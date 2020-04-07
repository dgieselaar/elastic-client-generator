
package org.elasticsearch.document.multiple.reindex_on_server;

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
import org.elasticsearch.document.multiple.reindex_on_server.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.time_unit.*;

public class ReindexOnServerRequest  implements XContentable<ReindexOnServerRequest> {
  
  static final ParseField CONFLICTS = new ParseField("conflicts");
  private Conflicts _conflicts;
  public Conflicts getConflicts() { return this._conflicts; }
  public ReindexOnServerRequest setConflicts(Conflicts val) { this._conflicts = val; return this; }


  static final ParseField DEST = new ParseField("dest");
  private ReindexDestination _dest;
  public ReindexDestination getDest() { return this._dest; }
  public ReindexOnServerRequest setDest(ReindexDestination val) { this._dest = val; return this; }


  static final ParseField SCRIPT = new ParseField("script");
  private Script _script;
  public Script getScript() { return this._script; }
  public ReindexOnServerRequest setScript(Script val) { this._script = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Long _size;
  public Long getSize() { return this._size; }
  public ReindexOnServerRequest setSize(Long val) { this._size = val; return this; }


  static final ParseField MAX_DOCS = new ParseField("max_docs");
  private Long _maxDocs;
  public Long getMaxDocs() { return this._maxDocs; }
  public ReindexOnServerRequest setMaxDocs(Long val) { this._maxDocs = val; return this; }


  static final ParseField SOURCE = new ParseField("source");
  private ReindexSource _source;
  public ReindexSource getSource() { return this._source; }
  public ReindexOnServerRequest setSource(ReindexSource val) { this._source = val; return this; }


  static final ParseField REFRESH = new ParseField("refresh");
  private Boolean _refresh;
  public Boolean getRefresh() { return this._refresh; }
  public ReindexOnServerRequest setRefresh(Boolean val) { this._refresh = val; return this; }


  static final ParseField REQUESTS_PER_SECOND = new ParseField("requests_per_second");
  private Long _requestsPerSecond;
  public Long getRequestsPerSecond() { return this._requestsPerSecond; }
  public ReindexOnServerRequest setRequestsPerSecond(Long val) { this._requestsPerSecond = val; return this; }


  static final ParseField SCROLL = new ParseField("scroll");
  private Time _scroll;
  public Time getScroll() { return this._scroll; }
  public ReindexOnServerRequest setScroll(Time val) { this._scroll = val; return this; }


  static final ParseField SLICES = new ParseField("slices");
  private Long _slices;
  public Long getSlices() { return this._slices; }
  public ReindexOnServerRequest setSlices(Long val) { this._slices = val; return this; }


  static final ParseField TIMEOUT = new ParseField("timeout");
  private Time _timeout;
  public Time getTimeout() { return this._timeout; }
  public ReindexOnServerRequest setTimeout(Time val) { this._timeout = val; return this; }


  static final ParseField WAIT_FOR_ACTIVE_SHARDS = new ParseField("wait_for_active_shards");
  private String _waitForActiveShards;
  public String getWaitForActiveShards() { return this._waitForActiveShards; }
  public ReindexOnServerRequest setWaitForActiveShards(String val) { this._waitForActiveShards = val; return this; }


  static final ParseField WAIT_FOR_COMPLETION = new ParseField("wait_for_completion");
  private Boolean _waitForCompletion;
  public Boolean getWaitForCompletion() { return this._waitForCompletion; }
  public ReindexOnServerRequest setWaitForCompletion(Boolean val) { this._waitForCompletion = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public ReindexOnServerRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return ReindexOnServerRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<ReindexOnServerRequest, Void> PARSER =
    new ConstructingObjectParser<>(ReindexOnServerRequest.class.getName(), false, args -> new ReindexOnServerRequest());

  static {
    PARSER.declareObject(ReindexOnServerRequest::setConflicts, (p, t) -> Conflicts.PARSER.apply(p, null), CONFLICTS);
    PARSER.declareObject(ReindexOnServerRequest::setDest, (p, t) -> ReindexDestination.PARSER.apply(p, null), DEST);
    PARSER.declareObject(ReindexOnServerRequest::setScript, (p, t) -> Script.PARSER.apply(p, null), SCRIPT);
    PARSER.declareLong(ReindexOnServerRequest::setSize, SIZE);
    PARSER.declareLong(ReindexOnServerRequest::setMaxDocs, MAX_DOCS);
    PARSER.declareObject(ReindexOnServerRequest::setSource, (p, t) -> ReindexSource.PARSER.apply(p, null), SOURCE);
    PARSER.declareBoolean(ReindexOnServerRequest::setRefresh, REFRESH);
    PARSER.declareLong(ReindexOnServerRequest::setRequestsPerSecond, REQUESTS_PER_SECOND);
    PARSER.declareObject(ReindexOnServerRequest::setScroll, (p, t) -> Time.PARSER.apply(p, null), SCROLL);
    PARSER.declareLong(ReindexOnServerRequest::setSlices, SLICES);
    PARSER.declareObject(ReindexOnServerRequest::setTimeout, (p, t) -> Time.PARSER.apply(p, null), TIMEOUT);
    PARSER.declareString(ReindexOnServerRequest::setWaitForActiveShards, WAIT_FOR_ACTIVE_SHARDS);
    PARSER.declareBoolean(ReindexOnServerRequest::setWaitForCompletion, WAIT_FOR_COMPLETION);
  }

}
