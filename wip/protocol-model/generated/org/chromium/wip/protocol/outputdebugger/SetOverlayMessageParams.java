// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Sets overlay message.
 */
public class SetOverlayMessageParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param messageOpt Overlay message to display when paused in debugger.
   */
  public SetOverlayMessageParams(String messageOpt) {
    if (messageOpt != null) {
      this.put("message", messageOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setOverlayMessage";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
