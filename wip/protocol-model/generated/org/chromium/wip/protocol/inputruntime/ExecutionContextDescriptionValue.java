// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputruntime;

/**
 Description of an isolated world.
 */
@org.chromium.protocolParser.JsonType
public interface ExecutionContextDescriptionValue {
  /**
   Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
   */
  long/*See org.chromium.wip.protocol.commonruntime.ExecutionContextIdTypedef*/ id();

  /**
   True if this is a context where inpspected web page scripts run. False if it is a content script isolated context.
   */
  boolean isPageContext();

  /**
   Human readable name describing given context.
   */
  String name();

  /**
   Id of the owning frame.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId();

}
