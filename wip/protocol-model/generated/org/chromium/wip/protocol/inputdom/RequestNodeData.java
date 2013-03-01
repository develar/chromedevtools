// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestNodeData {
  /**
   Node id for given object.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

}
