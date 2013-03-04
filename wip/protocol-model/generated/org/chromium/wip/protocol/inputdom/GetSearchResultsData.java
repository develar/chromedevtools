// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Returns search results from given <code>fromIndex</code> to given <code>toIndex</code> from the sarch with the given identifier.
 */
@org.chromium.protocolParser.JsonType
public interface GetSearchResultsData {
  /**
   Ids of the search result nodes.
   */
  java.util.List<Long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/> nodeIds();

}
