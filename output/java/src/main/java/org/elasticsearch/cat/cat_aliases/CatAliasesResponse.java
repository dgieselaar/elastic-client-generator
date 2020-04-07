
package org.elasticsearch.cat.cat_aliases;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_aliases.*;

public class CatAliasesResponse  implements XContentable<CatAliasesResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatAliasesRecord> _records;
  public List<CatAliasesRecord> getRecords() { return this._records; }
  public CatAliasesResponse setRecords(List<CatAliasesRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatAliasesResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatAliasesResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatAliasesResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatAliasesResponse.class.getName(), false, args -> new CatAliasesResponse());

  static {
    PARSER.declareObjectArray(CatAliasesResponse::setRecords, (p, t) -> CatAliasesRecord.PARSER.apply(p), RECORDS);
  }

}
