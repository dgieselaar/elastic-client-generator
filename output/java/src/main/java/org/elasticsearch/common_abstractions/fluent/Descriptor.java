
package org.elasticsearch.common_abstractions.fluent;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class Descriptor  implements XContentable<Descriptor> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Descriptor fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Descriptor.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Descriptor, Void> PARSER =
    new ConstructingObjectParser<>(Descriptor.class.getName(), false, args -> new Descriptor());

  static {
    
  }

}
