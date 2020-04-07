
package org.elasticsearch.indices.index_management.freeze_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class FreezeIndexRequest  implements XContentable<FreezeIndexRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public FreezeIndexRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public FreezeIndexRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public FreezeIndexRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public FreezeIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public FreezeIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public FreezeIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FreezeIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FreezeIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FreezeIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(FreezeIndexRequest.class.getName(), false, args -> new FreezeIndexRequest());

  static {
    PARSER.declareBoolean(FreezeIndexRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(FreezeIndexRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(FreezeIndexRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareObject(FreezeIndexRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(FreezeIndexRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
    PARSER.declareString(FreezeIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}
