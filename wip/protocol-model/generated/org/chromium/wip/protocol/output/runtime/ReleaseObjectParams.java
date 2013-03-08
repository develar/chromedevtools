// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Releases remote object with given id.
 */
public final class ReleaseObjectParams extends org.jetbrains.wip.WipRequest {
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