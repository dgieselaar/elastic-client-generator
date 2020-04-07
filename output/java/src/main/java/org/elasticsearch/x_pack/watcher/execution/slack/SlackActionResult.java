
package org.elasticsearch.x_pack.watcher.execution.slack;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.execution.slack.*;

public class SlackActionResult  implements XContentable<SlackActionResult> {
  
  static final ParseField ACCOUNT = new ParseField("account");
  private String _account;
  public String getAccount() { return this._account; }
  public SlackActionResult setAccount(String val) { this._account = val; return this; }


  static final ParseField SENT_MESSAGES = new ParseField("sent_messages");
  private List<SlackActionMessageResult> _sentMessages;
  public List<SlackActionMessageResult> getSentMessages() { return this._sentMessages; }
  public SlackActionResult setSentMessages(List<SlackActionMessageResult> val) { this._sentMessages = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public SlackActionResult fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return SlackActionResult.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<SlackActionResult, Void> PARSER =
    new ConstructingObjectParser<>(SlackActionResult.class.getName(), false, args -> new SlackActionResult());

  static {
    PARSER.declareString(SlackActionResult::setAccount, ACCOUNT);
    PARSER.declareObjectArray(SlackActionResult::setSentMessages, (p, t) -> SlackActionMessageResult.PARSER.apply(p), SENT_MESSAGES);
  }

}
