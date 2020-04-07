
package org.elasticsearch.query_dsl.span.containing;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.span.*;

public class SpanContainingQuery  implements XContentable<SpanContainingQuery> {
  
  static final ParseField BIG = new ParseField("big");
  private SpanQuery _big;
  public SpanQuery getBig() { return this._big; }
  public SpanContainingQuery setBig(SpanQuery val) { this._big = val; return this; }


  static final ParseField LITTLE = new ParseField("little");
  private SpanQuery _little;
  public SpanQuery getLittle() { return this._little; }
  public SpanContainingQuery setLittle(SpanQuery val) { this._little = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SpanContainingQuery fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SpanContainingQuery.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SpanContainingQuery, Void> PARSER =
    new ConstructingObjectParser<>(SpanContainingQuery.class.getName(), false, args -> new SpanContainingQuery());

  static {
    PARSER.declareObject(SpanContainingQuery::setBig, (p, t) -> SpanQuery.PARSER.apply(p, null), BIG);
    PARSER.declareObject(SpanContainingQuery::setLittle, (p, t) -> SpanQuery.PARSER.apply(p, null), LITTLE);
  }

}
