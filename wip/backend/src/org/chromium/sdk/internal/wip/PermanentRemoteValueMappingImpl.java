// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.JsEvaluateContext;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.wip.PermanentRemoteValueMapping;
import org.jetbrains.wip.protocol.runtime.ReleaseObjectGroup;
import org.jetbrains.wip.protocol.CommandResponse;

class PermanentRemoteValueMappingImpl extends WipValueLoader
    implements PermanentRemoteValueMapping {
  private final String id;

  PermanentRemoteValueMappingImpl(WipTabImpl tabImpl, String id) {
    super(tabImpl);
    this.id = id;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public RelayOk delete(final GenericCallback<Void> callback, SyncCallback syncCallback) {
    ReleaseObjectGroup params = new ReleaseObjectGroup(id);
    WipCommandCallback callbackWrapper;
    if (callback == null) {
      callbackWrapper = null;
    } else {
      callbackWrapper = new WipCommandCallback() {
        @Override
        public void messageReceived(CommandResponse response) {
          callback.success(null);
        }

        @Override
        public void failure(String message) {
          callback.failure(new Exception(message));
        }
      };
    }
    return getTabImpl().getCommandProcessor().send(params, callbackWrapper, syncCallback);
  }

  @Override
  String getObjectGroupId() {
    return id;
  }

  @Override
  public JsEvaluateContext getEvaluateContext() {
    return new WipContextBuilder.GlobalEvaluateContext(this);
  }
}
