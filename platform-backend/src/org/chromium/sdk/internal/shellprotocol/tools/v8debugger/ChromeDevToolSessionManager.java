// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.shellprotocol.tools.v8debugger;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.sdk.DebugEventListener;
import org.chromium.sdk.TabDebugEventListener;
import org.chromium.sdk.internal.shellprotocol.BrowserImpl;
import org.chromium.sdk.internal.shellprotocol.BrowserTabImpl;
import org.chromium.sdk.internal.shellprotocol.tools.ToolHandler;
import org.chromium.sdk.internal.shellprotocol.tools.ToolOutput;
import org.chromium.sdk.internal.shellprotocol.tools.protocol.input.Result;
import org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage;
import org.chromium.sdk.internal.transport.Message;
import org.chromium.sdk.internal.v8native.*;
import org.chromium.sdk.internal.v8native.protocol.input.data.ContextHandle;
import org.chromium.sdk.util.MethodIsBlockingException;
import org.jetbrains.v8.protocol.ProtocolService;
import org.jetbrains.jsonProtocol.JsonReaders;
import org.jetbrains.jsonProtocol.Request;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Handles the interaction with the "V8Debugger" tool.
 */
public class ChromeDevToolSessionManager implements DebugSessionManager {

  /**
   * This exception is thrown whenever the handler could not get a tab
   * attachment result from the debugged browser.
   */
  public static class AttachmentFailureException extends Exception {

    private static final long serialVersionUID = 1L;

    public AttachmentFailureException(String message, Throwable cause) {
      super(message, cause);
    }
  }

  /**
   * An interface to run callbacks in response to V8 debugger commands that do
   * not have associated JSON payloads.
   */
  public interface ResultAwareCallback {

    /**
     * This method is invoked whenever a response to a V8 command is received.
     *
     * @param result of the command
     */
    void resultReceived(Result result);
  }

  /** The class logger. */
  private static final Logger LOGGER =
      Logger.getLogger(ChromeDevToolSessionManager.class.getName());

  private static final V8ContextFilter CONTEXT_FILTER = new V8ContextFilter() {
    @SuppressWarnings({"UnusedDeclaration", "UnusedAssignment"})
    public boolean isContextOurs(ContextHandle contextHandle) {
      Object data = contextHandle.data();
      if (data == null) {
        return false;
      }

      boolean skipSketchCode = true;
      if (skipSketchCode) {
        // We do not actually have a context id to compare with. So we shouldn't waste time
        // on parsing until we have this id.
        return true;
      }

      long scriptContextId;
      if (data instanceof String) {
        String stringData = (String)data;
        // we should parse string and check context id. It should have the format "type,id".
      }
      else if (data instanceof JsonReaderEx) {
        scriptContextId = ProtocolService.PROTOCOL_READER.readContextData((JsonReaderEx)data).value();
      }
      //TODO(peter.rybin): Here we are probably supposed to compare it with our context id.
      return true;
    }
  };

  /** The host BrowserTabImpl instance. */
  private final BrowserTabImpl browserTabImpl;

  private final ToolOutput toolOutput;

  /** The debug context for this handler. */
  private final DebugSession debugSession;

  private final AtomicReference<AttachState> attachState =
    new AtomicReference<AttachState>(null);

  private final AtomicReference<ResultAwareCallback> attachCallback =
      new AtomicReference<ResultAwareCallback>(null);

  private final AtomicReference<ResultAwareCallback> detachCallback =
      new AtomicReference<ResultAwareCallback>(null);

  public ChromeDevToolSessionManager(BrowserTabImpl browserTabImpl, ToolOutput toolOutput) {
    this.browserTabImpl = browserTabImpl;
    this.toolOutput = toolOutput;
    V8CommandOutputImpl v8MessageOutput = new V8CommandOutputImpl(toolOutput);
    debugSession = new DebugSession(this, CONTEXT_FILTER, v8MessageOutput, browserTabImpl);
  }

  public DebugSession getDebugSession() {
    return debugSession;
  }

  public DebugEventListener getDebugEventListener() {
    return browserTabImpl.getDebugEventListener();
  }

  private TabDebugEventListener getTabDebugEventListener() {
    return browserTabImpl.getTabDebugEventListener();
  }

  private void handleChromeDevToolMessage(Message message) {
    JsonReaderEx reader = JsonReaders.createReader(message.getContent());
    ToolsMessage devToolsMessage;
    //try {
      //devToolsMessage = ToolsProtocolParserAccess.get().parseToolsMessage(reader);
      devToolsMessage = null;
    //} catch (IOException e) {
    //  LOGGER.log(Level.SEVERE, "Unexpected JSON data: " + reader.toString(), e);
    //  return;
    //}
    DebuggerToolCommand command = DebuggerToolCommand.forName(devToolsMessage.command());
    if (command == null) {
      throw new IllegalArgumentException("Invalid command: " + devToolsMessage.command());
    }
    try {
      switch (command) {
        case ATTACH:
          processAttach(devToolsMessage);
          break;
        case DETACH:
          processDetach(devToolsMessage);
          break;
        case DEBUGGER_COMMAND:
          processDebuggerCommand(devToolsMessage);
          break;
        case NAVIGATED:
          processNavigated(devToolsMessage);
          break;
        case CLOSED:
          processClosed(devToolsMessage);
          break;
      }
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "Unexpected JSON data: " + reader.toString(), e);
    }
  }

  public void onDebuggerDetached() {
    // ignore
  }

  /**
   * Disconnects tab from connections. Can safely be called several times. This sends EOS
   * message and unregisters tab from browser.
   * Should be called from UI, may block.
   */
  public void cutTheLineMyself() {
    toolHandler.cutTheLine();
  }
  /**
   * This method is sure to be called only once.
   */
  private void handleEos() {
    // We overwrite other values; nobody else should become unhappy, all expecters
    // are in handle* methods and they are not going to get their results
    attachState.set(AttachState.DISCONNECTED);
    browserTabImpl.handleEosFromToolService();
    debugSession.getCommandProcessor().processEos();

    DebugEventListener debugEventListener = getDebugEventListener();
    if (debugEventListener != null) {
      debugEventListener.disconnected();
    }
  }

  private AttachState getAttachState() {
    return attachState.get();
  }

  /**
   * This method is for UI -- pretty low precision of result type.
   * @return whether the handler is attached to a tab
   */
  public boolean isAttachedForUi() {
    return STATES_CALLED_ATTACHED.contains(getAttachState());
  }

  /**
   * Attaches the remote debugger to the associated browser tab.
   *
   * @return the attachment result
   * @throws AttachmentFailureException whenever the handler could not connect
   *         to the browser
   */
  public Result attachToTab() throws AttachmentFailureException, MethodIsBlockingException {
    boolean res = attachState.compareAndSet(null, AttachState.ATTACHING);
    if (!res) {
      throw new AttachmentFailureException("Illegal state", null);
    }

    String command = V8DebuggerToolMessageFactory.attach();
    Result attachResult = sendSimpleCommandSync(attachCallback, command);

    debugSession.startCommunication();

    return attachResult;
  }

  /**
   * Detaches the remote debugger from the associated browser tab.
   * Should be called from UI thread.
   * @return the detachment result
   */
  public Result detachFromTab() {
    if (attachState.get() != AttachState.NORMAL) {
      toolHandler.onDebuggerDetached();
      return Result.ILLEGAL_TAB_STATE;
    }

    String command = V8DebuggerToolMessageFactory.detach();
    Result result;
    try {
      result = sendSimpleCommandSync(detachCallback, command);
    } catch (AttachmentFailureException e) {
      result = null;
    } finally {
      // Make sure line is cut
      cutTheLineMyself();
    }

    return result;
  }

  private Result sendSimpleCommandSync(AtomicReference<ResultAwareCallback> callbackReference,
      String command) throws AttachmentFailureException {
    final Semaphore sem = new Semaphore(0);
    final Result[] output = new Result[1];
    ResultAwareCallback callback = new ResultAwareCallback() {
      public void resultReceived(Result result) {
        output[0] = result;
        sem.release();
      }
    };

    boolean res = callbackReference.compareAndSet(null, callback);
    if (!res) {
      throw new IllegalStateException("Callback is already set");
    }

    boolean completed;
    try {
      toolOutput.send(command);

      try {
        completed = sem.tryAcquire(BrowserImpl.OPERATION_TIMEOUT_MS, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    } finally {
      // Make sure we do not leave our callback behind us.
      callbackReference.compareAndSet(callback, null);
    }

    // If the command fails, notify the caller.
    if (!completed) {
      throw new AttachmentFailureException("Timed out", null);
    }

    return output[0];
  }

  public ToolHandler getToolHandler() {
    return toolHandler;
  }

  private final ToolHandlerImpl toolHandler = new ToolHandlerImpl();

  private class ToolHandlerImpl implements ToolHandler {
    private volatile boolean isLineCut = false;
    private boolean alreadyHasEos = false;

    /**
     * Here we call methods that are normally are being invoked from Connection Dispatch
     * thread. So we compete for "this" as synchronization monitor with that thread.
     * We should be careful, cause theoretically it may cause a deadlock.
     */
    void cutTheLine() {
      // First mark ourselves as "cut off" to stop other threads,
      // then start waiting on synchronized.
      isLineCut = true;
      synchronized (this) {
        sendEos();
      }
    }

    public synchronized void handleMessage(Message message) {
      if (isLineCut) {
        return;
      }
      handleChromeDevToolMessage(message);
    }

    public synchronized void handleEos() {
      if (isLineCut) {
        return;
      }
      sendEos();
    }
    private synchronized void sendEos() {
      if (alreadyHasEos) {
        return;
      }
      alreadyHasEos = true;
      ChromeDevToolSessionManager.this.handleEos();
    }

    public void onDebuggerDetached() {
      // ignore
    }
  }

  private void processClosed(ToolsMessage devToolsMessage) {
    notifyCallback(detachCallback, Result.OK);
    getTabDebugEventListener().closed();
    cutTheLineMyself();
  }

  /**
   * This method is invoked from synchronized code sections. It checks if there is a callback
   * provided in {@code callbackReference}. Sets callback to null.
   *
   * @param callbackReference reference which may hold callback
   * @param result to notify the callback with
   */
  private static void notifyCallback(
          AtomicReference<ResultAwareCallback> callbackReference,
          Result result
  ) {
    ResultAwareCallback callback = callbackReference.getAndSet(null);
    if (callback != null) {
      try {
        callback.resultReceived(result);
      } catch (Exception e) {
        LOGGER.log(Level.WARNING, "Exception in the callback", e);
      }
    }
  }

  private void processAttach(ToolsMessage toolsMessage) throws IOException {
    int resultValue = toolsMessage.result();
    Result result = Result.forCode(resultValue);
    // Message destination equals context.getTabId()
    if (result == Result.OK) {
      boolean res = attachState.compareAndSet(AttachState.ATTACHING, AttachState.NORMAL);
      if (!res) {
        throw new IllegalStateException();
      }
    } else {
      if (result == null) {
        result = Result.DEBUGGER_ERROR;
      }
    }
    notifyCallback(attachCallback, result);
  }

  private void processDetach(ToolsMessage toolsMessage) throws IOException {
    long resultValue = toolsMessage.result();
    Result result = Result.forCode((int) resultValue);
    if (result == Result.OK) {
      // ignore result, we may already be in DISCONNECTED state
      attachState.compareAndSet(AttachState.DETACHING, AttachState.DETACHED);
    } else {
      if (result == null) {
        result = Result.DEBUGGER_ERROR;
      }
    }
    notifyCallback(detachCallback, result);
  }

  private void processDebuggerCommand(ToolsMessage toolsMessage) throws IOException {
    JsonReaderEx reader = toolsMessage.data().asDebuggerData();
    if (reader == null) {
      throw new IllegalArgumentException("'data' field not found");
    }
    debugSession.getCommandProcessor().processIncomingJson(reader);
  }

  private void processNavigated(ToolsMessage toolsMessage) throws IOException {
    String newUrl = toolsMessage.data().asNavigatedData();

    debugSession.getScriptManager().reset();
    browserTabImpl.setUrl(newUrl);

    getTabDebugEventListener().navigated(newUrl);
  }

  public static class V8CommandOutputImpl implements V8CommandOutput {
    private final ToolOutput toolOutput;

    public V8CommandOutputImpl(ToolOutput toolOutput) {
      this.toolOutput = toolOutput;
    }

    public void send(Request debuggerMessage, boolean isImmediate) {
      toolOutput.send(V8DebuggerToolMessageFactory.debuggerCommand(debuggerMessage.toJson()));
      if (isImmediate) {
        toolOutput.send(V8DebuggerToolMessageFactory.evaluateJavascript(V8Helper.JAVASCRIPT_VOID));
      }
    }

    public void runInDispatchThread(Runnable callback) {
      toolOutput.runInDispatchThread(callback);
    }
  }

  private static class V8DebuggerToolMessageFactory {

    static String attach() {
      return createDebuggerMessage(DebuggerToolCommand.ATTACH, null);
    }

    static String detach() {
      return createDebuggerMessage(DebuggerToolCommand.DETACH, null);
    }

    public static String debuggerCommand(CharSequence json) {
      return createDebuggerMessage(DebuggerToolCommand.DEBUGGER_COMMAND, json);
    }

    public static String evaluateJavascript(String javascript) {
      return createDebuggerMessage(DebuggerToolCommand.EVALUATE_JAVASCRIPT, '"' + javascript + '"');
    }

    private static String createDebuggerMessage(DebuggerToolCommand command, CharSequence dataField) {
      StringBuilder sb = new StringBuilder("{\"command\":\"");
      sb.append(command.commandName).append('"');
      if (dataField != null) {
        sb.append(",\"data\":").append(dataField);
      }
      sb.append('}');
      return sb.toString();
    }
  }

  private enum AttachState {
    ATTACHING, NORMAL, DETACHING, DETACHED, DISCONNECTED
  }

  private static final Set<AttachState> STATES_CALLED_ATTACHED = EnumSet.of(AttachState.NORMAL);
}
