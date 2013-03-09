// Generated source
package org.chromium.wip.protocol.output.timeline;

/**
 * Starts capturing instrumentation events.
 */
public final class Start extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Samples JavaScript stack traces up to <code>maxCallStackDepth</code>, defaults to 5.
   */
  public Start maxCallStackDepth(int v) {
    put("maxCallStackDepth", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Timeline.start";
  }
}