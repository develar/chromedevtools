// Generated source
package org.jetbrains.wip.protocol.runtime;

/**
 * Description of an isolated world.
 */
@org.chromium.protocolReader.JsonType
public interface ExecutionContextDescriptionValue {
  /**
   * Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
   */
  int id();
  /**
   * True if this is a context where inpspected web page scripts run. False if it is a content script isolated context.
   */
  boolean isPageContext();
  /**
   * Human readable name describing given context.
   */
  String name();
  /**
   * Id of the owning frame.
   */
  String frameId();

}