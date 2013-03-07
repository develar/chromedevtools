// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Releases remote object with given id.
 */
public class ReleaseObjectParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param objectId Identifier of the object to release.
   */
  public ReleaseObjectParams(String objectId) {
    put("objectId", objectId);
  }
  @Override
  public String getMethodName() {
    return "Runtime.releaseObject";
  }
}