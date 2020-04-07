
package org.elasticsearch.cluster.cluster_pending_tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;

public class ClusterPendingTasksRequest  implements XContentable<ClusterPendingTasksRequest> {
  
  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public ClusterPendingTasksRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public ClusterPendingTasksRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterPendingTasksRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterPendingTasksRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterPendingTasksRequest, Void> PARSER =
    new ConstructingObjectParser<>(ClusterPendingTasksRequest.class.getName(), false, args -> new ClusterPendingTasksRequest());

  static {
    PARSER.declareBoolean(ClusterPendingTasksRequest::setLocal, LOCAL);
    PARSER.declareObject(ClusterPendingTasksRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
  }

}
