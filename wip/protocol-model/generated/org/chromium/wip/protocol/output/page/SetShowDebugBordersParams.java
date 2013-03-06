// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows debug borders on layers
 */
public class SetShowDebugBordersParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param show True for showing debug borders
   */
  public SetShowDebugBordersParams(boolean show) {
    put("show", show);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setShowDebugBorders";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}