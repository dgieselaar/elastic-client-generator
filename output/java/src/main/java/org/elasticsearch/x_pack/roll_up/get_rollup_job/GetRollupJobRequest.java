
package org.elasticsearch.x_pack.roll_up.get_rollup_job;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class GetRollupJobRequest  implements XContentable<GetRollupJobRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRollupJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRollupJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRollupJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetRollupJobRequest.class.getName(), false, args -> new GetRollupJobRequest());

  static {
    
  }

}
