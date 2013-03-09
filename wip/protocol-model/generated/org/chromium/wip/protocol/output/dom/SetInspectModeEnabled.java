// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Enters the 'inspect' mode. In this mode, elements that user is hovering over are highlighted. Backend then generates 'inspect' command upon element selection.
 */
public final class SetInspectModeEnabled extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param enabled True to enable inspection mode, false to disable it.
   */
  public SetInspectModeEnabled(boolean enabled) {
    put("enabled", enabled);
  }

  /**
   * @param v A descriptor for the highlight appearance of hovered-over nodes. May be omitted if <code>enabled == false</code>.
   */
  public SetInspectModeEnabled highlightConfig(org.chromium.wip.protocol.output.dom.HighlightConfig v) {
    put("highlightConfig", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.setInspectModeEnabled";
  }
}