
package org.elasticsearch.search.suggesters.phrase_suggester.smoothing_model;

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

public class LinearInterpolationSmoothingModel  implements XContentable<LinearInterpolationSmoothingModel> {
  
  static final ParseField BIGRAM_LAMBDA = new ParseField("bigram_lambda");
  private Double _bigramLambda;
  public Double getBigramLambda() { return this._bigramLambda; }
  public LinearInterpolationSmoothingModel setBigramLambda(Double val) { this._bigramLambda = val; return this; }


  static final ParseField TRIGRAM_LAMBDA = new ParseField("trigram_lambda");
  private Double _trigramLambda;
  public Double getTrigramLambda() { return this._trigramLambda; }
  public LinearInterpolationSmoothingModel setTrigramLambda(Double val) { this._trigramLambda = val; return this; }


  static final ParseField UNIGRAM_LAMBDA = new ParseField("unigram_lambda");
  private Double _unigramLambda;
  public Double getUnigramLambda() { return this._unigramLambda; }
  public LinearInterpolationSmoothingModel setUnigramLambda(Double val) { this._unigramLambda = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LinearInterpolationSmoothingModel fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LinearInterpolationSmoothingModel.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LinearInterpolationSmoothingModel, Void> PARSER =
    new ConstructingObjectParser<>(LinearInterpolationSmoothingModel.class.getName(), false, args -> new LinearInterpolationSmoothingModel());

  static {
    PARSER.declareDouble(LinearInterpolationSmoothingModel::setBigramLambda, BIGRAM_LAMBDA);
    PARSER.declareDouble(LinearInterpolationSmoothingModel::setTrigramLambda, TRIGRAM_LAMBDA);
    PARSER.declareDouble(LinearInterpolationSmoothingModel::setUnigramLambda, UNIGRAM_LAMBDA);
  }

}
