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
  public SearchInResourcesParams(String text, Boolean caseSensitiveOpt, Boolean isRegexOpt) {
    this.put("text", text);
    if (caseSensitiveOpt != null) {
      this.put("caseSensitive", caseSensitiveOpt);
    }
    if (isRegexOpt != null) {
      this.put("isRegex", isRegexOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".searchInResources";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.SearchInResourcesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parsePageSearchInResourcesData(data.getUnderlyingObject());
  }

}
