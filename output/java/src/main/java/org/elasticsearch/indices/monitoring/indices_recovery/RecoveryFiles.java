
package org.elasticsearch.indices.monitoring.indices_recovery;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.indices.monitoring.indices_recovery.*;
import org.elasticsearch.internal.*;

public class RecoveryFiles  implements XContentable<RecoveryFiles> {
  
  static final ParseField DETAILS = new ParseField("details");
  private List<RecoveryFileDetails> _details;
  public List<RecoveryFileDetails> getDetails() { return this._details; }
  public RecoveryFiles setDetails(List<RecoveryFileDetails> val) { this._details = val; return this; }


  static final ParseField PERCENT = new ParseField("percent");
  private String _percent;
  public String getPercent() { return this._percent; }
  public RecoveryFiles setPercent(String val) { this._percent = val; return this; }


  static final ParseField RECOVERED = new ParseField("recovered");
  private Long _recovered;
  public Long getRecovered() { return this._recovered; }
  public RecoveryFiles setRecovered(Long val) { this._recovered = val; return this; }


  static final ParseField REUSED = new ParseField("reused");
  private Long _reused;
  public Long getReused() { return this._reused; }
  public RecoveryFiles setReused(Long val) { this._reused = val; return this; }


  static final ParseField TOTAL = new ParseField("total");
  private Long _total;
  public Long getTotal() { return this._total; }
  public RecoveryFiles setTotal(Long val) { this._total = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RecoveryFiles fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RecoveryFiles.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RecoveryFiles, Void> PARSER =
    new ConstructingObjectParser<>(RecoveryFiles.class.getName(), false, args -> new RecoveryFiles());

  static {
    PARSER.declareObjectArray(RecoveryFiles::setDetails, (p, t) -> RecoveryFileDetails.PARSER.apply(p), DETAILS);
    PARSER.declareString(RecoveryFiles::setPercent, PERCENT);
    PARSER.declareLong(RecoveryFiles::setRecovered, RECOVERED);
    PARSER.declareLong(RecoveryFiles::setReused, REUSED);
    PARSER.declareLong(RecoveryFiles::setTotal, TOTAL);
  }

}
