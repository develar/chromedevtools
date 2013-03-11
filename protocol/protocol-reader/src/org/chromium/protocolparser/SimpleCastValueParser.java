package org.chromium.protocolparser;

class SimpleCastValueParser<T> extends ValueParser {
  private final Class<T> fieldType;

  SimpleCastValueParser(Class<T> fieldType, boolean nullable) {
    super(nullable);

    this.fieldType = fieldType;
  }

  @Override
  void writeReadCode(ClassScope scope, boolean subtyping, String fieldName, TextOutput out) {
    addReaderParameter(subtyping, out);
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append(fieldType.getCanonicalName());
  }

  @Override
  void writeArrayReadCode(ClassScope scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isThrowsIOException() {
    return false;
  }
}
