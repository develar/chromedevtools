// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Overrides the Geolocation Position or Error.
 */
public class SetGeolocationOverrideParams extends org.jetbrains.wip.protocol.WipRequest {


  /**
   * @param v Mock longitude
   */
  public SetGeolocationOverrideParams latitude(double v) {
    put("latitude", v);
    return this;
  }

  /**
   * @param v Mock latitude
   */
  public SetGeolocationOverrideParams longitude(double v) {
    put("longitude", v);
    return this;
  }

  /**
   * @param v Mock accuracy
   */
  public SetGeolocationOverrideParams accuracy(double v) {
    put("accuracy", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "Page.setGeolocationOverride";
  }
}