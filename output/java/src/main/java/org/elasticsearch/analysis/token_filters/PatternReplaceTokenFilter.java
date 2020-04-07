
package org.elasticsearch.analysis.token_filters;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PatternReplaceTokenFilter  implements XContentable<PatternReplaceTokenFilter> {
  
  static final ParseField FLAGS = new ParseField("flags");
  private String _flags;
  public String getFlags() { return this._flags; }
  public PatternReplaceTokenFilter setFlags(String val) { this._flags = val; return this; }


  static final ParseField PATTERN = new ParseField("pattern");
  private String _pattern;
  public String getPattern() { return this._pattern; }
  public PatternReplaceTokenFilter setPattern(String val) { this._pattern = val; return this; }


  static final ParseField REPLACEMENT = new ParseField("replacement");
  private String _replacement;
  public String getReplacement() { return this._replacement; }
  public PatternReplaceTokenFilter setReplacement(String val) { this._replacement = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PatternReplaceTokenFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PatternReplaceTokenFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PatternReplaceTokenFilter, Void> PARSER =
    new ConstructingObjectParser<>(PatternReplaceTokenFilter.class.getName(), false, args -> new PatternReplaceTokenFilter());

  static {
    PARSER.declareString(PatternReplaceTokenFilter::setFlags, FLAGS);
    PARSER.declareString(PatternReplaceTokenFilter::setPattern, PATTERN);
    PARSER.declareString(PatternReplaceTokenFilter::setReplacement, REPLACEMENT);
  }

}
