// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Returns properties of a given object. Object group of the result is inherited from the target object.
 */
public class GetPropertiesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputruntime.GetPropertiesData> {
  /**
   @param objectId Identifier of the object to return properties for.
   @param ownPropertiesOpt If true, returns properties belonging only to the element itself, not to its prototype chain.
   */
  public GetPropertiesParams(String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectId, Boolean ownPropertiesOpt) {
    this.put("objectId", objectId);
    if (ownPropertiesOpt != null) {
      this.put("ownProperties", ownPropertiesOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".getProperties";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputruntime.GetPropertiesData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseRuntimeGetPropertiesData(data.getUnderlyingObject());
  }

}
