package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;

class PrimitiveParser extends QuickParser<Object> {
  private final String className;
  private final String readPostfix;

  PrimitiveParser(String name) {
    this(name, false);
  }

  PrimitiveParser(String name, boolean nullable) {
    super(nullable);

    className = name;
    if (Character.isLowerCase(className.charAt(0))) {
      readPostfix = Character.toUpperCase(className.charAt(0)) + className.substring(1);
    }
    else {
      readPostfix = className;
    }
  }

  @Override
  void writeReadCode(String fieldName, JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
    out.append("read");
    if (isNullable()) {
      out.append("Nullable");
    }
    out.append(readPostfix).append('(').append(Util.READER_NAME);
    if (!isNullable()) {
      out.comma().quoute(fieldName);
    }
    out.append(')');
  }

  @Override
  void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append(className);
  }

  @Override
  public Long parseValueQuick(Object value) throws JsonProtocolParseException {
    throw new IllegalStateException();
  }

  @Override
  void writeParseQuickCode(JavaCodeGenerator.MethodScope scope, String valueRef, String resultRef) {
    TextOutput out = scope.getOutput();
    out.newLine().append(className).append(' ').append(resultRef);
    out.append(" = (").append(className).append(") ").append(valueRef).append(';');
  }

  @Override
  public void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, TextOutput out) {
    out.append("read").append(readPostfix).append("Array").append('(').append(Util.READER_NAME);
    out.comma().append("name").append(')');
  }
}