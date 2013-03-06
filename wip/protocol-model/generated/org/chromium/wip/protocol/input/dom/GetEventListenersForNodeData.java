// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.dom;

/**
 * Returns event listeners relevant to the node.
 */
@org.chromium.protocolParser.JsonType
public interface GetEventListenersForNodeData {
  /**
   * Array of relevant listeners.
   */
  java.util.List<org.chromium.wip.protocol.input.dom.EventListenerValue> listeners();

}