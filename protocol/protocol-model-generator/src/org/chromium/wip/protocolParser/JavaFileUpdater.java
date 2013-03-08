// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.TextOutput;

import java.io.*;

/**
 * A class that makes accurate java source file update. If only header
 * (with source file revision and other comments) changed, the file is left intact.
 * <p>User first writes all the content into a {@link Writer} provided and then
 * calls {@link #update()}.
 */
class JavaFileUpdater {
  private final File file;
  final StringBuilder builder;
  final TextOutput out;

  JavaFileUpdater(File file) {
    this.file = file;
    builder = new StringBuilder();
    out = new TextOutput(builder);
  }

  void update() throws IOException {
    String newContent = builder.toString();
    if (file.isFile()) {
      String oldContent = StreamUtil.readStringFromStream(new FileInputStream(file), StreamUtil.UTF8_CHARSET);
      if (stripHeader(oldContent).equals(stripHeader(newContent))) {
        return;
      }
    }
    else {
      File dir = file.getParentFile();
      boolean dirCreated = dir.mkdirs();
      if (!dirCreated && !dir.isDirectory()) {
        throw new RuntimeException("Failed to create directory " + dir.getPath());
      }
    }

    OutputStream outputStream = new FileOutputStream(file);
    Writer fileWriter = new OutputStreamWriter(outputStream, StreamUtil.UTF8_CHARSET);
    fileWriter.write(newContent);
    fileWriter.close();
    outputStream.close();
  }

  private static String stripHeader(String content) {
    int pos = content.indexOf("\npackage ");
    if (pos == -1) {
      return content;
    }
    return content.substring(pos);
  }
}
