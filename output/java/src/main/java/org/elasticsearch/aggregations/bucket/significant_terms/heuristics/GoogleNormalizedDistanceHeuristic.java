
package org.elasticsearch.aggregations.bucket.significant_terms.heuristics;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GoogleNormalizedDistanceHeuristic  implements XContentable<GoogleNormalizedDistanceHeuristic> {
  
  static final ParseField BACKGROUND_IS_SUPERSET = new ParseField("background_is_superset");
  private Boolean _backgroundIsSuperset;
  public Boolean getBackgroundIsSuperset() { return this._backgroundIsSuperset; }
  public GoogleNormalizedDistanceHeuristic setBackgroundIsSuperset(Boolean val) { this._backgroundIsSuperset = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GoogleNormalizedDistanceHeuristic fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GoogleNormalizedDistanceHeuristic.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GoogleNormalizedDistanceHeuristic, Void> PARSER =
    new ConstructingObjectParser<>(GoogleNormalizedDistanceHeuristic.class.getName(), false, args -> new GoogleNormalizedDistanceHeuristic());

  static {
    PARSER.declareBoolean(GoogleNormalizedDistanceHeuristic::setBackgroundIsSuperset, BACKGROUND_IS_SUPERSET);
  }

}
