// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonType;

/**
 * Stores all data for instance of json type.
 * Each implementation of json type interface is a java dynamic proxy, that holds reference
 * to {@link JsonInvocationHandler} which holds reference to this structure. ObjectData points
 * back to dynamic proxy instance in {@link #proxy}.
 */
class ObjectData {

  /**
   * Stores type-specific set of pre-parsed fields.
   */
  private final Object[] fieldArray;

  private final Object underlyingObject;
  private final TypeHandler<?> typeHandler;

  private Object proxy = null;

  ObjectData(TypeHandler<?> typeHandler, Object inputObject, int fieldArraySize) {
    this.typeHandler = typeHandler;
    underlyingObject = inputObject;

    fieldArray = fieldArraySize == 0 ? null : new Object[fieldArraySize];
  }

  Object[] getFieldArray() {
    return fieldArray;
  }

  Object getProxy() {
    return proxy;
  }

  @Override
  public String toString() {
    return "[" + typeHandler.getShortName() + "]/" + underlyingObject;
  }
}
