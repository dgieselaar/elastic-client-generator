
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RecoveryStatusRequest  implements XContentable<RecoveryStatusRequest> {
  
  static final ParseField ACTIVE_ONLY = new ParseField("active_only");
  private Boolean _activeOnly;
  public Boolean getActiveOnly() { return this._activeOnly; }
  public RecoveryStatusRequest setActiveOnly(Boolean val) { this._activeOnly = val; return this; }


  static final ParseField DETAILED = new ParseField("detailed");
  private Boolean _detailed;
  public Boolean getDetailed() { return this._detailed; }
  public RecoveryStatusRequest setDetailed(Boolean val) { this._detailed = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RecoveryStatusRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryStatusRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryStatusRequest, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryStatusRequest.class.getName(), false, args -> new RecoveryStatusRequest());

  static {
    PARSER.declareBoolean(RecoveryStatusRequest::setActiveOnly, ACTIVE_ONLY);
    PARSER.declareBoolean(RecoveryStatusRequest::setDetailed, DETAILED);
  }

}
