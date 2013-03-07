// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolParser;

import com.google.gson.stream.JsonReader;

/**
 * Optional base interface for JSON type interface. Underlying JSON object becomes available
 * to user this way.
 */
public interface JsonObjectBased {
  JsonReader getDeferredReader();
}
