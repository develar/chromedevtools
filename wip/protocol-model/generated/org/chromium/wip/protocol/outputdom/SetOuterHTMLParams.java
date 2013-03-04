// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Sets node HTML markup, returns new node id.
 */
public class SetOuterHTMLParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the node to set markup for.
   @param outerHTML Outer HTML markup to set.
   */
  public SetOuterHTMLParams(long nodeId, String outerHTML) {
    //this.put("nodeId", nodeId);
    //this.put("outerHTML", outerHTML);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setOuterHTML";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
