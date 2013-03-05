// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Searches for given string in frame / resource tree structure.
 */
public class SearchInResourcesParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.SearchInResourcesData> {
  /**
   @param text String to search for.
   @param caseSensitiveOpt If true, search is case sensitive.
   @param isRegexOpt If true, treats string parameter as regex.
   */
  public SearchInResourcesParams(String text, boolean caseSensitiveOpt, boolean isRegexOpt) {
    //this.put("text", text);
    //this.put("caseSensitive", caseSensitiveOpt);
    //this.put("isRegex", isRegexOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".searchInResources";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.SearchInResourcesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageSearchInResourcesData(data.getUnderlyingObject());
  }

}
