
package org.elasticsearch.indices.index_management.create_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.indices.alias_management.*;
import org.elasticsearch.mapping.*;
import org.elasticsearch.common_options.time_unit.*;

public class CreateIndexRequest  implements XContentable<CreateIndexRequest> {
  
  static final ParseField ALIASES = new ParseField("aliases");
  private NamedContainer<IndexName, Alias> _aliases;
  public NamedContainer<IndexName, Alias> getAliases() { return this._aliases; }
  public CreateIndexRequest setAliases(NamedContainer<IndexName, Alias> val) { this._aliases = val; return this; }


  static final ParseField MAPPINGS = new ParseField("mappings");
  private TypeMapping _mappings;
  public TypeMapping getMappings() { return this._mappings; }
  public CreateIndexRequest setMappings(TypeMapping val) { this._mappings = val; return this; }


  static final ParseField SETTINGS = new ParseField("settings");
  private NamedContainer<String, Object> _settings;
  public NamedContainer<String, Object> getSettings() { return this._settings; }
  public CreateIndexRequest setSettings(NamedContainer<String, Object> val) { this._settings = val; return this; }


  static final ParseField INCLUDE_TYPE_NAME = new ParseField("include_type_name");
  private Boolean _includeTypeName;
  public Boolean getIncludeTypeName() { return this._includeTypeName; }
  public CreateIndexRequest setIncludeTypeName(Boolean val) { this._includeTypeName = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CreateIndexRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public CreateIndexRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public CreateIndexRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CreateIndexRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateIndexRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateIndexRequest, Void> PARSER =
    new ConstructingObjectParser<>(CreateIndexRequest.class.getName(), false, args -> new CreateIndexRequest());

  static {
    PARSER.declareObject(CreateIndexRequest::setAliases, (p, t) ->  new NamedContainer<>(n -> () -> new IndexName(n),pp -> Alias.PARSER.apply(pp, null)), ALIASES);;
    PARSER.declareObject(CreateIndexRequest::setMappings, (p, t) -> TypeMapping.PARSER.apply(p, null), MAPPINGS);
    PARSER.declareObject(CreateIndexRequest::setSettings, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), SETTINGS);;
    PARSER.declareBoolean(CreateIndexRequest::setIncludeTypeName, INCLUDE_TYPE_NAME);
    PARSER.declareObject(CreateIndexRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(CreateIndexRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
    PARSER.declareString(CreateIndexRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
  }

}
