
package org.elasticsearch.x_pack.ilm.put_lifecycle;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PutLifecycleResponse  implements XContentable<PutLifecycleResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PutLifecycleResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PutLifecycleResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PutLifecycleResponse, Void> PARSER =
    new ConstructingObjectParser<>(PutLifecycleResponse.class.getName(), false, args -> new PutLifecycleResponse());

  static {
    
  }

}
