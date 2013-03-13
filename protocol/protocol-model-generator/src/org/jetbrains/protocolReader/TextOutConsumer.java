package org.jetbrains.protocolReader;

import org.jetbrains.protocolReader.TextOutput;

import java.io.IOException;

public interface TextOutConsumer {
  void append(TextOutput out) throws IOException;
}
