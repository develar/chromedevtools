// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Scope description.
 */
@org.chromium.protocolReader.JsonType
public interface ScopeValue {
  /**
   * Scope type.
   */
  Type type();
  /**
   * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.
   */
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue object();

  /**
   * Scope type.
   */
  public enum Type {
    GLOBAL, LOCAL, WITH, CLOSURE, CATCH
  }
}