package org.chromium.sdk.internal.protocolparser.dynamicimpl;

class ArrayParser extends ValueParser {
  private final ValueParser componentParser;
  private final boolean isList;

  ArrayParser(ValueParser componentParser, boolean isList, boolean nullable) {
    super(nullable);

    this.componentParser = componentParser;
    this.isList = isList;
  }

  @Override
  public void appendFinishedValueTypeNameJava(TextOutput out) {
    if (isList) {
      out.append("java.util.List<");
      componentParser.appendFinishedValueTypeNameJava(out);
      out.append('>');
    }
    else {
      componentParser.appendFinishedValueTypeNameJava(out);
      out.append("[]");
    }
  }

  @Override
  public void appendInternalValueTypeNameJava(JavaCodeGenerator.FileScope scope) {
    appendFinishedValueTypeNameJava(scope.getOutput());
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
    componentParser.writeArrayReadCode(scope, subtyping, out);
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
  }
}
