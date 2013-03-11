package org.jetbrains.jsonProtocol;

public interface RequestWithResponse<RESPONSE, READER> {
  RESPONSE readResponse(JsonObjectBased success, READER reader);
}
