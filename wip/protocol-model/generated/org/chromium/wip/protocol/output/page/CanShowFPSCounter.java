// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports a FPS counter display
 */
public final class CanShowFPSCounter extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CanShowFPSCounterData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canShowFPSCounter";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowFPSCounterData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageCanShowFPSCounterData(data.getDeferredReader());
  }
}