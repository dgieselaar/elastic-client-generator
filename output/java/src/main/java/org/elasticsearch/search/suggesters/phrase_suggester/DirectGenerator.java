
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


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common.*;

public class DirectGenerator  implements XContentable<DirectGenerator> {
  
  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public DirectGenerator setField(Field val) { this._field = val; return this; }


  static final ParseField MAX_EDITS = new ParseField("max_edits");
  private Integer _maxEdits;
  public Integer getMaxEdits() { return this._maxEdits; }
  public DirectGenerator setMaxEdits(Integer val) { this._maxEdits = val; return this; }


  static final ParseField MAX_INSPECTIONS = new ParseField("max_inspections");
  private Float _maxInspections;
  public Float getMaxInspections() { return this._maxInspections; }
  public DirectGenerator setMaxInspections(Float val) { this._maxInspections = val; return this; }


  static final ParseField MAX_TERM_FREQ = new ParseField("max_term_freq");
  private Float _maxTermFreq;
  public Float getMaxTermFreq() { return this._maxTermFreq; }
  public DirectGenerator setMaxTermFreq(Float val) { this._maxTermFreq = val; return this; }


  static final ParseField MIN_DOC_FREQ = new ParseField("min_doc_freq");
  private Float _minDocFreq;
  public Float getMinDocFreq() { return this._minDocFreq; }
  public DirectGenerator setMinDocFreq(Float val) { this._minDocFreq = val; return this; }


  static final ParseField MIN_WORD_LENGTH = new ParseField("min_word_length");
  private Integer _minWordLength;
  public Integer getMinWordLength() { return this._minWordLength; }
  public DirectGenerator setMinWordLength(Integer val) { this._minWordLength = val; return this; }


  static final ParseField POST_FILTER = new ParseField("post_filter");
  private String _postFilter;
  public String getPostFilter() { return this._postFilter; }
  public DirectGenerator setPostFilter(String val) { this._postFilter = val; return this; }


  static final ParseField PRE_FILTER = new ParseField("pre_filter");
  private String _preFilter;
  public String getPreFilter() { return this._preFilter; }
  public DirectGenerator setPreFilter(String val) { this._preFilter = val; return this; }


  static final ParseField PREFIX_LENGTH = new ParseField("prefix_length");
  private Integer _prefixLength;
  public Integer getPrefixLength() { return this._prefixLength; }
  public DirectGenerator setPrefixLength(Integer val) { this._prefixLength = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public DirectGenerator setSize(Integer val) { this._size = val; return this; }


  static final ParseField SUGGEST_MODE = new ParseField("suggest_mode");
  private SuggestMode _suggestMode;
  public SuggestMode getSuggestMode() { return this._suggestMode; }
  public DirectGenerator setSuggestMode(SuggestMode val) { this._suggestMode = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public DirectGenerator fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return DirectGenerator.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<DirectGenerator, Void> PARSER =
    new ConstructingObjectParser<>(DirectGenerator.class.getName(), false, args -> new DirectGenerator());

  static {
    PARSER.declareField(DirectGenerator::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareInteger(DirectGenerator::setMaxEdits, MAX_EDITS);
    PARSER.declareFloat(DirectGenerator::setMaxInspections, MAX_INSPECTIONS);
    PARSER.declareFloat(DirectGenerator::setMaxTermFreq, MAX_TERM_FREQ);
    PARSER.declareFloat(DirectGenerator::setMinDocFreq, MIN_DOC_FREQ);
    PARSER.declareInteger(DirectGenerator::setMinWordLength, MIN_WORD_LENGTH);
    PARSER.declareString(DirectGenerator::setPostFilter, POST_FILTER);
    PARSER.declareString(DirectGenerator::setPreFilter, PRE_FILTER);
    PARSER.declareInteger(DirectGenerator::setPrefixLength, PREFIX_LENGTH);
    PARSER.declareInteger(DirectGenerator::setSize, SIZE);
    PARSER.declareObject(DirectGenerator::setSuggestMode, (p, t) -> SuggestMode.PARSER.apply(p, null), SUGGEST_MODE);
  }

}
