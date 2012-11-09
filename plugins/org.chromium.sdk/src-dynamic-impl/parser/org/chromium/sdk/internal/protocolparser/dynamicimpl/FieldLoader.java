// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;

/**
 * This classs is responsible for parsing field values and saving them in {@link ObjectData}
 * for future use.
 */
class FieldLoader {
  public static final char FIELD_PREFIX = '_';

  private final String fieldName;
  final ValueParser<?> parser;

  FieldLoader(String fieldName, ValueParser<?> parser) {
    this.fieldName = fieldName;
    this.parser = parser;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void writeFieldDeclaration(ClassScope scope) {
    scope.getOutput().append("private ");
    parser.appendFinishedValueTypeNameJava(scope.getOutput());
    scope.append(' ').append(FIELD_PREFIX).append(fieldName).append(';');
  }
}
