
package org.elasticsearch.modules.snapshot_and_restore.repositories.create_repository;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class CreateRepositoryResponse  implements XContentable<CreateRepositoryResponse> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CreateRepositoryResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CreateRepositoryResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CreateRepositoryResponse, Void> PARSER =
    new ConstructingObjectParser<>(CreateRepositoryResponse.class.getName(), false, args -> new CreateRepositoryResponse());

  static {
    
  }

}
