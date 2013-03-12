// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Returns search results from given <code>fromIndex</code> to given <code>toIndex</code> from the sarch with the given identifier.
 */
public final class GetSearchResults extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.dom.GetSearchResultsResult, org.chromium.wip.protocol.ProtocolReponseReader> {
  /**
   * @param searchId Unique search session identifier.
   * @param fromIndex Start index of the search result to be returned.
   * @param toIndex End index of the search result to be returned.
   */
  public GetSearchResults(String searchId, int fromIndex, int toIndex) {
    writeString("searchId", searchId);
    writeInt("fromIndex", fromIndex);
    writeInt("toIndex", toIndex);
  }
  @Override
  public String getMethodName() {
    return "DOM.getSearchResults";
  }

  @Override
  public GetSearchResultsResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetSearchResultsResult(jsonReader);
  }
}