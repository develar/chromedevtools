package org.jetbrains.jsonProtocol;

public interface RequestWithResponse<RESPONSE, READER> extends Request {
  RESPONSE readResponse(JsonObjectBased success, READER reader);
}
