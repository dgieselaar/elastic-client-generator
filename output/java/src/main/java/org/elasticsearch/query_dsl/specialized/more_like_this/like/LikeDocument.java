
package org.elasticsearch.query_dsl.specialized.more_like_this.like;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.common_abstractions.infer.id.*;
import org.elasticsearch.common_abstractions.infer.index_name.*;
import org.elasticsearch.common_abstractions.infer.join_field_routing.*;

public class LikeDocument  implements XContentable<LikeDocument> {
  
  static final ParseField DOC = new ParseField("doc");
  private Object _doc;
  public Object getDoc() { return this._doc; }
  public LikeDocument setDoc(Object val) { this._doc = val; return this; }


  static final ParseField FIELDS = new ParseField("fields");
  private List<Field> _fields;
  public List<Field> getFields() { return this._fields; }
  public LikeDocument setFields(List<Field> val) { this._fields = val; return this; }


  static final ParseField ID = new ParseField("_id");
  private Id _id;
  public Id getId() { return this._id; }
  public LikeDocument setId(Id val) { this._id = val; return this; }


  static final ParseField INDEX = new ParseField("_index");
  private IndexName _index;
  public IndexName getIndex() { return this._index; }
  public LikeDocument setIndex(IndexName val) { this._index = val; return this; }


  static final ParseField PER_FIELD_ANALYZER = new ParseField("per_field_analyzer");
  private NamedContainer<Field, String> _perFieldAnalyzer;
  public NamedContainer<Field, String> getPerFieldAnalyzer() { return this._perFieldAnalyzer; }
  public LikeDocument setPerFieldAnalyzer(NamedContainer<Field, String> val) { this._perFieldAnalyzer = val; return this; }


  static final ParseField ROUTING = new ParseField("routing");
  private Routing _routing;
  public Routing getRouting() { return this._routing; }
  public LikeDocument setRouting(Routing val) { this._routing = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public LikeDocument fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return LikeDocument.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<LikeDocument, Void> PARSER =
    new ConstructingObjectParser<>(LikeDocument.class.getName(), false, args -> new LikeDocument());

  static {
    PARSER.declareObject(LikeDocument::setDoc, (p, t) -> Object.PARSER.apply(p, null), DOC);
    PARSER.declareObjectArray(LikeDocument::setFields, (p, t) -> Field.PARSER.apply(p), FIELDS);
    PARSER.declareId(LikeDocument::setId, (p, t) -> Id.createFrom(p), ID);
    PARSER.declareIndexName(LikeDocument::setIndex, (p, t) -> IndexName.createFrom(p), INDEX);
    PARSER.declareObject(LikeDocument::setPerFieldAnalyzer, (p, t) ->  new NamedContainer<>(n -> () -> new Field(n),pp -> String.PARSER.apply(pp, null)), PER_FIELD_ANALYZER);;
    PARSER.declareRouting(LikeDocument::setRouting, (p, t) -> Routing.createFrom(p), ROUTING);
  }

}
