// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.processor;

import org.jetbrains.v8.DebugSession;
import org.chromium.sdk.internal.v8native.protocol.input.EventNotification;
import org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody;
import org.chromium.sdk.internal.v8native.protocol.input.ScriptCollectedBody;

import java.io.IOException;

/**
 * Listens for scripts sent in the "scriptCollected" events and passes their ids to
 * the {@link org.jetbrains.v8.ScriptManager}.
 */
public class ScriptCollectedProcessor extends V8EventProcessor {

  public ScriptCollectedProcessor(DebugSession debugSession) {
    super(debugSession);
  }

  @Override
  public void messageReceived(EventNotification eventMessage) {
    EventNotificationBody body = eventMessage.body();
    ScriptCollectedBody scriptCollectedBody;
    try {
      scriptCollectedBody = body.asScriptCollectedBody();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    getDebugSession().getScriptManager().scriptCollected(scriptCollectedBody.script().id());
  }
}