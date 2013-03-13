// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
@org.chromium.protocolReader.JsonType
public interface RestartFrameResult {
  /**
   * New stack trace.
   */
  java.util.List<org.jetbrains.wip.protocol.debugger.CallFrameValue> callFrames();
  /**
   * VM-specific description.
   */
  Result result();

  /**
   * VM-specific description.
   */
  @org.chromium.protocolReader.JsonType(allowsOtherProperties=true)
  public interface Result extends org.jetbrains.jsonProtocol.JsonObjectBased {

  }
}