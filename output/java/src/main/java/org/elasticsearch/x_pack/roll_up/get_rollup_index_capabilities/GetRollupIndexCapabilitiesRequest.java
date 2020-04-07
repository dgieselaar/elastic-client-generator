
package org.elasticsearch.x_pack.roll_up.get_rollup_index_capabilities;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetRollupIndexCapabilitiesRequest  implements XContentable<GetRollupIndexCapabilitiesRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupIndexCapabilitiesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupIndexCapabilitiesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupIndexCapabilitiesRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupIndexCapabilitiesRequest.class.getName(), false, args -> new GetRollupIndexCapabilitiesRequest());

  static {
    
  }

}
