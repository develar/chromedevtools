// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Removes node with given id.
 */
public class RemoveNodeParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param nodeId Id of the node to remove.
   */
  public RemoveNodeParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId) {
    this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".removeNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
