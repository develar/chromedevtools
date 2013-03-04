// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Releases remote object with given id.
 */
public class ReleaseObjectParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param objectId Identifier of the object to release.
   */
  public ReleaseObjectParams(String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectId) {
    this.put("objectId", objectId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".releaseObject";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
