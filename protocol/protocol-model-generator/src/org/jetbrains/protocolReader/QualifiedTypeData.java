package org.jetbrains.protocolReader;

import org.chromium.protocolparser.TextOutput;

import java.io.IOException;

class QualifiedTypeData {
  private final BoxableType typeRef;
  private final boolean optional;
  private final boolean nullable;

  QualifiedTypeData(BoxableType typeRef, boolean optional, boolean nullable) {
    this.typeRef = typeRef;
    this.optional = optional;
    this.nullable = nullable;
  }

  boolean isOptional() {
    return optional;
  }

  boolean isNullable() {
    return nullable;
  }

  BoxableType getJavaType() {
    return typeRef;
  }

  void writeAnnotations(TextOutput out) throws IOException {
    if (isOptional()) {
      out.append("@org.chromium.protocolReader.JsonOptionalField").newLine();
    }
    if (isNullable()) {
      out.append("@org.chromium.protocolReader.JsonNullable").newLine();
    }
  }
}
