// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Searches for given string in script content.
 */
public final class SearchInContent extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.debugger.SearchInContentResult, org.chromium.wip.protocol.ProtocolReponseReader> {
  /**
   * @param scriptId Id of the script to search in.
   * @param query String to search for.
   */
  public SearchInContent(String scriptId, String query) {
    writeString("scriptId", scriptId);
    writeString("query", query);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInContent caseSensitive(boolean v) {
    writeBoolean("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInContent isRegex(boolean v) {
    writeBoolean("isRegex", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Debugger.searchInContent";
  }

  @Override
  public SearchInContentResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDebuggerSearchInContentResult(jsonReader);
  }
}