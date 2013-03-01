// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 JavaScript call frame. Array of call frames form the call stack.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CallFrameValue {
  /**
   Call frame identifier. This identifier is only valid while the virtual machine is paused.
   */
  String/*See org.chromium.wip.protocol.commondebugger.CallFrameIdTypedef*/ callFrameId();

  /**
   Name of the JavaScript function called on this call frame.
   */
  String functionName();

  /**
   Location in the source code.
   */
  org.chromium.wip.protocol.inputdebugger.LocationValue location();

  /**
   Scope chain for this call frame.
   */
  java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> scopeChain();

  /**
   <code>this</code> object for this call frame.
   */
  @org.chromium.sdk.internal.protocolparser.JsonField(jsonLiteralName="this")
  org.chromium.wip.protocol.inputruntime.RemoteObjectValue getThis();

}
