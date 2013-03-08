package org.jetbrains.v8.protocol;

import org.jetbrains.jsonProtocol.Request;

import java.io.IOException;

public abstract class V8Request extends Request {
  public V8Request() {
    this(null);
  }

  protected V8Request(String command) {
    try {
      writer.name("type").value("request");
      writer.name("command").value(command == null ? getMethodName() : command);
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected final String getIdKeyName() {
    return "seq";
  }

  @Override
  protected final String argumentsKeyName() {
    return "arguments";
  }

  public final String getType() {
    return "request";
  }
}
