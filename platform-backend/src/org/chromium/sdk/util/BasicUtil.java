// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

/**
 * Utilities for safe using collections and several small methods missing in standard Java library.
 */
public class BasicUtil {

  /**
   * Type-safe wrapper for {@link Map#get(Object)} method. It restricts
   * type of key and makes sure that you do not try to get by key of wrong
   * type.
   */
  public static <K, V> V getSafe(Map<K, V> map, K key) {
    return map.get(key);
  }

  /**
   * Type-safe wrapper for {@link Map#containsKey(Object)} method. It restricts
   * type of a value and makes sure that you do not call method for the value
   * wrong type.
   */
  public static <K, V> boolean containsKeySafe(Map<K, V> map, K key) {
    return map.containsKey(key);
  }

  /**
   * Convenience wrapper around {@link Object#equals(Object)} method that allows
   * both left and right to be null.
   */
  public static <T> boolean eq(T left, T right) {
    if (left == null) {
      return right == null;
    } else if (left == right) {
      return true;
    } else {
      return left.equals(right);
    }
  }

  /**
   * Takes stacktrace string out of exception.
   */
  public static String getStacktraceString(Exception exception) {
    StringWriter stringWriter = new StringWriter();
    PrintWriter printWriter = new PrintWriter(stringWriter);
    exception.printStackTrace(printWriter);
    printWriter.close();
    return stringWriter.toString();
  }
}
