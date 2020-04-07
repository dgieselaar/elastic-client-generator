
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


import org.elasticsearch.search.search.hits.*;
import org.elasticsearch.common_abstractions.lazy_document.*;
import org.elasticsearch.internal.*;

public class InnerHitsMetadata  implements XContentable<InnerHitsMetadata> {
  
  static final ParseField HITS = new ParseField("hits");
  private List<Hit<LazyDocument>> _hits;
  public List<Hit<LazyDocument>> getHits() { return this._hits; }
  public InnerHitsMetadata setHits(List<Hit<LazyDocument>> val) { this._hits = val; return this; }


  static final ParseField MAX_SCORE = new ParseField("max_score");
  private Double _maxScore;
  public Double getMaxScore() { return this._maxScore; }
  public InnerHitsMetadata setMaxScore(Double val) { this._maxScore = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private TotalHits _total;
  public TotalHits getTotal() { return this._total; }
  public InnerHitsMetadata setTotal(TotalHits val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InnerHitsMetadata fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InnerHitsMetadata.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InnerHitsMetadata, Void> PARSER =
    new ConstructingObjectParser<>(InnerHitsMetadata.class.getName(), false, args -> new InnerHitsMetadata());

  static {
    PARSER.declareObjectArray(InnerHitsMetadata::setHits, (p, t) -> Hit<LazyDocument>.PARSER.apply(p), HITS);
    PARSER.declareDouble(InnerHitsMetadata::setMaxScore, MAX_SCORE);
    PARSER.declareObject(InnerHitsMetadata::setTotal, (p, t) -> TotalHits.PARSER.apply(p, null), TOTAL);
  }

}
