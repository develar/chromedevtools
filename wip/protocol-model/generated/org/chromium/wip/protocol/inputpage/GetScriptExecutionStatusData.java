// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Determines if scripts can be executed in the page.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetScriptExecutionStatusData {
  /**
   Script execution status: "allowed" if scripts can be executed, "disabled" if script execution has been disabled through page settings, "forbidden" if script execution for the given page is not possible for other reasons.
   */
  Result result();

  /**
   Script execution status: "allowed" if scripts can be executed, "disabled" if script execution has been disabled through page settings, "forbidden" if script execution for the given page is not possible for other reasons.
   */
  public enum Result {
    ALLOWED,
    DISABLED,
    FORBIDDEN,
  }
}
