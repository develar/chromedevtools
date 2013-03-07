// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Sets overlay message.
 */
public class SetOverlayMessageParams extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Overlay message to display when paused in debugger.
   */
  public SetOverlayMessageParams message(String v) {
    if (v != null) {
      put("message", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setOverlayMessage";
  }
}