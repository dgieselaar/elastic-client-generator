
package org.elasticsearch.x_pack.watcher.condition;

import java.util.Date;
import java.util.Map;
import org.elasticsearch.Either;


public class ScriptCondition  {
  
  private String _lang;
  public String getLang() { return this._lang; }
  public ScriptCondition setLang(String val) { this._lang = val; return this; }


  private Map<String, Object> _params;
  public Map<String, Object> getParams() { return this._params; }
  public ScriptCondition setParams(Map<String, Object> val) { this._params = val; return this; }

}