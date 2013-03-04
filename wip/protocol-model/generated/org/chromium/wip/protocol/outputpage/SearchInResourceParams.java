// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Searches for given string in resource content.
 */
public class SearchInResourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.SearchInResourceData> {
  /**
   @param frameId Frame id for resource to search in.
   @param url URL of the resource to search in.
   @param query String to search for.
   @param caseSensitiveOpt If true, search is case sensitive.
   @param isRegexOpt If true, treats string parameter as regex.
   */
  public SearchInResourceParams(String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId, String url, String query, Boolean caseSensitiveOpt, Boolean isRegexOpt) {
    this.put("frameId", frameId);
    this.put("url", url);
    this.put("query", query);
    if (caseSensitiveOpt != null) {
      this.put("caseSensitive", caseSensitiveOpt);
    }
    if (isRegexOpt != null) {
      this.put("isRegex", isRegexOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".searchInResource";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.SearchInResourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parsePageSearchInResourceData(data.getUnderlyingObject());
  }

}
