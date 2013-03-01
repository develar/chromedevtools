// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Returns event listeners relevant to the node.
 */
public class GetEventListenersForNodeParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData> {
  /**
   @param nodeId Id of the node to get listeners for.
   @param objectGroupOpt Symbolic group name for handler value. Handler value is not returned without this parameter specified.
   */
  public GetEventListenersForNodeParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String objectGroupOpt) {
    this.put("nodeId", nodeId);
    if (objectGroupOpt != null) {
      this.put("objectGroup", objectGroupOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".getEventListenersForNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDOMGetEventListenersForNodeData(data.getUnderlyingObject());
  }

}