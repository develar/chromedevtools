// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Returns search results from given <code>fromIndex</code> to given <code>toIndex</code> from the sarch with the given identifier.
 */
public class GetSearchResultsParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.GetSearchResultsData> {
  /**
   @param searchId Unique search session identifier.
   @param fromIndex Start index of the search result to be returned.
   @param toIndex End index of the search result to be returned.
   */
  public GetSearchResultsParams(String searchId, long fromIndex, long toIndex) {
    //this.put("searchId", searchId);
    //this.put("fromIndex", fromIndex);
    //this.put("toIndex", toIndex);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getSearchResults";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.GetSearchResultsData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetSearchResultsData(data.getUnderlyingObject());
  }

}
