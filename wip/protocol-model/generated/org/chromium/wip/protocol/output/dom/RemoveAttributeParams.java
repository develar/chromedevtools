// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Removes attribute with given name from an element with given id.
 */
public class RemoveAttributeParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the element to remove attribute from.
   @param name Name of the attribute to remove.
   */
  public RemoveAttributeParams(long nodeId, String name) {
    //this.put("nodeId", nodeId);
    //this.put("name", name);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".removeAttribute";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
