
package org.elasticsearch.x_pack.info.x_pack_usage;

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

public class XPackUsageRequest  implements XContentable<XPackUsageRequest> {
  
  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public XPackUsageRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public XPackUsageRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return XPackUsageRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<XPackUsageRequest, Void> PARSER =
    new ConstructingObjectParser<>(XPackUsageRequest.class.getName(), false, args -> new XPackUsageRequest());

  static {
    PARSER.declareObject(XPackUsageRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
  }

}
