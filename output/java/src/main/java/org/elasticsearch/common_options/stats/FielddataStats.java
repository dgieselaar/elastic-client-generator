
package org.elasticsearch.common_options.stats;

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

public class FielddataStats  implements XContentable<FielddataStats> {
  
  static final ParseField EVICTIONS = new ParseField("evictions");
  private Long _evictions;
  public Long getEvictions() { return this._evictions; }
  public FielddataStats setEvictions(Long val) { this._evictions = val; return this; }


  static final ParseField MEMORY_SIZE_IN_BYTES = new ParseField("memory_size_in_bytes");
  private Long _memorySizeInBytes;
  public Long getMemorySizeInBytes() { return this._memorySizeInBytes; }
  public FielddataStats setMemorySizeInBytes(Long val) { this._memorySizeInBytes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FielddataStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FielddataStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FielddataStats, Void> PARSER =
    new ConstructingObjectParser<>(FielddataStats.class.getName(), false, args -> new FielddataStats());

  static {
    PARSER.declareLong(FielddataStats::setEvictions, EVICTIONS);
    PARSER.declareLong(FielddataStats::setMemorySizeInBytes, MEMORY_SIZE_IN_BYTES);
  }

}
