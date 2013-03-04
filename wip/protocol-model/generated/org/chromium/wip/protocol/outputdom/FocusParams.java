// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Focuses the given element.
 */
public class FocusParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the node to focus.
   */
  public FocusParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId) {
    this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".focus";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
