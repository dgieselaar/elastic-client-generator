
package org.elasticsearch.cluster.nodes_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class ClusterOperatingSystemPrettyNane  implements XContentable<ClusterOperatingSystemPrettyNane> {
  
  static final ParseField COUNT = new ParseField("count");
  private Integer _count;
  public Integer getCount() { return this._count; }
  public ClusterOperatingSystemPrettyNane setCount(Integer val) { this._count = val; return this; }


  static final ParseField PRETTY_NAME = new ParseField("pretty_name");
  private String _prettyName;
  public String getPrettyName() { return this._prettyName; }
  public ClusterOperatingSystemPrettyNane setPrettyName(String val) { this._prettyName = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ClusterOperatingSystemPrettyNane fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ClusterOperatingSystemPrettyNane.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ClusterOperatingSystemPrettyNane, Void> PARSER =
    new ConstructingObjectParser<>(ClusterOperatingSystemPrettyNane.class.getName(), false, args -> new ClusterOperatingSystemPrettyNane());

  static {
    PARSER.declareInteger(ClusterOperatingSystemPrettyNane::setCount, COUNT);
    PARSER.declareString(ClusterOperatingSystemPrettyNane::setPrettyName, PRETTY_NAME);
  }

}
