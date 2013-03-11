// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public final class GetProperties extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.runtime.GetPropertiesData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param objectId Identifier of the object to return properties for.
   */
  public GetProperties(String objectId) {
    writeString("objectId", objectId);
  }

  /**
   * @param v If true, returns properties belonging only to the element itself, not to its prototype chain.
   */
  public GetProperties ownProperties(boolean v) {
    writeBoolean("ownProperties", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Runtime.getProperties";
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.GetPropertiesData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readRuntimeGetPropertiesData(data.getDeferredReader());
  }
}