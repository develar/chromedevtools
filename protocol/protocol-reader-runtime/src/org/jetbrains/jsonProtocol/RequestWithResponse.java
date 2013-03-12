package org.jetbrains.jsonProtocol;

import com.google.gson.stream.JsonReaderEx;

public interface RequestWithResponse<RESULT, READER> extends Request {
  RESULT readResult(JsonReaderEx jsonReader, READER reader);
}
