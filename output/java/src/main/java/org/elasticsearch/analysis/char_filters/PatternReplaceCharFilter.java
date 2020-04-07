
package org.elasticsearch.analysis.char_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PatternReplaceCharFilter  implements XContentable<PatternReplaceCharFilter> {
  
  static final ParseField FLAGS = new ParseField("flags");
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternReplaceCharFilter setFlags(String val) { this._flags = val; return this; }


  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternReplaceCharFilter setPattern(String val) { this._pattern = val; return this; }


  static final ParseField REPLACEMENT = new ParseField("replacement");
  private String _replacement;
  public String getReplacement() { return this._replacement; }
  public PatternReplaceCharFilter setReplacement(String val) { this._replacement = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PatternReplaceCharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PatternReplaceCharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PatternReplaceCharFilter, Void> PARSER =
    new ConstructingObjectParser<>(PatternReplaceCharFilter.class.getName(), false, args -> new PatternReplaceCharFilter());

  static {
    PARSER.declareString(PatternReplaceCharFilter::setFlags, FLAGS);
    PARSER.declareString(PatternReplaceCharFilter::setPattern, PATTERN);
    PARSER.declareString(PatternReplaceCharFilter::setReplacement, REPLACEMENT);
  }

}
