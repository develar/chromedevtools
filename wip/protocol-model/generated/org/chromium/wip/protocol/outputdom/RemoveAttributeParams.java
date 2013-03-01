// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Removes attribute with given name from an element with given id.
 */
public class RemoveAttributeParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param nodeId Id of the element to remove attribute from.
   @param name Name of the attribute to remove.
   */
  public RemoveAttributeParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String name) {
    this.put("nodeId", nodeId);
    this.put("name", name);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".removeAttribute";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
