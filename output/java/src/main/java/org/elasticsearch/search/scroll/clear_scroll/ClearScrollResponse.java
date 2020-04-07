
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




public class ClearScrollResponse  implements XContentable<ClearScrollResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClearScrollResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClearScrollResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClearScrollResponse, Void> PARSER =
    new ConstructingObjectParser<>(ClearScrollResponse.class.getName(), false, args -> new ClearScrollResponse());

  static {
    
  }

}
