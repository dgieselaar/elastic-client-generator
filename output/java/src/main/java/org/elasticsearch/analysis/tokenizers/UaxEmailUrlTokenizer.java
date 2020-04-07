
package org.elasticsearch.analysis.tokenizers;

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

public class UaxEmailUrlTokenizer  implements XContentable<UaxEmailUrlTokenizer> {
  
  static final ParseField MAX_TOKEN_LENGTH = new ParseField("max_token_length");
  private Integer _maxTokenLength;
  public Integer getMaxTokenLength() { return this._maxTokenLength; }
  public UaxEmailUrlTokenizer setMaxTokenLength(Integer val) { this._maxTokenLength = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public UaxEmailUrlTokenizer fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return UaxEmailUrlTokenizer.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<UaxEmailUrlTokenizer, Void> PARSER =
    new ConstructingObjectParser<>(UaxEmailUrlTokenizer.class.getName(), false, args -> new UaxEmailUrlTokenizer());

  static {
    PARSER.declareInteger(UaxEmailUrlTokenizer::setMaxTokenLength, MAX_TOKEN_LENGTH);
  }

}
