// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspect' command upon element selection.
 */
public class SetInspectModeEnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param enabled True to enable inspection mode, false to disable it.
   */
  public SetInspectModeEnabledParams(boolean enabled) {
    put("enabled", enabled);
  }

  /**
   * @param v A descriptor for the highlight appearance of hovered-over nodes. May be omitted if <code>enabled == false</code>.
   */
  public SetInspectModeEnabledParams highlightConfig(org.chromium.wip.protocol.output.dom.HighlightConfigParam v) {
    put("highlightConfig", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setInspectModeEnabled";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}