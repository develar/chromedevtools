// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal;

import org.chromium.sdk.BrowserFactory;
import org.chromium.sdk.ConnectionLogger;
import org.chromium.sdk.StandaloneVm;
import org.chromium.sdk.internal.standalonev8.StandaloneVmImpl;
import org.chromium.sdk.internal.transport.Handshaker;
import org.chromium.sdk.internal.transport.SocketConnection;

import java.net.SocketAddress;

public class BrowserFactoryImpl extends BrowserFactory {
  private static final int DEFAULT_CONNECTION_TIMEOUT_MS = 1000;

  @Override
  public StandaloneVm createStandalone(SocketAddress socketAddress, ConnectionLogger connectionLogger) {
    Handshaker.StandaloneV8 handshaker = new Handshaker.StandaloneV8();
    return new StandaloneVmImpl(new SocketConnection(socketAddress, getTimeout(), connectionLogger, handshaker), handshaker);
  }

  private static int getTimeout() {
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
