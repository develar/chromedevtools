// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
public final class PushNodeByPathToFrontend extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.PushNodeByPathToFrontendResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public PushNodeByPathToFrontendResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMPushNodeByPathToFrontendResult(jsonReader);
  }
}