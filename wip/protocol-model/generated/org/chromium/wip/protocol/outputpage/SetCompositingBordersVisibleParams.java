// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Controls the visibility of compositing borders.
 */
public class SetCompositingBordersVisibleParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param visible True for showing compositing borders.
   */
  public SetCompositingBordersVisibleParams(boolean visible) {
    //this.put("visible", visible);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setCompositingBordersVisible";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
