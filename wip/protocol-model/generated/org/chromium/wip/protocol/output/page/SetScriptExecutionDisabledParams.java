// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Switches script execution in the page.
 */
public class SetScriptExecutionDisabledParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param value Whether script execution should be disabled in the page.
   */
  public SetScriptExecutionDisabledParams(boolean value) {
    put("value", value);
  }
  @Override
  public String getMethodName() {
    return "Page.setScriptExecutionDisabled";
  }
}