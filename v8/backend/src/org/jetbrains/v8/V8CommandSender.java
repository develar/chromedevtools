// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8;

import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.jetbrains.jsonProtocol.Request;

/**
 * API to asynchronous message sender that supports callbacks.
 * @param <MESSAGE> type of message supported
 */
public interface V8CommandSender {
  RelayOk sendV8CommandAsync(Request message, boolean isImmediate, V8CommandCallback v8HandlerCallback, SyncCallback syncCallback);
}