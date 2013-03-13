// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * This method sends a new XMLHttpRequest which is identical to the original one. The following parameters should be identical: method, url, async, request body, extra headers, withCredentials attribute, user, password.
 */
public final class ReplayXHR extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param requestId Identifier of XHR to replay.
   */
  public ReplayXHR(String requestId) {
    writeString("requestId", requestId);
  }
  @Override
  public String getMethodName() {
    return "Network.replayXHR";
  }
}