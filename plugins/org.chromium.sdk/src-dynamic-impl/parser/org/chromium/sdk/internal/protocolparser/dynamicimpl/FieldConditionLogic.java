// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.*;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * An interface to field conditions logic. Some conditions are simple and never need parsed
 * values, others are more fine-grained and require quick parser before making actual checks.
 */
abstract class FieldConditionLogic {
  private final boolean logicRequiresQuickParser;

  FieldConditionLogic(boolean logicRequiresQuickParser) {
    this.logicRequiresQuickParser = logicRequiresQuickParser;
  }

  boolean requiresQuickParser() {
    return logicRequiresQuickParser;
  }

  /**
   * Constructor function that creates field condition logic from method annotations.
   */
  static FieldConditionLogic readLogic(Method m) throws JsonProtocolModelParseException {
    List<FieldConditionLogic> results = new ArrayList<FieldConditionLogic>(1);
    JsonSubtypeConditionBoolValue boolValueAnnotation = m.getAnnotation(JsonSubtypeConditionBoolValue.class);
    if (boolValueAnnotation != null) {
      final boolean required = boolValueAnnotation.value();
      results.add(new FieldConditionLogic(true) {
        @Override
        void writeCheck(MethodScope scope, String valueRef, String hasValueRef,
                        String resultRef, QuickParser<?> quickParser) {
          TextOutput out = scope.getOutput();
          out.append("return ");
          if (!required) {
            out.append('!');
          }
          out.append(valueRef).semi();
        }
      });
    }
    JsonSubtypeConditionCustom customAnnotation = m.getAnnotation(JsonSubtypeConditionCustom.class);
    if (customAnnotation != null) {
      // We do not know exact type of condition. But we also do not care about result type
      // in 'constraint'. Compiler cannot catch the wildcard here, so we use an assumed type.
      @SuppressWarnings("unchecked") Class<? extends JsonValueCondition<Void>> assumedTypeCondition =
          (Class<? extends JsonValueCondition<Void>>) customAnnotation.condition();
      final CustomConditionWrapper<?> constraint = CustomConditionWrapper.create(assumedTypeCondition);
      results.add(new FieldConditionLogic(true) {
        @Override
        void writeCheck(MethodScope scope, String valueRef, String hasValueRef, String resultRef, QuickParser<?> quickParser) {
          constraint.writeParse(scope, scope.getOutput(), valueRef);
        }
      });
    }
    JsonSubtypeCondition conditionAnn = m.getAnnotation(JsonSubtypeCondition.class);
    if (conditionAnn != null) {
      int savedResSize = results.size();
      if (conditionAnn.fieldIsAbsent()) {
        results.add(new FieldConditionLogic(false) {

          @Override
          void writeCheck(MethodScope scope, String valueRef, String hasValueRef,
                          String resultRef, QuickParser<?> quickParser) {
            scope.startLine("boolean " + resultRef + " = !" + hasValueRef + ";\n");
          }
        });
      }
      if (conditionAnn.valueIsNull()) {
        results.add(new FieldConditionLogic(false) {

          @Override
          void writeCheck(MethodScope scope, String valueRef, String hasValueRef,
                          String resultRef, QuickParser<?> quickParser) {
            scope.startLine("boolean " + resultRef + " = " + valueRef + " != null;\n");
          }
        });
      }
      if (savedResSize == results.size()) {
        results.add(new FieldConditionLogic(false) {

          @Override
          void writeCheck(MethodScope scope, String valueRef, String hasValueRef,
                          String resultRef, QuickParser<?> quickParser) {
            scope.startLine("boolean " + resultRef + " = " + hasValueRef + ";\n");
          }
        });
      }
    }
    if (results.size() == 0) {
      return null;
    }
    if (results.size() > 1) {
      throw new IllegalStateException("Too many constraints for field getter " + m);
    }
    return results.get(0);
  }

  abstract void writeCheck(MethodScope methodScope, String valueRef, String hasValueRef,
                           String resultRef, QuickParser<?> quickParser);
}