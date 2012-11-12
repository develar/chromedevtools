package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.concurrent.atomic.AtomicReferenceArray;

class VolatileFieldBinding {
  private static final String FIELD_NAME_PREFIX = "lazy_";

  private final int position;
  private final FieldTypeInfo fieldTypeInfo;

  public VolatileFieldBinding(int position, FieldTypeInfo fieldTypeInfo) {
    this.position = position;
    this.fieldTypeInfo = fieldTypeInfo;
  }

  public Object get(AtomicReferenceArray<Object> atomicReferenceArray) {
    return atomicReferenceArray.get(position);
  }

  void writeGetExpressionJava(TextOutput out) {
    out.append(getCodeFieldName());
  }

  void writeFieldDeclarationJava(JavaCodeGenerator.ClassScope scope, TextOutput out) {
    out.append("private ");
    fieldTypeInfo.appendValueTypeNameJava(scope);
    out.append(" ").append(getCodeFieldName()).append(';');
  }

  private String getCodeFieldName() {
    return FIELD_NAME_PREFIX + position;
  }
}
