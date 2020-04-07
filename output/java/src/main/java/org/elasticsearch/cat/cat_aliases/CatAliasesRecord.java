
package org.elasticsearch.cat.cat_aliases;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;




public class CatAliasesRecord  implements XContentable<CatAliasesRecord> {
  
  static final ParseField ALIAS = new ParseField("alias");
  private String _alias;
  public String getAlias() { return this._alias; }
  public CatAliasesRecord setAlias(String val) { this._alias = val; return this; }


  static final ParseField FILTER = new ParseField("filter");
  private String _filter;
  public String getFilter() { return this._filter; }
  public CatAliasesRecord setFilter(String val) { this._filter = val; return this; }


  static final ParseField INDEX = new ParseField("index");
  private String _index;
  public String getIndex() { return this._index; }
  public CatAliasesRecord setIndex(String val) { this._index = val; return this; }


  static final ParseField INDEX_ROUTING = new ParseField("indexRouting");
  private String _indexRouting;
  public String getIndexRouting() { return this._indexRouting; }
  public CatAliasesRecord setIndexRouting(String val) { this._indexRouting = val; return this; }


  static final ParseField SEARCH_ROUTING = new ParseField("searchRouting");
  private String _searchRouting;
  public String getSearchRouting() { return this._searchRouting; }
  public CatAliasesRecord setSearchRouting(String val) { this._searchRouting = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public CatAliasesRecord fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return CatAliasesRecord.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<CatAliasesRecord, Void> PARSER =
    new ConstructingObjectParser<>(CatAliasesRecord.class.getName(), false, args -> new CatAliasesRecord());

  static {
    PARSER.declareString(CatAliasesRecord::setAlias, ALIAS);
    PARSER.declareString(CatAliasesRecord::setFilter, FILTER);
    PARSER.declareString(CatAliasesRecord::setIndex, INDEX);
    PARSER.declareString(CatAliasesRecord::setIndexRouting, INDEX_ROUTING);
    PARSER.declareString(CatAliasesRecord::setSearchRouting, SEARCH_ROUTING);
  }

}
