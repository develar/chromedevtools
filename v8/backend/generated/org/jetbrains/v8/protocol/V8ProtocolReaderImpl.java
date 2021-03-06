// This is a generated source.
package org.jetbrains.v8.protocol;

import org.jetbrains.jsonProtocol.*;

import static org.jetbrains.jsonProtocol.JsonReaders.*;

public final class V8ProtocolReaderImpl implements org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader {
  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.ContextData readContextData(com.google.gson.stream.JsonReaderEx reader) {
    return new M21(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle readValueHandle(com.google.gson.stream.JsonReaderEx reader) {
    return new M31(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.ScopeBody readScopeResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M17(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage readIncomingMessage(com.google.gson.stream.JsonReaderEx reader) {
    return new M13(reader);
  }

  @Override
  public org.jetbrains.v8.protocol.SetbreakpointResult readSetbreakpointResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M37(reader);
  }

  @Override
  public org.jetbrains.v8.protocol.VersionResult readVersionResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M38(reader);
  }

  public static final class M13 implements org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M4 lazy_0;
    private M8 lazy_1;
    private long _seq = -1;
    private org.chromium.sdk.internal.v8native.protocol.input.MessageType _type;

    public M13(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("seq")) {
          _seq = readLong(reader, "seq");
        }
        else if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.sdk.internal.v8native.protocol.input.MessageType.class);
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 1) {
          reader.skipValues();
          break;
        }
        else {
          i++;
        }
      }
      reader.endObject();
    }

    @Override
    public long seq() {
      return _seq;
    }

    @Override
    public M4 asResponse() {
      if (lazy_0 == null) {
        lazy_0 = new M4(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M8 asNotification() {
      if (lazy_1 == null) {
        lazy_1 = new M8(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.MessageType type() {
      return _type;
    }
  }

  public static final class M8 implements org.chromium.sdk.internal.v8native.protocol.input.EventNotification {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> _refs;
    private org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody _body;
    private String _event;

    public M8(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("refs")) {
          _refs = readObjectArray(reader, "refs", new M28F(), true);
        }
        else if (name.equals("body")) {
          _body = new M9(reader);
        }
        else if (name.equals("event")) {
          _event = readString(reader, "event");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return _refs;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody body() {
      return _body;
    }

    @Override
    public java.lang.String event() {
      return _event;
    }
  }

  public static final class M9 implements org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M2 lazy_0;
    private M0 lazy_1;
    private M19 lazy_2;

    public M9(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public M2 asBreakEventBody() {
      if (lazy_0 == null) {
        lazy_0 = new M2(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M0 asAfterCompileBody() {
      if (lazy_1 == null) {
        lazy_1 = new M0(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M19 asScriptCollectedBody() {
      if (lazy_2 == null) {
        lazy_2 = new M19(inputReader);
        inputReader = null;
      }
      return lazy_2;
    }
  }

  public static final class M4 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponse {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M6 lazy_0;
    private M5 lazy_1;
    private boolean _success;
    private int _request_seq = -1;
    private String _command;

    public M4(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("success")) {
          _success = readBoolean(reader, "success");
        }
        else if (name.equals("request_seq")) {
          _request_seq = readInt(reader, "request_seq");
        }
        else if (name.equals("command")) {
          _command = readString(reader, "command");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 2) {
          reader.skipValues();
          break;
        }
        else {
          i++;
        }
      }
      reader.endObject();
    }

    @Override
    public boolean success() {
      return _success;
    }

    @Override
    public M6 asSuccess() {
      if (lazy_0 == null) {
        lazy_0 = new M6(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M5 asError() {
      if (lazy_1 == null) {
        lazy_1 = new M5(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public int requestSeq() {
      return _request_seq;
    }

    @Override
    public java.lang.String command() {
      return _command;
    }
  }

  public static final class M2 implements org.chromium.sdk.internal.v8native.protocol.input.BreakEventBody {
    private int[] _breakpoints;
    private String _sourceLineText;
    private boolean _uncaught;
    private int _sourceLine = -1;
    private String _invocationText;
    private int _sourceColumn = -1;
    private com.google.gson.stream.JsonReaderEx _script;
    private org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle _exception;

    public M2(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("breakpoints")) {
          _breakpoints = readIntArray(reader);
        }
        else if (name.equals("sourceLineText")) {
          _sourceLineText = readString(reader, "sourceLineText");
        }
        else if (name.equals("uncaught")) {
          _uncaught = readBoolean(reader, "uncaught");
        }
        else if (name.equals("sourceLine")) {
          _sourceLine = readInt(reader, "sourceLine");
        }
        else if (name.equals("invocationText")) {
          _invocationText = readString(reader, "invocationText");
        }
        else if (name.equals("sourceColumn")) {
          _sourceColumn = readInt(reader, "sourceColumn");
        }
        else if (name.equals("script")) {
          _script = reader.subReader();
          reader.skipValue();
        }
        else if (name.equals("exception")) {
          _exception = new M31(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] breakpoints() {
      return _breakpoints;
    }

    @Override
    public java.lang.String sourceLineText() {
      return _sourceLineText;
    }

    @Override
    public boolean uncaught() {
      return _uncaught;
    }

    @Override
    public int sourceLine() {
      return _sourceLine;
    }

    @Override
    public java.lang.String invocationText() {
      return _invocationText;
    }

    @Override
    public int sourceColumn() {
      return _sourceColumn;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx script() {
      return _script;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle exception() {
      return _exception;
    }
  }

  public static final class M7 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> lazy_0;
    private M14 lazy_1;
    private M10 lazy_2;
    private M31 lazy_3;
    private M1 lazy_4;
    private M3 lazy_5;
    private M15 lazy_6;

    public M7(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> asScripts() {
      if (lazy_0 == null) {
        lazy_0 = readObjectArray(inputReader, null, new M26F(), false);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M14 asListBreakpointsBody() {
      if (lazy_1 == null) {
        lazy_1 = new M14(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M10 asFlagsBody() {
      if (lazy_2 == null) {
        lazy_2 = new M10(inputReader);
        inputReader = null;
      }
      return lazy_2;
    }

    @Override
    public M31 asEvaluateBody() {
      if (lazy_3 == null) {
        lazy_3 = new M31(inputReader);
        inputReader = null;
      }
      return lazy_3;
    }

    @Override
    public M1 asBacktraceCommandBody() {
      if (lazy_4 == null) {
        lazy_4 = new M1(inputReader);
        inputReader = null;
      }
      return lazy_4;
    }

    @Override
    public M3 asChangeLiveBody() {
      if (lazy_5 == null) {
        lazy_5 = new M3(inputReader);
        inputReader = null;
      }
      return lazy_5;
    }

    @Override
    public M15 asRestartFrameBody() {
      if (lazy_6 == null) {
        lazy_6 = new M15(inputReader);
        inputReader = null;
      }
      return lazy_6;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M1 implements org.chromium.sdk.internal.v8native.protocol.input.BacktraceCommandBody {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> _frames;
    private int _toFrame = -1;
    private int _totalFrames = -1;
    private int _fromFrame = -1;

    public M1(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("frames")) {
          _frames = readObjectArray(reader, "frames", new M12F(), true);
        }
        else if (name.equals("toFrame")) {
          _toFrame = readInt(reader, "toFrame");
        }
        else if (name.equals("totalFrames")) {
          _totalFrames = readInt(reader, "totalFrames");
        }
        else if (name.equals("fromFrame")) {
          _fromFrame = readInt(reader, "fromFrame");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> frames() {
      return _frames;
    }

    @Override
    public int toFrame() {
      return _toFrame;
    }

    @Override
    public int totalFrames() {
      return _totalFrames;
    }

    @Override
    public int fromFrame() {
      return _fromFrame;
    }
  }

  public static final class M12 implements org.chromium.sdk.internal.v8native.protocol.input.FrameObject {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _arguments;
    private java.util.Map _func;
    private String _text;
    private int _line = -1;
    private String _sourceLineText;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _locals;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> _scopes;
    private boolean _constructCall;
    private int _column = -1;
    private boolean _debuggerFrame;
    private String _type;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _receiver;
    private int _position = -1;
    private int _index = -1;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _script;

    public M12(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("arguments")) {
          _arguments = readObjectArray(reader, "arguments", new M25F(), false);
        }
        else if (name.equals("func")) {
          _func = readMap(reader, "func");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("line")) {
          _line = readInt(reader, "line");
        }
        else if (name.equals("sourceLineText")) {
          _sourceLineText = readString(reader, "sourceLineText");
        }
        else if (name.equals("locals")) {
          _locals = readObjectArray(reader, "locals", new M25F(), false);
        }
        else if (name.equals("scopes")) {
          _scopes = readObjectArray(reader, "scopes", new M18F(), false);
        }
        else if (name.equals("constructCall")) {
          _constructCall = readBoolean(reader, "constructCall");
        }
        else if (name.equals("column")) {
          _column = readInt(reader, "column");
        }
        else if (name.equals("debuggerFrame")) {
          _debuggerFrame = readBoolean(reader, "debuggerFrame");
        }
        else if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("receiver")) {
          _receiver = new M29(reader);
        }
        else if (name.equals("position")) {
          _position = readInt(reader, "position");
        }
        else if (name.equals("index")) {
          _index = readInt(reader, "index");
        }
        else if (name.equals("script")) {
          _script = new M29(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> arguments() {
      return _arguments;
    }

    @Override
    public java.util.Map func() {
      return _func;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public int line() {
      return _line;
    }

    @Override
    public java.lang.String sourceLineText() {
      return _sourceLineText;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> locals() {
      return _locals;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> scopes() {
      return _scopes;
    }

    @Override
    public boolean constructCall() {
      return _constructCall;
    }

    @Override
    public int column() {
      return _column;
    }

    @Override
    public boolean debuggerFrame() {
      return _debuggerFrame;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef receiver() {
      return _receiver;
    }

    @Override
    public int position() {
      return _position;
    }

    @Override
    public int index() {
      return _index;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef script() {
      return _script;
    }
  }

  public static final class M17 implements org.chromium.sdk.internal.v8native.protocol.input.ScopeBody {
    private String _text;
    private long _frameIndex = -1;
    private org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle _object;
    private long _type = -1;
    private long _index = -1;

    public M17(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("frameIndex")) {
          _frameIndex = readLong(reader, "frameIndex");
        }
        else if (name.equals("object")) {
          _object = M24.parse(reader);
        }
        else if (name.equals("type")) {
          _type = readLong(reader, "type");
        }
        else if (name.equals("index")) {
          _index = readLong(reader, "index");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public long frameIndex() {
      return _frameIndex;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle object() {
      return _object;
    }

    @Override
    public long type() {
      return _type;
    }

    @Override
    public long index() {
      return _index;
    }
  }

  public static final class M18 implements org.chromium.sdk.internal.v8native.protocol.input.ScopeRef {
    private int _type = -1;
    private int _index = -1;

    public M18(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("type")) {
          _type = readInt(reader, "type");
        }
        else if (name.equals("index")) {
          _index = readInt(reader, "index");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int type() {
      return _type;
    }

    @Override
    public int index() {
      return _index;
    }
  }

  public static final class M0 implements org.chromium.sdk.internal.v8native.protocol.input.AfterCompileBody {
    private org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle _script;

    public M0(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("script")) {
          _script = new M26(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle script() {
      return _script;
    }
  }

  public static final class M3 implements org.chromium.sdk.internal.v8native.protocol.input.ChangeLiveBody {
    private com.google.gson.stream.JsonReaderEx _change_log;
    private org.chromium.v8.liveEditProtocol.LiveEditResult _result;
    private boolean _stepin_recommended;

    public M3(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("change_log")) {
          _change_log = reader.subReader();
          reader.skipValue();
        }
        else if (name.equals("result")) {
          _result = new M32(reader);
        }
        else if (name.equals("stepin_recommended")) {
          _stepin_recommended = readBoolean(reader, "stepin_recommended");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getChangeLog() {
      return _change_log;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult getResultDescription() {
      return _result;
    }

    @Override
    public boolean stepin_recommended() {
      return _stepin_recommended;
    }
  }

  public static final class M15 implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody {
    private org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription _result;

    public M15(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = new M16(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription getResultDescription() {
      return _result;
    }
  }

  public static final class M14 implements org.chromium.sdk.internal.v8native.protocol.input.ListBreakpointsBody {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> _breakpoints;

    public M14(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("breakpoints")) {
          _breakpoints = readObjectArray(reader, "breakpoints", new M20F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> breakpoints() {
      return _breakpoints;
    }
  }

  public static final class M19 implements org.chromium.sdk.internal.v8native.protocol.input.ScriptCollectedBody {
    private org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId _script;

    public M19(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("script")) {
          _script = new M27(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId script() {
      return _script;
    }
  }

  public static final class M10 implements org.chromium.sdk.internal.v8native.protocol.input.FlagsBody {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> _flags;

    public M10(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("flags")) {
          _flags = readObjectArray(reader, "flags", new M11F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> flags() {
      return _flags;
    }
  }

  public static final class M28 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M26 lazy_0;
    private M31 lazy_1;
    private M22 lazy_2;
    private String _type;
    private int _handle = -1;

    public M28(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("handle")) {
          _handle = readInt(reader, "handle");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 1) {
          reader.skipValues();
          break;
        }
        else {
          i++;
        }
      }
      reader.endObject();
    }

    @Override
    public M26 asScriptHandle() {
      if (lazy_0 == null) {
        lazy_0 = new M26(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M31 asValueHandle() {
      if (lazy_1 == null) {
        lazy_1 = new M31(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M22 asContextHandle() {
      if (lazy_2 == null) {
        lazy_2 = new M22(inputReader);
        inputReader = null;
      }
      return lazy_2;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public int handle() {
      return _handle;
    }
  }

  public static final class M26 implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle {
    private String _text;
    private int _columnOffset = -1;
    private int _lineCount = -1;
    private String _sourceStart;
    private String _source;
    private int _sourceLength = -1;
    private int _scriptType = -1;
    private int _compilationType = -1;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized _evalFromScript;
    private int _lineOffset = -1;
    private com.google.gson.stream.JsonReaderEx _evalFromLocation;
    private String _name;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _context;
    private int _id = -1;

    public M26(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("columnOffset")) {
          _columnOffset = readInt(reader, "columnOffset");
        }
        else if (name.equals("lineCount")) {
          _lineCount = readInt(reader, "lineCount");
        }
        else if (name.equals("sourceStart")) {
          _sourceStart = readString(reader, "sourceStart");
        }
        else if (name.equals("source")) {
          _source = readString(reader, "source");
        }
        else if (name.equals("sourceLength")) {
          _sourceLength = readInt(reader, "sourceLength");
        }
        else if (name.equals("scriptType")) {
          _scriptType = readInt(reader, "scriptType");
        }
        else if (name.equals("compilationType")) {
          _compilationType = readInt(reader, "compilationType");
        }
        else if (name.equals("evalFromScript")) {
          _evalFromScript = new M30(reader);
        }
        else if (name.equals("lineOffset")) {
          _lineOffset = readInt(reader, "lineOffset");
        }
        else if (name.equals("evalFromLocation")) {
          _evalFromLocation = reader.subReader();
          reader.skipValue();
        }
        else if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("context")) {
          _context = new M29(reader);
        }
        else if (name.equals("id")) {
          _id = readInt(reader, "id");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public int columnOffset() {
      return _columnOffset;
    }

    @Override
    public int lineCount() {
      return _lineCount;
    }

    @Override
    public java.lang.String sourceStart() {
      return _sourceStart;
    }

    @Override
    public java.lang.String source() {
      return _source;
    }

    @Override
    public int sourceLength() {
      return _sourceLength;
    }

    @Override
    public int scriptType() {
      return _scriptType;
    }

    @Override
    public int compilationType() {
      return _compilationType;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized evalFromScript() {
      return _evalFromScript;
    }

    @Override
    public int lineOffset() {
      return _lineOffset;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx evalFromLocation() {
      return _evalFromLocation;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef context() {
      return _context;
    }

    @Override
    public int id() {
      return _id;
    }
  }

  public static final class M31 implements org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M24 lazy_0;
    private String _className;
    private String _text;
    private long _toIndex = -1;
    private long _fromIndex = -1;
    private String _type;
    private String _value;
    private long _length = -1;
    private int _handle = -1;

    public M31(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("toIndex")) {
          _toIndex = readLong(reader, "toIndex");
        }
        else if (name.equals("fromIndex")) {
          _fromIndex = readLong(reader, "fromIndex");
        }
        else if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("length")) {
          _length = readLong(reader, "length");
        }
        else if (name.equals("handle")) {
          _handle = readInt(reader, "handle");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 7) {
          reader.skipValues();
          break;
        }
        else {
          i++;
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String className() {
      return _className;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public long toIndex() {
      return _toIndex;
    }

    @Override
    public M24 asObject() {
      if (lazy_0 == null) {
        lazy_0 = new M24(inputReader, this);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public long fromIndex() {
      return _fromIndex;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public long length() {
      return _length;
    }

    @Override
    public int handle() {
      return _handle;
    }
  }

  public static final class M25 implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject {
    private int _attributes = -1;
    private int _propertyType = -1;
    private String _name;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _value;
    private int _ref = -1;

    public M25(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("attributes")) {
          _attributes = readInt(reader, "attributes");
        }
        else if (name.equals("propertyType")) {
          _propertyType = readInt(reader, "propertyType");
        }
        else if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = new M29(reader);
        }
        else if (name.equals("ref")) {
          _ref = readInt(reader, "ref");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int attributes() {
      return _attributes;
    }

    @Override
    public int propertyType() {
      return _propertyType;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef value() {
      return _value;
    }

    @Override
    public int ref() {
      return _ref;
    }
  }

  public static final class M24 implements org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M23 lazy_0;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _internalProperties;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _protoObject;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _constructorFunction;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _primitiveValue;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _prototypeObject;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _properties;

    private final org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle baseMessage;

    public M24(com.google.gson.stream.JsonReaderEx reader, org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle baseMessage) {
      this.baseMessage = baseMessage;

      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("internalProperties")) {
          _internalProperties = readObjectArray(reader, "internalProperties", new M25F(), true);
        }
        else if (name.equals("protoObject")) {
          _protoObject = new M29(reader);
        }
        else if (name.equals("constructorFunction")) {
          _constructorFunction = new M29(reader);
        }
        else if (name.equals("primitiveValue")) {
          _primitiveValue = new M29(reader);
        }
        else if (name.equals("prototypeObject")) {
          _prototypeObject = new M29(reader);
        }
        else if (name.equals("properties")) {
          _properties = readObjectArray(reader, "properties", new M25F(), false);
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 5) {
          reader.skipValues();
          break;
        }
        else {
          i++;
        }
      }
      reader.endObject();
    }

    public static M24 parse(com.google.gson.stream.JsonReaderEx reader) {
      return new M31(reader).asObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> internalProperties() {
      return _internalProperties;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef protoObject() {
      return _protoObject;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef constructorFunction() {
      return _constructorFunction;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef primitiveValue() {
      return _primitiveValue;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef prototypeObject() {
      return _prototypeObject;
    }

    @Override
    public M23 asFunction() {
      if (lazy_0 == null) {
        lazy_0 = new M23(inputReader, this);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> properties() {
      return _properties;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle getSuper() {
      return baseMessage;
    }}

  public static final class M22 implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextHandle {
    private com.google.gson.stream.JsonReaderEx _data;

    public M22(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("data")) {
          _data = reader.subReader();
          reader.skipValue();
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx data() {
      return _data;
    }
  }

  public static final class M21 implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextData {
    private String _type;
    private long _value = -1;

    public M21(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("value")) {
          _value = readLong(reader, "value");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public long value() {
      return _value;
    }
  }

  public static final class M20 implements org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo {
    private int _line = -1;
    private int _column = -1;
    private String _script_name;
    private int _script_id = -1;
    private String _script_regexp;
    private int _groupId = -1;
    private int _hit_count = -1;
    private boolean _active;
    private String _condition;
    private long _ignoreCount = -1;
    private org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type _type;
    private int _number = -1;

    public M20(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("line")) {
          _line = readInt(reader, "line");
        }
        else if (name.equals("column")) {
          _column = readInt(reader, "column");
        }
        else if (name.equals("script_name")) {
          _script_name = readString(reader, "script_name");
        }
        else if (name.equals("script_id")) {
          _script_id = readInt(reader, "script_id");
        }
        else if (name.equals("script_regexp")) {
          _script_regexp = readString(reader, "script_regexp");
        }
        else if (name.equals("groupId")) {
          _groupId = readInt(reader, "groupId");
        }
        else if (name.equals("hit_count")) {
          _hit_count = readInt(reader, "hit_count");
        }
        else if (name.equals("active")) {
          _active = readBoolean(reader, "active");
        }
        else if (name.equals("condition")) {
          _condition = readNullableString(reader);
        }
        else if (name.equals("ignoreCount")) {
          _ignoreCount = readLong(reader, "ignoreCount");
        }
        else if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type.class);
        }
        else if (name.equals("number")) {
          _number = readInt(reader, "number");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int line() {
      return _line;
    }

    @Override
    public int column() {
      return _column;
    }

    @Override
    public java.lang.String script_name() {
      return _script_name;
    }

    @Override
    public int script_id() {
      return _script_id;
    }

    @Override
    public java.lang.String script_regexp() {
      return _script_regexp;
    }

    @Override
    public int groupId() {
      return _groupId;
    }

    @Override
    public int hit_count() {
      return _hit_count;
    }

    @Override
    public boolean active() {
      return _active;
    }

    @Override
    public java.lang.String condition() {
      return _condition;
    }

    @Override
    public long ignoreCount() {
      return _ignoreCount;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type type() {
      return _type;
    }

    @Override
    public int number() {
      return _number;
    }
  }

  public static final class M27 implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId {
    private int _id = -1;

    public M27(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("id")) {
          _id = readInt(reader, "id");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int id() {
      return _id;
    }
  }

  public static final class M37 implements org.jetbrains.v8.protocol.SetbreakpointResult {
    private int _breakpoint = -1;
    private String _type;

    public M37(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("breakpoint")) {
          _breakpoint = readInt(reader, "breakpoint");
        }
        else if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int breakpoint() {
      return _breakpoint;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M38 implements org.jetbrains.v8.protocol.VersionResult {
    private String _V8Version;

    public M38(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("V8Version")) {
          _V8Version = readString(reader, "V8Version");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String V8Version() {
      return _V8Version;
    }
  }

  public static final class M5 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponse.Error {
    private boolean _success;
    private String _message;
    private String _command;

    public M5(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("success")) {
          _success = readBoolean(reader, "success");
        }
        else if (name.equals("message")) {
          _message = readString(reader, "message");
        }
        else if (name.equals("command")) {
          _command = readString(reader, "command");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean success() {
      return _success;
    }

    @Override
    public java.lang.String message() {
      return _message;
    }

    @Override
    public java.lang.String command() {
      return _command;
    }
  }

  public static final class M6 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponse.Success {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> _refs;
    private org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody _body;
    private boolean _success;
    private boolean _running;

    public M6(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("refs")) {
          _refs = readObjectArray(reader, "refs", new M28F(), true);
        }
        else if (name.equals("body")) {
          _body = new M7(reader);
        }
        else if (name.equals("success")) {
          _success = readBoolean(reader, "success");
        }
        else if (name.equals("running")) {
          _running = readBoolean(reader, "running");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return _refs;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody body() {
      return _body;
    }

    @Override
    public boolean success() {
      return _success;
    }

    @Override
    public boolean running() {
      return _running;
    }
  }

  public static final class M11 implements org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo {
    private String _name;
    private boolean _value;

    public M11(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = readBoolean(reader, "value");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public boolean value() {
      return _value;
    }
  }

  public static final class M29 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef {
    private String _className;
    private String _inferredName;
    private int _scriptId = -1;
    private String _type;
    private com.google.gson.stream.JsonReaderEx _value;
    private int _ref = -1;

    public M29(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, "inferredName");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readInt(reader, "scriptId");
        }
        else if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("value")) {
          _value = reader.subReader();
          reader.skipValue();
        }
        else if (name.equals("ref")) {
          _ref = readInt(reader, "ref");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String className() {
      return _className;
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public int scriptId() {
      return _scriptId;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx value() {
      return _value;
    }

    @Override
    public int ref() {
      return _ref;
    }
  }

  public static final class M23 implements org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle {
    private int _line = -1;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> _scopes;
    private int _column = -1;
    private String _source;
    private String _inferredName;
    private int _scriptId = -1;
    private boolean _resolved;
    private String _name;
    private int _position = -1;
    private com.google.gson.stream.JsonReaderEx _script;

    private final org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle baseMessage;

    public M23(com.google.gson.stream.JsonReaderEx reader, org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle baseMessage) {
      this.baseMessage = baseMessage;

      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("line")) {
          _line = readInt(reader, "line");
        }
        else if (name.equals("scopes")) {
          _scopes = readObjectArray(reader, "scopes", new M18F(), false);
        }
        else if (name.equals("column")) {
          _column = readInt(reader, "column");
        }
        else if (name.equals("source")) {
          _source = readString(reader, "source");
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, "inferredName");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readInt(reader, "scriptId");
        }
        else if (name.equals("resolved")) {
          _resolved = readBoolean(reader, "resolved");
        }
        else if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("position")) {
          _position = readInt(reader, "position");
        }
        else if (name.equals("script")) {
          _script = reader.subReader();
          reader.skipValue();
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    public static M23 parse(com.google.gson.stream.JsonReaderEx reader) {
      return M24.parse(reader).asFunction();
    }

    @Override
    public int line() {
      return _line;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> scopes() {
      return _scopes;
    }

    @Override
    public int column() {
      return _column;
    }

    @Override
    public java.lang.String source() {
      return _source;
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public int scriptId() {
      return _scriptId;
    }

    @Override
    public boolean resolved() {
      return _resolved;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public int position() {
      return _position;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx script() {
      return _script;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle getSuper() {
      return baseMessage;
    }}

  public static final class M32 implements org.chromium.v8.liveEditProtocol.LiveEditResult {
    private org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode _change_tree;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff _textual_diff;
    private String _created_script_name;
    private boolean _stack_modified;
    private boolean _updated;

    public M32(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("change_tree")) {
          _change_tree = new M34(reader);
        }
        else if (name.equals("textual_diff")) {
          _textual_diff = new M36(reader);
        }
        else if (name.equals("created_script_name")) {
          _created_script_name = readString(reader, "created_script_name");
        }
        else if (name.equals("stack_modified")) {
          _stack_modified = readBoolean(reader, "stack_modified");
        }
        else if (name.equals("updated")) {
          _updated = readBoolean(reader, "updated");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode change_tree() {
      return _change_tree;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff textual_diff() {
      return _textual_diff;
    }

    @Override
    public java.lang.String created_script_name() {
      return _created_script_name;
    }

    @Override
    public boolean stack_modified() {
      return _stack_modified;
    }

    @Override
    public boolean updated() {
      return _updated;
    }
  }

  public static final class M33 implements org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode {
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _children;
    private String _name;

    public M33(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("positions")) {
          _positions = new M35(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M33F(), false);
        }
        else if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> children() {
      return _children;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M35 implements org.chromium.v8.liveEditProtocol.LiveEditResult.Positions {
    private long _start_position = -1;
    private long _end_position = -1;

    public M35(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("start_position")) {
          _start_position = readLong(reader, "start_position");
        }
        else if (name.equals("end_position")) {
          _end_position = readLong(reader, "end_position");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long start_position() {
      return _start_position;
    }

    @Override
    public long end_position() {
      return _end_position;
    }
  }

  public static final class M34 implements org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode {
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> _children;
    private String _status;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _new_positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _new_children;
    private String _status_explanation;
    private String _name;

    public M34(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        CharSequence name = reader.nextNameAsCharSequence();
        if (name.equals("positions")) {
          _positions = new M35(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M34F(), false);
        }
        else if (name.equals("status")) {
          _status = readString(reader, "status");
        }
        else if (name.equals("new_positions")) {
          _new_positions = new M35(reader);
        }
        else if (name.equals("new_children")) {
          _new_children = readObjectArray(reader, "new_children", new M33F(), true);
        }
        else if (name.equals("status_explanation")) {
          _status_explanation = readString(reader, "status_explanation");
        }
        else if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> children() {
      return _children;
    }

    @Override
    public java.lang.String status() {
      return _status;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions new_positions() {
      return _new_positions;
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> new_children() {
      return _new_children;
    }

    @Override
    public java.lang.String status_explanation() {
      return _status_explanation;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M36 implements org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff {
    private int[] _chunks;

    public M36(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("chunks")) {
          _chunks = readIntArray(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] chunks() {
      return _chunks;
    }
  }

  public static final class M16 implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription {
    private boolean _stack_update_needs_step_in;

    public M16(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("stack_update_needs_step_in")) {
          _stack_update_needs_step_in = readBoolean(reader, "stack_update_needs_step_in");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean stack_update_needs_step_in() {
      return _stack_update_needs_step_in;
    }
  }

  public static final class M30 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M29 lazy_0;
    private M28 lazy_1;

    public M30(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public M29 asSomeRef() {
      if (lazy_0 == null) {
        lazy_0 = new M29(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M28 asSmthWithHandle() {
      if (lazy_1 == null) {
        lazy_1 = new M28(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }
  }

  static final class M28F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle read(com.google.gson.stream.JsonReaderEx reader) {
      return new M28(reader);
    }
  }

  static final class M26F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle read(com.google.gson.stream.JsonReaderEx reader) {
      return new M26(reader);
    }
  }

  static final class M12F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.FrameObject read(com.google.gson.stream.JsonReaderEx reader) {
      return new M12(reader);
    }
  }

  static final class M25F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject read(com.google.gson.stream.JsonReaderEx reader) {
      return new M25(reader);
    }
  }

  static final class M18F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.ScopeRef read(com.google.gson.stream.JsonReaderEx reader) {
      return new M18(reader);
    }
  }

  static final class M20F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo read(com.google.gson.stream.JsonReaderEx reader) {
      return new M20(reader);
    }
  }

  static final class M11F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo read(com.google.gson.stream.JsonReaderEx reader) {
      return new M11(reader);
    }
  }

  static final class M33F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode read(com.google.gson.stream.JsonReaderEx reader) {
      return new M33(reader);
    }
  }

  static final class M34F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode read(com.google.gson.stream.JsonReaderEx reader) {
      return new M34(reader);
    }
  }

}