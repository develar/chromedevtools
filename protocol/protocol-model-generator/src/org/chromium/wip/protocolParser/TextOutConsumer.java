package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.TextOutput;

import java.io.IOException;

public interface TextOutConsumer {
  void append(TextOutput out) throws IOException;
}
