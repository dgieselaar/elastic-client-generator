
package org.elasticsearch.cluster.nodes_stats;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.HashMap;
import org.elasticsearch.Either;
import org.elasticsearch.XContentable;
import org.elasticsearch.NamedContainer;
import org.elasticsearch.common.ParseField;
import org.elasticsearch.common.xcontent.*;


import org.elasticsearch.internal.*;

public class NodeBufferPool  implements XContentable<NodeBufferPool> {
  
  static final ParseField COUNT = new ParseField("count");
  private Long _count;
  public Long getCount() { return this._count; }
  public NodeBufferPool setCount(Long val) { this._count = val; return this; }


  static final ParseField TOTAL_CAPACITY = new ParseField("total_capacity");
  private String _totalCapacity;
  public String getTotalCapacity() { return this._totalCapacity; }
  public NodeBufferPool setTotalCapacity(String val) { this._totalCapacity = val; return this; }


  static final ParseField TOTAL_CAPACITY_IN_BYTES = new ParseField("total_capacity_in_bytes");
  private Long _totalCapacityInBytes;
  public Long getTotalCapacityInBytes() { return this._totalCapacityInBytes; }
  public NodeBufferPool setTotalCapacityInBytes(Long val) { this._totalCapacityInBytes = val; return this; }


  static final ParseField USED = new ParseField("used");
  private String _used;
  public String getUsed() { return this._used; }
  public NodeBufferPool setUsed(String val) { this._used = val; return this; }


  static final ParseField USED_IN_BYTES = new ParseField("used_in_bytes");
  private Long _usedInBytes;
  public Long getUsedInBytes() { return this._usedInBytes; }
  public NodeBufferPool setUsedInBytes(Long val) { this._usedInBytes = val; return this; }


  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    return null;
  }

  @Override
  public NodeBufferPool fromXContent(XContentParser parser) throws IOException, XContentParseException {
    return NodeBufferPool.PARSER.apply(parser, null);
  }

  public static final ConstructingObjectParser<NodeBufferPool, Void> PARSER =
    new ConstructingObjectParser<>(NodeBufferPool.class.getName(), false, args -> new NodeBufferPool());

  static {
    PARSER.declareLong(NodeBufferPool::setCount, COUNT);
    PARSER.declareString(NodeBufferPool::setTotalCapacity, TOTAL_CAPACITY);
    PARSER.declareLong(NodeBufferPool::setTotalCapacityInBytes, TOTAL_CAPACITY_IN_BYTES);
    PARSER.declareString(NodeBufferPool::setUsed, USED);
    PARSER.declareLong(NodeBufferPool::setUsedInBytes, USED_IN_BYTES);
  }

}
