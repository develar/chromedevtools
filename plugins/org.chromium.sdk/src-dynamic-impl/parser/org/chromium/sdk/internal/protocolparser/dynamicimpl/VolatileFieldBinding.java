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

  public Object setAndGet(AtomicReferenceArray<Object> atomicReferenceArray,
      Object value) {
    atomicReferenceArray.compareAndSet(position, null, value);
    return atomicReferenceArray.get(position);
  }

  public Object get(AtomicReferenceArray<Object> atomicReferenceArray) {
    return atomicReferenceArray.get(position);
  }

  void writeGetExpressionJava(TextOutput out) {
    out.append(getCodeFieldName());
  }

  void writeSetAndGetJava(JavaCodeGenerator.MethodScope scope, String valueRef, String resultRef) {
    scope.startLine(getCodeFieldName() + ".compareAndSet(null, " + valueRef + ");\n");
    scope.startLine("");
    fieldTypeInfo.appendValueTypeNameJava(scope);
    scope.append(" " + resultRef + " = ");
    writeGetExpressionJava(scope.getOutput());
    scope.append(";\n");
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
