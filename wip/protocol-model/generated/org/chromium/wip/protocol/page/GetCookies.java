// Generated source
package org.chromium.wip.protocol.page;

/**
 * Returns all browser cookies. Depending on the backend support, will either return detailed cookie information in the <code>cookie</code> field or string cookie representation using <code>cookieString</code>.
 */
public final class GetCookies extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.GetCookiesResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getCookies";
  }

  @Override
  public GetCookiesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetCookiesResult(jsonReader);
  }
}