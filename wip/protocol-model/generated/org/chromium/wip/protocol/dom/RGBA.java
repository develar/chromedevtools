// Generated source
package org.chromium.wip.protocol.dom;

/**
 * A structure holding an RGBA color.
 */
public final class RGBA extends org.jetbrains.jsonProtocol.OutMessage {
  /**
   * @param r The red component, in the [0-255] range.
   * @param g The green component, in the [0-255] range.
   * @param b The blue component, in the [0-255] range.
   */
  public RGBA(int r, int g, int b) {
    writeInt("r", r);
    writeInt("g", g);
    writeInt("b", b);
  }

  /**
   * @param v The alpha component, in the [0-1] range (default: 1).
   */
  public RGBA a(double v) {
    writeDouble("a", v);
    return this;
  }
}