package org.chromium.wip.protocolParser;

import java.io.IOException;

class IndentWriterImpl implements IndentWriter {
  private final String indent;
  private final Appendable output;

  IndentWriterImpl(Appendable output, String indent) {
    this.output = output;
    this.indent = indent;
  }

  @Override
  public void append(String text) {
    text = text.replaceAll("\t", indent);
    try {
      output.append(text);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public IndentWriter createInner() {
    return new IndentWriterImpl(output, indent + INDENT);
  }
}
