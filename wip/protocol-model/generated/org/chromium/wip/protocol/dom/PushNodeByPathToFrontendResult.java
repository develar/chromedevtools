// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
@org.chromium.protocolReader.JsonType
public interface PushNodeByPathToFrontendResult {
  /**
   * Id of the node for given path.
   */
  int nodeId();

}