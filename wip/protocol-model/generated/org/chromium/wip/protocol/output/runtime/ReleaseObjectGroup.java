// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Releases all remote objects that belong to a given group.
 */
public final class ReleaseObjectGroup extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param objectGroup Symbolic object group name.
   */
  public ReleaseObjectGroup(String objectGroup) {
    put("objectGroup", objectGroup);
  }
  @Override
  public String getMethodName() {
    return "Runtime.releaseObjectGroup";
  }
}