// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Represents function call argument. Either remote object id <code>objectId</code> or primitive <code>value</code> or neither of (for undefined) them should be specified.
 */
public final class CallArgument extends org.jetbrains.jsonProtocol.OutMessage {


  /**
   * @param v Primitive value.
   */
  public CallArgument value(String v) {
    put("value", v);
    return this;
  }

  /**
   * @param v Remote object handle.
   */
  public CallArgument objectId(String v) {
    if (v != null) {
      put("objectId", v);
    }
    return this;
  }
}