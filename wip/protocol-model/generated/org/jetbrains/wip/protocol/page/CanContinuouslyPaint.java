// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Tells if backend supports continuous painting
 */
public final class CanContinuouslyPaint extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.CanContinuouslyPaintResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canContinuouslyPaint";
  }

  @Override
  public CanContinuouslyPaintResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanContinuouslyPaintResult(jsonReader);
  }
}