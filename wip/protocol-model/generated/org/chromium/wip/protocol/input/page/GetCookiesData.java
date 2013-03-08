// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.page;

/**
 * Returns all browser cookies. Depending on the backend support, will either return detailed cookie information in the <code>cookie</code> field or string cookie representation using <code>cookieString</code>.
 */
@org.chromium.protocolReader.JsonType
public interface GetCookiesData {
  /**
   * Array of cookie objects.
   */
  java.util.List<org.chromium.wip.protocol.input.page.CookieValue> cookies();
  /**
   * document.cookie string representation of the cookies.
   */
  String cookiesString();

}