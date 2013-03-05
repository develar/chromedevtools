// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.debugger;

/**
Sets overlay message.
 */
public class SetOverlayMessageParams extends org.jetbrains.wip.protocol.WipParams {


  /**
   * @param v Overlay message to display when paused in debugger.
   */
  public SetOverlayMessageParams message(String v) {
    put("message", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setOverlayMessage";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}