
package org.elasticsearch.search.scroll.clear_scroll;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class ClearScrollRequest  implements XContentable<ClearScrollRequest> {
  
  static final ParseField SCROLL_ID = new ParseField("scroll_id");
  private List<String> _scrollId;
  public List<String> getScrollId() { return this._scrollId; }
  public ClearScrollRequest setScrollId(List<String> val) { this._scrollId = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearScrollRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearScrollRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearScrollRequest, Void> PARSER =
    new ConstructingObjectParser<>(ClearScrollRequest.class.getName(), false, args -> new ClearScrollRequest());

  static {
    PARSER.declareStringArray(ClearScrollRequest::setScrollId, SCROLL_ID);
  }

}
