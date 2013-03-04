// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Requests that the node is sent to the caller given its path. // FIXME, use XPath
 */
@org.chromium.protocolParser.JsonType
public interface PushNodeByPathToFrontendData {
  /**
   Id of the node for given path.
   */
  long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId();

}
