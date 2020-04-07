
package org.elasticsearch.query_dsl.span.field_masking;

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
import org.elasticsearch.query_dsl.span.*;

public class SpanFieldMaskingQuery  implements XContentable<SpanFieldMaskingQuery> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public SpanFieldMaskingQuery setField(Field val) { this._field = val; return this; }


  static final ParseField QUERY = new ParseField("query");
  private SpanQuery _query;
  public SpanQuery getQuery() { return this._query; }
  public SpanFieldMaskingQuery setQuery(SpanQuery val) { this._query = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanFieldMaskingQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanFieldMaskingQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanFieldMaskingQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanFieldMaskingQuery.class.getName(), false, args -> new SpanFieldMaskingQuery());

  static {
    PARSER.declareField(SpanFieldMaskingQuery::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareObject(SpanFieldMaskingQuery::setQuery, (p, t) -> SpanQuery.PARSER.apply(p, null), QUERY);
  }

}
