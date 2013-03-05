// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Returns event listeners relevant to the node.
 */
public class GetEventListenersForNodeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData> {
  /**
   @param nodeId Id of the node to get listeners for.
   @param objectGroupOpt Symbolic group name for handler value. Handler value is not returned without this parameter specified.
   */
  public GetEventListenersForNodeParams(long nodeId, String objectGroupOpt) {
    //this.put("nodeId", nodeId);
    //this.put("objectGroup", objectGroupOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getEventListenersForNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetEventListenersForNodeData(data.getUnderlyingObject());
  }

}
