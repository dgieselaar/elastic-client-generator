
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

public class FlushStats  implements XContentable<FlushStats> {
  
  static final ParseField PERIODIC = new ParseField("periodic");
  private Long _periodic;
  public Long getPeriodic() { return this._periodic; }
  public FlushStats setPeriodic(Long val) { this._periodic = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public FlushStats setTotal(Long val) { this._total = val; return this; }


  static final ParseField TOTAL_TIME = new ParseField("total_time");
  private String _totalTime;
  public String getTotalTime() { return this._totalTime; }
  public FlushStats setTotalTime(String val) { this._totalTime = val; return this; }


  static final ParseField TOTAL_TIME_IN_MILLIS = new ParseField("total_time_in_millis");
  private Long _totalTimeInMillis;
  public Long getTotalTimeInMillis() { return this._totalTimeInMillis; }
  public FlushStats setTotalTimeInMillis(Long val) { this._totalTimeInMillis = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public FlushStats fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return FlushStats.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<FlushStats, Void> PARSER =
    new ConstructingObjectParser<>(FlushStats.class.getName(), false, args -> new FlushStats());

  static {
    PARSER.declareLong(FlushStats::setPeriodic, PERIODIC);
    PARSER.declareLong(FlushStats::setTotal, TOTAL);
    PARSER.declareString(FlushStats::setTotalTime, TOTAL_TIME);
    PARSER.declareLong(FlushStats::setTotalTimeInMillis, TOTAL_TIME_IN_MILLIS);
  }

}
