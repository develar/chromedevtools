// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import org.jetbrains.jsonProtocol.JsonReaders;

import java.util.List;

public final class Enums {
  public static void appendEnums(List<String> enumConstants, String enumName, boolean input, TextOutput out) {
    out.append("enum ").append(enumName).openBlock();
    for (String constant : enumConstants) {
      out.append(JsonReaders.convertRawEnumName(constant));
      if (!input) {
        out.append("(\"").append(constant).append("\")");
      }
      if (!enumConstants.get(enumConstants.size() - 1).equals(constant)) {
        out.comma();
      }
    }
    if (input) {
      out.closeBlock();
    }
    else {
      out.semi().newLine();
    }
  }
}
