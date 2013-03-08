// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
@org.chromium.protocolReader.JsonType
public interface SetBreakpointData {
  /**
   * Id of the created breakpoint for further reference.
   */
  String breakpointId();
  /**
   * Location this breakpoint resolved into.
   */
  org.chromium.wip.protocol.input.debugger.LocationValue actualLocation();

}