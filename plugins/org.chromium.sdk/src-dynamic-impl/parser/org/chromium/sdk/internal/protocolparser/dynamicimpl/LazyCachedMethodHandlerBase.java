package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.protocolparser.implutil.CommonImpl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Basic implementation of the method that parses value on demand and store it for
 * a future use.
 */
abstract class LazyCachedMethodHandlerBase extends MethodHandler {
  private final VolatileFieldBinding fieldBinding;

  LazyCachedMethodHandlerBase(VolatileFieldBinding fieldBinding) {
    this.fieldBinding = fieldBinding;
  }

  @Override
  Object handle(ObjectData objectData, Object[] args) {
    try {
      return handle(objectData);
    } catch (JsonProtocolParseException e) {
      throw new CommonImpl.ParseRuntimeException(
          "On demand parsing failed for " + objectData.getUnderlyingObject(), e);
    }
  }

  Object handle(ObjectData objectData) throws JsonProtocolParseException {
    Object raw = handleRaw(objectData);
    return finishRawValue(raw);
  }

  protected abstract Object finishRawValue(Object raw);

  Object handleRaw(ObjectData objectData) throws JsonProtocolParseException {
    AtomicReferenceArray<Object> atomicReferenceArray = objectData.getAtomicReferenceArray();

    Object cachedValue = fieldBinding.get(atomicReferenceArray);
    if (cachedValue != null) {
      return cachedValue;
    }

    Object parsedValue = parse(objectData);
    if (parsedValue != null) {
      parsedValue = fieldBinding.setAndGet(atomicReferenceArray, parsedValue);
    }
    return parsedValue;
  }

  protected abstract Object parse(ObjectData objectData) throws JsonProtocolParseException;

  protected VolatileFieldBinding getFieldBinding() {
    return fieldBinding;
  }

  protected abstract void writeReturnTypeJava(JavaCodeGenerator.ClassScope scope, Method m);

  @Override
  void writeMethodImplementationJava(JavaCodeGenerator.ClassScope classScope, Method m, TextOutput out) {
    out.append("@Override").newLine().append("public ");
    writeReturnTypeJava(classScope, m);
    out.append(' ');
    appendMethodSignatureJava(m, Collections.<String>emptyList(), out);
    {
      Type[] exceptions = m.getGenericExceptionTypes();
      if (exceptions.length > 0) {
        classScope.append(" throws ");
        for (int i = 0; i < exceptions.length; i++) {
          if (i != 0) {
            classScope.append(", ");
          }
          Util.writeJavaTypeName(exceptions[i], out);
        }
      }
    }

    JavaCodeGenerator.MethodScope scope = classScope.newMethodScope();
    out.openBlock();

    writeReturnTypeJava(classScope, m);
    out.append(" result = ");
    getFieldBinding().writeGetExpressionJava(out);
    out.append(';').newLine();

    out.append("if (result != null)").openBlock();
    out.append("return result;").closeBlock();

    out.newLine().append("JsonReader reader = new JsonReader(").append(Util.PENDING_INPUT_READER_NAME).append(");");
    out.newLine();
    getFieldBinding().writeGetExpressionJava(out);
    out.append(" = ");
    writeReadCode(scope);
    out.append(';');
    out.newLine().append(Util.PENDING_INPUT_READER_NAME).append(" = null;");
    out.newLine().append("return ");
    getFieldBinding().writeGetExpressionJava(out);
    out.append(';');

    out.closeBlock();
  }

  protected abstract void writeReadCode(JavaCodeGenerator.MethodScope scope);
}
