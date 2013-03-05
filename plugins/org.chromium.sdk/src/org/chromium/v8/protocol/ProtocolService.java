package org.chromium.v8.protocol;

import org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader;

public final class ProtocolService {
  public static final V8ProtocolReader PROTOCOL_READER = new V8ProtocolReaderImpl();
}
