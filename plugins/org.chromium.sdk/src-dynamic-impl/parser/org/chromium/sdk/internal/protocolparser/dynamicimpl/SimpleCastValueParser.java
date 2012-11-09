package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;

class SimpleCastValueParser<T> extends QuickParser<T> {
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
  public T parseValueQuick(Object value) throws JsonProtocolParseException {
    if (value == null) {
      if (isNullable()) {
        return null;
      } else {
        throw new JsonProtocolParseException("Field must have type " + fieldType.getName());
      }
    }
    try {
      return fieldType.cast(value);
    } catch (ClassCastException e) {
      throw new JsonProtocolParseException("Field must have type " + fieldType.getName(), e);
    }
  }

  @Override
  public void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append(fieldType.getCanonicalName());
  }

  @Override
  public void writeParseQuickCode(JavaCodeGenerator.MethodScope scope, String valueRef,
      String resultRef) {
    TextOutput out = scope.getOutput();
    out.newLine().append(fieldType.getCanonicalName()).append(" ").append(resultRef);
    out.append(" = (").append(fieldType.getCanonicalName()).append(") ").append(valueRef).append(";");
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
    throw new UnsupportedOperationException();
  }
}
