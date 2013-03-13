// Generated source
package org.jetbrains.wip.protocol.timeline;

/**
 * Starts capturing instrumentation events.
 */
public final class Start extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Samples JavaScript stack traces up to <code>maxCallStackDepth</code>, defaults to 5.
   */
  public Start maxCallStackDepth(int v) {
    writeInt("maxCallStackDepth", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Timeline.start";
  }
}