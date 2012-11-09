package org.jetbrains.jsonProtocol;

import java.io.IOException;
import java.io.Reader;

public final class StringReader extends Reader {
  private String string;
  private final int end;
  private int position;

  public StringReader(String string) {
    this(string, 0, string.length());
  }

  private StringReader(String string, int start, int end) {
    this.string = string;
    this.end = end;
    position = start;
  }

  public StringReader subReader(int start, int end) {
    return new StringReader(string, start, end);
  }

  @Override
  public int read() {
    if (position >= end) {
      return -1;
    }
    return string.charAt(position++);
  }

  @Override
  public int read(char cbuf[], int off, int len) {
    if (off < 0 || off > cbuf.length || len < 0 || (off + len) > cbuf.length || (off + len) < 0) {
      throw new IndexOutOfBoundsException();
    }
    else if (len == 0) {
      return 0;
    }

    if (position >= end) {
      return -1;
    }
    int n = Math.min(end - position, len);
    string.getChars(position, position + n, cbuf, off);
    position += n;
    return n;
  }

  public boolean ready() throws IOException {
    if (string == null) {
      throw new IOException("Stream closed");
    }
    return true;
  }

  @Override
  public void close() throws IOException {
    string = null;
  }
}