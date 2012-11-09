package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.List;

class ArrayParser<T> extends ValueParser<List<? extends T>> {
  private final ValueParser<T> componentParser;
  private final boolean isList;

  ArrayParser(ValueParser<T> componentParser, boolean isList, boolean nullable) {
    super(nullable);

    this.componentParser = componentParser;
    this.isList = isList;
  }

  @Override
  public FieldLoadedFinisher getValueFinisher() {
    return null;
  }

  @Override
  public ObjectValueParser<?> asJsonTypeParser() {
    return null;
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
