// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.debug.core.model;

import java.io.IOException;
import java.util.Collection;

import org.chromium.debug.core.ChromiumDebugPlugin;
import org.chromium.debug.core.util.ChromiumDebugPluginUtil;
import org.chromium.sdk.Breakpoint;
import org.chromium.sdk.Browser;
import org.chromium.sdk.BrowserTab;
import org.chromium.sdk.CallFrame;
import org.chromium.sdk.DebugContext;
import org.chromium.sdk.DebugEventListener;
import org.chromium.sdk.ExceptionData;
import org.chromium.sdk.Script;
import org.chromium.sdk.JavascriptVm.BreakpointCallback;
import org.chromium.sdk.JavascriptVm.ScriptsCallback;
import org.chromium.sdk.DebugContext.State;
import org.chromium.sdk.DebugContext.StepAction;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;

/**
 * An IDebugTarget implementation for remote JavaScript debugging.
 * Can debug any target that supports the ChromeDevTools protocol.
 */
public class DebugTargetImpl extends DebugElementImpl implements IDebugTarget, DebugEventListener {

  private static final IThread[] EMPTY_THREADS = new IThread[0];

  private static final long OPERATION_TIMEOUT_MS = 15000L;

  private final ILaunch launch;

  private final JavascriptThread[] threads;
  
  private final ConsolePseudoProcess consolePseudoProcess;

  private BrowserTab targetTab;

  private ResourceManager resourceManager;

  private BreakpointRegistry breakpointRegistry;

  private IProject debugProject;

  private DebugContext debugContext;

  private boolean isSuspended = false;

  private boolean isDisconnected = false;

  private final Browser browser;

  public DebugTargetImpl(ILaunch launch, Browser browser, ConsolePseudoProcess consolePseudoProcess) throws CoreException {
    super(null);
    this.launch = launch;
    this.browser = browser;
    this.threads = new JavascriptThread[] { new JavascriptThread(this) };
    this.consolePseudoProcess = consolePseudoProcess;
  }


  /**
   * Loads browser tabs, consults the {@code selector} which of the tabs to
   * attach to, and if any has been selected, requests an attachment to the tab.
   *
   * @param projectName to create for the browser scripts
   * @param selector that returns the user-selected tab to attach to
   * @param attachCallback to invoke on successful attachment
   * @param monitor to report the progress to
   * @return whether the target has attached to a tab
   * @throws CoreException
   */
  public boolean attach(String projectName, TabSelector selector, Runnable attachCallback,
      IProgressMonitor monitor) throws CoreException {
    monitor.beginTask("", 2); //$NON-NLS-1$
    BrowserTab[] tabs = getBrowserTabs(browser);
    this.targetTab = selector.selectTab(tabs);
    if (targetTab == null) {
      return false;
    }
    monitor.worked(1);
    return performAttach(projectName, attachCallback);
  }

  private boolean performAttach(String projectName, Runnable attachCallback) {
    if (targetTab.attach(this)) {
      this.debugProject = ChromiumDebugPluginUtil.createEmptyProject(projectName);
      this.breakpointRegistry = new BreakpointRegistry();
      this.resourceManager = new ResourceManager(debugProject, breakpointRegistry);
      onAttach(projectName, attachCallback);
      return true;
    }
    // Could not attach. Log a warning...
    ChromiumDebugPlugin.logWarning("Could not attach to a browser tab"); //$NON-NLS-1$
    return false;
  }

  private static BrowserTab[] getBrowserTabs(Browser browser) throws CoreException {
    BrowserTab[] tabs;
    try {
      tabs = browser.getTabs();
    } catch (IOException e) {
      throw newCoreException("Failed to get tabs for debugging", e); //$NON-NLS-1$
    } catch (IllegalStateException e) {
      throw newCoreException("Another Chromium JavaScript Debug Launch is in progress", e); //$NON-NLS-1$
    }
    return tabs;
  }

  private void onAttach(String projectName, Runnable attachCallback) {
    DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
    reloadScriptsAndResume(attachCallback);
  }

  private void reloadScriptsAndResume(final Runnable attachCallback) {
    reloadScripts(true, new Runnable() {
      public void run() {
        try {
          if (attachCallback != null) {
            attachCallback.run();
          }
        } finally {
          fireCreationEvent();
          resumed();
        }
      }
    });
  }

  private void reloadScripts(boolean isSync, final Runnable runnable) {
    Runnable command = new Runnable() {
      public void run() {
        targetTab.getScripts(new ScriptsCallback() {
          public void failure(String errorMessage) {
            ChromiumDebugPlugin.logError(errorMessage);
          }

          public void success(Collection<Script> scripts) {
            if (!targetTab.isAttached()) {
              return;
            }
            for (Script script : scripts) {
              getResourceManager().addScript(script);
            }
            if (runnable != null) {
              runnable.run();
            }
          }

        });
      }
    };
    if (isSync) {
      command.run();
      return;
    }
    Thread t = new Thread(command);
    t.setDaemon(true);
    t.start();
    try {
      t.join(OPERATION_TIMEOUT_MS);
    } catch (InterruptedException e) {
      ChromiumDebugPlugin.log(e);
    }
  }

  public String getName() throws DebugException {
    return Messages.DebugTargetImpl_TargetName;
  }

  public IProcess getProcess() {
    return null;
  }

  public BrowserTab getTargetTab() {
    return targetTab;
  }

  public IThread[] getThreads() throws DebugException {
    return isDisconnected()
        ? EMPTY_THREADS
        : threads;
  }

  public boolean hasThreads() throws DebugException {
    return getThreads().length > 0;
  }

  public boolean supportsBreakpoint(IBreakpoint breakpoint) {
    return ChromiumDebugPlugin.DEBUG_MODEL_ID.equals(breakpoint.getModelIdentifier()) &&
        !isDisconnected();
  }

  @Override
  public DebugTargetImpl getDebugTarget() {
    return this;
  }

  @Override
  public ILaunch getLaunch() {
    return launch;
  }

  @Override
  public String getModelIdentifier() {
    return ChromiumDebugPlugin.DEBUG_MODEL_ID;
  }

  public boolean canTerminate() {
    return false;
  }

  public boolean isTerminated() {
    return false;
  }

  public void terminate() throws DebugException {
  }

  public boolean canResume() {
    return !isDisconnected() && isSuspended();
  }

  public boolean canSuspend() {
    // Immediate thread suspension is not supported by V8
    // (as it does not make sense.)
    return false;
  }

  public synchronized boolean isSuspended() {
    return isSuspended;
  }

  private synchronized void setSuspended(boolean isSuspended) {
    this.isSuspended = isSuspended;
  }

  public void suspended(int detail) {
    setSuspended(true);
    getThread().reset();
    fireSuspendEvent(detail);
  }

  public void resume() throws DebugException {
    debugContext.continueVm(StepAction.CONTINUE, 1, null);
    // Let's pretend Chromium does respond to the "continue" request immediately
    resumed(DebugEvent.CLIENT_REQUEST);
  }

  public void resumed(int detail) {
    fireResumeEvent(detail);
  }

  public void suspend() throws DebugException {
    // Immediate thread suspension is not supported by V8
    // (as it does not make sense.)
  }

  public boolean canDisconnect() {
    return !isDisconnected();
  }

  public void disconnect() throws DebugException {
    if (!canDisconnect()) {
      return;
    }
    removeAllBreakpoints();
    if (!targetTab.detach()) {
      ChromiumDebugPlugin.logWarning(Messages.DebugTargetImpl_BadResultWhileDisconnecting);
    }
    // This is a duplicated call to disconnected().
    // The primary one comes from V8DebuggerToolHandler#onDebuggerDetached
    // but we want to make sure the target becomes disconnected even if
    // there is a browser failure and it does not respond.
    disconnected();
  }

  public synchronized boolean isDisconnected() {
    return isDisconnected;
  }

  public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
    return null;
  }

  public boolean supportsStorageRetrieval() {
    return false;
  }

  public IProject getDebugProject() {
    return debugProject;
  }

  /**
   * Fires a debug event
   *
   * @param event to be fired
   */
  public void fireEvent(DebugEvent event) {
    DebugPlugin debugPlugin = DebugPlugin.getDefault();
    if (debugPlugin != null) {
      debugPlugin.fireDebugEventSet(new DebugEvent[] { event });
    }
  }

  public void fireEventForThread(int kind, int detail) {
    try {
      IThread[] threads = getThreads();
      if (threads.length > 0) {
        fireEvent(new DebugEvent(threads[0], kind, detail));
      }
    } catch (DebugException e) {
      // Actually, this is not thrown in our getThreads()
      return;
    }
  }

  public void fireCreationEvent() {
    setDisconnected(false);
    fireEventForThread(DebugEvent.CREATE, DebugEvent.UNSPECIFIED);
  }

  public synchronized void setDisconnected(boolean disconnected) {
    isDisconnected = disconnected;
    if (disconnected && consolePseudoProcess != null) {
      consolePseudoProcess.terminated();
    }
  }

  public void fireResumeEvent(int detail) {
    setSuspended(false);
    fireEventForThread(DebugEvent.RESUME, detail);
    fireEvent(new DebugEvent(this, DebugEvent.RESUME, detail));
  }

  public void fireSuspendEvent(int detail) {
    setSuspended(true);
    fireEventForThread(DebugEvent.SUSPEND, detail);
    fireEvent(new DebugEvent(this, DebugEvent.SUSPEND, detail));
  }

  public void fireTerminateEvent() {
    // TODO(peter.rybin): from Alexander Pavlov: I think you need to fire a terminate event after
    // this line, for consolePseudoProcess if one is not null.
    fireEventForThread(DebugEvent.TERMINATE, DebugEvent.UNSPECIFIED);
    fireEvent(new DebugEvent(this, DebugEvent.TERMINATE, DebugEvent.UNSPECIFIED));
    fireEvent(new DebugEvent(getLaunch(), DebugEvent.TERMINATE, DebugEvent.UNSPECIFIED));
  }

  public void breakpointAdded(IBreakpoint breakpoint) {
    if (!supportsBreakpoint(breakpoint)) {
      return;
    }
    try {
      if (breakpoint.isEnabled()) {
        // Class cast is ensured by the supportsBreakpoint implementation
        final ChromiumLineBreakpoint lineBreakpoint = (ChromiumLineBreakpoint) breakpoint;
        IFile file = (IFile) breakpoint.getMarker().getResource();
        if (getResourceManager().isAddingFile(file)) {
          return; // restoring breakpoints in progress
        }
        final Script script = getResourceManager().getScript(file);
        if (script == null) {
          // Might be a script from a different debug target
          return;
        }
        final int line = (lineBreakpoint.getLineNumber() - 1) + script.getStartLine();
        BreakpointCallback callback = new BreakpointCallback() {
          public void success(Breakpoint breakpoint) {
            lineBreakpoint.setBreakpoint(breakpoint);
            breakpointRegistry.add(script, line, breakpoint);
          }

          public void failure(String errorMessage) {
            ChromiumDebugPlugin.logError(errorMessage);
          }
        };
        // ILineBreakpoint lines are 1-based while V8 lines are 0-based
        if (script.getName() != null) {
          getTargetTab().setBreakpoint(Breakpoint.Type.SCRIPT_NAME,
              script.getName(),
              line,
              Breakpoint.EMPTY_VALUE,
              breakpoint.isEnabled(),
              lineBreakpoint.getCondition(),
              lineBreakpoint.getIgnoreCount(),
              callback);
        } else {
          getTargetTab().setBreakpoint(Breakpoint.Type.SCRIPT_ID,
              String.valueOf(script.getId()),
              line,
              Breakpoint.EMPTY_VALUE,
              breakpoint.isEnabled(),
              lineBreakpoint.getCondition(),
              lineBreakpoint.getIgnoreCount(),
              callback);
        }
      }
    } catch (CoreException e) {
      ChromiumDebugPlugin.log(e);
    }
  }

  public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
    if (!supportsBreakpoint(breakpoint)) {
      return;
    }
    // Class cast is ensured by the supportsBreakpoint implementation
    ((ChromiumLineBreakpoint) breakpoint).changed();
  }

  public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
    if (!supportsBreakpoint(breakpoint)) {
      return;
    }
    try {
      if (breakpoint.isEnabled()) {
        // Class cast is ensured by the supportsBreakpoint implementation
        ChromiumLineBreakpoint lineBreakpoint = (ChromiumLineBreakpoint) breakpoint;
        lineBreakpoint.clear();
        breakpointRegistry.remove(
            getResourceManager().getScript((IFile) breakpoint.getMarker().getResource()),
            lineBreakpoint.getLineNumber() - 1,
            lineBreakpoint.getBrowserBreakpoint());
      }
    } catch (CoreException e) {
      ChromiumDebugPlugin.log(e);
    }
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object getAdapter(Class adapter) {
    if (ILaunch.class.equals(adapter)) {
      return this.launch;
    }
    return super.getAdapter(adapter);
  }

  public ResourceManager getResourceManager() {
    return resourceManager;
  }

  public JavascriptThread getThread() {
    return isDisconnected()
        ? null
        : threads[0];
  }

  private static void breakpointsHit(Collection<? extends Breakpoint> breakpointsHit) {
    if (breakpointsHit.isEmpty()) {
      return;
    }
    IBreakpoint[] breakpoints =
        DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(
            ChromiumDebugPlugin.DEBUG_MODEL_ID);
    for (IBreakpoint breakpoint : breakpoints) {
      ChromiumLineBreakpoint jsBreakpoint = (ChromiumLineBreakpoint) breakpoint;
      if (breakpointsHit.contains(jsBreakpoint.getBrowserBreakpoint())) {
        jsBreakpoint.setIgnoreCount(-1); // reset ignore count as we've hit it
      }
    }
  }

  public void resumed() {
    resumed(DebugEvent.CLIENT_REQUEST);
  }

  public void suspended(DebugContext context) {
    this.debugContext = context;
    breakpointsHit(context.getBreakpointsHit());
    if (context.getState() == State.EXCEPTION) {
      ExceptionData exceptionData = context.getExceptionData();
      CallFrame topFrame = context.getCallFrames().get(0);
      Script script = topFrame.getScript();
      ChromiumDebugPlugin.logError(
          Messages.DebugTargetImpl_LogExceptionFormat,
          exceptionData.isUncaught()
              ? Messages.DebugTargetImpl_Uncaught
              : Messages.DebugTargetImpl_Caught,
          exceptionData.getExceptionMessage(),
          script != null ? script.getName() : "<unknown>", //$NON-NLS-1$
          topFrame.getLineNumber(),
          trim(exceptionData.getSourceText(), 80));
      suspended(DebugEvent.BREAKPOINT);
      return;
    }
    boolean hasBreakpointsHit = !context.getBreakpointsHit().isEmpty();
    suspended(hasBreakpointsHit
        ? DebugEvent.BREAKPOINT
        : DebugEvent.STEP_END);
  }

  private static String trim(String text, int maxLength) {
    if (text == null || text.length() <= maxLength) {
      return text;
    }
    return text.substring(0, maxLength - 3) + "..."; //$NON-NLS-1$
  }

  public void disconnected() {
    if (!isDisconnected()) {
      setDisconnected(true);
      DebugPlugin.getDefault().getBreakpointManager().removeBreakpointListener(this);
      fireTerminateEvent();
    }
  }

  public DebugContext getDebugContext() {
    return debugContext;
  }

  public void navigated(String newUrl) {
    getResourceManager().clear();
    fireEvent(new DebugEvent(this, DebugEvent.CHANGE, DebugEvent.STATE));
  }

  public void scriptLoaded(Script newScript) {
    getResourceManager().addScript(newScript);
  }

  public void closed() {
    fireEvent(new DebugEvent(this, DebugEvent.CHANGE, DebugEvent.STATE));
  }

  private static CoreException newCoreException(String message, Throwable cause) {
    return new CoreException(
        new Status(Status.ERROR, ChromiumDebugPlugin.PLUGIN_ID, message, cause));
  }

  private void removeAllBreakpoints() {
    IBreakpointManager breakpointManager = DebugPlugin.getDefault().getBreakpointManager();
    IBreakpoint[] breakpoints =
        breakpointManager.getBreakpoints(ChromiumDebugPlugin.DEBUG_MODEL_ID);
    for (IBreakpoint bp : breakpoints) {
      ChromiumLineBreakpoint clb = (ChromiumLineBreakpoint) bp;
      if (clb.getBrowserBreakpoint() != null &&
          clb.getBrowserBreakpoint().getId() != Breakpoint.INVALID_ID) {
        clb.getBrowserBreakpoint().clear(null);
      }
    }
    try {
      breakpointManager.removeBreakpoints(breakpoints, true);
    } catch (CoreException e) {
      ChromiumDebugPlugin.log(e);
    }
  }
}
