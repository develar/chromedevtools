// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

/**
 * This classs is responsible for parsing field values and saving them in {@_link ObjectData}
 * for future use.
 */
class FieldLoader {
  public static final char FIELD_PREFIX = '_';

  private final String fieldName;
  final ValueParser valueParser;

  FieldLoader(String fieldName, ValueParser valueParser) {
    this.fieldName = fieldName;
    this.valueParser = valueParser;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void writeFieldDeclaration(TextOutput out) {
    out.append("private ");
    valueParser.appendFinishedValueTypeName(out);
    out.append(' ').append(FIELD_PREFIX).append(fieldName).append(';');
  }
}
