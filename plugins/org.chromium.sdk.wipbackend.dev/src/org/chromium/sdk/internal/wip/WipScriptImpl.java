// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.wip;

import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.ScriptBase;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.util.RelaySyncCallback;
import org.chromium.v8.liveEditProtocol.LiveEditResult;
import org.chromium.v8.protocol.ProtocolService;
import org.chromium.wip.protocol.input.debugger.CallFrameValue;
import org.chromium.wip.protocol.input.debugger.SetScriptSourceData;
import org.chromium.wip.protocol.output.debugger.SetScriptSource;

import java.util.List;

class WipScriptImpl extends ScriptBase<String> {
  private final WipScriptManager scriptManager;

  WipScriptImpl(WipScriptManager scriptManager, Descriptor<String> descriptor) {
    super(descriptor);
    this.scriptManager = scriptManager;
  }

  @Override
  public RelayOk setSourceOnRemote(String newSource, UpdateCallback callback,
      SyncCallback syncCallback) {
    return sendLiveEditRequest(newSource, false, callback, syncCallback);
  }

  @Override
  public RelayOk previewSetSource(String newSource, UpdateCallback callback,
      SyncCallback syncCallback) {
    return sendLiveEditRequest(newSource, true, callback, syncCallback);
  }

  private RelayOk sendLiveEditRequest(String newSource, final boolean preview,
      final UpdateCallback updateCallback,
      final SyncCallback syncCallback) {

    RelaySyncCallback relay = new RelaySyncCallback(syncCallback);
    final RelaySyncCallback.Guard guard = relay.newGuard();

    GenericCallback<SetScriptSourceData> commandCallback = new GenericCallback<SetScriptSourceData>() {
      @Override
      public void success(SetScriptSourceData value) {
        RelayOk relayOk = possiblyUpdateCallFrames(preview, value, updateCallback, guard.getRelay());
        guard.discharge(relayOk);
      }

      @Override
      public void failure(Exception exception) {
        updateCallback.failure(exception.getMessage());
      }
    };

    WipCommandProcessor commandProcessor = scriptManager.getTabImpl().getCommandProcessor();
    return commandProcessor.send(new SetScriptSource(getId(), newSource).preview(preview), commandCallback, guard.asSyncCallback());
  }

  private RelayOk possiblyUpdateCallFrames(boolean preview, final SetScriptSourceData data,
      final UpdateCallback updateCallback, RelaySyncCallback relay) {

    // TODO: support 'step-in recommended'.

    List<CallFrameValue> callFrames = null;
    if (!preview) {
      callFrames = data.callFrames();
    }
    if (callFrames == null) {
      dispatchResult(data.result(), updateCallback);
      return relay.finish();
    } else {
      GenericCallback<Void> setFramesCallback =
          new GenericCallback<Void>() {
        @Override public void success(Void value) {
          dispatchResult(data.result(), updateCallback);
        }
        @Override public void failure(Exception exception) {
          throw new RuntimeException(exception);
        }
      };
      WipContextBuilder contextBuilder = scriptManager.getTabImpl().getContextBuilder();
      return contextBuilder.updateStackTrace(callFrames, setFramesCallback, relay.getUserSyncCallback());
    }
  }

  private static void dispatchResult(SetScriptSourceData.Result result, UpdateCallback updateCallback) {
    if (updateCallback != null) {
      LiveEditResult liveEditResult = ProtocolService.LIVE_EDIT.parseLiveEditResult(result.getDeferredReader());
      ChangeDescription wrappedChangeDescription = UpdateResultParser.wrapChangeDescription(liveEditResult);
      updateCallback.success(null, wrappedChangeDescription);
    }
  }
}
