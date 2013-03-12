// Generated source
package org.chromium.wip.protocol.page;

/**
 * Tells if backend supports debug borders on layers
 */
public final class CanShowDebugBorders extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CanShowDebugBordersResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.canShowDebugBorders";
  }

  @Override
  public CanShowDebugBordersResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCanShowDebugBordersResult(jsonReader);
  }
}