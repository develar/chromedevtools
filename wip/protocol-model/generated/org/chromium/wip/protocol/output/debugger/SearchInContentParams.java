// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Searches for given string in script content.
 */
public class SearchInContentParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.debugger.SearchInContentData> {
  /**
   * @param scriptId Id of the script to search in.
   * @param query String to search for.
   */
  public SearchInContentParams(String scriptId, String query) {
    put("scriptId", scriptId);
    put("query", query);
  }

  /**
   * @param v If true, search is case sensitive.
   */
  public SearchInContentParams caseSensitive(boolean v) {
    put("caseSensitive", v);
    return this;
  }

  /**
   * @param v If true, treats string parameter as regex.
   */
  public SearchInContentParams isRegex(boolean v) {
    put("isRegex", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".searchInContent";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SearchInContentData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSearchInContentData(data.getUnderlyingObject());
  }
}