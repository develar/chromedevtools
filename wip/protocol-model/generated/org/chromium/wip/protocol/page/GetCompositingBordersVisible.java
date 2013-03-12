// Generated source
package org.chromium.wip.protocol.page;

/**
 * Indicates the visibility of compositing borders.
 */
public final class GetCompositingBordersVisible extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.GetCompositingBordersVisibleResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getCompositingBordersVisible";
  }

  @Override
  public GetCompositingBordersVisibleResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetCompositingBordersVisibleResult(jsonReader);
  }
}