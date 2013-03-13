// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Returns all browser cookies. Depending on the backend support, will either return detailed cookie information in the <code>cookie</code> field or string cookie representation using <code>cookieString</code>.
 */
@org.chromium.protocolReader.JsonType
public interface GetCookiesResult {
  /**
   * Array of cookie objects.
   */
  java.util.List<org.jetbrains.wip.protocol.page.CookieValue> cookies();
  /**
   * document.cookie string representation of the cookies.
   */
  String cookiesString();

}