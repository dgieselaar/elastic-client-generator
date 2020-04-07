
package org.elasticsearch.x_pack.watcher.acknowledge_watch;

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

public class ExecutionState  implements XContentable<ExecutionState> {
  
  static final ParseField SUCCESSFUL = new ParseField("successful");
  private Boolean _successful;
  public Boolean getSuccessful() { return this._successful; }
  public ExecutionState setSuccessful(Boolean val) { this._successful = val; return this; }


  static final ParseField TIMESTAMP = new ParseField("timestamp");
  private Date _timestamp;
  public Date getTimestamp() { return this._timestamp; }
  public ExecutionState setTimestamp(Date val) { this._timestamp = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ExecutionState fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ExecutionState.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ExecutionState, Void> PARSER =
    new ConstructingObjectParser<>(ExecutionState.class.getName(), false, args -> new ExecutionState());

  static {
    PARSER.declareBoolean(ExecutionState::setSuccessful, SUCCESSFUL);
    PARSER.declareDate(ExecutionState::setTimestamp, (p, t) -> Date.createFrom(p), TIMESTAMP);
  }

}
