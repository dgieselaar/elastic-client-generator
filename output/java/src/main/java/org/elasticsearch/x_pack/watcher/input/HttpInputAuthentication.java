
package org.elasticsearch.x_pack.watcher.input;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.input.*;

public class HttpInputAuthentication  implements XContentable<HttpInputAuthentication> {
  
  static final ParseField BASIC = new ParseField("basic");
  private HttpInputBasicAuthentication _basic;
  public HttpInputBasicAuthentication getBasic() { return this._basic; }
  public HttpInputAuthentication setBasic(HttpInputBasicAuthentication val) { this._basic = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public HttpInputAuthentication fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return HttpInputAuthentication.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<HttpInputAuthentication, Void> PARSER =
    new ConstructingObjectParser<>(HttpInputAuthentication.class.getName(), false, args -> new HttpInputAuthentication());

  static {
    PARSER.declareObject(HttpInputAuthentication::setBasic, (p, t) -> HttpInputBasicAuthentication.PARSER.apply(p, null), BASIC);
  }

}
