
package org.elasticsearch.cluster.nodes_hot_threads;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class HotThreadInformation  implements XContentable<HotThreadInformation> {
  
  static final ParseField HOSTS = new ParseField("hosts");
  private List<String> _hosts;
  public List<String> getHosts() { return this._hosts; }
  public HotThreadInformation setHosts(List<String> val) { this._hosts = val; return this; }


  static final ParseField NODE_ID = new ParseField("node_id");
  private String _nodeId;
  public String getNodeId() { return this._nodeId; }
  public HotThreadInformation setNodeId(String val) { this._nodeId = val; return this; }


  static final ParseField NODE_NAME = new ParseField("node_name");
  private String _nodeName;
  public String getNodeName() { return this._nodeName; }
  public HotThreadInformation setNodeName(String val) { this._nodeName = val; return this; }


  static final ParseField THREADS = new ParseField("threads");
  private List<String> _threads;
  public List<String> getThreads() { return this._threads; }
  public HotThreadInformation setThreads(List<String> val) { this._threads = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HotThreadInformation fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HotThreadInformation.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HotThreadInformation, Void> PARSER =
    new ConstructingObjectParser<>(HotThreadInformation.class.getName(), false, args -> new HotThreadInformation());

  static {
    PARSER.declareStringArray(HotThreadInformation::setHosts, HOSTS);
    PARSER.declareString(HotThreadInformation::setNodeId, NODE_ID);
    PARSER.declareString(HotThreadInformation::setNodeName, NODE_NAME);
    PARSER.declareStringArray(HotThreadInformation::setThreads, THREADS);
  }

}
