// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Sets files for the given file input element.
 */
public class SetFileInputFilesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param nodeId Id of the file input node to set files for.
   @param files Array of file paths to set.
   */
  public SetFileInputFilesParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, java.util.List<String> files) {
    this.put("nodeId", nodeId);
    this.put("files", files);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setFileInputFiles";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
