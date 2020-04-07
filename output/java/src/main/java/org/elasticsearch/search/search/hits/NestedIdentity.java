
package org.elasticsearch.search.search.hits;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.internal.*;

public class NestedIdentity  implements XContentable<NestedIdentity> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public NestedIdentity setField(Field val) { this._field = val; return this; }


  static final ParseField NESTED = new ParseField("_nested");
  private NestedIdentity _nested;
  public NestedIdentity getNested() { return this._nested; }
  public NestedIdentity setNested(NestedIdentity val) { this._nested = val; return this; }


  static final ParseField OFFSET = new ParseField("offset");
  private Integer _offset;
  public Integer getOffset() { return this._offset; }
  public NestedIdentity setOffset(Integer val) { this._offset = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NestedIdentity fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NestedIdentity.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NestedIdentity, Void> PARSER =
    new ConstructingObjectParser<>(NestedIdentity.class.getName(), false, args -> new NestedIdentity());

  static {
    PARSER.declareField(NestedIdentity::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(NestedIdentity::setNested, (p, t) -> NestedIdentity.PARSER.apply(p, null), NESTED);
    PARSER.declareInteger(NestedIdentity::setOffset, OFFSET);
  }

}
