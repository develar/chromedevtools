// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Indicates the visibility of compositing borders.
 */
public final class GetCompositingBordersVisible extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.GetCompositingBordersVisibleResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getCompositingBordersVisible";
  }

  @Override
  public GetCompositingBordersVisibleResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetCompositingBordersVisibleResult(jsonReader);
  }
}