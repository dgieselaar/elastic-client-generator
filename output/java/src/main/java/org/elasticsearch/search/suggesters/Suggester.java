
package org.elasticsearch.search.suggesters;

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

public class Suggester  implements XContentable<Suggester> {
  
  static final ParseField ANALYZER = new ParseField("analyzer");
  private String _analyzer;
  public String getAnalyzer() { return this._analyzer; }
  public Suggester setAnalyzer(String val) { this._analyzer = val; return this; }


  static final ParseField FIELD = new ParseField("field");
  private Field _field;
  public Field getField() { return this._field; }
  public Suggester setField(Field val) { this._field = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public Suggester setSize(Integer val) { this._size = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public Suggester fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return Suggester.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<Suggester, Void> PARSER =
    new ConstructingObjectParser<>(Suggester.class.getName(), false, args -> new Suggester());

  static {
    PARSER.declareString(Suggester::setAnalyzer, ANALYZER);
    PARSER.declareField(Suggester::setField, (p, t) -> Field.createFrom(p), FIELD);
    PARSER.declareInteger(Suggester::setSize, SIZE);
  }

}
