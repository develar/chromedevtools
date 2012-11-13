package org.chromium.sdk.internal.protocolparser.dynamicimpl;

class SimpleCastValueParser<T> extends ValueParser {
  private final Class<T> fieldType;

  SimpleCastValueParser(Class<T> fieldType, boolean nullable) {
    super(nullable);

    this.fieldType = fieldType;
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, TextOutput out) {
    addReaderParameter(subtyping, out);
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append(fieldType.getCanonicalName());
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isThrowsIOException() {
    return false;
  }
}
