
package org.elasticsearch.search.suggesters.phrase_suggester;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class PhraseSuggestHighlight  implements XContentable<PhraseSuggestHighlight> {
  
  static final ParseField POST_TAG = new ParseField("post_tag");
  private String _postTag;
  public String getPostTag() { return this._postTag; }
  public PhraseSuggestHighlight setPostTag(String val) { this._postTag = val; return this; }


  static final ParseField PRE_TAG = new ParseField("pre_tag");
  private String _preTag;
  public String getPreTag() { return this._preTag; }
  public PhraseSuggestHighlight setPreTag(String val) { this._preTag = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public PhraseSuggestHighlight fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return PhraseSuggestHighlight.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<PhraseSuggestHighlight, Void> PARSER =
    new ConstructingObjectParser<>(PhraseSuggestHighlight.class.getName(), false, args -> new PhraseSuggestHighlight());

  static {
    PARSER.declareString(PhraseSuggestHighlight::setPostTag, POST_TAG);
    PARSER.declareString(PhraseSuggestHighlight::setPreTag, PRE_TAG);
  }

}
