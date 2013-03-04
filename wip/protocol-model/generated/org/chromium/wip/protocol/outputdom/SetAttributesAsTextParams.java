// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Sets attributes on element with given id. This method is useful when user edits some existing attribute value and types in several attribute name/value pairs.
 */
public class SetAttributesAsTextParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the element to set attributes for.
   @param text Text with a number of attributes. Will parse this text using HTML parser.
   @param nameOpt Attribute name to replace with new attributes derived from text in case text parsed successfully.
   */
  public SetAttributesAsTextParams(long nodeId, String text, String nameOpt) {
    //this.put("nodeId", nodeId);
    //this.put("text", text);
    //this.put("name", nameOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setAttributesAsText";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
