// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Searches for given string in script content.
 */
public class SearchInContentParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SearchInContentData> {
  /**
   @param scriptId Id of the script to search in.
   @param query String to search for.
   @param caseSensitiveOpt If true, search is case sensitive.
   @param isRegexOpt If true, treats string parameter as regex.
   */
  public SearchInContentParams(String scriptId, String query, boolean caseSensitiveOpt, boolean isRegexOpt) {
    //this.put("scriptId", scriptId);
    //this.put("query", query);
    //this.put("caseSensitive", caseSensitiveOpt);
    //this.put("isRegex", isRegexOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".searchInContent";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SearchInContentData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerSearchInContentData(data.getUnderlyingObject());
  }

}
