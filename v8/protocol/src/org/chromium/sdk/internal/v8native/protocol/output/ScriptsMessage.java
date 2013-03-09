// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

/**
 * Represents a "scripts" V8 request message.
 */
public class ScriptsMessage extends ContextlessDebuggerMessage {

  /**
   * Native scripts constant.
   */
  public static final int SCRIPTS_NATIVE = 1 << 0;

  /**
   * Extension scripts constant.
   */
  public static final int SCRIPTS_EXTENSION = 1 << 1;

  /**
   * Normal scripts constant.
   */
  public static final int SCRIPTS_NORMAL = 1 << 2;

  /**
   * @param types a bitwise OR of script types to retrieve
   * @param includeSource whether to include script source in the response,
   *        default is false
   */
  public ScriptsMessage(int types, Boolean includeSource) {
    super(DebuggerCommand.SCRIPTS.value);
    writeInt("types", types);
    writeBoolean("includeSource", includeSource);
  }

  /**
   * @param ids of scripts to retrieve
   * @param includeSource whether to include script source in the response,
   *        default is false
   */
  public ScriptsMessage(long[] ids, Boolean includeSource) {
    super(DebuggerCommand.SCRIPTS.value);
    writeLongArray("ids", ids);
    writeBoolean("includeSource", includeSource);
  }
}
