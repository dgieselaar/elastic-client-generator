
package org.elasticsearch.x_pack.roll_up.get_rollup_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.x_pack.roll_up.get_rollup_capabilities.*;
import org.elasticsearch.common_abstractions.response.*;

public class GetRollupCapabilitiesResponse extends DictionaryResponseBase<IndexName, RollupCapabilities> implements XContentable<GetRollupCapabilitiesResponse> {
  
  static final ParseField INDICES = new ParseField("indices");
  private NamedContainer<IndexName, RollupCapabilities> _indices;
  public NamedContainer<IndexName, RollupCapabilities> getIndices() { return this._indices; }
  public GetRollupCapabilitiesResponse setIndices(NamedContainer<IndexName, RollupCapabilities> val) { this._indices = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupCapabilitiesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupCapabilitiesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupCapabilitiesResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupCapabilitiesResponse.class.getName(), false, args -> new GetRollupCapabilitiesResponse());

  static {
    PARSER.declareObject(GetRollupCapabilitiesResponse::setIndices, (p, t) ->  new NamedContainer<>(n -> () -> new IndexName(n),pp -> RollupCapabilities.PARSER.apply(pp, null)), INDICES);;
  }

}
