// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
@org.chromium.protocolReader.JsonType
public interface RequestNodeData {
  /**
   * Node id for given object.
   */
  int nodeId();

}