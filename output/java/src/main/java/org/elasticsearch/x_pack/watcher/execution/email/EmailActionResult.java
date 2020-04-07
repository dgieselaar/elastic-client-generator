
package org.elasticsearch.x_pack.watcher.execution.email;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.execution.email.*;

public class EmailActionResult  implements XContentable<EmailActionResult> {
  
  static final ParseField ACCOUNT = new ParseField("account");
  private String _account;
  public String getAccount() { return this._account; }
  public EmailActionResult setAccount(String val) { this._account = val; return this; }


  static final ParseField MESSAGE = new ParseField("message");
  private EmailResult _message;
  public EmailResult getMessage() { return this._message; }
  public EmailActionResult setMessage(EmailResult val) { this._message = val; return this; }


  static final ParseField REASON = new ParseField("reason");
  private String _reason;
  public String getReason() { return this._reason; }
  public EmailActionResult setReason(String val) { this._reason = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public EmailActionResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return EmailActionResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<EmailActionResult, Void> PARSER =
    new ConstructingObjectParser<>(EmailActionResult.class.getName(), false, args -> new EmailActionResult());

  static {
    PARSER.declareString(EmailActionResult::setAccount, ACCOUNT);
    PARSER.declareObject(EmailActionResult::setMessage, (p, t) -> EmailResult.PARSER.apply(p, null), MESSAGE);
    PARSER.declareString(EmailActionResult::setReason, REASON);
  }

}
