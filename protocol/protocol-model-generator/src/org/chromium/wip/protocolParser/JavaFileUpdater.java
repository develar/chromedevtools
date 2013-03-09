// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.TextOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * A class that makes accurate java source file update. If only header
 * (with source file revision and other comments) changed, the file is left intact.
 * <p>User first writes all the content into a {@link Writer} provided and then
 * calls {@link #update()}.
 */
class JavaFileUpdater {
  private final Path file;
  final StringBuilder builder;
  final TextOutput out;

  JavaFileUpdater(Path file) {
    this.file = file;
    builder = new StringBuilder();
    out = new TextOutput(builder);
  }

  void update() throws IOException {
    byte[] newContent = builder.toString().getBytes(StandardCharsets.UTF_8);
    if (Files.exists(file)) {
      byte[] oldContent = Files.readAllBytes(file);
      if (Arrays.equals(oldContent, newContent)) {
        return;
      }
    }
    else {
      //Files.pa
      //File dir = file.getParentFile();
      //boolean dirCreated = dir.mkdirs();
      //if (!dirCreated && !dir.isDirectory()) {
      //  throw new RuntimeException("Failed to create directory " + dir.getPath());
      //}
    }

    Files.write(file, newContent);
  }
}
