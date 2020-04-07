
package org.elasticsearch.indices.index_management.delete_index;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class DeleteIndexResponse  implements XContentable<DeleteIndexResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DeleteIndexResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DeleteIndexResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DeleteIndexResponse, Void> PARSER =
    new ConstructingObjectParser<>(DeleteIndexResponse.class.getName(), false, args -> new DeleteIndexResponse());

  static {
    
  }

}
