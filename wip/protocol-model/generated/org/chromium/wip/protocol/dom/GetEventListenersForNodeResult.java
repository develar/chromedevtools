// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Returns event listeners relevant to the node.
 */
@org.chromium.protocolReader.JsonType
public interface GetEventListenersForNodeResult {
  /**
   * Array of relevant listeners.
   */
  java.util.List<org.chromium.wip.protocol.dom.EventListenerValue> listeners();

}