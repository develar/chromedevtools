// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A utility for JSON-related data conversion.
 */
public class JsonUtil {

  private static final Logger LOGGER = Logger.getLogger(JsonUtil.class.getName());

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

  /**
   * Helper function to rip out a nested JSON object from the payload.
   *
   * @param obj JSON payload
   * @param key to look up
   * @return null if key not found
   */
  public static Map getAsJSON(Map obj, CharSequence key) {
    String keyString = key.toString();
    Object v = obj.get(keyString);
    if (v instanceof Map || v == null) {
      return (Map) v;
    }

    LOGGER.log(Level.SEVERE, "Key: {0}, found value: {1}", new Object[] {keyString, v});
    return null;
  }

  private JsonUtil() {
    // not instantiable
  }
}
