
package org.elasticsearch.cat.cat_plugins;

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

public class CatPluginsRequest  implements XContentable<CatPluginsRequest> {
  
  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatPluginsRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatPluginsRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatPluginsRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatPluginsRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatPluginsRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatPluginsRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatPluginsRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatPluginsRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatPluginsRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatPluginsRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatPluginsRequest.class.getName(), false, args -> new CatPluginsRequest());

  static {
    PARSER.declareString(CatPluginsRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatPluginsRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatPluginsRequest::setHelp, HELP);
    PARSER.declareBoolean(CatPluginsRequest::setLocal, LOCAL);
    PARSER.declareObject(CatPluginsRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareStringArray(CatPluginsRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatPluginsRequest::setVerbose, VERBOSE);
  }

}
