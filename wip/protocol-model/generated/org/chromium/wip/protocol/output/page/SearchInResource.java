// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Searches for given string in resource content.
 */
public final class SearchInResource extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.SearchInResourceData> {
  /**
   * @param frameId Frame id for resource to search in.
   * @param url URL of the resource to search in.
   * @param query String to search for.
   */
  public SearchInResource(String frameId, String url, String query) {
    put("frameId", frameId);
    put("url", url);
    put("query", query);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInResource caseSensitive(boolean v) {
    put("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInResource isRegex(boolean v) {
    put("isRegex", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.searchInResource";
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageSearchInResourceData(data.getDeferredReader());
  }
}