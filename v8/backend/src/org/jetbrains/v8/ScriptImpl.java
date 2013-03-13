package org.jetbrains.v8;

import org.chromium.sdk.DebugContext;
import org.chromium.sdk.DebugEventListener;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.ScriptBase;
import org.chromium.sdk.internal.v8native.protocol.input.ChangeLiveBody;
import org.chromium.sdk.internal.v8native.protocol.input.CommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;
import org.chromium.sdk.internal.v8native.protocol.output.ChangeLiveMessage;
import org.jetbrains.v8.value.HandleManager;
import org.chromium.v8.liveEditProtocol.LiveEditResult;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ScriptImpl extends ScriptBase<Integer> {
  private static final Logger LOGGER = Logger.getLogger(ScriptImpl.class.getName());

  private final DebugSession debugSession;

  public ScriptImpl(Descriptor<Integer> descriptor, DebugSession debugSession) {
    super(descriptor);
    this.debugSession = debugSession;
  }

  @Override
  public RelayOk setSourceOnRemote(String newSource, UpdateCallback callback, SyncCallback syncCallback) {
    return debugSession.sendMessage(new ChangeLiveMessage(getId(), newSource, Boolean.FALSE), createScriptUpdateCallback(callback, false), syncCallback);
  }

  @Override
  public RelayOk previewSetSource(String newSource, UpdateCallback callback, SyncCallback syncCallback) {
    return debugSession.sendMessage(new ChangeLiveMessage(getId(), newSource, Boolean.TRUE), createScriptUpdateCallback(callback, true), syncCallback);
  }

  private V8CommandCallback createScriptUpdateCallback(final UpdateCallback callback, final boolean previewOnly) {
    return new V8CommandCallbackBase() {
      @Override
      public void success(CommandResponse.Success successResponse) {
        ChangeLiveBody body = successResponse.body().asChangeLiveBody();
        LiveEditResult resultDescription = body.getResultDescription();
        if (!previewOnly) {
          V8Helper.ScriptLoadCallback scriptCallback = new V8Helper.ScriptLoadCallback() {
            @Override
            public void failure(String message) {
              LOGGER.log(Level.SEVERE, "Failed to reload script after LiveEdit script update; " + message);
            }

            @Override
            public void success() {
              DebugEventListener listener = debugSession.getDebugEventListener();
              if (listener != null) {
                listener.scriptContentChanged(ScriptImpl.this);
              }
            }
          };
          V8Helper.reloadScriptAsync(debugSession, new long[]{getId()}, scriptCallback, null);

          if (body.stepin_recommended() == Boolean.TRUE) {
            DebugContext debugContext = debugSession.getContextBuilder().getCurrentDebugContext();
            //noinspection StatementWithEmptyBody
            if (debugContext == null) {
              // We may have already issued 'continue' since the moment that change live command
              // was sent so the context was dropped. Ignore this case.
            }
            else {
              debugContext.continueVm(DebugContext.StepAction.IN, 0, null, null);
            }
          }
          else {
            if (resultDescription != null && resultDescription.stack_modified()) {
              debugSession.recreateCurrentContext();
            }
          }
        }

        if (callback != null) {
          callback.success(body.getChangeLog(), UpdateResultParser.wrapChangeDescription(resultDescription));
        }
      }

      @Override
      public void failure(String message) {
        callback.failure(message);
      }
    };
  }

  public static int getScriptId(HandleManager handleManager, int scriptRef) {
    SomeHandle handle = scriptRef == -1 ? null : handleManager.getHandle(scriptRef);
    if (handle == null) {
      return -1; // not found
    }
    return handle.asScriptHandle().id();
  }
}
