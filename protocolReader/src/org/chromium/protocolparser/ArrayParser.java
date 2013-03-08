package org.chromium.protocolparser;

class ArrayParser extends ValueParser {
  private final ValueParser componentParser;
  private final boolean isList;

  ArrayParser(ValueParser componentParser, boolean isList, boolean nullable) {
    super(nullable);

    this.componentParser = componentParser;
    this.isList = isList;
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    if (isList) {
      out.append("java.util.List<");
      componentParser.appendFinishedValueTypeName(out);
      out.append('>');
    }
    else {
      componentParser.appendFinishedValueTypeName(out);
      out.append("[]");
    }
  }

  @Override
  public void appendInternalValueTypeName(JavaCodeGenerator.FileScope scope) {
    appendFinishedValueTypeName(scope.getOutput());
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope scope, boolean deferredReading, TextOutput out) {
    componentParser.writeArrayReadCode(scope, deferredReading, out);
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
  }
}
