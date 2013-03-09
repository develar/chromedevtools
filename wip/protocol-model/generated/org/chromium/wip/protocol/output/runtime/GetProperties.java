// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public final class GetProperties extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.runtime.GetPropertiesData> {
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
  public org.chromium.wip.protocol.input.runtime.GetPropertiesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseRuntimeGetPropertiesData(data.getDeferredReader());
  }
}