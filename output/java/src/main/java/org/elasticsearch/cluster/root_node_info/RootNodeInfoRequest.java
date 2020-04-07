
package org.elasticsearch.cluster.root_node_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RootNodeInfoRequest  implements XContentable<RootNodeInfoRequest> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RootNodeInfoRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RootNodeInfoRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RootNodeInfoRequest, Void> PARSER =
    new ConstructingObjectParser<>(RootNodeInfoRequest.class.getName(), false, args -> new RootNodeInfoRequest());

  static {
    
  }

}
