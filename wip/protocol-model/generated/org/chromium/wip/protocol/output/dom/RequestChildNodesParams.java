// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that children of the node with given id are returned to the caller in form of <code>setChildNodes</code> events where not only immediate children are retrieved, but all children down to the specified depth.
 */
public final class RequestChildNodesParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param nodeId Id of the node to get children for.
   */
  public RequestChildNodesParams(int nodeId) {
    put("nodeId", nodeId);
  }

  /**
   * @param v The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the entire subtree or provide an integer larger than 0.
   */
  public RequestChildNodesParams depth(int v) {
    put("depth", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.requestChildNodes";
  }
}