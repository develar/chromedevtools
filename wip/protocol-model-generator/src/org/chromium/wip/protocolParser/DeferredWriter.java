package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.TextOutput;

class DeferredWriter extends TextOutput implements IndentWriter {
  private final String indent;
  private final StringBuilder builder;

  DeferredWriter() {
    this("", new StringBuilder());
  }

  DeferredWriter(String indent, StringBuilder builder) {
    super(builder);
    this.indent = indent;
    this.builder = builder;
  }

  @Override
  public void append(String text) {
    text = text.replaceAll("\t", "\t" + indent);
    builder.append(text);
  }

  @Override
  public IndentWriter createInner() {
    return new DeferredWriter(indent + INDENT, builder);
  }

  void writeContent(IndentWriter output) {
    output.append(builder.toString());
  }
}
