package org.chromium.protocolparser;

import java.util.Arrays;

public class TextOutput {
  private int identLevel = 0;
  private final static int indentGranularity = 2;
  private char[][] indents = new char[][]{new char[0]};
  private boolean justNewlined;
  private final StringBuilder out;

  public TextOutput(StringBuilder out) {
    this.out = out;
  }

  public TextOutput indentIn() {
    ++identLevel;
    if (identLevel >= indents.length) {
      // Cache a new level of indentation string.
      char[] newIndentLevel = new char[identLevel * indentGranularity];
      Arrays.fill(newIndentLevel, ' ');
      char[][] newIndents = new char[indents.length + 1][];
      System.arraycopy(indents, 0, newIndents, 0, indents.length);
      newIndents[identLevel] = newIndentLevel;
      indents = newIndents;
    }
    return this;
  }

  public TextOutput indentOut() {
    --identLevel;
    return this;
  }

  public TextOutput newLine() {
    out.append('\n');
    justNewlined = true;
    return this;
  }

  public void append(double value) {
    maybeIndent();
    out.append(value);
  }

  public TextOutput append(int value) {
    maybeIndent();
    out.append(value);
    return this;
  }

  public TextOutput append(char c) {
    maybeIndent();
    out.append(c);
    return this;
  }

  public void append(char[] s) {
    maybeIndent();
    out.append(s);
  }

  public TextOutput append(CharSequence s) {
    maybeIndent();
    out.append(s);
    return this;
  }

  public void openBlock() {
    openBlock(true);
  }

  public void openBlock(boolean addNewLine) {
    space().append('{');
    if (addNewLine) {
      newLine();
    }
    indentIn();
  }

  public void closeBlock() {
    indentOut().newLine().append('}');
  }

  public TextOutput comma() {
    return append(',').append(' ');
  }

  public TextOutput space() {
    return append(' ');
  }

  public TextOutput semi() {
    return append(';');
  }

  public TextOutput quoute(CharSequence s) {
    return append('"').append(s).append('"');
  }

  public void maybeIndent() {
    if (justNewlined) {
      out.append(indents[identLevel]);
      justNewlined = false;
    }
  }
}
