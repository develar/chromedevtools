// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
 */
public final class EnableParams extends org.jetbrains.wip.WipRequest {

  @Override
  public String getMethodName() {
    return "Debugger.enable";
  }
}