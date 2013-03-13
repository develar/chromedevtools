package org.jetbrains.protocolReader;

class PrimitiveValueReader extends ValueReader {
  private final String className;
  private final String readPostfix;

  PrimitiveValueReader(String name) {
    this(name, false);
  }

  PrimitiveValueReader(String name, boolean nullable) {
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
  void writeReadCode(ClassScope methodScope, boolean subtyping, String fieldName, TextOutput out) {
    beginReadCall(readPostfix, subtyping, out, fieldName);
    out.append(')');
  }

  @Override
  void appendFinishedValueTypeName(TextOutput out) {
    out.append(className);
  }

  @Override
  public void writeArrayReadCode(ClassScope scope,
                                 boolean subtyping,
                                 boolean nullable,
                                 String fieldName, TextOutput out) {
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
