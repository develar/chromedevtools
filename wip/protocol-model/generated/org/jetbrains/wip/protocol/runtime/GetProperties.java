// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public final class GetProperties extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.runtime.GetPropertiesResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public GetPropertiesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readRuntimeGetPropertiesResult(jsonReader);
  }
}