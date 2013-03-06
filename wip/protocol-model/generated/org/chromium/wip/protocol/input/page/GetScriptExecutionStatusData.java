// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Determines if scripts can be executed in the page.
 */
@org.chromium.protocolParser.JsonType
public interface GetScriptExecutionStatusData {
  /**
   * Script execution status: "allowed" if scripts can be executed, "disabled" if script execution has been disabled through page settings, "forbidden" if script execution for the given page is not possible for other reasons.
   */
  Result result();

  /**
   * Script execution status: "allowed" if scripts can be executed, "disabled" if script execution has been disabled through page settings, "forbidden" if script execution for the given page is not possible for other reasons.
   */
  public enum Result {
    ALLOWED, DISABLED, FORBIDDEN
  }
}