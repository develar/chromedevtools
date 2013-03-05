// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspect' command upon element selection.
 */
public class SetInspectModeEnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param enabled True to enable inspection mode, false to disable it.
   @param highlightConfigOpt A descriptor for the highlight appearance of hovered-over nodes. May be omitted if <code>enabled == false</code>.
   */
  public SetInspectModeEnabledParams(boolean enabled, org.chromium.wip.protocol.output.dom.HighlightConfigParam highlightConfigOpt) {
    //this.put("enabled", enabled);
    //this.put("highlightConfig", highlightConfigOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setInspectModeEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
