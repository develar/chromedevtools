// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.runtime;

/**
 * Releases all remote objects that belong to a given group.
 */
public class ReleaseObjectGroupParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param objectGroup Symbolic object group name.
   */
  public ReleaseObjectGroupParams(String objectGroup) {
    put("objectGroup", objectGroup);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.RUNTIME + ".releaseObjectGroup";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}