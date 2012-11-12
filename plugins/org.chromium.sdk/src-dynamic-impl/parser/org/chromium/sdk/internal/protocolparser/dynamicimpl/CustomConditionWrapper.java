package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonValueCondition;

class CustomConditionWrapper<T> {
  private final JsonValueCondition<? super T> constraint;

  static <T> CustomConditionWrapper<T> create(Class<? extends JsonValueCondition<T>> constraintClass) {
    return new CustomConditionWrapper<T>(constraintClass);
  }

  CustomConditionWrapper(Class<? extends JsonValueCondition<? super T>> constraintClass) {
    try {
      constraint = constraintClass.newInstance();
    }
    catch (InstantiationException e) {
      throw new RuntimeException(e);
    }
    catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  abstract static class StaticField implements JavaCodeGenerator.ElementData {
    abstract int getFieldNumber();
  }

  public void writeParse(JavaCodeGenerator.ClassScope classScope, final TextOutput out, String valueRef) {

    StaticField field = classScope.getRootClassScope().addMember(constraint.getClass(), new JavaCodeGenerator.ElementFactory<StaticField>() {
      @Override
      public StaticField create(final int code) {
        return new StaticField() {
          @Override public void generateCode(JavaCodeGenerator.ClassScope classScope) {
            out.append("private static final ");
            out.append(constraint.getClass().getCanonicalName()).append(' ').append("CUSTOM_CONDITION_").append(getFieldNumber()).append(" = new ");
            out.append(constraint.getClass().getCanonicalName()).append("();");
          }

          @Override
          int getFieldNumber() {
            return code;
          }
        };
      }
    });
    out.append("return ").append("CUSTOM_CONDITION_").append(field.getFieldNumber()).append(".conforms(").append(valueRef).append(");");
  }
}
