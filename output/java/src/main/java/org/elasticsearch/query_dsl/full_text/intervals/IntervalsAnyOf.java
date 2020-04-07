
package org.elasticsearch.query_dsl.full_text.intervals;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.query_dsl.full_text.intervals.*;

public class IntervalsAnyOf  implements XContentable<IntervalsAnyOf> {
  
  static final ParseField INTERVALS = new ParseField("intervals");
  private List<IntervalsContainer> _intervals;
  public List<IntervalsContainer> getIntervals() { return this._intervals; }
  public IntervalsAnyOf setIntervals(List<IntervalsContainer> val) { this._intervals = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public IntervalsAnyOf fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return IntervalsAnyOf.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<IntervalsAnyOf, Void> PARSER =
    new ConstructingObjectParser<>(IntervalsAnyOf.class.getName(), false, args -> new IntervalsAnyOf());

  static {
    PARSER.declareObjectArray(IntervalsAnyOf::setIntervals, (p, t) -> IntervalsContainer.PARSER.apply(p), INTERVALS);
  }

}
