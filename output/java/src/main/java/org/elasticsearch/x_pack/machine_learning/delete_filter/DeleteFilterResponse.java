
package org.elasticsearch.x_pack.machine_learning.delete_filter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteFilterResponse  implements XContentable<DeleteFilterResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteFilterResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteFilterResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteFilterResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteFilterResponse.class.getName(), false, args -> new DeleteFilterResponse());

  static {
    
  }

}
