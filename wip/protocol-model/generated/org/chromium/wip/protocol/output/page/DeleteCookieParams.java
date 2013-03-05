// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Deletes browser cookie with given name, domain and path.
 */
public class DeleteCookieParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param cookieName Name of the cookie to remove.
   * @param url URL to match cooke domain and path.
   */
  public DeleteCookieParams(String cookieName, String url) {
    put("cookieName", cookieName);
    put("url", url);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".deleteCookie";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}