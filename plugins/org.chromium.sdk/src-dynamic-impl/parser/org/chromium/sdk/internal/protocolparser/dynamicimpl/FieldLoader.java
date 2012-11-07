// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;

/**
 * This classs is responsible for parsing field values and saving them in {@link ObjectData}
 * for future use.
 */
class FieldLoader {
  public static final char FIELD_PREFIX = '_';

  private final String fieldName;
  private final int fieldPosInArray;
  final SlowParser<?> parser;
  private final boolean isOptional;

  FieldLoader(int fieldPosInArray, String fieldName, SlowParser<?> parser,
      boolean isOptional) {
    this.fieldName = fieldName;
    this.fieldPosInArray = fieldPosInArray;
    this.parser = parser;
    this.isOptional = isOptional;
  }

  public String getFieldName() {
    return fieldName;
  }

  public void parse(boolean hasValue, Object value, ObjectData objectData)
      throws JsonProtocolParseException {
    if (hasValue) {
      try {
        objectData.getFieldArray()[fieldPosInArray] = parser.parseValue(value, objectData);
      } catch (JsonProtocolParseException e) {
        throw new JsonProtocolParseException("Failed to parse field " + getFieldName(), e);
      }
    } else {
      if (!isOptional) {
        throw new JsonProtocolParseException("Field is not optional: " + getFieldName());
      }
    }
  }

  public void writeFieldDeclaration(ClassScope scope) {
    scope.getOutput().newLine().append("private ");
    parser.appendFinishedValueTypeNameJava(scope.getOutput());
    scope.append(' ').append(FIELD_PREFIX).append(fieldName).append(';');
  }
}
