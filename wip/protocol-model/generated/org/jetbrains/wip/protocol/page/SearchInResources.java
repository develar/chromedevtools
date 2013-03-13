// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Searches for given string in frame / resource tree structure.
 */
public final class SearchInResources extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.SearchInResourcesResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public SearchInResourcesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageSearchInResourcesResult(jsonReader);
  }
}