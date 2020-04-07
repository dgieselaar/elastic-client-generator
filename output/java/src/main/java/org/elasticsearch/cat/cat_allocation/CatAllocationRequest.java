
package org.elasticsearch.cat.cat_allocation;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common.*;
import org.elasticsearch.common_options.time_unit.*;

public class CatAllocationRequest  implements XContentable<CatAllocationRequest> {
  
  static final ParseField BYTES = new ParseField("bytes");
  private Bytes _bytes;
  public Bytes getBytes() { return this._bytes; }
  public CatAllocationRequest setBytes(Bytes val) { this._bytes = val; return this; }


  static final ParseField FORMAT = new ParseField("format");
  private String _format;
  public String getFormat() { return this._format; }
  public CatAllocationRequest setFormat(String val) { this._format = val; return this; }


  static final ParseField HEADERS = new ParseField("headers");
  private List<String> _headers;
  public List<String> getHeaders() { return this._headers; }
  public CatAllocationRequest setHeaders(List<String> val) { this._headers = val; return this; }


  static final ParseField HELP = new ParseField("help");
  private Boolean _help;
  public Boolean getHelp() { return this._help; }
  public CatAllocationRequest setHelp(Boolean val) { this._help = val; return this; }


  static final ParseField LOCAL = new ParseField("local");
  private Boolean _local;
  public Boolean getLocal() { return this._local; }
  public CatAllocationRequest setLocal(Boolean val) { this._local = val; return this; }


  static final ParseField MASTER_TIMEOUT = new ParseField("master_timeout");
  private Time _masterTimeout;
  public Time getMasterTimeout() { return this._masterTimeout; }
  public CatAllocationRequest setMasterTimeout(Time val) { this._masterTimeout = val; return this; }


  static final ParseField SORT_BY_COLUMNS = new ParseField("sort_by_columns");
  private List<String> _sortByColumns;
  public List<String> getSortByColumns() { return this._sortByColumns; }
  public CatAllocationRequest setSortByColumns(List<String> val) { this._sortByColumns = val; return this; }


  static final ParseField VERBOSE = new ParseField("verbose");
  private Boolean _verbose;
  public Boolean getVerbose() { return this._verbose; }
  public CatAllocationRequest setVerbose(Boolean val) { this._verbose = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatAllocationRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatAllocationRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatAllocationRequest, Void> PARSER =
    new ConstructingObjectParser<>(CatAllocationRequest.class.getName(), false, args -> new CatAllocationRequest());

  static {
    PARSER.declareObject(CatAllocationRequest::setBytes, (p, t) -> Bytes.PARSER.apply(p, null), BYTES);
    PARSER.declareString(CatAllocationRequest::setFormat, FORMAT);
    PARSER.declareStringArray(CatAllocationRequest::setHeaders, HEADERS);
    PARSER.declareBoolean(CatAllocationRequest::setHelp, HELP);
    PARSER.declareBoolean(CatAllocationRequest::setLocal, LOCAL);
    PARSER.declareObject(CatAllocationRequest::setMasterTimeout, (p, t) -> Time.PARSER.apply(p, null), MASTER_TIMEOUT);
    PARSER.declareStringArray(CatAllocationRequest::setSortByColumns, SORT_BY_COLUMNS);
    PARSER.declareBoolean(CatAllocationRequest::setVerbose, VERBOSE);
  }

}
