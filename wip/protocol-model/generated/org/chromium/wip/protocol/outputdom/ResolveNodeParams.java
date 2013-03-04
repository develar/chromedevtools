// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Resolves JavaScript node object for given node id.
 */
public class ResolveNodeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.ResolveNodeData> {
  /**
   @param nodeId Id of the node to resolve.
   @param objectGroupOpt Symbolic group name that can be used to release multiple objects.
   */
  public ResolveNodeParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String objectGroupOpt) {
    this.put("nodeId", nodeId);
    if (objectGroupOpt != null) {
      this.put("objectGroup", objectGroupOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".resolveNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.ResolveNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDOMResolveNodeData(data.getUnderlyingObject());
  }

}
