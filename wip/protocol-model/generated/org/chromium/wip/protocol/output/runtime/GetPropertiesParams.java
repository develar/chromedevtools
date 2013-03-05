// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.runtime;

/**
Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public class GetPropertiesParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.runtime.GetPropertiesData> {
  /**
   @param objectId Identifier of the object to return properties for.
   @param ownPropertiesOpt If true, returns properties belonging only to the element itself, not to its prototype chain.
   */
  public GetPropertiesParams(String objectId, boolean ownPropertiesOpt) {
    //this.put("objectId", objectId);
    //this.put("ownProperties", ownPropertiesOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.RUNTIME + ".getProperties";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.input.runtime.GetPropertiesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseRuntimeGetPropertiesData(data.getUnderlyingObject());
  }

}
