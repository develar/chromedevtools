// Generated source
package org.chromium.wip.protocol.debugger;

/**
 * Sets JavaScript breakpoint at a given location.
 */
@org.chromium.protocolReader.JsonType
public interface SetBreakpointResult {
  /**
   * Id of the created breakpoint for further reference.
   */
  String breakpointId();
  /**
   * Location this breakpoint resolved into.
   */
  org.chromium.wip.protocol.debugger.LocationValue actualLocation();

}