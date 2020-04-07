
package org.elasticsearch.cluster.nodes_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.nodes_info.*;

public class NodesInfoResponse  implements XContentable<NodesInfoResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesInfoResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, NodeInfo> _nodes;
  public NamedContainer<String, NodeInfo> getNodes() { return this._nodes; }
  public NodesInfoResponse setNodes(NamedContainer<String, NodeInfo> val) { this._nodes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesInfoResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesInfoResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesInfoResponse, Void> PARSER =
    new ConstructingObjectParser<>(NodesInfoResponse.class.getName(), false, args -> new NodesInfoResponse());

  static {
    PARSER.declareString(NodesInfoResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareObject(NodesInfoResponse::setNodes, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> NodeInfo.PARSER.apply(pp, null)), NODES);;
  }

}
