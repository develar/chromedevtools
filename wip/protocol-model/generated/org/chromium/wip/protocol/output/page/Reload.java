// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Reloads given page optionally ignoring the cache.
 */
public final class Reload extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v If true, browser cache is ignored (as if the user pressed Shift+refresh).
   */
  public Reload ignoreCache(boolean v) {
    writeBoolean("ignoreCache", v);
    return this;
  }

  /**
   * @param v If set, the script will be injected into all frames of the inspected page after reload.
   */
  public Reload scriptToEvaluateOnLoad(String v) {
    if (v != null) {
      writeString("scriptToEvaluateOnLoad", v);
    }
    return this;
  }

  /**
   * @param v Script body that should evaluate to function that will preprocess all the scripts before their compilation.
   */
  public Reload scriptPreprocessor(String v) {
    if (v != null) {
      writeString("scriptPreprocessor", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.reload";
  }
}