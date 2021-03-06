// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes. DOMNode is a base node mirror type.
 */
@org.chromium.protocolReader.JsonType
public interface EventListenerValue {
  /**
   * <code>EventListener</code>'s type.
   */
  String type();
  /**
   * <code>EventListener</code>'s useCapture.
   */
  boolean useCapture();
  /**
   * <code>EventListener</code>'s isAttribute.
   */
  boolean isAttribute();
  /**
   * Target <code>DOMNode</code> id.
   */
  int nodeId();
  /**
   * Event handler function body.
   */
  String handlerBody();
  /**
   * Handler code location.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.debugger.LocationValue location();
  /**
   * Source script URL.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String sourceName();
  /**
   * Event handler function value.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue handler();

}