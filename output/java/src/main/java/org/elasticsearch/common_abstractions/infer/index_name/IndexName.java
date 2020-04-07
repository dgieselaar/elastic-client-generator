
package org.elasticsearch.common_abstractions.infer.index_name;

import java.io.IOException;
import java.util.Objects;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;

public final class IndexName implements XContentable<IndexName> {
  private final String value;

  public IndexName(String value) { this.value = value; }

  @Override
  public String toString() { return value.toString(); }

  @Override
  public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      IndexName that = (IndexName) o;
      return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() { return Objects.hash(value); }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.value(this.value);
    return null;
  }

  public static IndexName createFrom(XContentParser parser) throws IOException, XContentParseException { return new IndexName(parser.text()); }

  @Override
  public IndexName fromXContent(XContentParser parser) throws IOException, XContentParseException { return IndexName.createFrom(parser); }

}
