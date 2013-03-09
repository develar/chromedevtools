// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Removes attribute with given name from an element with given id.
 */
public final class RemoveAttribute extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the element to remove attribute from.
   * @param name Name of the attribute to remove.
   */
  public RemoveAttribute(int nodeId, String name) {
    writeInt("nodeId", nodeId);
    writeString("name", name);
  }
  @Override
  public String getMethodName() {
    return "DOM.removeAttribute";
  }
}