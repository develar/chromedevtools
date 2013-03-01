// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
This method sends a new XMLHttpRequest which is identical to the original one. The following parameters should be identical: method, url, async, request body, extra headers, withCredentials attribute, user, password.
 */
public class ReplayXHRParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param requestId Identifier of XHR to replay.
   */
  public ReplayXHRParams(String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId) {
    this.put("requestId", requestId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".replayXHR";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
