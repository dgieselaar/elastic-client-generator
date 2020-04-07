
package org.elasticsearch.x_pack.machine_learning.close_job;

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

public class CloseJobRequest  implements XContentable<CloseJobRequest> {
  
  static final ParseField ALLOW_NO_JOBS = new ParseField("allow_no_jobs");
  private Boolean _allowNoJobs;
  public Boolean getAllowNoJobs() { return this._allowNoJobs; }
  public CloseJobRequest setAllowNoJobs(Boolean val) { this._allowNoJobs = val; return this; }


  static final ParseField FORCE = new ParseField("force");
  private Boolean _force;
  public Boolean getForce() { return this._force; }
  public CloseJobRequest setForce(Boolean val) { this._force = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CloseJobRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CloseJobRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CloseJobRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CloseJobRequest, Void> PARSER =
    new ConstructingObjectParser<>(CloseJobRequest.class.getName(), false, args -> new CloseJobRequest());

  static {
    PARSER.declareBoolean(CloseJobRequest::setAllowNoJobs, ALLOW_NO_JOBS);
    PARSER.declareBoolean(CloseJobRequest::setForce, FORCE);
    PARSER.declareObject(CloseJobRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
