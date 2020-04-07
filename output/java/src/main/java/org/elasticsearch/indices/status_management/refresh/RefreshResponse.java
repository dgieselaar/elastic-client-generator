
package org.elasticsearch.indices.status_management.refresh;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RefreshResponse  implements XContentable<RefreshResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RefreshResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RefreshResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RefreshResponse, Void> PARSER =
    new ConstructingObjectParser<>(RefreshResponse.class.getName(), false, args -> new RefreshResponse());

  static {
    
  }

}
