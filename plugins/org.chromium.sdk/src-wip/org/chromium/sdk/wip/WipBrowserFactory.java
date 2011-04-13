// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.wip;

import java.net.InetSocketAddress;

import org.chromium.sdk.Browser;
import org.chromium.sdk.ConnectionLogger;

/**
 * A factory for connections via WebInspector protocol (WIP).
 */
public interface WipBrowserFactory {

  WipBrowserFactory INSTANCE = new org.chromium.sdk.internal.wip.WipBrowserFactoryImpl();

  /**
   * TODO(peter.rybin): This should return a regular {@link Browser} when we have tab access
   * in protocol.
   */
  Browser createBrowser(InetSocketAddress socketAddress,
      LoggerFactory connectionLoggerFactory);

  interface LoggerFactory {
    ConnectionLogger newBrowserConnectionLogger();

    ConnectionLogger newTabConnectionLogger();
  }
}
