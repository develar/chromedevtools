// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Switches script execution in the page.
 */
public class SetScriptExecutionDisabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param value Whether script execution should be disabled in the page.
   */
  public SetScriptExecutionDisabledParams(boolean value) {
    //this.put("value", value);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setScriptExecutionDisabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
