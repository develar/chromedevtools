// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.wip.protocol;

import org.jetbrains.jsonProtocol.RequestImpl;

import java.io.IOException;

public abstract class WipRequest extends RequestImpl {
  public WipRequest() {
    try {
      writer.name(BasicConstants.Property.METHOD).value(getMethodName());
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected final String getIdKeyName() {
    return "id";
  }

  @Override
  protected final String argumentsKeyName() {
    return "params";
  }
}
