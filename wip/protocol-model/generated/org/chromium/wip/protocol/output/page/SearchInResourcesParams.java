// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Searches for given string in frame / resource tree structure.
 */
public class SearchInResourcesParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.SearchInResourcesData> {
  /**
   * @param text String to search for.
   */
  public SearchInResourcesParams(String text) {
    put("text", text);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInResourcesParams caseSensitive(boolean v) {
    put("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInResourcesParams isRegex(boolean v) {
    put("isRegex", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".searchInResources";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourcesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageSearchInResourcesData(data.getUnderlyingObject());
  }
}