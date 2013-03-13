// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Requests that children of the node with given id are returned to the caller in form of <code>setChildNodes</code> events where not only immediate children are retrieved, but all children down to the specified depth.
 */
public final class RequestChildNodes extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param nodeId Id of the node to get children for.
   */
  public RequestChildNodes(int nodeId) {
    writeInt("nodeId", nodeId);
  }

  /**
   * @param v The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the entire subtree or provide an integer larger than 0.
   */
  public RequestChildNodes depth(int v) {
    writeInt("depth", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.requestChildNodes";
  }
}