
package org.elasticsearch.aggregations.bucket.terms;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;
import org.elasticsearch.aggregations.bucket.terms.*;
import org.elasticsearch.common_abstractions.infer.field.*;
import org.elasticsearch.internal.*;
import org.elasticsearch.common_options.scripting.*;

public class TermsAggregation  {
  
  private TermsAggregationCollectMode _collectMode;
  public TermsAggregationCollectMode getCollectMode() { return this._collectMode; }
  public TermsAggregation setCollectMode(TermsAggregationCollectMode val) { this._collectMode = val; return this; }


  private TermsExclude _exclude;
  public TermsExclude getExclude() { return this._exclude; }
  public TermsAggregation setExclude(TermsExclude val) { this._exclude = val; return this; }


  private TermsAggregationExecutionHint _executionHint;
  public TermsAggregationExecutionHint getExecutionHint() { return this._executionHint; }
  public TermsAggregation setExecutionHint(TermsAggregationExecutionHint val) { this._executionHint = val; return this; }


  private Field _field;
  public Field getField() { return this._field; }
  public TermsAggregation setField(Field val) { this._field = val; return this; }


  private TermsInclude _include;
  public TermsInclude getInclude() { return this._include; }
  public TermsAggregation setInclude(TermsInclude val) { this._include = val; return this; }


  private Integer _minDocCount;
  public Integer getMinDocCount() { return this._minDocCount; }
  public TermsAggregation setMinDocCount(Integer val) { this._minDocCount = val; return this; }


  private Object _missing;
  public Object getMissing() { return this._missing; }
  public TermsAggregation setMissing(Object val) { this._missing = val; return this; }


  private TermsOrder[] _order;
  public TermsOrder[] getOrder() { return this._order; }
  public TermsAggregation setOrder(TermsOrder[] val) { this._order = val; return this; }


  private Script _script;
  public Script getScript() { return this._script; }
  public TermsAggregation setScript(Script val) { this._script = val; return this; }


  private Integer _shardSize;
  public Integer getShardSize() { return this._shardSize; }
  public TermsAggregation setShardSize(Integer val) { this._shardSize = val; return this; }


  private Boolean _showTermDocCountError;
  public Boolean getShowTermDocCountError() { return this._showTermDocCountError; }
  public TermsAggregation setShowTermDocCountError(Boolean val) { this._showTermDocCountError = val; return this; }


  private Integer _size;
  public Integer getSize() { return this._size; }
  public TermsAggregation setSize(Integer val) { this._size = val; return this; }

}