
package org.elasticsearch.x_pack.machine_learning.machine_learning_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.machine_learning.machine_learning_info.*;

public class MachineLearningInfoResponse  implements XContentable<MachineLearningInfoResponse> {
  
  static final ParseField DEFAULTS = new ParseField("defaults");
  private Defaults _defaults;
  public Defaults getDefaults() { return this._defaults; }
  public MachineLearningInfoResponse setDefaults(Defaults val) { this._defaults = val; return this; }


  static final ParseField LIMITS = new ParseField("limits");
  private Limits _limits;
  public Limits getLimits() { return this._limits; }
  public MachineLearningInfoResponse setLimits(Limits val) { this._limits = val; return this; }


  static final ParseField UPGRADE_MODE = new ParseField("upgrade_mode");
  private Boolean _upgradeMode;
  public Boolean getUpgradeMode() { return this._upgradeMode; }
  public MachineLearningInfoResponse setUpgradeMode(Boolean val) { this._upgradeMode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public MachineLearningInfoResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return MachineLearningInfoResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<MachineLearningInfoResponse, Void> PARSER =
    new ConstructingObjectParser<>(MachineLearningInfoResponse.class.getName(), false, args -> new MachineLearningInfoResponse());

  static {
    PARSER.declareObject(MachineLearningInfoResponse::setDefaults, (p, t) -> Defaults.PARSER.apply(p, null), DEFAULTS);
    PARSER.declareObject(MachineLearningInfoResponse::setLimits, (p, t) -> Limits.PARSER.apply(p, null), LIMITS);
    PARSER.declareBoolean(MachineLearningInfoResponse::setUpgradeMode, UPGRADE_MODE);
  }

}
