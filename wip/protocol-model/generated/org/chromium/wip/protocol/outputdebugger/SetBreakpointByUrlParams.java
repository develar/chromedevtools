// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
public class SetBreakpointByUrlParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData> {
  /**
   @param lineNumber Line number to set breakpoint at.
   @param urlOpt URL of the resources to set breakpoint on.
   @param urlRegexOpt Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
   @param columnNumberOpt Offset in the line to set breakpoint at.
   @param conditionOpt Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
   */
  public SetBreakpointByUrlParams(long lineNumber, String urlOpt, String urlRegexOpt, long columnNumberOpt, String conditionOpt) {
    //this.put("lineNumber", lineNumber);
    //this.put("url", urlOpt);
    //this.put("urlRegex", urlRegexOpt);
    //this.put("columnNumber", columnNumberOpt);
    //this.put("condition", conditionOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setBreakpointByUrl";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.WipGeneratedParserRoot parser) throws java.io.IOException {
    return parser.parseDebuggerSetBreakpointByUrlData(data.getUnderlyingObject());
  }

}
