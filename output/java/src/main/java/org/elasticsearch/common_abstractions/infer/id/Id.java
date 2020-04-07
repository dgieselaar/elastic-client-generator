
package org.elasticsearch.common_abstractions.infer.id;

import java.io.IOException;
import java.util.Objects;
import org.elasticsearch.XContentable;
import org.elasticsearch.common.xcontent.*;

public final class Id implements XContentable<Id> {
  private final String value;

  public Id(String value) { this.value = value; }

  @Override
  public String toString() { return value.toString(); }

  @Override
  public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Id that = (Id) o;
      return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() { return Objects.hash(value); }

  @Override
  public XContentBuilder toXContent(XContentBuilder builder, ToXContent.Params params) throws IOException {
    builder.value(this.value);
    return null;
  }

  public static Id createFrom(XContentParser parser) throws IOException, XContentParseException { return new Id(parser.text()); }

  @Override
  public Id fromXContent(XContentParser parser) throws IOException, XContentParseException { return Id.createFrom(parser); }

}
