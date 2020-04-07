
package org.elasticsearch.search.search.inner_hits;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.search.search.collapsing.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.search.search.highlighting.*;
import org.elasticsearch.common_options.scripting.*;
import org.elasticsearch.search.search.sort.*;
import org.elasticsearch.search.search.source_filtering.*;

public class InnerHits  implements XContentable<InnerHits> {
  
  static final ParseField COLLAPSE = new ParseField("collapse");
  private FieldCollapse _collapse;
  public FieldCollapse getCollapse() { return this._collapse; }
  public InnerHits setCollapse(FieldCollapse val) { this._collapse = val; return this; }


  static final ParseField DOCVALUE_FIELDS = new ParseField("docvalue_fields");
  private List<Field> _docvalueFields;
  public List<Field> getDocvalueFields() { return this._docvalueFields; }
  public InnerHits setDocvalueFields(List<Field> val) { this._docvalueFields = val; return this; }


  static final ParseField EXPLAIN = new ParseField("explain");
  private Boolean _explain;
  public Boolean getExplain() { return this._explain; }
  public InnerHits setExplain(Boolean val) { this._explain = val; return this; }


  static final ParseField FROM = new ParseField("from");
  private Integer _from;
  public Integer getFrom() { return this._from; }
  public InnerHits setFrom(Integer val) { this._from = val; return this; }


  static final ParseField HIGHLIGHT = new ParseField("highlight");
  private Highlight _highlight;
  public Highlight getHighlight() { return this._highlight; }
  public InnerHits setHighlight(Highlight val) { this._highlight = val; return this; }


  static final ParseField IGNORE_UNMAPPED = new ParseField("ignore_unmapped");
  private Boolean _ignoreUnmapped;
  public Boolean getIgnoreUnmapped() { return this._ignoreUnmapped; }
  public InnerHits setIgnoreUnmapped(Boolean val) { this._ignoreUnmapped = val; return this; }


  static final ParseField NAME = new ParseField("name");
  private String _name;
  public String getName() { return this._name; }
  public InnerHits setName(String val) { this._name = val; return this; }


  static final ParseField SCRIPT_FIELDS = new ParseField("script_fields");
  private NamedContainer<String, ScriptField> _scriptFields;
  public NamedContainer<String, ScriptField> getScriptFields() { return this._scriptFields; }
  public InnerHits setScriptFields(NamedContainer<String, ScriptField> val) { this._scriptFields = val; return this; }


  static final ParseField SIZE = new ParseField("size");
  private Integer _size;
  public Integer getSize() { return this._size; }
  public InnerHits setSize(Integer val) { this._size = val; return this; }


  static final ParseField SORT = new ParseField("sort");
  private List<Sort> _sort;
  public List<Sort> getSort() { return this._sort; }
  public InnerHits setSort(List<Sort> val) { this._sort = val; return this; }


  static final ParseField SOURCE = new ParseField("_source");
  private Either<Boolean, SourceFilter> _source;
  public Either<Boolean, SourceFilter> getSource() { return this._source; }
  public InnerHits setSource(Either<Boolean, SourceFilter> val) { this._source = val; return this; }


  static final ParseField VERSION = new ParseField("version");
  private Boolean _version;
  public Boolean getVersion() { return this._version; }
  public InnerHits setVersion(Boolean val) { this._version = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public InnerHits fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return InnerHits.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<InnerHits, Void> PARSER =
    new ConstructingObjectParser<>(InnerHits.class.getName(), false, args -> new InnerHits());

  static {
    PARSER.declareObject(InnerHits::setCollapse, (p, t) -> FieldCollapse.PARSER.apply(p, null), COLLAPSE);
    PARSER.declareObjectArray(InnerHits::setDocvalueFields, (p, t) -> Field.PARSER.apply(p), DOCVALUE_FIELDS);
    PARSER.declareBoolean(InnerHits::setExplain, EXPLAIN);
    PARSER.declareInteger(InnerHits::setFrom, FROM);
    PARSER.declareObject(InnerHits::setHighlight, (p, t) -> Highlight.PARSER.apply(p, null), HIGHLIGHT);
    PARSER.declareBoolean(InnerHits::setIgnoreUnmapped, IGNORE_UNMAPPED);
    PARSER.declareString(InnerHits::setName, NAME);
    PARSER.declareObject(InnerHits::setScriptFields, (p, t) ->  new NamedContainer<>(n -> () -> n,pp -> ScriptField.PARSER.apply(pp, null)), SCRIPT_FIELDS);;
    PARSER.declareInteger(InnerHits::setSize, SIZE);
    PARSER.declareObjectArray(InnerHits::setSort, (p, t) -> Sort.PARSER.apply(p), SORT);
    PARSER.declareObject(InnerHits::setSource, (p, t) -> null, SOURCE);
    PARSER.declareBoolean(InnerHits::setVersion, VERSION);
  }

}
