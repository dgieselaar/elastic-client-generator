
package org.elasticsearch.analysis.analyzers;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.analysis.languages.*;
import org.elasticsearch.analysis.*;

public class LanguageAnalyzer  implements XContentable<LanguageAnalyzer> {
  
  static final ParseField LANGUAGE = new ParseField("language");
  private Language _language;
  public Language getLanguage() { return this._language; }
  public LanguageAnalyzer setLanguage(Language val) { this._language = val; return this; }


  static final ParseField STEM_EXCLUSION = new ParseField("stem_exclusion");
  private List<String> _stemExclusion;
  public List<String> getStemExclusion() { return this._stemExclusion; }
  public LanguageAnalyzer setStemExclusion(List<String> val) { this._stemExclusion = val; return this; }


  static final ParseField STOPWORDS = new ParseField("stopwords");
  private StopWords _stopwords;
  public StopWords getStopwords() { return this._stopwords; }
  public LanguageAnalyzer setStopwords(StopWords val) { this._stopwords = val; return this; }


  static final ParseField STOPWORDS_PATH = new ParseField("stopwords_path");
  private String _stopwordsPath;
  public String getStopwordsPath() { return this._stopwordsPath; }
  public LanguageAnalyzer setStopwordsPath(String val) { this._stopwordsPath = val; return this; }


  static final ParseField TYPE = new ParseField("type");
  private String _type;
  public String getType() { return this._type; }
  public LanguageAnalyzer setType(String val) { this._type = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LanguageAnalyzer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LanguageAnalyzer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LanguageAnalyzer, Void> PARSER =
    new ConstructingObjectParser<>(LanguageAnalyzer.class.getName(), false, args -> new LanguageAnalyzer());

  static {
    PARSER.declareObject(LanguageAnalyzer::setLanguage, (p, t) -> Language.PARSER.apply(p, null), LANGUAGE);
    PARSER.declareStringArray(LanguageAnalyzer::setStemExclusion, STEM_EXCLUSION);
    PARSER.declareObject(LanguageAnalyzer::setStopwords, (p, t) -> StopWords.PARSER.apply(p, null), STOPWORDS);
    PARSER.declareString(LanguageAnalyzer::setStopwordsPath, STOPWORDS_PATH);
    PARSER.declareString(LanguageAnalyzer::setType, TYPE);
  }

}
