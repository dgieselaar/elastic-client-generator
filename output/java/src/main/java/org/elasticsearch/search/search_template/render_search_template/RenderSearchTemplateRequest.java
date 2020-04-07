
package org.elasticsearch.search.search_template.render_search_template;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class RenderSearchTemplateRequest  implements XContentable<RenderSearchTemplateRequest> {
  
  static final ParseField FILE = new ParseField("file");
  private String _file;
  public String getFile() { return this._file; }
  public RenderSearchTemplateRequest setFile(String val) { this._file = val; return this; }


  static final ParseField PARAMS = new ParseField("params");
  private NamedContainer<String, Object> _params;
  public NamedContainer<String, Object> getParams() { return this._params; }
  public RenderSearchTemplateRequest setParams(NamedContainer<String, Object> val) { this._params = val; return this; }


  static final ParseField SOURCE = new ParseField("source");
  private String _source;
  public String getSource() { return this._source; }
  public RenderSearchTemplateRequest setSource(String val) { this._source = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public RenderSearchTemplateRequest fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return RenderSearchTemplateRequest.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<RenderSearchTemplateRequest, Void> PARSER =
    new ConstructingObjectParser<>(RenderSearchTemplateRequest.class.getName(), false, args -> new RenderSearchTemplateRequest());

  static {
    PARSER.declareString(RenderSearchTemplateRequest::setFile, FILE);
    PARSER.declareObject(RenderSearchTemplateRequest::setParams, (p, t) ->  new NamedContainer<>(n -> () -> n,XContentParser::binaryValue), PARAMS);;
    PARSER.declareString(RenderSearchTemplateRequest::setSource, SOURCE);
  }

}
