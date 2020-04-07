
package org.elasticsearch.x_pack.security.privileges.get_user_privileges;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.security.privileges.get_user_privileges.*;

public class GetUserPrivilegesResponse  implements XContentable<GetUserPrivilegesResponse> {
  
  static final ParseField APPLICATIONS = new ParseField("applications");
  private List<ApplicationResourcePrivileges> _applications;
  public List<ApplicationResourcePrivileges> getApplications() { return this._applications; }
  public GetUserPrivilegesResponse setApplications(List<ApplicationResourcePrivileges> val) { this._applications = val; return this; }


  static final ParseField CLUSTER = new ParseField("cluster");
  private List<String> _cluster;
  public List<String> getCluster() { return this._cluster; }
  public GetUserPrivilegesResponse setCluster(List<String> val) { this._cluster = val; return this; }


  static final ParseField GLOBAL = new ParseField("global");
  private List<GlobalPrivileges> _global;
  public List<GlobalPrivileges> getGlobal() { return this._global; }
  public GetUserPrivilegesResponse setGlobal(List<GlobalPrivileges> val) { this._global = val; return this; }


  static final ParseField INDICES = new ParseField("indices");
  private List<UserIndicesPrivileges> _indices;
  public List<UserIndicesPrivileges> getIndices() { return this._indices; }
  public GetUserPrivilegesResponse setIndices(List<UserIndicesPrivileges> val) { this._indices = val; return this; }


  static final ParseField RUN_AS = new ParseField("run_as");
  private List<String> _runAs;
  public List<String> getRunAs() { return this._runAs; }
  public GetUserPrivilegesResponse setRunAs(List<String> val) { this._runAs = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetUserPrivilegesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetUserPrivilegesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetUserPrivilegesResponse, Void> PARSER =
    new ConstructingObjectParser<>(GetUserPrivilegesResponse.class.getName(), false, args -> new GetUserPrivilegesResponse());

  static {
    PARSER.declareObjectArray(GetUserPrivilegesResponse::setApplications, (p, t) -> ApplicationResourcePrivileges.PARSER.apply(p), APPLICATIONS);
    PARSER.declareStringArray(GetUserPrivilegesResponse::setCluster, CLUSTER);
    PARSER.declareObjectArray(GetUserPrivilegesResponse::setGlobal, (p, t) -> GlobalPrivileges.PARSER.apply(p), GLOBAL);
    PARSER.declareObjectArray(GetUserPrivilegesResponse::setIndices, (p, t) -> UserIndicesPrivileges.PARSER.apply(p), INDICES);
    PARSER.declareStringArray(GetUserPrivilegesResponse::setRunAs, RUN_AS);
  }

}
