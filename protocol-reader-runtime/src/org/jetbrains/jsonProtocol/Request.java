package org.jetbrains.jsonProtocol;

import java.io.IOException;

public abstract class Request extends OutMessage {
  protected boolean argumentsObjectStarted;

  public abstract String getMethodName();

  protected abstract String getIdKeyName();

  protected abstract String argumentsKeyName();

  protected final void beginArguments() throws IOException {
    if (!argumentsObjectStarted) {
      argumentsObjectStarted = true;
      writer.name(argumentsKeyName());
      writer.beginObject();
    }
  }

  public final void finalize(int id) {
    try {
      if (argumentsObjectStarted) {
        writer.endObject();
      }
      writer.name(getIdKeyName()).value(id);
      writer.endObject();
      writer.close();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
