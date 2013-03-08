// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Sets attribute for an element with given id.
 */
public final class SetAttributeValueParams extends org.jetbrains.wip.WipRequest {
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
  @Override
  public String getMethodName() {
    return "DOM.setAttributeValue";
  }
}