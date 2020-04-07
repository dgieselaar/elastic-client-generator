
package org.elasticsearch.x_pack.ilm.get_lifecycle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;
import org.elasticsearch.x_pack.ilm.*;

public class LifecyclePolicy  implements XContentable<LifecyclePolicy> {
  
  static final ParseField MODIFIED_DATE = new ParseField("modified_date");
  private Date _modifiedDate;
  public Date getModifiedDate() { return this._modifiedDate; }
  public LifecyclePolicy setModifiedDate(Date val) { this._modifiedDate = val; return this; }


  static final ParseField POLICY = new ParseField("policy");
  private Policy _policy;
  public Policy getPolicy() { return this._policy; }
  public LifecyclePolicy setPolicy(Policy val) { this._policy = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Integer _version;
  public Integer getVersion() { return this._version; }
  public LifecyclePolicy setVersion(Integer val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LifecyclePolicy fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LifecyclePolicy.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LifecyclePolicy, Void> PARSER =
    new ConstructingObjectParser<>(LifecyclePolicy.class.getName(), false, args -> new LifecyclePolicy());

  static {
    PARSER.declareDate(LifecyclePolicy::setModifiedDate, (p, t) -> Date.createFrom(p), MODIFIED_DATE);
    PARSER.declareObject(LifecyclePolicy::setPolicy, (p, t) -> Policy.PARSER.apply(p, null), POLICY);
    PARSER.declareInteger(LifecyclePolicy::setVersion, VERSION);
  }

}
