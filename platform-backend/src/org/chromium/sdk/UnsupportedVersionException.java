// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk;

/**
 * This exception is thrown if the SDK protocol version is not compatible with
 * that supported by the browser.
 */
public class UnsupportedVersionException extends Exception {

  private static final long serialVersionUID = 1L;

  public UnsupportedVersionException(Version localVersion, Version remoteVersion) {
    this("localVersion=" + localVersion
        + "; remoteVersion=" + remoteVersion);
  }

  public UnsupportedVersionException(String message) {
    super(message);
  }
}
