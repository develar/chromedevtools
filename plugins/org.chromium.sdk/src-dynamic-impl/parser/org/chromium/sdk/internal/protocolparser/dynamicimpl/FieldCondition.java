// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

/**
 * An implementation of JsonSubtypeCondition* annotations. Basically it only holds all parameters
 * and delegates actual condition evaluating to {@link #conditionLogic}.
 */
class FieldCondition {
  private final String propertyName;
  final FieldConditionLogic conditionLogic;

  FieldCondition(String propertyName, FieldConditionLogic conditionLogic) {
    this.propertyName = propertyName;
    this.conditionLogic = conditionLogic;
  }

  String getPropertyName() {
    return propertyName;
  }
}