
package org.elasticsearch.search.search.highlighting;

import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;
import java.io.IOException;

public enum HighlighterFragmenter implements XContentable<HighlighterFragmenter> {
  Simple("simple"),
    Span("span");
  private final String textRepresentation;

  private HighlighterFragmenter(final String text) { this.textRepresentation = text; }

  @Override
  public String toString() { return textRepresentation; }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return builder.value(this.textRepresentation);
  }

  @Override
  public HighlighterFragmenter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PARSER.apply(parser);
  }

  public static final CheckedFunction<XContentParser, HighlighterFragmenter, IOException> PARSER = (parser) -> {
    String text = parser.text();
    switch (text) {
      case "simple": return HighlighterFragmenter.Simple;
      case "span": return HighlighterFragmenter.Span;
      default:
        String message = String.format("'%s' not a valid value for enum '%s'", text, HighlighterFragmenter.class.getName());
        throw new XContentParseException(parser.getTokenLocation(), message);
    }
  };
}
