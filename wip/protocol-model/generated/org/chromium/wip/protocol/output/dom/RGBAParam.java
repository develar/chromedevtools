// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
A structure holding an RGBA color.
 */
public class RGBAParam extends org.jetbrains.jsonProtocol.OutMessage {
  /**
   * @param r The red component, in the [0-255] range.
   * @param g The green component, in the [0-255] range.
   * @param b The blue component, in the [0-255] range.
   */
  public RGBAParam(long r, long g, long b) {
    put("r", r);
    put("g", g);
    put("b", b);
  }

  /**
   * @param v The alpha component, in the [0-1] range (default: 1).
   */
  public RGBAParam a(double v) {
    put("a", v);
    return this;
  }
}