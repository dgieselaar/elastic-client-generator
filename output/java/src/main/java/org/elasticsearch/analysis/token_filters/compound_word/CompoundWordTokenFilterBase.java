
package org.elasticsearch.analysis.token_filters.compound_word;

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

public class CompoundWordTokenFilterBase  implements XContentable<CompoundWordTokenFilterBase> {
  
  static final ParseField HYPHENATION_PATTERNS_PATH = new ParseField("hyphenation_patterns_path");
  private String _hyphenationPatternsPath;
  public String getHyphenationPatternsPath() { return this._hyphenationPatternsPath; }
  public CompoundWordTokenFilterBase setHyphenationPatternsPath(String val) { this._hyphenationPatternsPath = val; return this; }


  static final ParseField MAX_SUBWORD_SIZE = new ParseField("max_subword_size");
  private Integer _maxSubwordSize;
  public Integer getMaxSubwordSize() { return this._maxSubwordSize; }
  public CompoundWordTokenFilterBase setMaxSubwordSize(Integer val) { this._maxSubwordSize = val; return this; }


  static final ParseField MIN_SUBWORD_SIZE = new ParseField("min_subword_size");
  private Integer _minSubwordSize;
  public Integer getMinSubwordSize() { return this._minSubwordSize; }
  public CompoundWordTokenFilterBase setMinSubwordSize(Integer val) { this._minSubwordSize = val; return this; }


  static final ParseField MIN_WORD_SIZE = new ParseField("min_word_size");
  private Integer _minWordSize;
  public Integer getMinWordSize() { return this._minWordSize; }
  public CompoundWordTokenFilterBase setMinWordSize(Integer val) { this._minWordSize = val; return this; }


  static final ParseField ONLY_LONGEST_MATCH = new ParseField("only_longest_match");
  private Boolean _onlyLongestMatch;
  public Boolean getOnlyLongestMatch() { return this._onlyLongestMatch; }
  public CompoundWordTokenFilterBase setOnlyLongestMatch(Boolean val) { this._onlyLongestMatch = val; return this; }


  static final ParseField WORD_LIST = new ParseField("word_list");
  private List<String> _wordList;
  public List<String> getWordList() { return this._wordList; }
  public CompoundWordTokenFilterBase setWordList(List<String> val) { this._wordList = val; return this; }


  static final ParseField WORD_LIST_PATH = new ParseField("word_list_path");
  private String _wordListPath;
  public String getWordListPath() { return this._wordListPath; }
  public CompoundWordTokenFilterBase setWordListPath(String val) { this._wordListPath = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CompoundWordTokenFilterBase fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CompoundWordTokenFilterBase.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CompoundWordTokenFilterBase, Void> PARSER =
    new ConstructingObjectParser<>(CompoundWordTokenFilterBase.class.getName(), false, args -> new CompoundWordTokenFilterBase());

  static {
    PARSER.declareString(CompoundWordTokenFilterBase::setHyphenationPatternsPath, HYPHENATION_PATTERNS_PATH);
    PARSER.declareInteger(CompoundWordTokenFilterBase::setMaxSubwordSize, MAX_SUBWORD_SIZE);
    PARSER.declareInteger(CompoundWordTokenFilterBase::setMinSubwordSize, MIN_SUBWORD_SIZE);
    PARSER.declareInteger(CompoundWordTokenFilterBase::setMinWordSize, MIN_WORD_SIZE);
    PARSER.declareBoolean(CompoundWordTokenFilterBase::setOnlyLongestMatch, ONLY_LONGEST_MATCH);
    PARSER.declareStringArray(CompoundWordTokenFilterBase::setWordList, WORD_LIST);
    PARSER.declareString(CompoundWordTokenFilterBase::setWordListPath, WORD_LIST_PATH);
  }

}
