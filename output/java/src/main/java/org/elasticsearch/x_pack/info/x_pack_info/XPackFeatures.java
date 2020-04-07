
package org.elasticsearch.x_pack.info.x_pack_info;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.x_pack.info.x_pack_info.*;

public class XPackFeatures  implements XContentable<XPackFeatures> {
  
  static final ParseField CCR = new ParseField("ccr");
  private XPackFeature _ccr;
  public XPackFeature getCcr() { return this._ccr; }
  public XPackFeatures setCcr(XPackFeature val) { this._ccr = val; return this; }


  static final ParseField DATA_FRAME = new ParseField("data_frame");
  private XPackFeature _dataFrame;
  public XPackFeature getDataFrame() { return this._dataFrame; }
  public XPackFeatures setDataFrame(XPackFeature val) { this._dataFrame = val; return this; }


  static final ParseField FLATTENED = new ParseField("flattened");
  private XPackFeature _flattened;
  public XPackFeature getFlattened() { return this._flattened; }
  public XPackFeatures setFlattened(XPackFeature val) { this._flattened = val; return this; }


  static final ParseField DATA_SCIENCE = new ParseField("data_science");
  private XPackFeature _dataScience;
  public XPackFeature getDataScience() { return this._dataScience; }
  public XPackFeatures setDataScience(XPackFeature val) { this._dataScience = val; return this; }


  static final ParseField GRAPH = new ParseField("graph");
  private XPackFeature _graph;
  public XPackFeature getGraph() { return this._graph; }
  public XPackFeatures setGraph(XPackFeature val) { this._graph = val; return this; }


  static final ParseField ILM = new ParseField("ilm");
  private XPackFeature _ilm;
  public XPackFeature getIlm() { return this._ilm; }
  public XPackFeatures setIlm(XPackFeature val) { this._ilm = val; return this; }


  static final ParseField LOGSTASH = new ParseField("logstash");
  private XPackFeature _logstash;
  public XPackFeature getLogstash() { return this._logstash; }
  public XPackFeatures setLogstash(XPackFeature val) { this._logstash = val; return this; }


  static final ParseField ML = new ParseField("ml");
  private XPackFeature _ml;
  public XPackFeature getMl() { return this._ml; }
  public XPackFeatures setMl(XPackFeature val) { this._ml = val; return this; }


  static final ParseField MONITORING = new ParseField("monitoring");
  private XPackFeature _monitoring;
  public XPackFeature getMonitoring() { return this._monitoring; }
  public XPackFeatures setMonitoring(XPackFeature val) { this._monitoring = val; return this; }


  static final ParseField ROLLUP = new ParseField("rollup");
  private XPackFeature _rollup;
  public XPackFeature getRollup() { return this._rollup; }
  public XPackFeatures setRollup(XPackFeature val) { this._rollup = val; return this; }


  static final ParseField SECURITY = new ParseField("security");
  private XPackFeature _security;
  public XPackFeature getSecurity() { return this._security; }
  public XPackFeatures setSecurity(XPackFeature val) { this._security = val; return this; }


  static final ParseField SQL = new ParseField("sql");
  private XPackFeature _sql;
  public XPackFeature getSql() { return this._sql; }
  public XPackFeatures setSql(XPackFeature val) { this._sql = val; return this; }


  static final ParseField VECTORS = new ParseField("vectors");
  private XPackFeature _vectors;
  public XPackFeature getVectors() { return this._vectors; }
  public XPackFeatures setVectors(XPackFeature val) { this._vectors = val; return this; }


  static final ParseField WATCHER = new ParseField("watcher");
  private XPackFeature _watcher;
  public XPackFeature getWatcher() { return this._watcher; }
  public XPackFeatures setWatcher(XPackFeature val) { this._watcher = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public XPackFeatures fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return XPackFeatures.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<XPackFeatures, Void> PARSER =
    new ConstructingObjectParser<>(XPackFeatures.class.getName(), false, args -> new XPackFeatures());

  static {
    PARSER.declareObject(XPackFeatures::setCcr, (p, t) -> XPackFeature.PARSER.apply(p, null), CCR);
    PARSER.declareObject(XPackFeatures::setDataFrame, (p, t) -> XPackFeature.PARSER.apply(p, null), DATA_FRAME);
    PARSER.declareObject(XPackFeatures::setFlattened, (p, t) -> XPackFeature.PARSER.apply(p, null), FLATTENED);
    PARSER.declareObject(XPackFeatures::setDataScience, (p, t) -> XPackFeature.PARSER.apply(p, null), DATA_SCIENCE);
    PARSER.declareObject(XPackFeatures::setGraph, (p, t) -> XPackFeature.PARSER.apply(p, null), GRAPH);
    PARSER.declareObject(XPackFeatures::setIlm, (p, t) -> XPackFeature.PARSER.apply(p, null), ILM);
    PARSER.declareObject(XPackFeatures::setLogstash, (p, t) -> XPackFeature.PARSER.apply(p, null), LOGSTASH);
    PARSER.declareObject(XPackFeatures::setMl, (p, t) -> XPackFeature.PARSER.apply(p, null), ML);
    PARSER.declareObject(XPackFeatures::setMonitoring, (p, t) -> XPackFeature.PARSER.apply(p, null), MONITORING);
    PARSER.declareObject(XPackFeatures::setRollup, (p, t) -> XPackFeature.PARSER.apply(p, null), ROLLUP);
    PARSER.declareObject(XPackFeatures::setSecurity, (p, t) -> XPackFeature.PARSER.apply(p, null), SECURITY);
    PARSER.declareObject(XPackFeatures::setSql, (p, t) -> XPackFeature.PARSER.apply(p, null), SQL);
    PARSER.declareObject(XPackFeatures::setVectors, (p, t) -> XPackFeature.PARSER.apply(p, null), VECTORS);
    PARSER.declareObject(XPackFeatures::setWatcher, (p, t) -> XPackFeature.PARSER.apply(p, null), WATCHER);
  }

}
