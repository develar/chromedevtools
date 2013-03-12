// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import java.util.Map;

/**
 * A utility for JSON-related data conversion.
 */
public class JsonUtil {
  /**
   * Helper function to rip out a string from a JSON payload.
   *
   * @param obj JSON payload
   * @param key to look up
   * @return null if key not found or bad type
   */
  public static String getAsString(Map obj, CharSequence key) {
    String keyString = key.toString();
    Object v = obj.get(keyString);
    if (v instanceof String || v == null) {
      return (String) v;
    }
    return String.valueOf(v);
  }

  private JsonUtil() {
    // not instantiable
  }
}
