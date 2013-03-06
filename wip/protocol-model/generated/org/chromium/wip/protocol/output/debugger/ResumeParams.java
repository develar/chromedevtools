// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Resumes JavaScript execution.
 */
public class ResumeParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".resume";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}