// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.shellprotocol.tools.devtools;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.internal.shellprotocol.tools.ToolHandler;
import org.chromium.sdk.internal.shellprotocol.tools.ToolOutput;
import org.chromium.sdk.internal.shellprotocol.tools.protocol.DevToolsServiceCommand;
import org.chromium.sdk.internal.shellprotocol.tools.protocol.input.ToolsMessage;
import org.chromium.sdk.internal.transport.Message;
import org.jetbrains.jsonProtocol.JsonReaders;
import org.jetbrains.jsonProtocol.StringIntPair;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Handles the interaction with the "DevToolsService" tool.
 */
public class DevToolsServiceHandler implements ToolHandler {

  /** The class logger. */
  private static final Logger LOGGER = Logger.getLogger(DevToolsServiceHandler.class.getName());

  /**
   * The debugger connection to use.
   */
  private final ToolOutput toolOutput;

  /**
   * A "list_tabs" command callback. Is accessed in a synchronized way.
   */
  private ListTabsCallback listTabsCallback;

  /**
   * A "version" command callback. Is accessed in a synchronized way.
   */
  private VersionCallback versionCallback;

  /**
   * An access/modification lock for the callback fields.
   */
  private final Object lock = new Object();

  /**
   * A callback that will be invoked when the ChromeDevTools protocol version
   * is available.
   */
  private interface VersionCallback {
    void versionReceived(String versionString);
  }

  /**
   * A callback that will be invoked when the tabs from the associated browser
   * instance are ready (or not...)
   */
  private interface ListTabsCallback {
    void tabsReceived(List<StringIntPair> tabs);

    void failure(int result);
  }

  public DevToolsServiceHandler(ToolOutput toolOutput) {
    this.toolOutput = toolOutput;
  }

  public void onDebuggerDetached() {
  }

  public void handleMessage(Message message) {
    JsonReader reader = JsonReaders.createReader(message.getContent().toString());
    ToolsMessage toolsResponse;
    //try {
      //toolsResponse = ToolsProtocolParserAccess.get().parseToolsMessage(reader);
      toolsResponse = null;
    //}
    //catch (IOException e) {
    //  LOGGER.log(Level.SEVERE, "Unexpected JSON data: " + message.getContent(), e);
    //  return;
    //}

    DevToolsServiceCommand command = DevToolsServiceCommand.forString(toolsResponse.command());
    if (command == null) {
      return;
    }
    try {
      switch (command) {
      case LIST_TABS:
        handleListTabs(toolsResponse);
        break;
      case VERSION:
        handleVersion(toolsResponse);
        break;
      default:
        break;
      }
    } catch (IOException e) {
      LOGGER.log(Level.SEVERE, "Unexpected JSON data: " + reader.toString(), e);
    }
  }

  public void handleEos() {
    // ignore this event, we do not close browser in any way; but clients should dismiss
    // all tickets
  }

  private void handleVersion(ToolsMessage toolsResponse) throws IOException {
    VersionCallback callback;
    synchronized (lock) {
      callback = versionCallback;
      versionCallback = null;
    }
    if (callback != null) {
      String versionString = toolsResponse.data().asVersionData();
      callback.versionReceived(versionString);
    }
  }

  private void handleListTabs(ToolsMessage toolsResponse) throws IOException {
    ListTabsCallback callback;
    synchronized (lock) {
      callback = listTabsCallback;
      listTabsCallback = null;
    }
    if (callback != null) {
      int result = toolsResponse.result();
      if (result != 0) {
        callback.failure(result);
        return;
      }
      callback.tabsReceived(toolsResponse.data().asListTabsData());
    }
  }

  @SuppressWarnings("unchecked")
  public List<StringIntPair> listTabs(int timeout) {
    final Semaphore sem = new Semaphore(0);
    final List<StringIntPair>[] output = new List[1];
    synchronized (lock) {
      if (listTabsCallback != null) {
        throw new IllegalStateException("list_tabs request is pending");
      }
      listTabsCallback = new ListTabsCallback() {
        public void failure(int result) {
          sem.release();
        }

        public void tabsReceived(List<StringIntPair> tabs) {
          output[0] = tabs;
          sem.release();
        }
      };
    }
    toolOutput.send(CommandFactory.listTabs());
    // TODO: properly handle errors here, in particular throw IOException if timeout.
    try {
      if (!sem.tryAcquire(timeout, TimeUnit.MILLISECONDS)) {
        resetListTabsHandler();
      }
    } catch (InterruptedException e) {
      // Fall through
    }

    if (output[0] == null) {
      return Collections.emptyList();
    }

    return output[0];
  }

  public String version(int timeout) throws TimeoutException {
    final Semaphore sem = new Semaphore(0);
    final String[] output = new String[1];
    synchronized (lock) {
      if (versionCallback != null) {
        throw new IllegalStateException("version request is pending");
      }
      versionCallback = new VersionCallback() {
        public void versionReceived(String versionString) {
          output[0] = versionString;
          sem.release();
        }
      };
    }
    toolOutput.send(CommandFactory.version());
    boolean res;
    try {
      res = sem.tryAcquire(timeout, TimeUnit.MILLISECONDS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    if (!res) {
      throw new TimeoutException("Failed to get version response in " + timeout + " ms");
    }
    return output[0];
  }

  /**
   * This can get called asynchronously.
   */
  public void resetListTabsHandler() {
    synchronized (lock) {
      listTabsCallback = null;
    }
  }

  private static class CommandFactory {
    public static String ping() {
      return createDevToolsMessage(DevToolsServiceCommand.PING);
    }

    public static String version() {
      return createDevToolsMessage(DevToolsServiceCommand.VERSION);
    }
    public static String listTabs() {
      return createDevToolsMessage(DevToolsServiceCommand.LIST_TABS);
    }

    private static String createDevToolsMessage(DevToolsServiceCommand command) {
      return "{\"command\":\"" + command.commandName + "\"}";
    }
  }
}
