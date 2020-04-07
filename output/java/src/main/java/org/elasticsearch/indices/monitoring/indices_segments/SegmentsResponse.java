
package org.elasticsearch.indices.monitoring.indices_segments;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.indices.monitoring.indices_segments.*;
import org.elasticsearch.common_options.hit.*;

public class SegmentsResponse  implements XContentable<SegmentsResponse> {
  
  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<String, IndexSegment> _indices;
  public NamedContainer<String, IndexSegment> getIndices() { return this._indices; }
  public SegmentsResponse setIndices(NamedContainer<String, IndexSegment> val) { this._indices = val; return this; }


  static final ParseField SHARDS = new ParseField("_shards");
  private ShardStatistics _shards;
  public ShardStatistics getShards() { return this._shards; }
  public SegmentsResponse setShards(ShardStatistics val) { this._shards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SegmentsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SegmentsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SegmentsResponse, Void> PARSER =
    new ConstructingObjectParser<>(SegmentsResponse.class.getName(), false, args -> new SegmentsResponse());

  static {
    PARSER.declareObject(SegmentsResponse::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> IndexSegment.PARSER.apply(pp, null)), INDICES);;
    PARSER.declareObject(SegmentsResponse::setShards, (p, t) -> ShardStatistics.PARSER.apply(p, null), SHARDS);
  }

}
