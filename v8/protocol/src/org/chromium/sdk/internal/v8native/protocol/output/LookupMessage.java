package org.chromium.sdk.internal.v8native.protocol.output;

import com.google.gson.stream.JsonReaderEx;
import gnu.trove.TLongObjectHashMap;
import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.jetbrains.jsonProtocol.RequestWithResponse;
import org.jetbrains.v8.protocol.ProtocolReponseReader;

/**
 * Represents a "lookup" request message.
 */
public class LookupMessage extends V8Request implements RequestWithResponse<TLongObjectHashMap<ValueHandle>,ProtocolReponseReader> {
  /**
   * @param handles    to look up
   * @param inlineRefs whether to inline references
   */
  public LookupMessage(long[] handles, Boolean inlineRefs) {
    this(handles, inlineRefs, -1);
  }

  public LookupMessage(long[] handles, Boolean inlineRefs, long maxStringLength) {
    super(DebuggerCommand.LOOKUP.value);
    writeLongArray("handles", handles);
    writeBoolean("inlineRefs", inlineRefs);
    if (maxStringLength != -1) {
      writeLong("maxStringLength", maxStringLength);
    }
  }

  @Override
  public TLongObjectHashMap<ValueHandle> readResult(JsonReaderEx jsonReader, ProtocolReponseReader reader) {
    return _readResult(jsonReader, (V8ProtocolReader)reader);
  }

  public static TLongObjectHashMap<ValueHandle> _readResult(JsonReaderEx jsonReader, V8ProtocolReader reader) {
    TLongObjectHashMap<ValueHandle> map = new TLongObjectHashMap<ValueHandle>();
    jsonReader.beginObject();
    while (jsonReader.hasNext()) {
      map.put(Long.parseLong(jsonReader.nextName()), reader.readValueHandle(jsonReader));
    }
    jsonReader.endObject();
    return map;
  }
}