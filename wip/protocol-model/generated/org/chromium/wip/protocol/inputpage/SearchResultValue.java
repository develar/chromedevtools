// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Search result for resource.
 */
@org.chromium.protocolParser.JsonType
public interface SearchResultValue {
  /**
   Resource URL.
   */
  String url();

  /**
   Resource frame id.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

  /**
   Number of matches in the resource content.
   */
  Number matchesCount();

}
