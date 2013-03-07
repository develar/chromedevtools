// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * This method sends a new XMLHttpRequest which is identical to the original one. The following parameters should be identical: method, url, async, request body, extra headers, withCredentials attribute, user, password.
 */
public class ReplayXHRParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param requestId Identifier of XHR to replay.
   */
  public ReplayXHRParams(String requestId) {
    put("requestId", requestId);
  }
  @Override
  public String getMethodName() {
    return "Network.replayXHR";
  }
}