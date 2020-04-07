
package org.elasticsearch.mapping.types;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.property_name.*;

public class IProperty  implements XContentable<IProperty> {
  
  static final ParseField LOCAL_METADATA = new ParseField("local_metadata");
  private NamedContainer<String, Object> _localMetadata;
  public NamedContainer<String, Object> getLocalMetadata() { return this._localMetadata; }
  public IProperty setLocalMetadata(NamedContainer<String, Object> val) { this._localMetadata = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private PropertyName _name;
  public PropertyName getName() { return this._name; }
  public IProperty setName(PropertyName val) { this._name = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public IProperty setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IProperty, Void> PARSER =
    new ConstructingObjectParser<>(IProperty.class.getName(), false, args -> new IProperty());

  static {
    PARSER.declareObject(IProperty::setLocalMetadata, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), LOCAL_METADATA);;
    PARSER.declarePropertyName(IProperty::setName, (p, t) -> PropertyName.createFrom(p), NAME);
    PARSER.declareString(IProperty::setType, TYPE);
  }

}
