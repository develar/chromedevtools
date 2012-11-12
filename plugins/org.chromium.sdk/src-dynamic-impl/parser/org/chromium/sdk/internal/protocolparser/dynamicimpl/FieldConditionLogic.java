// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.*;

import java.lang.reflect.Method;

/**
 * An interface to field conditions logic. Some conditions are simple and never need parsed
 * values, others are more fine-grained and require quick parser before making actual checks.
 */
abstract class FieldConditionLogic {
  FieldConditionLogic() {
  }

  static FieldConditionLogic readLogic(Method m) {
    JsonSubtypeConditionBoolValue boolValueAnnotation = m.getAnnotation(JsonSubtypeConditionBoolValue.class);
    if (boolValueAnnotation != null) {
      final boolean required = boolValueAnnotation.value();
      return new FieldConditionLogic() {
        @Override
        void writeCheck(ClassScope scope, TextOutput out, String valueRef) {
          out.append("return ");
          if (!required) {
            out.append('!');
          }
          out.append(valueRef).semi();
        }
      };
    }

    JsonSubtypeConditionCustom customAnnotation = m.getAnnotation(JsonSubtypeConditionCustom.class);
    if (customAnnotation != null) {
      final CustomConditionWrapper constraint = CustomConditionWrapper.create(customAnnotation.condition());
      return new FieldConditionLogic() {
        @Override
        void writeCheck(ClassScope scope, TextOutput out, String valueRef) {
          constraint.writeParse(scope, out, valueRef);
        }
      };
    }

    JsonSubtypeCondition conditionAnnotation = m.getAnnotation(JsonSubtypeCondition.class);
    if (conditionAnnotation != null) {
      final boolean shouldBeNull = conditionAnnotation.fieldIsAbsent() || conditionAnnotation.valueIsNull();
      return new FieldConditionLogic() {
        @Override
        void writeCheck(ClassScope scope, TextOutput out, String valueRef) {
          out.append("return ").append(valueRef).space().append(shouldBeNull ? '=' : '!').append("= null").semi();
        }
      };
    }
    return null;
  }

  abstract void writeCheck(ClassScope scope, TextOutput out, String valueRef);
}