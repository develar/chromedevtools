// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Requests that backend shows debug borders on layers
 */
public class SetShowDebugBordersParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param show True for showing debug borders
   */
  public SetShowDebugBordersParams(boolean show) {
    this.put("show", show);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setShowDebugBorders";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
