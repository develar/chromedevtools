package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonValueCondition;

class CustomConditionWrapper {
  private final JsonValueCondition<?> constraint;

  CustomConditionWrapper(JsonValueCondition<?> condition) {
    constraint = condition;
  }

  public static CustomConditionWrapper create(Class<? extends JsonValueCondition<?>> condition) {
    try {
      return new CustomConditionWrapper(condition.newInstance());
    }
    catch (InstantiationException e) {
      throw new RuntimeException(e);
    }
    catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  private abstract static class StaticField implements JavaCodeGenerator.ElementData {
    abstract int getFieldNumber();
  }

  public void writeParse(ClassScope classScope, final TextOutput out, String valueRef) {
    StaticField field = classScope.getRootClassScope().addMember(constraint.getClass(), new JavaCodeGenerator.ElementFactory<StaticField>() {
      @Override
      public StaticField create(final int code) {
        return new StaticField() {
          @Override public void generateCode(ClassScope classScope) {
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
