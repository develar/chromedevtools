// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import org.chromium.sdk.BrowserFactory;

public class BrowserFactoryImpl extends BrowserFactory {
  private static final int DEFAULT_CONNECTION_TIMEOUT_MS = 1000;

  public static int getTimeout() {
    String timeoutString = System.getProperty(
        "org.chromium.sdk.client.connection.timeoutMs",
        String.valueOf(DEFAULT_CONNECTION_TIMEOUT_MS));
    int timeoutMs = DEFAULT_CONNECTION_TIMEOUT_MS;
    try {
      timeoutMs = Integer.parseInt(timeoutString);
    } catch (NumberFormatException e) {
      // fall through and use the default value
    }
    return timeoutMs;
  }

}
