// Generated source
package org.chromium.wip.protocol.page;

/**
 * Tells if backend supports continuous painting
 */
public final class CanContinuouslyPaint extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanContinuouslyPaintResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canContinuouslyPaint";
  }

  @Override
  public CanContinuouslyPaintResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanContinuouslyPaintResult(jsonReader);
  }
}