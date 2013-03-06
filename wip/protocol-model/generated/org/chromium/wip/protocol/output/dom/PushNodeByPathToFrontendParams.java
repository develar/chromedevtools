// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
public class PushNodeByPathToFrontendParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData> {
  /**
   * @param path Path to node in the proprietary format.
   */
  public PushNodeByPathToFrontendParams(String path) {
    put("path", path);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".pushNodeByPathToFrontend";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMPushNodeByPathToFrontendData(data.getUnderlyingObject());
  }
}