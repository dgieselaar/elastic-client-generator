
package org.elasticsearch.x_pack.watcher.action.pager_duty;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.watcher.action.pager_duty.*;

public class PagerDutyContext  implements XContentable<PagerDutyContext> {
  
  static final ParseField HREF = new ParseField("href");
  private String _href;
  public String getHref() { return this._href; }
  public PagerDutyContext setHref(String val) { this._href = val; return this; }


  static final ParseField SRC = new ParseField("src");
  private String _src;
  public String getSrc() { return this._src; }
  public PagerDutyContext setSrc(String val) { this._src = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private PagerDutyContextType _type;
  public PagerDutyContextType getType() { return this._type; }
  public PagerDutyContext setType(PagerDutyContextType val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PagerDutyContext fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PagerDutyContext.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PagerDutyContext, Void> PARSER =
    new ConstructingObjectParser<>(PagerDutyContext.class.getName(), false, args -> new PagerDutyContext());

  static {
    PARSER.declareString(PagerDutyContext::setHref, HREF);
    PARSER.declareString(PagerDutyContext::setSrc, SRC);
    PARSER.declareObject(PagerDutyContext::setType, (p, t) -> PagerDutyContextType.PARSER.apply(p, null), TYPE);
  }

}
