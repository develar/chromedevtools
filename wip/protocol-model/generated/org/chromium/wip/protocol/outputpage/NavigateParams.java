// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Navigates current page to the given URL.
 */
public class NavigateParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param url URL to navigate the page to.
   */
  public NavigateParams(String url) {
    this.put("url", url);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".navigate";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
