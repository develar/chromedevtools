// This is a generated source.
package org.chromium.v8.protocol;

import org.jetbrains.jsonProtocol.ObjectFactory;

import java.io.IOException;

import static org.jetbrains.jsonProtocol.JsonReaders.*;

public final class V8ProtocolReaderImpl implements org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolReader {
  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage parseIncomingMessage(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M13(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle parseScriptHandle(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M31(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.FrameObject parseFrameObject(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M12(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle parseValueHandle(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M36(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef parseSomeRef(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M34(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.data.ContextData parseContextData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M23(reader);
  }

  @Override
  public org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse parseSuccessCommandResponse(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M20(reader);
  }

  public static final class M13 implements org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M5 lazy_0;
    private M7 lazy_1;
    private org.chromium.sdk.internal.v8native.protocol.input.MessageType _type;
    private long _seq;

    public M13(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.sdk.internal.v8native.protocol.input.MessageType.class);
        }
        else if (name.equals("seq")) {
          _seq = readLong(reader, "seq");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 1) {
          break;
        }
        else {
          i++;
        }
      }
    }

    @Override
    public M7 asEventNotification() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M7(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M5 asCommandResponse() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M5(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.MessageType type() {
      return _type;
    }

    @Override
    public long seq() {
      return _seq;
    }
  }

  public static final class M7 implements org.chromium.sdk.internal.v8native.protocol.input.EventNotification {
    private org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody _body;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> _refs;
    private String _event;

    public M7(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("body")) {
          _body = new M8(reader);
        }
        else if (name.equals("refs")) {
          _refs = readObjectArray(reader, "refs", new M33F(), true);
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
    public org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody body() {
      return _body;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return _refs;
    }

    @Override
    public java.lang.String event() {
      return _event;
    }
  }

  public static final class M8 implements org.chromium.sdk.internal.v8native.protocol.input.EventNotificationBody {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M2 lazy_0;
    private M0 lazy_1;
    private M19 lazy_2;

    public M8(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public M19 asScriptCollectedBody() {
      if (lazy_2 == null) {
        try {
          lazy_2 = new M19(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_2;
    }

    @Override
    public M0 asAfterCompileBody() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M0(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M2 asBreakEventBody() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M2(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M20 implements org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse {
    private org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody _body;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> _refs;
    private boolean _success;
    private boolean _running;

    public M20(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("body")) {
          _body = new M6(reader);
        }
        else if (name.equals("refs")) {
          _refs = readObjectArray(reader, "refs", new M33F(), true);
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
    public boolean running() {
      return _running;
    }

    @Override
    public boolean success() {
      return _success;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody body() {
      return _body;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> refs() {
      return _refs;
    }
  }

  public static final class M9 implements org.chromium.sdk.internal.v8native.protocol.input.FailedCommandResponse {
    private String _command;
    private String _message;
    private boolean _success;
    private long _request_seq;

    public M9(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("command")) {
          _command = readString(reader, "command");
        }
        else if (name.equals("message")) {
          _message = readString(reader, "message");
        }
        else if (name.equals("success")) {
          _success = readBoolean(reader, "success");
        }
        else if (name.equals("request_seq")) {
          _request_seq = readLong(reader, "request_seq");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String message() {
      return _message;
    }

    @Override
    public long requestSeq() {
      return _request_seq;
    }

    @Override
    public java.lang.String command() {
      return _command;
    }

    @Override
    public boolean success() {
      return _success;
    }
  }

  public static final class M5 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponse {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M20 lazy_0;
    private M9 lazy_1;
    private String _command;
    private boolean _success;
    private int _request_seq;

    public M5(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("command")) {
          _command = readString(reader, "command");
        }
        else if (name.equals("success")) {
          _success = readBoolean(reader, "success");
        }
        else if (name.equals("request_seq")) {
          _request_seq = readInt(reader, "request_seq");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 2) {
          break;
        }
        else {
          i++;
        }
      }
    }

    @Override
    public M9 asFailure() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M9(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public int requestSeq() {
      return _request_seq;
    }

    @Override
    public boolean success() {
      return _success;
    }

    @Override
    public M20 asSuccess() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M20(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public java.lang.String command() {
      return _command;
    }
  }

  public static final class M2 implements org.chromium.sdk.internal.v8native.protocol.input.BreakEventBody {
    private org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle _exception;
    private long[] _breakpoints;
    private String _sourceLineText;
    private boolean _uncaught;
    private long _sourceLine;
    private String _invocationText;
    private com.google.gson.stream.JsonReaderEx _script;
    private long _sourceColumn;

    public M2(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("exception")) {
          _exception = new M36(reader);
        }
        else if (name.equals("breakpoints")) {
          _breakpoints = readLongArray(reader);
        }
        else if (name.equals("sourceLineText")) {
          _sourceLineText = readString(reader, "sourceLineText");
        }
        else if (name.equals("uncaught")) {
          _uncaught = readBoolean(reader, "uncaught");
        }
        else if (name.equals("sourceLine")) {
          _sourceLine = readLong(reader, "sourceLine");
        }
        else if (name.equals("invocationText")) {
          _invocationText = readString(reader, "invocationText");
        }
        else if (name.equals("script")) {
          _script = reader;
        }
        else if (name.equals("sourceColumn")) {
          _sourceColumn = readLong(reader, "sourceColumn");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String invocationText() {
      return _invocationText;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle exception() {
      return _exception;
    }

    @Override
    public java.lang.String sourceLineText() {
      return _sourceLineText;
    }

    @Override
    public long sourceLine() {
      return _sourceLine;
    }

    @Override
    public long sourceColumn() {
      return _sourceColumn;
    }

    @Override
    public long[] breakpoints() {
      return _breakpoints;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx script() {
      return _script;
    }

    @Override
    public boolean uncaught() {
      return _uncaught;
    }
  }

  public static final class M6 implements org.chromium.sdk.internal.v8native.protocol.input.CommandResponseBody {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M1 lazy_0;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> lazy_1;
    private M3 lazy_2;
    private java.util.Map lazy_3;
    private M36 lazy_4;
    private M17 lazy_5;
    private M21 lazy_6;
    private M4 lazy_7;
    private M15 lazy_8;
    private M14 lazy_9;
    private M10 lazy_10;

    public M6(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public M4 asChangeLiveBody() {
      if (lazy_7 == null) {
        try {
          lazy_7 = new M4(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_7;
    }

    @Override
    public M1 asBacktraceCommandBody() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M1(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M17 asScopeBody() {
      if (lazy_5 == null) {
        try {
          lazy_5 = new M17(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_5;
    }

    @Override
    public java.util.Map asLookupMap() {
      if (lazy_3 == null) {
        try {
          lazy_3 = readMap(inputReader, null);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_3;
    }

    @Override
    public M3 asBreakpointBody() {
      if (lazy_2 == null) {
        try {
          lazy_2 = new M3(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_2;
    }

    @Override
    public M10 asFlagsBody() {
      if (lazy_10 == null) {
        try {
          lazy_10 = new M10(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_10;
    }

    @Override
    public M15 asRestartFrameBody() {
      if (lazy_8 == null) {
        try {
          lazy_8 = new M15(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_8;
    }

    @Override
    public M14 asListBreakpointsBody() {
      if (lazy_9 == null) {
        try {
          lazy_9 = new M14(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_9;
    }

    @Override
    public M21 asVersionBody() {
      if (lazy_6 == null) {
        try {
          lazy_6 = new M21(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_6;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> asScripts() {
      if (lazy_1 == null) {
        try {
          lazy_1 = readObjectArray(inputReader, null, new M31F(), false);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M36 asEvaluateBody() {
      if (lazy_4 == null) {
        try {
          lazy_4 = new M36(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_4;
    }
  }

  public static final class M1 implements org.chromium.sdk.internal.v8native.protocol.input.BacktraceCommandBody {
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> _frames;
    private long _fromFrame;
    private long _toFrame;
    private long _totalFrames;

    public M1(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frames")) {
          _frames = readObjectArray(reader, "frames", new M12F(), true);
        }
        else if (name.equals("fromFrame")) {
          _fromFrame = readLong(reader, "fromFrame");
        }
        else if (name.equals("toFrame")) {
          _toFrame = readLong(reader, "toFrame");
        }
        else if (name.equals("totalFrames")) {
          _totalFrames = readLong(reader, "totalFrames");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long fromFrame() {
      return _fromFrame;
    }

    @Override
    public long toFrame() {
      return _toFrame;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> frames() {
      return _frames;
    }

    @Override
    public long totalFrames() {
      return _totalFrames;
    }
  }

  public static final class M12 implements org.chromium.sdk.internal.v8native.protocol.input.FrameObject {
    private String _type;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _receiver;
    private int _position;
    private long _index;
    private String _text;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _locals;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _arguments;
    private String _sourceLineText;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _script;
    private java.util.Map _func;
    private long _line;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> _scopes;
    private boolean _constructCall;
    private int _column;
    private boolean _debuggerFrame;

    public M12(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("receiver")) {
          _receiver = new M34(reader);
        }
        else if (name.equals("position")) {
          _position = readInt(reader, "position");
        }
        else if (name.equals("index")) {
          _index = readLong(reader, "index");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("locals")) {
          _locals = readObjectArray(reader, "locals", new M27F(), false);
        }
        else if (name.equals("arguments")) {
          _arguments = readObjectArray(reader, "arguments", new M27F(), false);
        }
        else if (name.equals("sourceLineText")) {
          _sourceLineText = readString(reader, "sourceLineText");
        }
        else if (name.equals("script")) {
          _script = new M34(reader);
        }
        else if (name.equals("func")) {
          _func = readMap(reader, "func");
        }
        else if (name.equals("line")) {
          _line = readLong(reader, "line");
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
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean debuggerFrame() {
      return _debuggerFrame;
    }

    @Override
    public int column() {
      return _column;
    }

    @Override
    public java.util.Map func() {
      return _func;
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
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> arguments() {
      return _arguments;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef script() {
      return _script;
    }

    @Override
    public long line() {
      return _line;
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
    public boolean constructCall() {
      return _constructCall;
    }

    @Override
    public long index() {
      return _index;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }
  }

  public static final class M3 implements org.chromium.sdk.internal.v8native.protocol.input.BreakpointBody {
    private String _type;
    private long _line;
    private java.lang.Object _column;
    private long _breakpoint;
    private String _script_name;

    public M3(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("line")) {
          _line = readLong(reader, "line");
        }
        else if (name.equals("column")) {
          _column = reader;
        }
        else if (name.equals("breakpoint")) {
          _breakpoint = readLong(reader, "breakpoint");
        }
        else if (name.equals("script_name")) {
          _script_name = readString(reader, "script_name");
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
    public java.lang.String script_name() {
      return _script_name;
    }

    @Override
    public long line() {
      return _line;
    }

    @Override
    public java.lang.Object column() {
      return _column;
    }

    @Override
    public long breakpoint() {
      return _breakpoint;
    }
  }

  public static final class M17 implements org.chromium.sdk.internal.v8native.protocol.input.ScopeBody {
    private long _type;
    private long _index;
    private String _text;
    private org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle _object;
    private long _frameIndex;

    public M17(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readLong(reader, "type");
        }
        else if (name.equals("index")) {
          _index = readLong(reader, "index");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("object")) {
          _object = M26.parse(reader);
        }
        else if (name.equals("frameIndex")) {
          _frameIndex = readLong(reader, "frameIndex");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
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
    public java.lang.String text() {
      return _text;
    }

    @Override
    public long index() {
      return _index;
    }
  }

  public static final class M18 implements org.chromium.sdk.internal.v8native.protocol.input.ScopeRef {
    private long _type;
    private long _index;

    public M18(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
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
    public long type() {
      return _type;
    }

    @Override
    public long index() {
      return _index;
    }
  }

  public static final class M21 implements org.chromium.sdk.internal.v8native.protocol.input.VersionBody {
    private String _V8Version;

    public M21(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String getV8Version() {
      return _V8Version;
    }
  }

  public static final class M0 implements org.chromium.sdk.internal.v8native.protocol.input.AfterCompileBody {
    private org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle _script;

    public M0(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("script")) {
          _script = new M31(reader);
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

  public static final class M4 implements org.chromium.sdk.internal.v8native.protocol.input.ChangeLiveBody {
    private java.lang.Object _change_log;
    private org.chromium.v8.liveEditProtocol.LiveEditResult _result;
    private boolean _stepin_recommended;

    public M4(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("change_log")) {
          _change_log = reader;
        }
        else if (name.equals("result")) {
          _result = new M37(reader);
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
    public boolean stepin_recommended() {
      return _stepin_recommended;
    }

    @Override
    public java.lang.Object getChangeLog() {
      return _change_log;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult getResultDescription() {
      return _result;
    }
  }

  public static final class M15 implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody {
    private org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription _result;

    public M15(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

    public M14(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("breakpoints")) {
          _breakpoints = readObjectArray(reader, "breakpoints", new M22F(), false);
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

    public M19(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("script")) {
          _script = new M32(reader);
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

    public M10(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M33 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M31 lazy_0;
    private M36 lazy_1;
    private M24 lazy_2;
    private String _type;
    private long _handle;

    public M33(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("handle")) {
          _handle = readLong(reader, "handle");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 1) {
          break;
        }
        else {
          i++;
        }
      }
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public M31 asScriptHandle() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M31(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M36 asValueHandle() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M36(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M24 asContextHandle() {
      if (lazy_2 == null) {
        try {
          lazy_2 = new M24(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_2;
    }

    @Override
    public long handle() {
      return _handle;
    }
  }

  public static final class M31 implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle {
    private String _name;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _context;
    private long _id;
    private java.lang.Object _data;
    private String _text;
    private long _lineOffset;
    private long _columnOffset;
    private long _lineCount;
    private String _sourceStart;
    private String _source;
    private long _sourceLength;
    private long _scriptType;
    private long _compilationType;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized _evalFromScript;
    private com.google.gson.stream.JsonReaderEx _evalFromLocation;

    public M31(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("context")) {
          _context = new M34(reader);
        }
        else if (name.equals("id")) {
          _id = readLong(reader, "id");
        }
        else if (name.equals("data")) {
          _data = reader;
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("lineOffset")) {
          _lineOffset = readLong(reader, "lineOffset");
        }
        else if (name.equals("columnOffset")) {
          _columnOffset = readLong(reader, "columnOffset");
        }
        else if (name.equals("lineCount")) {
          _lineCount = readLong(reader, "lineCount");
        }
        else if (name.equals("sourceStart")) {
          _sourceStart = readString(reader, "sourceStart");
        }
        else if (name.equals("source")) {
          _source = readString(reader, "source");
        }
        else if (name.equals("sourceLength")) {
          _sourceLength = readLong(reader, "sourceLength");
        }
        else if (name.equals("scriptType")) {
          _scriptType = readLong(reader, "scriptType");
        }
        else if (name.equals("compilationType")) {
          _compilationType = readLong(reader, "compilationType");
        }
        else if (name.equals("evalFromScript")) {
          _evalFromScript = new M35(reader);
        }
        else if (name.equals("evalFromLocation")) {
          _evalFromLocation = reader;
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized evalFromScript() {
      return _evalFromScript;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef context() {
      return _context;
    }

    @Override
    public long lineCount() {
      return _lineCount;
    }

    @Override
    public long compilationType() {
      return _compilationType;
    }

    @Override
    public java.lang.String source() {
      return _source;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public long sourceLength() {
      return _sourceLength;
    }

    @Override
    public long id() {
      return _id;
    }

    @Override
    public com.google.gson.stream.JsonReaderEx evalFromLocation() {
      return _evalFromLocation;
    }

    @Override
    public long columnOffset() {
      return _columnOffset;
    }

    @Override
    public java.lang.Object data() {
      return _data;
    }

    @Override
    public java.lang.String sourceStart() {
      return _sourceStart;
    }

    @Override
    public long scriptType() {
      return _scriptType;
    }

    @Override
    public long lineOffset() {
      return _lineOffset;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }
  }

  public static final class M36 implements org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M26 lazy_0;
    private String _type;
    private java.lang.Object _value;
    private long _length;
    private long _handle;
    private String _className;
    private String _text;
    private long _fromIndex;
    private long _toIndex;

    public M36(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else if (name.equals("length")) {
          _length = readLong(reader, "length");
        }
        else if (name.equals("handle")) {
          _handle = readLong(reader, "handle");
        }
        else if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("fromIndex")) {
          _fromIndex = readLong(reader, "fromIndex");
        }
        else if (name.equals("toIndex")) {
          _toIndex = readLong(reader, "toIndex");
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 7) {
          break;
        }
        else {
          i++;
        }
      }
    }

    @Override
    public long toIndex() {
      return _toIndex;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public java.lang.String className() {
      return _className;
    }

    @Override
    public long length() {
      return _length;
    }

    @Override
    public java.lang.Object value() {
      return _value;
    }

    @Override
    public M26 asObject() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M26(inputReader, this);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public long handle() {
      return _handle;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public long fromIndex() {
      return _fromIndex;
    }
  }

  public static final class M30 implements org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData {
    private String _type;
    private java.lang.Object _value;
    private long _ref;
    private String _className;
    private String _inferredName;
    private long _scriptId;

    public M30(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else if (name.equals("ref")) {
          _ref = readLong(reader, "ref");
        }
        else if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, "inferredName");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readLong(reader, "scriptId");
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
    public java.lang.Object value() {
      return _value;
    }

    @Override
    public long scriptId() {
      return _scriptId;
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
    public long ref() {
      return _ref;
    }
  }

  public static final class M27 implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M29 lazy_0;
    private M28 lazy_1;
    private java.lang.Object _name;

    public M27(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("name")) {
          _name = reader;
          break;
        }
        else {
          reader.skipValue();
        }
      }
    }

    @Override
    public java.lang.Object name() {
      return _name;
    }

    @Override
    public M29 asPropertyWithValue() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M29(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M28 asPropertyWithRef() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M28(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }
  }

  public static final class M28 implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithRef {
    private long _ref;
    private long _attributes;
    private long _propertyType;

    public M28(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("ref")) {
          _ref = readLong(reader, "ref");
        }
        else if (name.equals("attributes")) {
          _attributes = readLong(reader, "attributes");
        }
        else if (name.equals("propertyType")) {
          _propertyType = readLong(reader, "propertyType");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long attributes() {
      return _attributes;
    }

    @Override
    public void value() {

    }

    @Override
    public long propertyType() {
      return _propertyType;
    }

    @Override
    public long ref() {
      return _ref;
    }
  }

  public static final class M29 implements org.chromium.sdk.internal.v8native.protocol.input.data.PropertyWithValue {
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _value;

    public M29(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("value")) {
          _value = new M34(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef value() {
      return _value;
    }
  }

  public static final class M26 implements org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M25 lazy_0;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _properties;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> _internalProperties;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _protoObject;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _constructorFunction;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _primitiveValue;
    private org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef _prototypeObject;

    private final org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle baseMessage;

    public M26(com.google.gson.stream.JsonReaderEx reader, org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle baseMessage) throws java.io.IOException {
      this.baseMessage = baseMessage;

      inputReader = reader.subReader();
      reader.beginObject();
      int i = 0;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("properties")) {
          _properties = readObjectArray(reader, "properties", new M27F(), false);
        }
        else if (name.equals("internalProperties")) {
          _internalProperties = readObjectArray(reader, "internalProperties", new M27F(), true);
        }
        else if (name.equals("protoObject")) {
          _protoObject = new M34(reader);
        }
        else if (name.equals("constructorFunction")) {
          _constructorFunction = new M34(reader);
        }
        else if (name.equals("primitiveValue")) {
          _primitiveValue = new M34(reader);
        }
        else if (name.equals("prototypeObject")) {
          _prototypeObject = new M34(reader);
        }
        else {
          reader.skipValue();
          continue;
        }

        if (i == 5) {
          break;
        }
        else {
          i++;
        }
      }
    }

    public static M26 parse(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M36(reader).asObject();
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef prototypeObject() {
      return _prototypeObject;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> properties() {
      return _properties;
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
    public M25 asFunction() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M25(inputReader, this);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef primitiveValue() {
      return _primitiveValue;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef constructorFunction() {
      return _constructorFunction;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle getSuper() {
      return baseMessage;
    }}

  public static final class M25 implements org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle {
    private String _name;
    private long _position;
    private com.google.gson.stream.JsonReaderEx _script;
    private long _line;
    private java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> _scopes;
    private long _column;
    private String _source;
    private String _inferredName;
    private long _scriptId;
    private boolean _resolved;

    private final org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle baseMessage;

    public M25(com.google.gson.stream.JsonReaderEx reader, org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle baseMessage) throws java.io.IOException {
      this.baseMessage = baseMessage;

      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("position")) {
          _position = readLong(reader, "position");
        }
        else if (name.equals("script")) {
          _script = reader;
        }
        else if (name.equals("line")) {
          _line = readLong(reader, "line");
        }
        else if (name.equals("scopes")) {
          _scopes = readObjectArray(reader, "scopes", new M18F(), false);
        }
        else if (name.equals("column")) {
          _column = readLong(reader, "column");
        }
        else if (name.equals("source")) {
          _source = readString(reader, "source");
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, "inferredName");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readLong(reader, "scriptId");
        }
        else if (name.equals("resolved")) {
          _resolved = readBoolean(reader, "resolved");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    public static M25 parse(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return M26.parse(reader).asFunction();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx script() {
      return _script;
    }

    @Override
    public long scriptId() {
      return _scriptId;
    }

    @Override
    public long line() {
      return _line;
    }

    @Override
    public long column() {
      return _column;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public boolean resolved() {
      return _resolved;
    }

    @Override
    public java.lang.String source() {
      return _source;
    }

    @Override
    public java.util.List<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> scopes() {
      return _scopes;
    }

    @Override
    public long position() {
      return _position;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle getSuper() {
      return baseMessage;
    }}

  public static final class M34 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M30 lazy_0;
    private long _ref;

    public M34(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("ref")) {
          _ref = readLong(reader, "ref");
          break;
        }
        else {
          reader.skipValue();
        }
      }
    }

    @Override
    public long ref() {
      return _ref;
    }

    @Override
    public M30 asWithDisplayData() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M30(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M35 implements org.chromium.sdk.internal.v8native.protocol.input.data.SomeSerialized {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M34 lazy_0;
    private M33 lazy_1;

    public M35(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public M34 asSomeRef() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M34(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M33 asSmthWithHandle() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M33(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }
  }

  public static final class M24 implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextHandle {
    private java.lang.Object _data;

    public M24(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("data")) {
          _data = reader;
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Object data() {
      return _data;
    }
  }

  public static final class M23 implements org.chromium.sdk.internal.v8native.protocol.input.data.ContextData {
    private String _type;
    private long _value;

    public M23(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
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

  public static final class M22 implements org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo {
    private org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type _type;
    private long _number;
    private long _line;
    private long _column;
    private String _script_name;
    private long _script_id;
    private String _script_regexp;
    private long _groupId;
    private long _hit_count;
    private boolean _active;
    private String _condition;
    private long _ignoreCount;

    public M22(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type.class);
        }
        else if (name.equals("number")) {
          _number = readLong(reader, "number");
        }
        else if (name.equals("line")) {
          _line = readLong(reader, "line");
        }
        else if (name.equals("column")) {
          _column = readLong(reader, "column");
        }
        else if (name.equals("script_name")) {
          _script_name = readString(reader, "script_name");
        }
        else if (name.equals("script_id")) {
          _script_id = readLong(reader, "script_id");
        }
        else if (name.equals("script_regexp")) {
          _script_regexp = readString(reader, "script_regexp");
        }
        else if (name.equals("groupId")) {
          _groupId = readLong(reader, "groupId");
        }
        else if (name.equals("hit_count")) {
          _hit_count = readLong(reader, "hit_count");
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
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long groupId() {
      return _groupId;
    }

    @Override
    public java.lang.String condition() {
      return _condition;
    }

    @Override
    public long number() {
      return _number;
    }

    @Override
    public long script_id() {
      return _script_id;
    }

    @Override
    public long column() {
      return _column;
    }

    @Override
    public long ignoreCount() {
      return _ignoreCount;
    }

    @Override
    public boolean active() {
      return _active;
    }

    @Override
    public java.lang.String script_name() {
      return _script_name;
    }

    @Override
    public long line() {
      return _line;
    }

    @Override
    public java.lang.String script_regexp() {
      return _script_regexp;
    }

    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo.Type type() {
      return _type;
    }

    @Override
    public long hit_count() {
      return _hit_count;
    }
  }

  public static final class M32 implements org.chromium.sdk.internal.v8native.protocol.input.data.ScriptWithId {
    private long _id;

    public M32(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("id")) {
          _id = readLong(reader, "id");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long id() {
      return _id;
    }
  }

  public static final class M37 implements org.chromium.v8.liveEditProtocol.LiveEditResult {
    private org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode _change_tree;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff _textual_diff;
    private String _created_script_name;
    private boolean _stack_modified;
    private boolean _updated;

    public M37(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("change_tree")) {
          _change_tree = new M39(reader);
        }
        else if (name.equals("textual_diff")) {
          _textual_diff = new M41(reader);
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
    public boolean stack_modified() {
      return _stack_modified;
    }

    @Override
    public java.lang.String created_script_name() {
      return _created_script_name;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff textual_diff() {
      return _textual_diff;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode change_tree() {
      return _change_tree;
    }

    @Override
    public boolean updated() {
      return _updated;
    }
  }

  public static final class M38 implements org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode {
    private String _name;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _children;

    public M38(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("positions")) {
          _positions = new M40(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M38F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> children() {
      return _children;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }
  }

  public static final class M40 implements org.chromium.v8.liveEditProtocol.LiveEditResult.Positions {
    private long _start_position;
    private long _end_position;

    public M40(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
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
    public long end_position() {
      return _end_position;
    }

    @Override
    public long start_position() {
      return _start_position;
    }
  }

  public static final class M39 implements org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode {
    private String _name;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> _children;
    private String _status;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _new_positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _new_children;
    private String _status_explanation;

    public M39(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("positions")) {
          _positions = new M40(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M39F(), false);
        }
        else if (name.equals("status")) {
          _status = readString(reader, "status");
        }
        else if (name.equals("new_positions")) {
          _new_positions = new M40(reader);
        }
        else if (name.equals("new_children")) {
          _new_children = readObjectArray(reader, "new_children", new M38F(), true);
        }
        else if (name.equals("status_explanation")) {
          _status_explanation = readString(reader, "status_explanation");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> children() {
      return _children;
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> new_children() {
      return _new_children;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions new_positions() {
      return _new_positions;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String status() {
      return _status;
    }

    @Override
    public java.lang.String status_explanation() {
      return _status_explanation;
    }
  }

  public static final class M41 implements org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff {
    private int[] _chunks;

    public M41(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M11 implements org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo {
    private String _name;
    private java.lang.Object _value;

    public M11(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Object value() {
      return _value;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M16 implements org.chromium.sdk.internal.v8native.protocol.input.RestartFrameBody.ResultDescription {
    private boolean _stack_update_needs_step_in;

    public M16(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  static final class M33F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M33(reader);
    }
  }

  static final class M38F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M38(reader);
    }
  }

  static final class M39F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M39(reader);
    }
  }

  static final class M31F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M31(reader);
    }
  }

  static final class M12F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.FrameObject> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.FrameObject read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M12(reader);
    }
  }

  static final class M11F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.FlagsBody.FlagInfo read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M11(reader);
    }
  }

  static final class M22F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.BreakpointInfo read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M22(reader);
    }
  }

  static final class M18F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.ScopeRef> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.ScopeRef read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M18(reader);
    }
  }

  static final class M27F extends ObjectFactory<org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject> {
    @Override
    public org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M27(reader);
    }
  }

}