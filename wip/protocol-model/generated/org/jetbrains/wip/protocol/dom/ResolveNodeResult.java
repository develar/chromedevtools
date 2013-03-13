// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Resolves JavaScript node object for given node id.
 */
@org.chromium.protocolReader.JsonType
public interface ResolveNodeResult {
  /**
   * JavaScript object wrapper for given node.
   */
  org.jetbrains.wip.protocol.runtime.RemoteObjectValue object();

}