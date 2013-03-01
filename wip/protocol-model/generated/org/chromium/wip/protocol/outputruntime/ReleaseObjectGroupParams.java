// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Releases all remote objects that belong to a given group.
 */
public class ReleaseObjectGroupParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param objectGroup Symbolic object group name.
   */
  public ReleaseObjectGroupParams(String objectGroup) {
    this.put("objectGroup", objectGroup);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".releaseObjectGroup";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
