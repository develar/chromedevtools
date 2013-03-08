// Generated source
package org.chromium.wip.protocol.output.runtime;

/**
 * Enables reporting of execution contexts creation by means of <code>executionContextCreated</code> event. When the reporting gets enabled the event will be sent immediately for each existing execution context.
 */
public class EnableParams extends org.jetbrains.wip.protocol.WipRequest {

  @Override
  public String getMethodName() {
    return "Runtime.enable";
  }
}