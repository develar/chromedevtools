package org.chromium.wip.protocolParser;

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

  void writeAnnotations(IndentWriter appendable, String indent) throws IOException {
    if (isOptional()) {
      appendable.append("\t" + indent +
          "@org.chromium.protocolParser.JsonOptionalField\n");
    }
    if (isNullable()) {
      appendable.append("\t" + indent +
          "@org.chromium.protocolParser.JsonNullable\n");
    }
  }
}
