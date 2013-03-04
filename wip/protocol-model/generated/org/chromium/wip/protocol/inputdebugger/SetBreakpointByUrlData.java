// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this command is issued, all existing parsed scripts will have breakpoints resolved and returned in <code>locations</code> property. Further matching script parsing will result in subsequent <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
 */
@org.chromium.protocolParser.JsonType
public interface SetBreakpointByUrlData {
  /**
   Id of the created breakpoint for further reference.
   */
  String breakpointId();

  /**
   List of the locations this breakpoint resolved into upon addition.
   */
  java.util.List<org.chromium.wip.protocol.inputdebugger.LocationValue> locations();

}
