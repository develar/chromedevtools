// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
 * Overrides the Geolocation Position or Error.
 */
public class SetGeolocationOverrideParams extends org.jetbrains.wip.protocol.WipParams {


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
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setGeolocationOverride";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}