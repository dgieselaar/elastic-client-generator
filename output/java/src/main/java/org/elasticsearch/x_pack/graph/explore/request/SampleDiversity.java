
package org.elasticsearch.x_pack.graph.explore.request;

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
import org.elasticsearch.internal.*;

public class SampleDiversity  implements XContentable<SampleDiversity> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public SampleDiversity setField(Field val) { this._field = val; return this; }


  static final ParseField MAX_DOCS_PER_VALUE = new ParseField("max_docs_per_value");
  private Integer _maxDocsPerValue;
  public Integer getMaxDocsPerValue() { return this._maxDocsPerValue; }
  public SampleDiversity setMaxDocsPerValue(Integer val) { this._maxDocsPerValue = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SampleDiversity fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SampleDiversity.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SampleDiversity, Void> PARSER =
    new ConstructingObjectParser<>(SampleDiversity.class.getName(), false, args -> new SampleDiversity());

  static {
    PARSER.declareField(SampleDiversity::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareInteger(SampleDiversity::setMaxDocsPerValue, MAX_DOCS_PER_VALUE);
  }

}
