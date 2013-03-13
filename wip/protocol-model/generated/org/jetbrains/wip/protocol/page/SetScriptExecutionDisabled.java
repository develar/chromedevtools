// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Switches script execution in the page.
 */
public final class SetScriptExecutionDisabled extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param value Whether script execution should be disabled in the page.
   */
  public SetScriptExecutionDisabled(boolean value) {
    writeBoolean("value", value);
  }
  @Override
  public String getMethodName() {
    return "Page.setScriptExecutionDisabled";
  }
}