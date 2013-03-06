// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Restarts particular call frame from the beginning.
 */
@org.chromium.protocolParser.JsonType
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
  @org.chromium.protocolParser.JsonType(allowsOtherProperties=true)
  public interface Result extends org.chromium.protocolParser.JsonObjectBased {

  }
}