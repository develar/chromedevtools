// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes. DOMNode is a base node mirror type.
 */
@org.chromium.protocolParser.JsonType
public interface EventListenerValue {
  /**
   <code>EventListener</code>'s type.
   */
  String type();

  /**
   <code>EventListener</code>'s useCapture.
   */
  boolean useCapture();

  /**
   <code>EventListener</code>'s isAttribute.
   */
  boolean isAttribute();

  /**
   Target <code>DOMNode</code> id.
   */
  long nodeId();

  /**
   Event handler function body.
   */
  String handlerBody();

  /**
   Handler code location.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputdebugger.LocationValue location();

  /**
   Source script URL.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String sourceName();

  /**
   Event handler function value.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue handler();

}
