// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Sets overlay message.
 */
public final class SetOverlayMessage extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Overlay message to display when paused in debugger.
   */
  public SetOverlayMessage message(String v) {
    if (v != null) {
      writeString("message", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.setOverlayMessage";
  }
}