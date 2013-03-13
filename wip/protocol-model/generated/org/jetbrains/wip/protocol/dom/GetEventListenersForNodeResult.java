// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Returns event listeners relevant to the node.
 */
@org.chromium.protocolReader.JsonType
public interface GetEventListenersForNodeResult {
  /**
   * Array of relevant listeners.
   */
  java.util.List<org.jetbrains.wip.protocol.dom.EventListenerValue> listeners();

}