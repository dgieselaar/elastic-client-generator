
package org.elasticsearch.indices.index_settings.update_index_settings;

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

public class UpdateIndexSettingsRequest  implements XContentable<UpdateIndexSettingsRequest> {
  
  static final ParseField INDEX_SETTINGS = new ParseField("index_settings");
  private NamedContainer<String, Object> _indexSettings;
  public NamedContainer<String, Object> getIndexSettings() { return this._indexSettings; }
  public UpdateIndexSettingsRequest setIndexSettings(NamedContainer<String, Object> val) { this._indexSettings = val; return this; }


  static final ParseField ALLOW_NO_INDICES = new ParseField("allow_no_indices");
  private Boolean _allowNoIndices;
  public Boolean getAllowNoIndices() { return this._allowNoIndices; }
  public UpdateIndexSettingsRequest setAllowNoIndices(Boolean val) { this._allowNoIndices = val; return this; }


  static final ParseField EXPAND_WILDCARDS = new ParseField("expand_wildcards");
  private ExpandWildcards _expandWildcards;
  public ExpandWildcards getExpandWildcards() { return this._expandWildcards; }
  public UpdateIndexSettingsRequest setExpandWildcards(ExpandWildcards val) { this._expandWildcards = val; return this; }


  static final ParseField FLAT_SETTINGS = new ParseField("flat_settings");
  private Boolean _flatSettings;
  public Boolean getFlatSettings() { return this._flatSettings; }
  public UpdateIndexSettingsRequest setFlatSettings(Boolean val) { this._flatSettings = val; return this; }


  static final ParseField IGNORE_UNAVAILABLE = new ParseField("ignore_unavailable");
  private Boolean _ignoreUnavailable;
  public Boolean getIgnoreUnavailable() { return this._ignoreUnavailable; }
  public UpdateIndexSettingsRequest setIgnoreUnavailable(Boolean val) { this._ignoreUnavailable = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public UpdateIndexSettingsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField PRESERVE_EXISTING = new ParseField("preserve_existing");
  private Boolean _preserveExisting;
  public Boolean getPreserveExisting() { return this._preserveExisting; }
  public UpdateIndexSettingsRequest setPreserveExisting(Boolean val) { this._preserveExisting = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public UpdateIndexSettingsRequest setTimeout(Time val) { this._timeout = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UpdateIndexSettingsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UpdateIndexSettingsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UpdateIndexSettingsRequest, Void> PARSER =
    new ConstructingObjectParser<>(UpdateIndexSettingsRequest.class.getName(), false, args -> new UpdateIndexSettingsRequest());

  static {
    PARSER.declareObject(UpdateIndexSettingsRequest::setIndexSettings, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), INDEX_SETTINGS);;
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setAllowNoIndices, ALLOW_NO_INDICES);
    PARSER.declareObject(UpdateIndexSettingsRequest::setExpandWildcards, (p, t) -> ExpandWildcards.PARSER.apply(p, null), EXPAND_WILDCARDS);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setFlatSettings, FLAT_SETTINGS);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setIgnoreUnavailable, IGNORE_UNAVAILABLE);
    PARSER.declareObject(UpdateIndexSettingsRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareBoolean(UpdateIndexSettingsRequest::setPreserveExisting, PRESERVE_EXISTING);
    PARSER.declareObject(UpdateIndexSettingsRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
  }

}
