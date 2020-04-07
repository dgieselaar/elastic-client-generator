
package org.elasticsearch.x_pack.security.api_key.create_api_key;

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
import org.elasticsearch.x_pack.security.api_key.create_api_key.*;

public class CreateApiKeyRequest  implements XContentable<CreateApiKeyRequest> {
  
  static final ParseField REFRESH = new ParseField("refresh");
  private Refresh _refresh;
  public Refresh getRefresh() { return this._refresh; }
  public CreateApiKeyRequest setRefresh(Refresh val) { this._refresh = val; return this; }


  static final ParseField EXPIRATION = new ParseField("expiration");
  private Time _expiration;
  public Time getExpiration() { return this._expiration; }
  public CreateApiKeyRequest setExpiration(Time val) { this._expiration = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public CreateApiKeyRequest setName(String val) { this._name = val; return this; }


  static final ParseField ROLE_DESCRIPTORS = new ParseField("role_descriptors");
  private NamedContainer<String, ApiKeyRole> _roleDescriptors;
  public NamedContainer<String, ApiKeyRole> getRoleDescriptors() { return this._roleDescriptors; }
  public CreateApiKeyRequest setRoleDescriptors(NamedContainer<String, ApiKeyRole> val) { this._roleDescriptors = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CreateApiKeyRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateApiKeyRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateApiKeyRequest, Void> PARSER =
    new ConstructingObjectParser<>(CreateApiKeyRequest.class.getName(), false, args -> new CreateApiKeyRequest());

  static {
    PARSER.declareObject(CreateApiKeyRequest::setRefresh, (p, t) -> Refresh.PARSER.apply(p, null), REFRESH);
    PARSER.declareObject(CreateApiKeyRequest::setExpiration, (p, t) -> Time.PARSER.apply(p, null), EXPIRATION);
    PARSER.declareString(CreateApiKeyRequest::setName, NAME);
    PARSER.declareObject(CreateApiKeyRequest::setRoleDescriptors, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> ApiKeyRole.PARSER.apply(pp, null)), ROLE_DESCRIPTORS);;
  }

}
