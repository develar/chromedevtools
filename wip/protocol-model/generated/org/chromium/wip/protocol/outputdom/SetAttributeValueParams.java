// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Sets attribute for an element with given id.
 */
public class SetAttributeValueParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the element to set attribute for.
   @param name Attribute name.
   @param value Attribute value.
   */
  public SetAttributeValueParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String name, String value) {
    this.put("nodeId", nodeId);
    this.put("name", name);
    this.put("value", value);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setAttributeValue";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
