package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.json.simple.JSONArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrayParser<T> extends ValueParser<List<? extends T>> {
  static abstract class ListFactory {
    abstract <T> List<T> create(JSONArray array, ValueParser<T> componentParser)
        throws JsonProtocolParseException;
  }

  static final ListFactory EAGER = new ListFactory() {
    @SuppressWarnings("unchecked")
    @Override
    <T> List<T> create(JSONArray array, ValueParser<T> componentParser)
        throws JsonProtocolParseException {
      int size = array.size();
      List list = new ArrayList<Object>(size);
      FieldLoadedFinisher valueFinisher = componentParser.getValueFinisher();
      for (Object anArray : array) {
        // We do not support super object for array component.
        Object val = componentParser.parseValue(anArray, null);
        if (valueFinisher != null) {
          val = valueFinisher.getValueForUser(val);
        }
        list.add(val);
      }
      return Collections.unmodifiableList(list);
    }
  };

  private final ValueParser<T> componentParser;
  private final boolean isList;

  ArrayParser(ValueParser<T> componentParser, boolean isList, boolean nullable) {
    super(nullable);

    this.componentParser = componentParser;
    this.isList = isList;
  }

  @Override
  public List<? extends T> parseValue(Object value, ObjectData thisData)
      throws JsonProtocolParseException {
    if (isNullable() && value == null) {
      return null;
    }
    if (!(value instanceof JSONArray)) {
      throw new JsonProtocolParseException("Array value expected");
    }
    JSONArray arrayValue = (JSONArray) value;
    return EAGER.create(arrayValue, componentParser);
  }

  @Override
  public FieldLoadedFinisher getValueFinisher() {
    return null;
  }

  @Override
  public JsonTypeParser<?> asJsonTypeParser() {
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
  void writeReadCode(JavaCodeGenerator.MethodScope scope, TextOutput out) {
    componentParser.writeArrayReadCode(scope, out);
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, TextOutput out) {

  }
}
