/* tslint:disable:no-console */
import {Specification} from "../specification/src/api-specification";
import Domain, {ArrayOf, Dictionary, Type, UnionOf} from "elasticsearch-client-specification/src/domain";
import fs from "fs";
import * as changeCase from "change-case";

const specification = Specification.load();

if (specification.domain_errors.length + specification.endpoint_errors.length !== 0) {
  if (specification.endpoint_errors.length > 0) console.error("The specification contains the following endpoint mapping errors:");
  for (const e of specification.endpoint_errors) console.error("  - " + e);
// tslint:disable-next-line:max-line-length
} else console.log("The specification contains no errors in any of the " + specification.endpoints.length + " endpoints yielding " + specification.types.length + " types");

const reservedTypes = ["string", "integer", "double", "boolean", "object"];
const stringTypes =
  ["Field", "Id", "Ids", "IndexName", "Indices", "Routing", "LongId", "IndexMetrics", "Metrics", "Name", "Names",
    "NodeIds", "PropertyName", "RelationName", "TaskId", "Timestamp",
    "Uri", "Date", "TimeSpan"
  ];
const numberTypes = ["short", "byte", "integer", "long", "float", "double"];
const objectTypes = ["SourceDocument"];

const $typeName = (name: string) => {
  if (reservedTypes.includes(name) || !name.includes("<"))
    return changeCase.pascalCase(name, {stripRegexp:/[^A-Z0-9<>]/gi });

  return changeCase.pascalCase(name, {stripRegexp:/[^A-Z0-9<>]/gi });
};

const $referencedTypes = (instance: Domain.InstanceOf) : Domain.TypeDeclaration[] => {
  // Type|ArrayOf|Dictionary|UnionOf;
  if (instance instanceof Type) {
    const type = specification.typeLookup[instance.name];
    const inherits =
      type instanceof Domain.Interface
      ? type.inherits.flatMap(t=> t.closedGenerics.map($referencedTypes)).flat()
      : [];
    return [type]
      .concat(instance.closedGenerics.map($referencedTypes).flat(Infinity))
      .concat(inherits);
  }
  else if (instance instanceof ArrayOf) return $referencedTypes(instance.of).flat(Infinity);
  else if (instance instanceof Dictionary) return [$referencedTypes(instance.key), $referencedTypes(instance.value)].flat(Infinity);
  else if (instance instanceof UnionOf) return instance.items.map($referencedTypes).flat(Infinity);
};

const $instanceOf = (instance: Domain.InstanceOf) => {
  if (instance instanceof Type)  {
    if (instance.closedGenerics.length === 0)
      return $typeName(instance.name);

    const generics = instance.closedGenerics.map($instanceOf).flat(Infinity);
    return `${$typeName(instance.name)}<${generics.join(", ")}>`;
  }
  else if (instance instanceof ArrayOf) return `List<${$instanceOf(instance.of)}>`;
  else if (instance instanceof Dictionary) return `NamedContainer<${$instanceOf(instance.key)}, ${$instanceOf(instance.value)}>`;
  else if (instance instanceof UnionOf) return `Either<${instance.items.map($instanceOf).join(", ")}>`;
};
const $propertyName = (prop: string) => {
  if (prop === "+") return "Add";
  if (prop === "-") return "Subtract";
  return prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
      ? changeCase.pascalCase(prop)
    : changeCase.pascalCase(prop);
};

const $fieldName = (prop: string) =>
  prop.includes(".") || prop.includes("-") || prop.match(/^(\d|\W)/)
    ? `_${changeCase.camelCase(prop)}`
    : `_${changeCase.camelCase(prop)}`;

const $property = (prop: Domain.InterfaceProperty, parent: Domain.Interface) => `
  static final ParseField ${changeCase.constantCase(prop.name)} = new ParseField("${prop.name}");
  private ${$instanceOf(prop.type)} ${$fieldName(prop.name)};
  public ${$instanceOf(prop.type)} get${$propertyName(prop.name)}() { return this.${$fieldName(prop.name)}; }
  public ${$typeName(parent.name)}${$typeGenerics(parent)} set${$propertyName(prop.name)}(${$instanceOf(prop.type)} val) { this.${$fieldName(prop.name)} = val; return this; }
`;
const $properties = (type: Domain.Interface) => type.properties.map(p => $property(p, type)).join("\n");

const $parseProperty = (prop: Domain.InterfaceProperty, parent: Domain.Interface) => {
  const t = $instanceOf(prop.type);
  const valueTypes = ["String", "Float", "Double", "Integer", "Boolean", "Long"];
  if (valueTypes.includes(t))
    return `PARSER.declare${t}(${$typeName(parent.name)}::set${$propertyName(prop.name)}, ${changeCase.constantCase(prop.name)});`;
  if (stringTypes.includes(t))
    return `PARSER.declare${t}(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> ${t}.createFrom(p), ${changeCase.constantCase(prop.name)});`;
  if (prop.type instanceof  Domain.ArrayOf) {
    const arrayOf = $instanceOf(prop.type.of);
    if (valueTypes.includes(arrayOf))
      return `PARSER.declare${arrayOf}Array(${$typeName(parent.name)}::set${$propertyName(prop.name)}, ${changeCase.constantCase(prop.name)});`;
    if (prop.type.of instanceof Domain.UnionOf) // TODO
      return `PARSER.declareObjectArray(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> null, ${changeCase.constantCase(prop.name)});`;
    return `PARSER.declareObjectArray(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> ${arrayOf}.PARSER.apply(p), ${changeCase.constantCase(prop.name)});`;
  }

  if (prop.type instanceof Domain.Dictionary) {
    const pre = `PARSER.declareObject(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> `;
    const post = `, ${changeCase.constantCase(prop.name)});`;
    const $key = (i: Domain.InstanceOf) => {
      if (i instanceof Type) {
        if (valueTypes.includes($instanceOf(i)))
          return `n -> () -> n`;
        if (stringTypes.includes(i.name))
          return `n -> () -> new ${$instanceOf(i)}(n)`;
        return `${$instanceOf(i)}.PARSER.apply(p, null)`;
      }
      return `UNSUPPORTED`;
    };
    const $val = (i: Domain.InstanceOf) => {
      if (i instanceof Type) {
        if ($instanceOf(i) === "Object") return `XContentParser::binaryValue`;
        if (stringTypes.includes(i.name))
          return `n -> () -> new ${$instanceOf(i)}(n)`;
        return `pp -> ${$instanceOf(i)}.PARSER.apply(pp, null)`;
      }
      return `UNSUPPORTED`;
    };
    return `${pre} new NamedContainer<>(${$key(prop.type.key)},${$val(prop.type.value)})${post};`;
    // PARSER.declareObject(TypeMapping::setMeta, (p, t) -> new NamedContainer<>(n -> () -> n, XContentParser::binaryValue), META);
    // PARSER.declareObject(TypeMapping::setDynamicTemplates, (p, t) -> new NamedContainer<>(n -> () -> n, pp -> DynamicTemplate.PARSER.apply(pp, null)), DYNAMIC_TEMPLATES);
    // PARSER.declareObject(TypeMapping::setProperties, (p, t) -> new NamedContainer<>(n -> () -> new PropertyName(n), pp -> IProperty.PARSER.apply(pp, null)), PROPERTIES);
  }
  if (prop.type instanceof Domain.Enum)
    return `PARSER.declareObject(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> ${t}.PARSER.apply(p), ${changeCase.constantCase(prop.name)});`;
  if (prop.type instanceof Domain.UnionOf) // TODO
    return `PARSER.declareObject(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> null, ${changeCase.constantCase(prop.name)});`;
  return `PARSER.declareObject(${$typeName(parent.name)}::set${$propertyName(prop.name)}, (p, t) -> ${t}.PARSER.apply(p, null), ${changeCase.constantCase(prop.name)});`;
}
const $parseProperties = (type: Domain.Interface) => type.properties.map(p => $parseProperty(p, type)).join("\n    ");

const $typeExtends = (type: Domain.Interface) => {
  return type.inherits.length === 0
    ? ``
    : `extends ${type.inherits.map($handleDictionaryResponse).join(", ")}`;
};
const $handleDictionaryResponse = (ref: Domain.ImplementsReference) => {
  if (ref.type === undefined) {
    console.log(ref);
    return "";
  }

  return ref.type.name === "DictionaryResponseBase"
    ? `${$typeName(ref.type.name)}<${ref.closedGenerics.map($instanceOf).join(", ")}>`
    : $typeName(ref.type.name);
    // : `ResponseBase, Map<${$instanceOf(ref.closedGenerics[0])}, any>`;
};
const $imports = (type: Domain.Interface) => {
  const types = type
    .properties
    .flatMap(e => $referencedTypes(e.type))
    .concat(type.inherits.map(i=>i.type))
    .concat(type.inherits.flatMap(i=> i.closedGenerics.flatMap($referencedTypes)))
    .filter(e=>e && e.name !== "string")
    .map(e=> {
      if (e.namespace.startsWith("mapping.types.core."))
         return "mapping.types.core";
      return e.namespace;
    })
    .map($import);
  return new Set(types);
}
const $import = (ns: string) => `import org.elasticsearch.${ns}.*;`;
const $typeGenerics = (type: Domain.Interface) => {
  return type.openGenerics.length === 0
    ? ``
    : `<${type.openGenerics.map(g => `${g}`).join(", ")}>`;
};
const $type = (type: Domain.Interface) => `
package org.elasticsearch.${type.namespace};

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


${[...$imports(type)].join("\n")}

public class ${$typeName(type.name)}${$typeGenerics(type)} ${$typeExtends(type)} implements XContentable<${$typeName(type.name)}> {
  ${$properties(type)}

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ${$typeName(type.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ${$typeName(type.name)}.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<${$typeName(type.name)}, Void> PARSER =
    new ConstructingObjectParser<>(${$typeName(type.name)}.class.getName(), false, args -> new ${$typeName(type.name)}());

  static {
    ${$parseProperties(type)}
  }

}
`;
const $createUnionType = (type: Domain.Interface) => `package org.elasticsearch.${type.namespace};

import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
${[...$imports(type)].join("\n")}

public class ${type.name} extends Either<${type.inherits[0].closedGenerics.map($instanceOf).join(", ")}> implements XContentable<${$typeName(type.name)}> { }
`;
const $createValueObject = (type: Domain.Interface, valueType: string) => `
package org.elasticsearch.${type.namespace};

import java.io.IOException;
import java.util.Objects;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;

public final class ${$typeName(type.name)} implements XContentable<${$typeName(type.name)}> {
  private final ${valueType} value;

  public ${$typeName(type.name)}(String value) { this.value = value; }

  @Override
  public String toString() { return value.toString(); }

  @Override
  public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      ${$typeName(type.name)} that = (${$typeName(type.name)}) o;
      return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() { return Objects.hash(value); }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.value(this.value);
    return null;
  }

  public static ${$typeName(type.name)} createFrom(XContentParser parser) throws IOException, XContentParseException { return new ${$typeName(type.name)}(parser.text()); }

  @Override
  public ${$typeName(type.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException { return ${$typeName(type.name)}.createFrom(parser); }

}
`;

const $createType = (type: Domain.Interface) => {
  if (stringTypes.includes(type.name))
    return $createValueObject(type, "String");
  if (objectTypes.includes(type.name))
    return $createValueObject(type, "Object");
  if (type.implementsUnion()) return $createUnionType(type);
  return $type(type)
};

const $enumFlag = (e: Domain.EnumMember, flag: boolean, n: number) => !flag ? `"${e.stringRepresentation}"` : `1 << ${n+1}`;
const $enumValue = (e: Domain.EnumMember, flag: boolean, n: number) => `${$propertyName(e.name)}(${$enumFlag(e, flag, n)})`;
const $enumValues = (e: Domain.Enum) => e.members.map((m,i)=> $enumValue(m, e.flags, i)).join(",\n    ");
const $enumParseCase = (e: Domain.EnumMember, parent: Domain.Enum) =>
  `case "${e.stringRepresentation}": return ${$typeName(parent.name)}.${$propertyName(e.name)}`;
const $enumParseCases = (e: Domain.Enum) => e.members.map((m,i)=> $enumParseCase(m, e)).join(";\n      ");
const $enum = (e: Domain.Enum) => `
package org.elasticsearch.${e.namespace};

import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum ${$typeName(e.name)} implements XContentable<${$typeName(e.name)}> {
  ${$enumValues(e)};
  private final String textRepresentation;

  private ${$typeName(e.name)}(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public ${$typeName(e.name)} fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, ${$typeName(e.name)}, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      ${$enumParseCases(e)};
      default:
        String message = String.format("'%s' not a valid value for enum '%s'", text, ${$typeName(e.name)}.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
`;
const $renderType = (type: Domain.TypeDeclaration) => {
  if (type instanceof Domain.Interface) return $createType(type);
  else if (type instanceof Domain.Enum) return $enum(type);
};

for (const type of specification.types) {
  if (numberTypes.includes(type.name)) continue;
  if (type.name === "Date") continue;
  if (type.namespace.startsWith("mapping.types.core."))
    type.namespace = "mapping.types.core";
  const ns = type.namespace;
  const folder = ns.replace(/\./g, "/");
  const exportFolder = `../output/java/src/main/java/org/elasticsearch/${folder}`;
  if (!fs.existsSync(exportFolder)) fs.mkdirSync(exportFolder, { recursive: true });
  fs.writeFileSync(`${exportFolder}/${changeCase.pascalCase(type.name)}.java`, $renderType(type));
}

