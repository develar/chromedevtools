package org.jetbrains.v8.protocol;

import org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader;
import org.chromium.v8.liveEditProtocol.LiveEditProtocolReader;
import org.jetbrains.v8.liveEditProtocol.LiveEditProtocolReaderImpl;

public final class ProtocolService {
  public static final V8ProtocolReader PROTOCOL_READER = new V8ProtocolReaderImpl();
  public static final LiveEditProtocolReader LIVE_EDIT = new LiveEditProtocolReaderImpl();
}
