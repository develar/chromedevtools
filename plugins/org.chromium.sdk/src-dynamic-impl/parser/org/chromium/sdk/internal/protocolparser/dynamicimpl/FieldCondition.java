// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

/**
 * An implementation of JsonSubtypeCondition* annotations. Basically it only holds all parameters
 * and delegates actual condition evaluating to {@link #conditionLogic}.
 */
class FieldCondition {
  private final String propertyName;
  private final QuickParser<?> quickParser;
  private final FieldConditionLogic conditionLogic;

  FieldCondition(String propertyName, QuickParser<?> quickParser, FieldConditionLogic conditionLogic) {
    if (conditionLogic.requiresQuickParser() && quickParser == null) {
      throw new IllegalStateException("The choose condition does not work with the type of " + propertyName);
    }
    this.propertyName = propertyName;
    this.quickParser = quickParser;
    this.conditionLogic = conditionLogic;
  }

  String getPropertyName() {
    return propertyName;
  }

  public void writeCheck(MethodScope methodScope, String valueRef, String hasValueRef, String resultRef) {
    conditionLogic.writeCheck(methodScope, valueRef, hasValueRef, resultRef, quickParser);
  }
}