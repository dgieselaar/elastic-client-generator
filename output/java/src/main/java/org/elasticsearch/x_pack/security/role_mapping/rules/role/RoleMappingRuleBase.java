
package org.elasticsearch.x_pack.security.role_mapping.rules.role;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RoleMappingRuleBase  implements XContentable<RoleMappingRuleBase> {
  

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RoleMappingRuleBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RoleMappingRuleBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RoleMappingRuleBase, Void> PARSER =
    new ConstructingObjectParser<>(RoleMappingRuleBase.class.getName(), false, args -> new RoleMappingRuleBase());

  static {
    
  }

}
