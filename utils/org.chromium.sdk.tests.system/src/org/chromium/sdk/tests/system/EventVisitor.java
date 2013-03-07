// Copyright (c) 2010 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.tests.system;

import org.chromium.sdk.DebugContext;
import org.chromium.sdk.Script;

/**
 * A visitor for events from {@link org.chromium.sdk.DebugEventListener} and {@link org.chromium.sdk.TabDebugEventListener}.
 */
interface EventVisitor<RES> {
  RES visitClosed() throws SmokeException;
  RES visitNavigated(String newUrl) throws SmokeException;
  RES visitDisconnected() throws SmokeException;
  RES visitScriptLoaded(Script newScript) throws SmokeException;
  RES visitSuspended(DebugContext context) throws SmokeException;
  RES visitResumed() throws SmokeException;
  RES visitScriptCollected(Script script) throws SmokeException;
}
