// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Searches for given string in script content.
 */
public final class SearchInContent extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.SearchInContentData> {
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
  public org.chromium.wip.protocol.input.debugger.SearchInContentData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSearchInContentData(data.getDeferredReader());
  }
}