// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Discards search results from the session with the given id. <code>getSearchResults</code> should no longer be called for that search.
 */
public class DiscardSearchResultsParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param searchId Unique search session identifier.
   */
  public DiscardSearchResultsParams(String searchId) {
    this.put("searchId", searchId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".discardSearchResults";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
