// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspect' command upon element selection.
 */
public final class SetInspectModeEnabledParams extends org.jetbrains.wip.WipRequest {
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
  @Override
  public String getMethodName() {
    return "DOM.setInspectModeEnabled";
  }
}