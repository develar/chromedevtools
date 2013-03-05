// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
 * Searches for given string in resource content.
 */
public class SearchInResourceParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.SearchInResourceData> {
  /**
   * @param frameId Frame id for resource to search in.
   * @param url URL of the resource to search in.
   * @param query String to search for.
   */
  public SearchInResourceParams(String frameId, String url, String query) {
    put("frameId", frameId);
    put("url", url);
    put("query", query);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInResourceParams caseSensitive(boolean v) {
    put("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInResourceParams isRegex(boolean v) {
    put("isRegex", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".searchInResource";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageSearchInResourceData(data.getUnderlyingObject());
  }

}