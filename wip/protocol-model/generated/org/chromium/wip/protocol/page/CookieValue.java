// Generated source
package org.chromium.wip.protocol.page;

/**
 * Cookie object
 */
@org.chromium.protocolReader.JsonType
public interface CookieValue {
  /**
   * Cookie name.
   */
  String name();
  /**
   * Cookie value.
   */
  String value();
  /**
   * Cookie domain.
   */
  String domain();
  /**
   * Cookie path.
   */
  String path();
  /**
   * Cookie expires.
   */
  double expires();
  /**
   * Cookie size.
   */
  int size();
  /**
   * True if cookie is http-only.
   */
  boolean httpOnly();
  /**
   * True if cookie is secure.
   */
  boolean secure();
  /**
   * True in case of session cookie.
   */
  boolean session();

}