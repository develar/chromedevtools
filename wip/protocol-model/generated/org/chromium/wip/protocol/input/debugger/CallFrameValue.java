// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * JavaScript call frame. Array of call frames form the call stack.
 */
@org.chromium.protocolReader.JsonType
public interface CallFrameValue {
  /**
   * Call frame identifier. This identifier is only valid while the virtual machine is paused.
   */
  String callFrameId();
  /**
   * Name of the JavaScript function called on this call frame.
   */
  String functionName();
  /**
   * Location in the source code.
   */
  org.chromium.wip.protocol.input.debugger.LocationValue location();
  /**
   * Scope chain for this call frame.
   */
  java.util.List<org.chromium.wip.protocol.input.debugger.ScopeValue> scopeChain();
  /**
   * <code>this</code> object for this call frame.
   */
  @org.chromium.protocolReader.JsonField(jsonLiteralName="this")
  org.chromium.wip.protocol.input.runtime.RemoteObjectValue getThis();

}