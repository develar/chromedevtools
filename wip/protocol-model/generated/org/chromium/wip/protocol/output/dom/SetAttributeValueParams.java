// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets attribute for an element with given id.
 */
public class SetAttributeValueParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param nodeId Id of the element to set attribute for.
   * @param name Attribute name.
   * @param value Attribute value.
   */
  public SetAttributeValueParams(int nodeId, String name, String value) {
    put("nodeId", nodeId);
    put("name", name);
    put("value", value);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setAttributeValue";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}