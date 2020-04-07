
package org.elasticsearch.x_pack.security.api_key.invalidate_api_key;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class InvalidateApiKeyRequest  implements XContentable<InvalidateApiKeyRequest> {
  
  static final ParseField ID = new ParseField("id");
  private String _id;
  public String getId() { return this._id; }
  public InvalidateApiKeyRequest setId(String val) { this._id = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public InvalidateApiKeyRequest setName(String val) { this._name = val; return this; }


  static final ParseField REALM_NAME = new ParseField("realm_name");
  private String _realmName;
  public String getRealmName() { return this._realmName; }
  public InvalidateApiKeyRequest setRealmName(String val) { this._realmName = val; return this; }


  static final ParseField USERNAME = new ParseField("username");
  private String _username;
  public String getUsername() { return this._username; }
  public InvalidateApiKeyRequest setUsername(String val) { this._username = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InvalidateApiKeyRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InvalidateApiKeyRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InvalidateApiKeyRequest, Void> PARSER =
    new ConstructingObjectParser<>(InvalidateApiKeyRequest.class.getName(), false, args -> new InvalidateApiKeyRequest());

  static {
    PARSER.declareString(InvalidateApiKeyRequest::setId, ID);
    PARSER.declareString(InvalidateApiKeyRequest::setName, NAME);
    PARSER.declareString(InvalidateApiKeyRequest::setRealmName, REALM_NAME);
    PARSER.declareString(InvalidateApiKeyRequest::setUsername, USERNAME);
  }

}
