
package org.elasticsearch.mapping.types.specialized.ip;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class IpProperty  implements XContentable<IpProperty> {
  
  static final ParseField BOOST = new ParseField("boost");
  private Double _boost;
  public Double getBoost() { return this._boost; }
  public IpProperty setBoost(Double val) { this._boost = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private Boolean _index;
  public Boolean getIndex() { return this._index; }
  public IpProperty setIndex(Boolean val) { this._index = val; return this; }


  static final ParseField NULL_VALUE = new ParseField("null_value");
  private String _nullValue;
  public String getNullValue() { return this._nullValue; }
  public IpProperty setNullValue(String val) { this._nullValue = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IpProperty fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IpProperty.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IpProperty, Void> PARSER =
    new ConstructingObjectParser<>(IpProperty.class.getName(), false, args -> new IpProperty());

  static {
    PARSER.declareDouble(IpProperty::setBoost, BOOST);
    PARSER.declareBoolean(IpProperty::setIndex, INDEX);
    PARSER.declareString(IpProperty::setNullValue, NULL_VALUE);
  }

}
