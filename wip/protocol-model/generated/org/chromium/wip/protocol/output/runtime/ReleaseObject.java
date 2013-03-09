// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Releases remote object with given id.
 */
public final class ReleaseObject extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param objectId Identifier of the object to release.
   */
  public ReleaseObject(String objectId) {
    writeString("objectId", objectId);
  }
  @Override
  public String getMethodName() {
    return "Runtime.releaseObject";
  }
}