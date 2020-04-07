
package org.elasticsearch.search.field_capabilities;

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
import org.elasticsearch.common_abstractions.infer.field.*;

public class FieldCapabilitiesRequest  implements XContentable<FieldCapabilitiesRequest> {
  
  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public FieldCapabilitiesRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public FieldCapabilitiesRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public FieldCapabilitiesRequest setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public FieldCapabilitiesRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField INCLUDE_UNMAPPED = new ParseField("include_unmapped");
  private Boolean _includeUnmapped;
  public Boolean getIncludeUnmapped() { return this._includeUnmapped; }
  public FieldCapabilitiesRequest setIncludeUnmapped(Boolean val) { this._includeUnmapped = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FieldCapabilitiesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FieldCapabilitiesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FieldCapabilitiesRequest, Void> PARSER =
    new ConstructingObjectParser<>(FieldCapabilitiesRequest.class.getName(), false, args -> new FieldCapabilitiesRequest());

  static {
    PARSER.declareBoolean(FieldCapabilitiesRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(FieldCapabilitiesRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareObjectArray(FieldCapabilitiesRequest::setFields, (p, t) -> Field.PARSER.apply(p), FIELDS);
    PARSER.declareBoolean(FieldCapabilitiesRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareBoolean(FieldCapabilitiesRequest::setIncludeUnmapped, INCLUDE_UNMAPPED);
  }

}
