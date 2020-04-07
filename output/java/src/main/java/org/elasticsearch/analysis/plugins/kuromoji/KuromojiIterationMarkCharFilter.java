
package org.elasticsearch.analysis.plugins.kuromoji;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class KuromojiIterationMarkCharFilter  implements XContentable<KuromojiIterationMarkCharFilter> {
  
  static final ParseField NORMALIZE_KANA = new ParseField("normalize_kana");
  private Boolean _normalizeKana;
  public Boolean getNormalizeKana() { return this._normalizeKana; }
  public KuromojiIterationMarkCharFilter setNormalizeKana(Boolean val) { this._normalizeKana = val; return this; }


  static final ParseField NORMALIZE_KANJI = new ParseField("normalize_kanji");
  private Boolean _normalizeKanji;
  public Boolean getNormalizeKanji() { return this._normalizeKanji; }
  public KuromojiIterationMarkCharFilter setNormalizeKanji(Boolean val) { this._normalizeKanji = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public KuromojiIterationMarkCharFilter fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return KuromojiIterationMarkCharFilter.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<KuromojiIterationMarkCharFilter, Void> PARSER =
    new ConstructingObjectParser<>(KuromojiIterationMarkCharFilter.class.getName(), false, args -> new KuromojiIterationMarkCharFilter());

  static {
    PARSER.declareBoolean(KuromojiIterationMarkCharFilter::setNormalizeKana, NORMALIZE_KANA);
    PARSER.declareBoolean(KuromojiIterationMarkCharFilter::setNormalizeKanji, NORMALIZE_KANJI);
  }

}
