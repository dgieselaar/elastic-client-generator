
package org.elasticsearch.cat.cat_node_attributes;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_options.time_unit.*;

public class CatNodeAttributesRequest  implements XContentable<CatNodeAttributesRequest> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatNodeAttributesRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatNodeAttributesRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatNodeAttributesRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatNodeAttributesRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatNodeAttributesRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatNodeAttributesRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatNodeAttributesRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatNodeAttributesRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatNodeAttributesRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatNodeAttributesRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatNodeAttributesRequest.class.getName(), false, args -> new CatNodeAttributesRequest());

  static {
    PARSER.declareString(CatNodeAttributesRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatNodeAttributesRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatNodeAttributesRequest::setHelp, HELP);
    PARSER.declareBoolean(CatNodeAttributesRequest::setLocal, LOCAL);
    PARSER.declareObject(CatNodeAttributesRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareStringArray(CatNodeAttributesRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatNodeAttributesRequest::setVerbose, VERBOSE);
  }

}
