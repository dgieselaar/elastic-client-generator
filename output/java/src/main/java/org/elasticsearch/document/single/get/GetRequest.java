
package org.elasticsearch.document.single.get;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.join_field_routing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class GetRequest  implements XContentable<GetRequest> {
  
  static final ParseField PREFERENCE = new ParseField("preference");
  private String _preference;
  public String getPreference() { return this._preference; }
  public GetRequest setPreference(String val) { this._preference = val; return this; }


  static final ParseField REALTIME = new ParseField("realtime");
  private Boolean _realtime;
  public Boolean getRealtime() { return this._realtime; }
  public GetRequest setRealtime(Boolean val) { this._realtime = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public GetRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public GetRequest setRouting(Routing val) { this._routing = val; return this; }


  static final ParseField SOURCE_ENABLED = new ParseField("source_enabled");
  private Boolean _sourceEnabled;
  public Boolean getSourceEnabled() { return this._sourceEnabled; }
  public GetRequest setSourceEnabled(Boolean val) { this._sourceEnabled = val; return this; }


  static final ParseField SOURCE_EXCLUDES = new ParseField("source_excludes");
  private List<Field> _sourceExcludes;
  public List<Field> getSourceExcludes() { return this._sourceExcludes; }
  public GetRequest setSourceExcludes(List<Field> val) { this._sourceExcludes = val; return this; }


  static final ParseField SOURCE_INCLUDES = new ParseField("source_includes");
  private List<Field> _sourceIncludes;
  public List<Field> getSourceIncludes() { return this._sourceIncludes; }
  public GetRequest setSourceIncludes(List<Field> val) { this._sourceIncludes = val; return this; }


  static final ParseField STORED_FIELDS = new ParseField("stored_fields");
  private List<Field> _storedFields;
  public List<Field> getStoredFields() { return this._storedFields; }
  public GetRequest setStoredFields(List<Field> val) { this._storedFields = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Long _version;
  public Long getVersion() { return this._version; }
  public GetRequest setVersion(Long val) { this._version = val; return this; }


  static final ParseField VERSION_TYPE = new ParseField("version_type");
  private VersionType _versionType;
  public VersionType getVersionType() { return this._versionType; }
  public GetRequest setVersionType(VersionType val) { this._versionType = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public GetRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return GetRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<GetRequest, Void> PARSER =
    new ConstructingObjectParser<>(GetRequest.class.getName(), false, args -> new GetRequest());

  static {
    PARSER.declareString(GetRequest::setPreference, PREFERENCE);
    PARSER.declareBoolean(GetRequest::setRealtime, REALTIME);
    PARSER.declareBoolean(GetRequest::setRefresh, REFRESH);
    PARSER.declareRouting(GetRequest::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
    PARSER.declareBoolean(GetRequest::setSourceEnabled, SOURCE_ENABLED);
    PARSER.declareObjectArray(GetRequest::setSourceExcludes, (p, t) -> Field.PARSER.apply(p), SOURCE_EXCLUDES);
    PARSER.declareObjectArray(GetRequest::setSourceIncludes, (p, t) -> Field.PARSER.apply(p), SOURCE_INCLUDES);
    PARSER.declareObjectArray(GetRequest::setStoredFields, (p, t) -> Field.PARSER.apply(p), STORED_FIELDS);
    PARSER.declareLong(GetRequest::setVersion, VERSION);
    PARSER.declareObject(GetRequest::setVersionType, (p, t) -> VersionType.PARSER.apply(p, null), VERSION_TYPE);
  }

}
