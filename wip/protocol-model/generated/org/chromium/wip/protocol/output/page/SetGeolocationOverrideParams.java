// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Overrides the Geolocation Position or Error.
 */
public class SetGeolocationOverrideParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param latitudeOpt Mock longitude
   @param longitudeOpt Mock latitude
   @param accuracyOpt Mock accuracy
   */
  public SetGeolocationOverrideParams(Number latitudeOpt, Number longitudeOpt, Number accuracyOpt) {
    //this.put("latitude", latitudeOpt);
    //this.put("longitude", longitudeOpt);
    //this.put("accuracy", accuracyOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setGeolocationOverride";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
