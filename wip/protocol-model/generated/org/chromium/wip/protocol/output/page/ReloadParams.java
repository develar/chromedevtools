// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Reloads given page optionally ignoring the cache.
 */
public final class ReloadParams extends org.jetbrains.wip.WipRequest {


  /**
   * @param v If true, browser cache is ignored (as if the user pressed Shift+refresh).
   */
  public ReloadParams ignoreCache(boolean v) {
    put("ignoreCache", v);
    return this;
  }

  /**
   * @param v If set, the script will be injected into all frames of the inspected page after reload.
   */
  public ReloadParams scriptToEvaluateOnLoad(String v) {
    if (v != null) {
      put("scriptToEvaluateOnLoad", v);
    }
    return this;
  }

  /**
   * @param v Script body that should evaluate to function that will preprocess all the scripts before their compilation.
   */
  public ReloadParams scriptPreprocessor(String v) {
    if (v != null) {
      put("scriptPreprocessor", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.reload";
  }
}