// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
public final class PushNodeByPathToFrontend extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param path Path to node in the proprietary format.
   */
  public PushNodeByPathToFrontend(String path) {
    writeString("path", path);
  }
  @Override
  public String getMethodName() {
    return "DOM.pushNodeByPathToFrontend";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMPushNodeByPathToFrontendData(data.getDeferredReader());
  }
}