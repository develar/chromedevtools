// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
@org.chromium.protocolReader.JsonType
public interface RequestNodeResult {
  /**
   * Node id for given object.
   */
  int nodeId();

}