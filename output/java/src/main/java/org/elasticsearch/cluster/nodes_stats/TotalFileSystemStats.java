
package org.elasticsearch.cluster.nodes_stats;

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

public class TotalFileSystemStats  implements XContentable<TotalFileSystemStats> {
  
  static final ParseField AVAILABLE = new ParseField("available");
  private String _available;
  public String getAvailable() { return this._available; }
  public TotalFileSystemStats setAvailable(String val) { this._available = val; return this; }


  static final ParseField AVAILABLE_IN_BYTES = new ParseField("available_in_bytes");
  private Long _availableInBytes;
  public Long getAvailableInBytes() { return this._availableInBytes; }
  public TotalFileSystemStats setAvailableInBytes(Long val) { this._availableInBytes = val; return this; }


  static final ParseField FREE = new ParseField("free");
  private String _free;
  public String getFree() { return this._free; }
  public TotalFileSystemStats setFree(String val) { this._free = val; return this; }


  static final ParseField FREE_IN_BYTES = new ParseField("free_in_bytes");
  private Long _freeInBytes;
  public Long getFreeInBytes() { return this._freeInBytes; }
  public TotalFileSystemStats setFreeInBytes(Long val) { this._freeInBytes = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private String _total;
  public String getTotal() { return this._total; }
  public TotalFileSystemStats setTotal(String val) { this._total = val; return this; }


  static final ParseField TOTAL_IN_BYTES = new ParseField("total_in_bytes");
  private Long _totalInBytes;
  public Long getTotalInBytes() { return this._totalInBytes; }
  public TotalFileSystemStats setTotalInBytes(Long val) { this._totalInBytes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public TotalFileSystemStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return TotalFileSystemStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<TotalFileSystemStats, Void> PARSER =
    new ConstructingObjectParser<>(TotalFileSystemStats.class.getName(), false, args -> new TotalFileSystemStats());

  static {
    PARSER.declareString(TotalFileSystemStats::setAvailable, AVAILABLE);
    PARSER.declareLong(TotalFileSystemStats::setAvailableInBytes, AVAILABLE_IN_BYTES);
    PARSER.declareString(TotalFileSystemStats::setFree, FREE);
    PARSER.declareLong(TotalFileSystemStats::setFreeInBytes, FREE_IN_BYTES);
    PARSER.declareString(TotalFileSystemStats::setTotal, TOTAL);
    PARSER.declareLong(TotalFileSystemStats::setTotalInBytes, TOTAL_IN_BYTES);
  }

}
