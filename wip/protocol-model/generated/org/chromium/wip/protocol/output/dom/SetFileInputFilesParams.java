// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Sets files for the given file input element.
 */
public class SetFileInputFilesParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param nodeId Id of the file input node to set files for.
   @param files Array of file paths to set.
   */
  public SetFileInputFilesParams(long nodeId, java.util.List<String> files) {
    //this.put("nodeId", nodeId);
    //this.put("files", files);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setFileInputFiles";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
