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
    return null;
  }

  abstract void writeCheck(ClassScope scope, TextOutput out, String valueRef);
}