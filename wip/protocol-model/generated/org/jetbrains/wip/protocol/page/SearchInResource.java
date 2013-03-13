// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Searches for given string in resource content.
 */
public final class SearchInResource extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.SearchInResourceResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param frameId Frame id for resource to search in.
   * @param url URL of the resource to search in.
   * @param query String to search for.
   */
  public SearchInResource(String frameId, String url, String query) {
    writeString("frameId", frameId);
    writeString("url", url);
    writeString("query", query);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInResource caseSensitive(boolean v) {
    writeBoolean("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInResource isRegex(boolean v) {
    writeBoolean("isRegex", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.searchInResource";
  }

  @Override
  public SearchInResourceResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageSearchInResourceResult(jsonReader);
  }
}