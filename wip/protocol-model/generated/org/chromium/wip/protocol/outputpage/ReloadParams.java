// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Reloads given page optionally ignoring the cache.
 */
public class ReloadParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param ignoreCacheOpt If true, browser cache is ignored (as if the user pressed Shift+refresh).
   @param scriptToEvaluateOnLoadOpt If set, the script will be injected into all frames of the inspected page after reload.
   @param scriptPreprocessorOpt Script body that should evaluate to function that will preprocess all the scripts before their compilation.
   */
  public ReloadParams(boolean ignoreCacheOpt, String scriptToEvaluateOnLoadOpt, String scriptPreprocessorOpt) {
    //this.put("ignoreCache", ignoreCacheOpt);
    //this.put("scriptToEvaluateOnLoad", scriptToEvaluateOnLoadOpt);
    //this.put("scriptPreprocessor", scriptPreprocessorOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".reload";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
