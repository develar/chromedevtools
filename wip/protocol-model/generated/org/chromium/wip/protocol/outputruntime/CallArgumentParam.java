// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Represents function call argument. Either remote object id <code>objectId</code> or primitive <code>value</code> or neither of (for undefined) them should be specified.
 */
public class CallArgumentParam extends org.json.simple.JSONObject {
  /**
   @param valueOpt Primitive value.
   @param objectIdOpt Remote object handle.
   */
  public CallArgumentParam(Object valueOpt, String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectIdOpt) {
    if (valueOpt != null) {
      this.put("value", valueOpt);
    }
    if (objectIdOpt != null) {
      this.put("objectId", objectIdOpt);
    }
  }

}
