// Generated source
package org.chromium.wip.protocol.page;

/**
 * Tells if backend supports a FPS counter display
 */
public final class CanShowFPSCounter extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanShowFPSCounterResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canShowFPSCounter";
  }

  @Override
  public CanShowFPSCounterResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanShowFPSCounterResult(jsonReader);
  }
}