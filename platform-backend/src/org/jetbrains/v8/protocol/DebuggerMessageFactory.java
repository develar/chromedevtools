// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocol;

import org.chromium.sdk.internal.v8native.protocol.output.ScopeMessage;

/**
 * A factory for {@link org.chromium.sdk.internal.v8native.protocol.output.V8Request}s. Static methods are used to construct
 * commands to be sent to the remote V8 debugger.
 */
public class DebuggerMessageFactory {
  /**
   * A generic 'scope' message parameter that refers to the scope host.
   * It is either a stack frame or a function.
   */
  public static abstract class ScopeHostParameter {
    abstract ScopeMessage create(int scopeNumber);

    public static ScopeHostParameter forFrame(final int frameNumber) {
      return new ScopeHostParameter() {
        @Override
        ScopeMessage create(int scopeNumber) {
          return new ScopeMessage(scopeNumber, frameNumber, null);
        }
      };
    }

    public static ScopeHostParameter forFunction(final long functionHandle) {
      return new ScopeHostParameter() {
        @Override
        ScopeMessage create(int scopeNumber) {
          return new ScopeMessage(scopeNumber, null, functionHandle);
        }
      };
    }
  }

  public static ScopeMessage scope(int scopeNumber, ScopeHostParameter hostParameter) {
    return hostParameter.create(scopeNumber);
  }
}
