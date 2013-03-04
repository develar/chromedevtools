// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
public class PushNodeByPathToFrontendParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData> {
  /**
   @param path Path to node in the proprietary format.
   */
  public PushNodeByPathToFrontendParams(String path) {
    this.put("path", path);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".pushNodeByPathToFrontend";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDOMPushNodeByPathToFrontendData(data.getUnderlyingObject());
  }

}
