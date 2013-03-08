package org.chromium.protocolparser;

class PrimitiveValueParser extends ValueParser {
  private final String className;
  private final String readPostfix;

  PrimitiveValueParser(String name) {
    this(name, false);
  }

  PrimitiveValueParser(String name, boolean nullable) {
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
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean deferredReading, TextOutput out) {
    beginReadCall(readPostfix, deferredReading, out);
    out.append(')');
  }

  @Override
  void appendFinishedValueTypeName(TextOutput out) {
    out.append(className);
  }

  @Override
  public void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out, boolean nullable) {
    if (readPostfix.equals("String")) {
      out.append("nextList");
    }
    else {
      out.append("read").append(readPostfix).append("Array");
    }
    out.append('(').append(Util.READER_NAME);
    out.append(')');
  }
}
