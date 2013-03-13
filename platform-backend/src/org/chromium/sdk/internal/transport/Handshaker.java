// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.transport;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Handshaker handles "handshake" part of communication. It may write and read whatever it needs
 * before regular message-based communication has started.
 */
public interface Handshaker {
  /**
   * Performs handshake. This method is blocking. After it has successfully finished, input/output
   * should be ready for normal message-based communication. In case method fails with IOException,
   * input and output are returned in undefined state.
   * @throws IOException if handshake process failed physically (input or output has unexpectedly
   * closed) or logically (if unexpected message came from remote).
   */
  void perform(LineReader input, OutputStream output) throws IOException;
}