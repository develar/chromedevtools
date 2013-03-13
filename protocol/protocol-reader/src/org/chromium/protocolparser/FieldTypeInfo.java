// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

/**
 * Information about a field type that is used in Java code generation.
 */
interface FieldTypeInfo {
  void appendValueTypeNameJava(FileScopeImpl scope, TextOutput out);
}