
package org.elasticsearch.x_pack.watcher.deactivate_watch;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.activate_watch.*;

public class DeactivateWatchResponse  implements XContentable<DeactivateWatchResponse> {
  
  static final ParseField STATUS = new ParseField("status");
  private ActivationStatus _status;
  public ActivationStatus getStatus() { return this._status; }
  public DeactivateWatchResponse setStatus(ActivationStatus val) { this._status = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeactivateWatchResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeactivateWatchResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeactivateWatchResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeactivateWatchResponse.class.getName(), false, args -> new DeactivateWatchResponse());

  static {
    PARSER.declareObject(DeactivateWatchResponse::setStatus, (p, t) -> ActivationStatus.PARSER.apply(p, null), STATUS);
  }

}
