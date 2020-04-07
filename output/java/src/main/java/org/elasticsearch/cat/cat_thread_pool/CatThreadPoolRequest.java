
package org.elasticsearch.cat.cat_thread_pool;

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
import org.elasticsearch.common.*;

public class CatThreadPoolRequest  implements XContentable<CatThreadPoolRequest> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatThreadPoolRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatThreadPoolRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatThreadPoolRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatThreadPoolRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatThreadPoolRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Size _size;
  public Size getSize() { return this._size; }
  public CatThreadPoolRequest setSize(Size val) { this._size = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatThreadPoolRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatThreadPoolRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatThreadPoolRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatThreadPoolRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatThreadPoolRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatThreadPoolRequest.class.getName(), false, args -> new CatThreadPoolRequest());

  static {
    PARSER.declareString(CatThreadPoolRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatThreadPoolRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatThreadPoolRequest::setHelp, HELP);
    PARSER.declareBoolean(CatThreadPoolRequest::setLocal, LOCAL);
    PARSER.declareObject(CatThreadPoolRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareObject(CatThreadPoolRequest::setSize, (p, t) -> Size.PARSER.apply(p, null), SIZE);
    PARSER.declareStringArray(CatThreadPoolRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatThreadPoolRequest::setVerbose, VERBOSE);
  }

}
