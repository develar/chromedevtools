// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.runtime;

/**
Represents function call argument. Either remote object id <code>objectId</code> or primitive <code>value</code> or neither of (for undefined) them should be specified.
 */
public class CallArgumentParam extends org.jetbrains.jsonProtocol.OutMessage {


  /**
   * @param v Primitive value.
   */
  public CallArgumentParam value(String v) {
    put("value", v);
    return this;
  }

  /**
   * @param v Remote object handle.
   */
  public CallArgumentParam objectId(String v) {
    put("objectId", v);
    return this;
  }
}