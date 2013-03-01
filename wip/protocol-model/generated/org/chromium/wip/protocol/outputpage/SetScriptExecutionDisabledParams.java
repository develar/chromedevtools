// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Switches script execution in the page.
 */
public class SetScriptExecutionDisabledParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param value Whether script execution should be disabled in the page.
   */
  public SetScriptExecutionDisabledParams(boolean value) {
    this.put("value", value);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setScriptExecutionDisabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
