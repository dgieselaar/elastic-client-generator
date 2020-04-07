
package org.elasticsearch.cluster.nodes_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cluster.nodes_stats.*;

public class NodesStatsResponse  implements XContentable<NodesStatsResponse> {
  
  static final ParseField CLUSTER_NAME = new ParseField("cluster_name");
  private String _clusterName;
  public String getClusterName() { return this._clusterName; }
  public NodesStatsResponse setClusterName(String val) { this._clusterName = val; return this; }


  static final ParseField NODES = new ParseField("nodes");
  private NamedContainer<String, NodeStats> _nodes;
  public NamedContainer<String, NodeStats> getNodes() { return this._nodes; }
  public NodesStatsResponse setNodes(NamedContainer<String, NodeStats> val) { this._nodes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodesStatsResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodesStatsResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodesStatsResponse, Void> PARSER =
    new ConstructingObjectParser<>(NodesStatsResponse.class.getName(), false, args -> new NodesStatsResponse());

  static {
    PARSER.declareString(NodesStatsResponse::setClusterName, CLUSTER_NAME);
    PARSER.declareObject(NodesStatsResponse::setNodes, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> NodeStats.PARSER.apply(pp, null)), NODES);;
  }

}
