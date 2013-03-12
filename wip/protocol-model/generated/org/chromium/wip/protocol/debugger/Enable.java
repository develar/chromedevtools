// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
 */
public final class Enable extends org.jetbrains.wip.protocol.WipRequest {

  @Override
  public String getMethodName() {
    return "Debugger.enable";
  }
}