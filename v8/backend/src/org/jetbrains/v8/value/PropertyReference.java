// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.value;


/**
 * A named property reference.
 */
public class PropertyReference {
  private final Object name;

  private final DataWithRef smthWithRef;

  /**
   * @param name the name of the property
   * @param smthWithRef a JSON descriptor of the property
   */
  public PropertyReference(Object name, DataWithRef smthWithRef) {
    this.name = name;
    this.smthWithRef = smthWithRef;
  }

  public long getRef() {
    return smthWithRef.ref();
  }

  public Object getName() {
    return name;
  }

  public DataWithRef getValueObject() {
    return smthWithRef;
  }
}