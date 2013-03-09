// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Overrides the Geolocation Position or Error.
 */
public final class SetGeolocationOverride extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Mock longitude
   */
  public SetGeolocationOverride latitude(double v) {
    put("latitude", v);
    return this;
  }

  /**
   * @param v Mock latitude
   */
  public SetGeolocationOverride longitude(double v) {
    put("longitude", v);
    return this;
  }

  /**
   * @param v Mock accuracy
   */
  public SetGeolocationOverride accuracy(double v) {
    put("accuracy", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.setGeolocationOverride";
  }
}