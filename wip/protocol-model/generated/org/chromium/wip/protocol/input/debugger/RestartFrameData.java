// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
@org.chromium.protocolReader.JsonType
public interface RestartFrameData {
  /**
   * New stack trace.
   */
  java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames();
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