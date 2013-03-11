// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Searches for given string in frame / resource tree structure.
 */
public final class SearchInResources extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.SearchInResourcesData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param text String to search for.
   */
  public SearchInResources(String text) {
    writeString("text", text);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInResources caseSensitive(boolean v) {
    writeBoolean("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInResources isRegex(boolean v) {
    writeBoolean("isRegex", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.searchInResources";
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourcesData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageSearchInResourcesData(data.getDeferredReader());
  }
}