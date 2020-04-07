
package org.elasticsearch.cat.cat_tasks;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.cat.cat_tasks.*;

public class CatTasksResponse  implements XContentable<CatTasksResponse> {
  
  static final ParseField RECORDS = new ParseField("records");
  private List<CatTasksRecord> _records;
  public List<CatTasksRecord> getRecords() { return this._records; }
  public CatTasksResponse setRecords(List<CatTasksRecord> val) { this._records = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatTasksResponse fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatTasksResponse.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatTasksResponse, Void> PARSER =
    new ConstructingObjectParser<>(CatTasksResponse.class.getName(), false, args -> new CatTasksResponse());

  static {
    PARSER.declareObjectArray(CatTasksResponse::setRecords, (p, t) -> CatTasksRecord.PARSER.apply(p), RECORDS);
  }

}
