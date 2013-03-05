// This is a generated source.
package org.chromium.wip.protocol;

import org.jetbrains.jsonProtocol.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.JsonParseException;
import java.io.IOException;

public final class WipProtocolReaderImpl implements org.jetbrains.wip.protocol.WipProtocolReader {
  @Override
  public org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData parsePageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M100(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData parseConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M3(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.SetBreakpointData parseDebuggerSetBreakpointData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M27(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ShadowRootPoppedEventData parseDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M55(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData parseNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M66(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputconsole.MessagesClearedEventData parseConsoleMessagesClearedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M4(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData parseNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M65(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputruntime.EvaluateData parseRuntimeEvaluateData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M116(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData parseDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M37(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData parseRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M117(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.DataReceivedEventData parseNetworkDataReceivedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M60(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData parseNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M69(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanOverrideDeviceOrientationData parsePageCanOverrideDeviceOrientationData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M86(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData parsePageAddScriptToEvaluateOnLoadData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M83(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ChildNodeCountUpdatedEventData parseDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M34(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.ResumedEventData parseDebuggerResumedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M20(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.RunScriptData parseDebuggerRunScriptData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M21(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData parseNetworkResponseReceivedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M71(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.MoveToData parseDOMMoveToData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M45(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.LoadEventFiredEventData parsePageLoadEventFiredEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M109(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData parseNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M82(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData parseNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M74(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanOverrideGeolocationData parsePageCanOverrideGeolocationData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M87(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.PausedEventData parseDebuggerPausedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M16(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputruntime.RemoteObjectValue parseRemoteObjectValue(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M124(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData parsePageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M107(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipEvent parseWipEvent(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M130(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.GetResourceTreeData parsePageGetResourceTreeData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M105(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData parseNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M75(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanShowFPSCounterData parsePageCanShowFPSCounterData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M89(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.SearchInResourcesData parsePageSearchInResourcesData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M112(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.SetScriptSourceData parseDebuggerSetScriptSourceData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M28(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData parseNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M76(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData parseDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M35(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData parseDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M33(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData parseDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M36(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipTabList parseTabList(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M132(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputruntime.CallFunctionOnData parseRuntimeCallFunctionOnData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M115(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.CanClearBrowserCacheData parseNetworkCanClearBrowserCacheData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M58(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.CanSetScriptSourceData parseDebuggerCanSetScriptSourceData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M7(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.SearchInResourceData parsePageSearchInResourceData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M111(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData parsePageGetScriptExecutionStatusData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M106(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.PerformSearchData parseDOMPerformSearchData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M47(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.GetResourceContentData parsePageGetResourceContentData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M104(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData parsePageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M108(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.CausesRecompilationData parseDebuggerCausesRecompilationData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M8(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData parseNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M79(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.GetCompositingBordersVisibleData parsePageGetCompositingBordersVisibleData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M102(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.SetChildNodesEventData parseDOMSetChildNodesEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M53(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData parseDebuggerEvaluateOnCallFrameData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M10(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData parsePageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M93(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.QuerySelectorAllData parseDOMQuerySelectorAllData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M49(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData parseNetworkLoadingFailedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M64(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData parsePageFrameStartedLoadingEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M99(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.GetAttributesData parseDOMGetAttributesData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M39(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData parseNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M67(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData parsePageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M98(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData parseDebuggerGetFunctionDetailsData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M12(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.QuerySelectorData parseDOMQuerySelectorData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M50(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData parseDOMShadowRootPushedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M56(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.GetSearchResultsData parseDOMGetSearchResultsData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M43(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M30(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData parsePageDomContentEventFiredEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M92(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipCommandResponse parseWipCommandResponse(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M125(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData parseDebuggerScriptParsedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M24(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanOverrideDeviceMetricsData parsePageCanOverrideDeviceMetricsData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M85(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.FrameNavigatedEventData parsePageFrameNavigatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M95(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData parsePageCanContinuouslyPaintData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M84(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CaptureScreenshotData parsePageCaptureScreenshotData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M90(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.RequestNodeData parseDOMRequestNodeData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M51(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.GetDocumentData parseDOMGetDocumentData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M40(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData parseDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M5(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData parseNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M77(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.FrameDetachedEventData parsePageFrameDetachedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M94(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.GetOuterHTMLData parseDOMGetOuterHTMLData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M42(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.AttributeModifiedEventData parseDOMAttributeModifiedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M31(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData parseDebuggerSetBreakpointByUrlData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M26(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData parseDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M23(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData parseDOMGetEventListenersForNodeData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M41(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData parseNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M73(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.GetCookiesData parsePageGetCookiesData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M103(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.ResolveNodeData parseDOMResolveNodeData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M52(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData parseDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M14(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputruntime.GetPropertiesData parseRuntimeGetPropertiesData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M119(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.AttributeRemovedEventData parseDOMAttributeRemovedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M32(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.CompileScriptData parseDebuggerCompileScriptData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M9(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData parseNetworkCanClearBrowserCookiesData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M59(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.SearchInContentData parseDebuggerSearchInContentData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M25(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputnetwork.GetResponseBodyData parseNetworkGetResponseBodyData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M61(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData parseDOMPushNodeByPathToFrontendData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M48(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData parsePageScriptsEnabledEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M110(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.RestartFrameData parseDebuggerRestartFrameData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M18(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.SetNodeNameData parseDOMSetNodeNameData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M54(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData parseDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M44(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputconsole.MessageAddedEventData parseConsoleMessageAddedEventData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M2(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputpage.CanShowDebugBordersData parsePageCanShowDebugBordersData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M88(reader);
  }

  @Override
  public org.chromium.wip.protocol.inputdebugger.GetScriptSourceData parseDebuggerGetScriptSourceData(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M13(reader);
  }

  public static final class M0 extends Message implements org.chromium.wip.protocol.inputconsole.CallFrameValue {
    private long _lineNumber;
    private String _url;
    private String _functionName;
    private long _columnNumber;

    public M0(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readLong(reader, name);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("functionName")) {
          _functionName = readString(reader, name);
        }
        else if (name.equals("columnNumber")) {
          _columnNumber = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long lineNumber() {
      return _lineNumber;
    }

    @Override
    public long columnNumber() {
      return _columnNumber;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String functionName() {
      return _functionName;
    }
  }

  public static final class M1 extends Message implements org.chromium.wip.protocol.inputconsole.ConsoleMessageValue {
    private org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue> _stackTrace;
    private String _url;
    private String _text;
    private org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Source _source;
    private org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Level _level;
    private long _line;
    private long _repeatCount;
    private java.util.List<org.chromium.wip.protocol.inputruntime.RemoteObjectValue> _parameters;
    private String _networkRequestId;

    public M1(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Type.class);
        }
        else if (name.equals("stackTrace")) {
          _stackTrace = readObjectArray(reader, name, new M0F());
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("text")) {
          _text = readString(reader, name);
        }
        else if (name.equals("source")) {
          _source = readEnum(reader, name, org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Source.class);
        }
        else if (name.equals("level")) {
          _level = readEnum(reader, name, org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Level.class);
        }
        else if (name.equals("line")) {
          _line = readLong(reader, name);
        }
        else if (name.equals("repeatCount")) {
          _repeatCount = readLong(reader, name);
        }
        else if (name.equals("parameters")) {
          _parameters = readObjectArray(reader, name, new M124F());
        }
        else if (name.equals("networkRequestId")) {
          _networkRequestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue> stackTrace() {
      return _stackTrace;
    }

    @Override
    public org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Type type() {
      return _type;
    }

    @Override
    public long repeatCount() {
      return _repeatCount;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputruntime.RemoteObjectValue> parameters() {
      return _parameters;
    }

    @Override
    public long line() {
      return _line;
    }

    @Override
    public org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Source source() {
      return _source;
    }

    @Override
    public java.lang.String networkRequestId() {
      return _networkRequestId;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public org.chromium.wip.protocol.inputconsole.ConsoleMessageValue.Level level() {
      return _level;
    }
  }

  public static final class M2 extends Message implements org.chromium.wip.protocol.inputconsole.MessageAddedEventData {
    private org.chromium.wip.protocol.inputconsole.ConsoleMessageValue _message;

    public M2(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("message")) {
          _message = new M1(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputconsole.ConsoleMessageValue message() {
      return _message;
    }
  }

  public static final class M3 extends Message implements org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData {
    private long _count;

    public M3(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("count")) {
          _count = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long count() {
      return _count;
    }
  }

  public static final class M4 extends Message implements org.chromium.wip.protocol.inputconsole.MessagesClearedEventData {

    public M4(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M5 extends Message implements org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData {
    private org.chromium.wip.protocol.inputdebugger.LocationValue _location;
    private String _breakpointId;

    public M5(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue location() {
      return _location;
    }
  }

  public static final class M6 extends Message implements org.chromium.wip.protocol.inputdebugger.CallFrameValue {
    private org.chromium.wip.protocol.inputdebugger.LocationValue _location;
    private String _functionName;
    private String _callFrameId;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> _scopeChain;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _this;

    public M6(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("functionName")) {
          _functionName = readString(reader, name);
        }
        else if (name.equals("callFrameId")) {
          _callFrameId = readString(reader, name);
        }
        else if (name.equals("scopeChain")) {
          _scopeChain = readObjectArray(reader, name, new M22F());
        }
        else if (name.equals("this")) {
          _this = new M124(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String callFrameId() {
      return _callFrameId;
    }

    @Override
    public java.lang.String functionName() {
      return _functionName;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue getThis() {
      return _this;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue location() {
      return _location;
    }
  }

  public static final class M7 extends Message implements org.chromium.wip.protocol.inputdebugger.CanSetScriptSourceData {
    private boolean _result;

    public M7(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M8 extends Message implements org.chromium.wip.protocol.inputdebugger.CausesRecompilationData {
    private boolean _result;

    public M8(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M9 extends Message implements org.chromium.wip.protocol.inputdebugger.CompileScriptData {
    private String _scriptId;
    private String _syntaxErrorMessage;

    public M9(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("scriptId")) {
          _scriptId = readString(reader, name);
        }
        else if (name.equals("syntaxErrorMessage")) {
          _syntaxErrorMessage = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String scriptId() {
      return _scriptId;
    }

    @Override
    public java.lang.String syntaxErrorMessage() {
      return _syntaxErrorMessage;
    }
  }

  public static final class M10 extends Message implements org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M10(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M11 extends Message implements org.chromium.wip.protocol.inputdebugger.FunctionDetailsValue {
    private String _name;
    private String _displayName;
    private org.chromium.wip.protocol.inputdebugger.LocationValue _location;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> _scopeChain;
    private String _inferredName;

    public M11(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("displayName")) {
          _displayName = readString(reader, name);
        }
        else if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("scopeChain")) {
          _scopeChain = readObjectArray(reader, name, new M22F());
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue location() {
      return _location;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String displayName() {
      return _displayName;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }
  }

  public static final class M12 extends Message implements org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData {
    private org.chromium.wip.protocol.inputdebugger.FunctionDetailsValue _details;

    public M12(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("details")) {
          _details = new M11(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.FunctionDetailsValue details() {
      return _details;
    }
  }

  public static final class M13 extends Message implements org.chromium.wip.protocol.inputdebugger.GetScriptSourceData {
    private String _scriptSource;

    public M13(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("scriptSource")) {
          _scriptSource = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String scriptSource() {
      return _scriptSource;
    }
  }

  public static final class M14 extends Message implements org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData {

    public M14(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M15 extends Message implements org.chromium.wip.protocol.inputdebugger.LocationValue {
    private long _lineNumber;
    private long _columnNumber;
    private String _scriptId;

    public M15(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readLong(reader, name);
        }
        else if (name.equals("columnNumber")) {
          _columnNumber = readLong(reader, name);
        }
        else if (name.equals("scriptId")) {
          _scriptId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long lineNumber() {
      return _lineNumber;
    }

    @Override
    public java.lang.String scriptId() {
      return _scriptId;
    }

    @Override
    public long columnNumber() {
      return _columnNumber;
    }
  }

  public static final class M16 extends Message implements org.chromium.wip.protocol.inputdebugger.PausedEventData {
    private org.chromium.wip.protocol.inputdebugger.PausedEventData.Data _data;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> _callFrames;
    private org.chromium.wip.protocol.inputdebugger.PausedEventData.Reason _reason;

    public M16(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("data")) {
          _data = new M17(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, name, new M6F());
        }
        else if (name.equals("reason")) {
          _reason = readEnum(reader, name, org.chromium.wip.protocol.inputdebugger.PausedEventData.Reason.class);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames() {
      return _callFrames;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.PausedEventData.Reason reason() {
      return _reason;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.PausedEventData.Data data() {
      return _data;
    }
  }

  public static final class M17 extends LazyReadMessage implements org.chromium.wip.protocol.inputdebugger.PausedEventData.Data {

    public M17(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }
    @Override
    public com.google.gson.stream.JsonReader getUnderlyingObject() {
return new JsonReader(inputReader);
    }}

  public static final class M18 extends Message implements org.chromium.wip.protocol.inputdebugger.RestartFrameData {
    private org.chromium.wip.protocol.inputdebugger.RestartFrameData.Result _result;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> _callFrames;

    public M18(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M19(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, name, new M6F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames() {
      return _callFrames;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.RestartFrameData.Result result() {
      return _result;
    }
  }

  public static final class M19 extends LazyReadMessage implements org.chromium.wip.protocol.inputdebugger.RestartFrameData.Result {

    public M19(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }
    @Override
    public com.google.gson.stream.JsonReader getUnderlyingObject() {
return new JsonReader(inputReader);
    }}

  public static final class M20 extends Message implements org.chromium.wip.protocol.inputdebugger.ResumedEventData {

    public M20(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M21 extends Message implements org.chromium.wip.protocol.inputdebugger.RunScriptData {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M21(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M22 extends Message implements org.chromium.wip.protocol.inputdebugger.ScopeValue {
    private org.chromium.wip.protocol.inputdebugger.ScopeValue.Type _type;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _object;

    public M22(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputdebugger.ScopeValue.Type.class);
        }
        else if (name.equals("object")) {
          _object = new M124(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue object() {
      return _object;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.ScopeValue.Type type() {
      return _type;
    }
  }

  public static final class M23 extends Message implements org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData {
    private String _url;
    private String _scriptSource;
    private long _startLine;
    private long _errorLine;
    private String _errorMessage;

    public M23(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("scriptSource")) {
          _scriptSource = readString(reader, name);
        }
        else if (name.equals("startLine")) {
          _startLine = readLong(reader, name);
        }
        else if (name.equals("errorLine")) {
          _errorLine = readLong(reader, name);
        }
        else if (name.equals("errorMessage")) {
          _errorMessage = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String errorMessage() {
      return _errorMessage;
    }

    @Override
    public long startLine() {
      return _startLine;
    }

    @Override
    public long errorLine() {
      return _errorLine;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String scriptSource() {
      return _scriptSource;
    }
  }

  public static final class M24 extends Message implements org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData {
    private String _url;
    private String _scriptId;
    private long _startLine;
    private long _startColumn;
    private long _endLine;
    private long _endColumn;
    private boolean _isContentScript;
    private String _sourceMapURL;
    private boolean _hasSourceURL;

    public M24(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("scriptId")) {
          _scriptId = readString(reader, name);
        }
        else if (name.equals("startLine")) {
          _startLine = readLong(reader, name);
        }
        else if (name.equals("startColumn")) {
          _startColumn = readLong(reader, name);
        }
        else if (name.equals("endLine")) {
          _endLine = readLong(reader, name);
        }
        else if (name.equals("endColumn")) {
          _endColumn = readLong(reader, name);
        }
        else if (name.equals("isContentScript")) {
          _isContentScript = readBoolean(reader, name);
        }
        else if (name.equals("sourceMapURL")) {
          _sourceMapURL = readString(reader, name);
        }
        else if (name.equals("hasSourceURL")) {
          _hasSourceURL = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean hasSourceURL() {
      return _hasSourceURL;
    }

    @Override
    public long startLine() {
      return _startLine;
    }

    @Override
    public long endLine() {
      return _endLine;
    }

    @Override
    public java.lang.String sourceMapURL() {
      return _sourceMapURL;
    }

    @Override
    public java.lang.String scriptId() {
      return _scriptId;
    }

    @Override
    public long startColumn() {
      return _startColumn;
    }

    @Override
    public boolean isContentScript() {
      return _isContentScript;
    }

    @Override
    public long endColumn() {
      return _endColumn;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }
  }

  public static final class M25 extends Message implements org.chromium.wip.protocol.inputdebugger.SearchInContentData {
    private java.util.List<org.chromium.wip.protocol.inputpage.SearchMatchValue> _result;

    public M25(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readObjectArray(reader, name, new M113F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M26 extends Message implements org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData {
    private String _breakpointId;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.LocationValue> _locations;

    public M26(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, name);
        }
        else if (name.equals("locations")) {
          _locations = readObjectArray(reader, name, new M15F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.LocationValue> locations() {
      return _locations;
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }
  }

  public static final class M27 extends Message implements org.chromium.wip.protocol.inputdebugger.SetBreakpointData {
    private String _breakpointId;
    private org.chromium.wip.protocol.inputdebugger.LocationValue _actualLocation;

    public M27(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, name);
        }
        else if (name.equals("actualLocation")) {
          _actualLocation = new M15(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue actualLocation() {
      return _actualLocation;
    }
  }

  public static final class M28 extends Message implements org.chromium.wip.protocol.inputdebugger.SetScriptSourceData {
    private org.chromium.wip.protocol.inputdebugger.SetScriptSourceData.Result _result;
    private java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> _callFrames;

    public M28(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M29(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, name, new M6F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.SetScriptSourceData.Result result() {
      return _result;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames() {
      return _callFrames;
    }
  }

  public static final class M29 extends LazyReadMessage implements org.chromium.wip.protocol.inputdebugger.SetScriptSourceData.Result {

    public M29(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }
    @Override
    public com.google.gson.stream.JsonReader getUnderlyingObject() {
return new JsonReader(inputReader);
    }}

  public static final class M30 extends Message implements org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData {
    private boolean _result;

    public M30(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M31 extends Message implements org.chromium.wip.protocol.inputdom.AttributeModifiedEventData {
    private String _name;
    private String _value;
    private long _nodeId;

    public M31(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("value")) {
          _value = readString(reader, name);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M32 extends Message implements org.chromium.wip.protocol.inputdom.AttributeRemovedEventData {
    private String _name;
    private long _nodeId;

    public M32(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M33 extends Message implements org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData {
    private long _nodeId;
    private String _characterData;

    public M33(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else if (name.equals("characterData")) {
          _characterData = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }

    @Override
    public java.lang.String characterData() {
      return _characterData;
    }
  }

  public static final class M34 extends Message implements org.chromium.wip.protocol.inputdom.ChildNodeCountUpdatedEventData {
    private long _nodeId;
    private long _childNodeCount;

    public M34(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else if (name.equals("childNodeCount")) {
          _childNodeCount = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }

    @Override
    public long childNodeCount() {
      return _childNodeCount;
    }
  }

  public static final class M35 extends Message implements org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData {
    private org.chromium.wip.protocol.inputdom.NodeValue _node;
    private long _parentNodeId;
    private long _previousNodeId;

    public M35(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("node")) {
          _node = new M46(reader);
        }
        else if (name.equals("parentNodeId")) {
          _parentNodeId = readLong(reader, name);
        }
        else if (name.equals("previousNodeId")) {
          _previousNodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue node() {
      return _node;
    }

    @Override
    public long parentNodeId() {
      return _parentNodeId;
    }

    @Override
    public long previousNodeId() {
      return _previousNodeId;
    }
  }

  public static final class M36 extends Message implements org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData {
    private long _nodeId;
    private long _parentNodeId;

    public M36(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else if (name.equals("parentNodeId")) {
          _parentNodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long parentNodeId() {
      return _parentNodeId;
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M37 extends Message implements org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData {

    public M37(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M38 extends Message implements org.chromium.wip.protocol.inputdom.EventListenerValue {
    private String _type;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _handler;
    private org.chromium.wip.protocol.inputdebugger.LocationValue _location;
    private long _nodeId;
    private boolean _useCapture;
    private boolean _isAttribute;
    private String _handlerBody;
    private String _sourceName;

    public M38(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, name);
        }
        else if (name.equals("handler")) {
          _handler = new M124(reader);
        }
        else if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else if (name.equals("useCapture")) {
          _useCapture = readBoolean(reader, name);
        }
        else if (name.equals("isAttribute")) {
          _isAttribute = readBoolean(reader, name);
        }
        else if (name.equals("handlerBody")) {
          _handlerBody = readString(reader, name);
        }
        else if (name.equals("sourceName")) {
          _sourceName = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String handlerBody() {
      return _handlerBody;
    }

    @Override
    public boolean useCapture() {
      return _useCapture;
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }

    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue location() {
      return _location;
    }

    @Override
    public boolean isAttribute() {
      return _isAttribute;
    }

    @Override
    public java.lang.String sourceName() {
      return _sourceName;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue handler() {
      return _handler;
    }
  }

  public static final class M39 extends Message implements org.chromium.wip.protocol.inputdom.GetAttributesData {
    private java.util.List<String> _attributes;

    public M39(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("attributes")) {
          _attributes = nextList(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<java.lang.String> attributes() {
      return _attributes;
    }
  }

  public static final class M40 extends Message implements org.chromium.wip.protocol.inputdom.GetDocumentData {
    private org.chromium.wip.protocol.inputdom.NodeValue _root;

    public M40(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("root")) {
          _root = new M46(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue root() {
      return _root;
    }
  }

  public static final class M41 extends Message implements org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData {
    private java.util.List<org.chromium.wip.protocol.inputdom.EventListenerValue> _listeners;

    public M41(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("listeners")) {
          _listeners = readObjectArray(reader, name, new M38F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdom.EventListenerValue> listeners() {
      return _listeners;
    }
  }

  public static final class M42 extends Message implements org.chromium.wip.protocol.inputdom.GetOuterHTMLData {
    private String _outerHTML;

    public M42(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("outerHTML")) {
          _outerHTML = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String outerHTML() {
      return _outerHTML;
    }
  }

  public static final class M43 extends Message implements org.chromium.wip.protocol.inputdom.GetSearchResultsData {
    private long[] _nodeIds;

    public M43(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeIds")) {
          _nodeIds = readLongArray(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M44 extends Message implements org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData {
    private long[] _nodeIds;

    public M44(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeIds")) {
          _nodeIds = readLongArray(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M45 extends Message implements org.chromium.wip.protocol.inputdom.MoveToData {
    private long _nodeId;

    public M45(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M46 extends Message implements org.chromium.wip.protocol.inputdom.NodeValue {
    private String _name;
    private String _value;
    private java.util.List<String> _attributes;
    private long _nodeId;
    private long _childNodeCount;
    private long _nodeType;
    private String _nodeName;
    private String _localName;
    private String _nodeValue;
    private java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> _children;
    private String _documentURL;
    private String _baseURL;
    private String _publicId;
    private String _systemId;
    private String _internalSubset;
    private String _xmlVersion;
    private String _frameId;
    private org.chromium.wip.protocol.inputdom.NodeValue _contentDocument;
    private java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> _shadowRoots;
    private org.chromium.wip.protocol.inputdom.NodeValue _templateContent;

    public M46(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("value")) {
          _value = readString(reader, name);
        }
        else if (name.equals("attributes")) {
          _attributes = nextList(reader);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else if (name.equals("childNodeCount")) {
          _childNodeCount = readLong(reader, name);
        }
        else if (name.equals("nodeType")) {
          _nodeType = readLong(reader, name);
        }
        else if (name.equals("nodeName")) {
          _nodeName = readString(reader, name);
        }
        else if (name.equals("localName")) {
          _localName = readString(reader, name);
        }
        else if (name.equals("nodeValue")) {
          _nodeValue = readString(reader, name);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, name, new M46F());
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, name);
        }
        else if (name.equals("baseURL")) {
          _baseURL = readString(reader, name);
        }
        else if (name.equals("publicId")) {
          _publicId = readString(reader, name);
        }
        else if (name.equals("systemId")) {
          _systemId = readString(reader, name);
        }
        else if (name.equals("internalSubset")) {
          _internalSubset = readString(reader, name);
        }
        else if (name.equals("xmlVersion")) {
          _xmlVersion = readString(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("contentDocument")) {
          _contentDocument = new M46(reader);
        }
        else if (name.equals("shadowRoots")) {
          _shadowRoots = readObjectArray(reader, name, new M46F());
        }
        else if (name.equals("templateContent")) {
          _templateContent = new M46(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue contentDocument() {
      return _contentDocument;
    }

    @Override
    public long nodeType() {
      return _nodeType;
    }

    @Override
    public java.lang.String systemId() {
      return _systemId;
    }

    @Override
    public java.util.List<java.lang.String> attributes() {
      return _attributes;
    }

    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue templateContent() {
      return _templateContent;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public java.lang.String nodeValue() {
      return _nodeValue;
    }

    @Override
    public java.lang.String publicId() {
      return _publicId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String documentURL() {
      return _documentURL;
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> shadowRoots() {
      return _shadowRoots;
    }

    @Override
    public java.lang.String xmlVersion() {
      return _xmlVersion;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> children() {
      return _children;
    }

    @Override
    public java.lang.String nodeName() {
      return _nodeName;
    }

    @Override
    public java.lang.String baseURL() {
      return _baseURL;
    }

    @Override
    public java.lang.String internalSubset() {
      return _internalSubset;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.String localName() {
      return _localName;
    }

    @Override
    public long childNodeCount() {
      return _childNodeCount;
    }
  }

  public static final class M47 extends Message implements org.chromium.wip.protocol.inputdom.PerformSearchData {
    private String _searchId;
    private long _resultCount;

    public M47(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("searchId")) {
          _searchId = readString(reader, name);
        }
        else if (name.equals("resultCount")) {
          _resultCount = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long resultCount() {
      return _resultCount;
    }

    @Override
    public java.lang.String searchId() {
      return _searchId;
    }
  }

  public static final class M48 extends Message implements org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData {
    private long _nodeId;

    public M48(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M49 extends Message implements org.chromium.wip.protocol.inputdom.QuerySelectorAllData {
    private long[] _nodeIds;

    public M49(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeIds")) {
          _nodeIds = readLongArray(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M50 extends Message implements org.chromium.wip.protocol.inputdom.QuerySelectorData {
    private long _nodeId;

    public M50(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M51 extends Message implements org.chromium.wip.protocol.inputdom.RequestNodeData {
    private long _nodeId;

    public M51(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M52 extends Message implements org.chromium.wip.protocol.inputdom.ResolveNodeData {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _object;

    public M52(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("object")) {
          _object = new M124(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue object() {
      return _object;
    }
  }

  public static final class M53 extends Message implements org.chromium.wip.protocol.inputdom.SetChildNodesEventData {
    private long _parentId;
    private java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> _nodes;

    public M53(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("parentId")) {
          _parentId = readLong(reader, name);
        }
        else if (name.equals("nodes")) {
          _nodes = readObjectArray(reader, name, new M46F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputdom.NodeValue> nodes() {
      return _nodes;
    }

    @Override
    public long parentId() {
      return _parentId;
    }
  }

  public static final class M54 extends Message implements org.chromium.wip.protocol.inputdom.SetNodeNameData {
    private long _nodeId;

    public M54(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long nodeId() {
      return _nodeId;
    }
  }

  public static final class M55 extends Message implements org.chromium.wip.protocol.inputdom.ShadowRootPoppedEventData {
    private long _hostId;
    private long _rootId;

    public M55(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("hostId")) {
          _hostId = readLong(reader, name);
        }
        else if (name.equals("rootId")) {
          _rootId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long rootId() {
      return _rootId;
    }

    @Override
    public long hostId() {
      return _hostId;
    }
  }

  public static final class M56 extends Message implements org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData {
    private org.chromium.wip.protocol.inputdom.NodeValue _root;
    private long _hostId;

    public M56(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("root")) {
          _root = new M46(reader);
        }
        else if (name.equals("hostId")) {
          _hostId = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long hostId() {
      return _hostId;
    }

    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue root() {
      return _root;
    }
  }

  public static final class M57 extends Message implements org.chromium.wip.protocol.inputnetwork.CachedResourceValue {
    private org.chromium.wip.protocol.inputpage.ResourceTypeEnum _type;
    private String _url;
    private org.chromium.wip.protocol.inputnetwork.ResponseValue _response;
    private double _bodySize;

    public M57(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputpage.ResourceTypeEnum.class);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("response")) {
          _response = new M72(reader);
        }
        else if (name.equals("bodySize")) {
          _bodySize = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputpage.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.ResponseValue response() {
      return _response;
    }

    @Override
    public java.lang.Number bodySize() {
      return _bodySize;
    }
  }

  public static final class M58 extends Message implements org.chromium.wip.protocol.inputnetwork.CanClearBrowserCacheData {
    private boolean _result;

    public M58(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M59 extends Message implements org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData {
    private boolean _result;

    public M59(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M60 extends Message implements org.chromium.wip.protocol.inputnetwork.DataReceivedEventData {
    private double _timestamp;
    private String _requestId;
    private long _dataLength;
    private long _encodedDataLength;

    public M60(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("dataLength")) {
          _dataLength = readLong(reader, name);
        }
        else if (name.equals("encodedDataLength")) {
          _encodedDataLength = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long encodedDataLength() {
      return _encodedDataLength;
    }

    @Override
    public long dataLength() {
      return _dataLength;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M61 extends Message implements org.chromium.wip.protocol.inputnetwork.GetResponseBodyData {
    private String _body;
    private boolean _base64Encoded;

    public M61(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("body")) {
          _body = readString(reader, name);
        }
        else if (name.equals("base64Encoded")) {
          _base64Encoded = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean base64Encoded() {
      return _base64Encoded;
    }

    @Override
    public java.lang.String body() {
      return _body;
    }
  }

  public static final class M62 extends Message implements org.chromium.wip.protocol.inputnetwork.HeadersValue {

    public M62(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M63 extends Message implements org.chromium.wip.protocol.inputnetwork.InitiatorValue {
    private org.chromium.wip.protocol.inputnetwork.InitiatorValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue> _stackTrace;
    private double _lineNumber;
    private String _url;

    public M63(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputnetwork.InitiatorValue.Type.class);
        }
        else if (name.equals("stackTrace")) {
          _stackTrace = readObjectArray(reader, name, new M0F());
        }
        else if (name.equals("lineNumber")) {
          _lineNumber = readDouble(reader, name);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number lineNumber() {
      return _lineNumber;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.InitiatorValue.Type type() {
      return _type;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue> stackTrace() {
      return _stackTrace;
    }
  }

  public static final class M64 extends Message implements org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData {
    private double _timestamp;
    private String _requestId;
    private String _errorText;
    private boolean _canceled;

    public M64(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("errorText")) {
          _errorText = readString(reader, name);
        }
        else if (name.equals("canceled")) {
          _canceled = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public boolean canceled() {
      return _canceled;
    }

    @Override
    public java.lang.String errorText() {
      return _errorText;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M65 extends Message implements org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData {
    private double _timestamp;
    private String _requestId;

    public M65(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M66 extends Message implements org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData {
    private String _requestId;

    public M66(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M67 extends Message implements org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.inputnetwork.InitiatorValue _initiator;
    private org.chromium.wip.protocol.inputnetwork.CachedResourceValue _resource;

    public M67(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, name);
        }
        else if (name.equals("initiator")) {
          _initiator = new M63(reader);
        }
        else if (name.equals("resource")) {
          _resource = new M57(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String documentURL() {
      return _documentURL;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.InitiatorValue initiator() {
      return _initiator;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.CachedResourceValue resource() {
      return _resource;
    }
  }

  public static final class M68 extends Message implements org.chromium.wip.protocol.inputnetwork.RequestValue {
    private String _method;
    private String _url;
    private org.chromium.wip.protocol.inputnetwork.HeadersValue _headers;
    private String _postData;

    public M68(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("method")) {
          _method = readString(reader, name);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("postData")) {
          _postData = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String method() {
      return _method;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.HeadersValue headers() {
      return _headers;
    }

    @Override
    public java.lang.String postData() {
      return _postData;
    }
  }

  public static final class M69 extends Message implements org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.inputnetwork.InitiatorValue _initiator;
    private org.chromium.wip.protocol.inputnetwork.RequestValue _request;
    private org.chromium.wip.protocol.inputnetwork.ResponseValue _redirectResponse;

    public M69(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, name);
        }
        else if (name.equals("initiator")) {
          _initiator = new M63(reader);
        }
        else if (name.equals("request")) {
          _request = new M68(reader);
        }
        else if (name.equals("redirectResponse")) {
          _redirectResponse = new M72(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.ResponseValue redirectResponse() {
      return _redirectResponse;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.InitiatorValue initiator() {
      return _initiator;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.RequestValue request() {
      return _request;
    }

    @Override
    public java.lang.String documentURL() {
      return _documentURL;
    }
  }

  public static final class M70 extends Message implements org.chromium.wip.protocol.inputnetwork.ResourceTimingValue {
    private double _requestTime;
    private double _proxyStart;
    private double _proxyEnd;
    private double _dnsStart;
    private double _dnsEnd;
    private double _connectStart;
    private double _connectEnd;
    private double _sslStart;
    private double _sslEnd;
    private double _sendStart;
    private double _sendEnd;
    private double _receiveHeadersEnd;

    public M70(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("requestTime")) {
          _requestTime = readDouble(reader, name);
        }
        else if (name.equals("proxyStart")) {
          _proxyStart = readDouble(reader, name);
        }
        else if (name.equals("proxyEnd")) {
          _proxyEnd = readDouble(reader, name);
        }
        else if (name.equals("dnsStart")) {
          _dnsStart = readDouble(reader, name);
        }
        else if (name.equals("dnsEnd")) {
          _dnsEnd = readDouble(reader, name);
        }
        else if (name.equals("connectStart")) {
          _connectStart = readDouble(reader, name);
        }
        else if (name.equals("connectEnd")) {
          _connectEnd = readDouble(reader, name);
        }
        else if (name.equals("sslStart")) {
          _sslStart = readDouble(reader, name);
        }
        else if (name.equals("sslEnd")) {
          _sslEnd = readDouble(reader, name);
        }
        else if (name.equals("sendStart")) {
          _sendStart = readDouble(reader, name);
        }
        else if (name.equals("sendEnd")) {
          _sendEnd = readDouble(reader, name);
        }
        else if (name.equals("receiveHeadersEnd")) {
          _receiveHeadersEnd = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number connectStart() {
      return _connectStart;
    }

    @Override
    public java.lang.Number proxyStart() {
      return _proxyStart;
    }

    @Override
    public java.lang.Number connectEnd() {
      return _connectEnd;
    }

    @Override
    public java.lang.Number requestTime() {
      return _requestTime;
    }

    @Override
    public java.lang.Number sslEnd() {
      return _sslEnd;
    }

    @Override
    public java.lang.Number sslStart() {
      return _sslStart;
    }

    @Override
    public java.lang.Number dnsStart() {
      return _dnsStart;
    }

    @Override
    public java.lang.Number proxyEnd() {
      return _proxyEnd;
    }

    @Override
    public java.lang.Number dnsEnd() {
      return _dnsEnd;
    }

    @Override
    public java.lang.Number receiveHeadersEnd() {
      return _receiveHeadersEnd;
    }

    @Override
    public java.lang.Number sendStart() {
      return _sendStart;
    }

    @Override
    public java.lang.Number sendEnd() {
      return _sendEnd;
    }
  }

  public static final class M71 extends Message implements org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData {
    private org.chromium.wip.protocol.inputpage.ResourceTypeEnum _type;
    private double _timestamp;
    private String _frameId;
    private org.chromium.wip.protocol.inputnetwork.ResponseValue _response;
    private String _requestId;
    private String _loaderId;

    public M71(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputpage.ResourceTypeEnum.class);
        }
        else if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("response")) {
          _response = new M72(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.ResponseValue response() {
      return _response;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.inputpage.ResourceTypeEnum type() {
      return _type;
    }
  }

  public static final class M72 extends Message implements org.chromium.wip.protocol.inputnetwork.ResponseValue {
    private String _url;
    private org.chromium.wip.protocol.inputnetwork.HeadersValue _headers;
    private double _status;
    private String _statusText;
    private String _headersText;
    private String _mimeType;
    private org.chromium.wip.protocol.inputnetwork.HeadersValue _requestHeaders;
    private String _requestHeadersText;
    private boolean _connectionReused;
    private double _connectionId;
    private boolean _fromDiskCache;
    private org.chromium.wip.protocol.inputnetwork.ResourceTimingValue _timing;

    public M72(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("status")) {
          _status = readDouble(reader, name);
        }
        else if (name.equals("statusText")) {
          _statusText = readString(reader, name);
        }
        else if (name.equals("headersText")) {
          _headersText = readString(reader, name);
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, name);
        }
        else if (name.equals("requestHeaders")) {
          _requestHeaders = new M62(reader);
        }
        else if (name.equals("requestHeadersText")) {
          _requestHeadersText = readString(reader, name);
        }
        else if (name.equals("connectionReused")) {
          _connectionReused = readBoolean(reader, name);
        }
        else if (name.equals("connectionId")) {
          _connectionId = readDouble(reader, name);
        }
        else if (name.equals("fromDiskCache")) {
          _fromDiskCache = readBoolean(reader, name);
        }
        else if (name.equals("timing")) {
          _timing = new M70(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.ResourceTimingValue timing() {
      return _timing;
    }

    @Override
    public java.lang.String mimeType() {
      return _mimeType;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public boolean fromDiskCache() {
      return _fromDiskCache;
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }

    @Override
    public java.lang.String requestHeadersText() {
      return _requestHeadersText;
    }

    @Override
    public boolean connectionReused() {
      return _connectionReused;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.HeadersValue requestHeaders() {
      return _requestHeaders;
    }

    @Override
    public java.lang.Number status() {
      return _status;
    }

    @Override
    public java.lang.Number connectionId() {
      return _connectionId;
    }

    @Override
    public java.lang.String headersText() {
      return _headersText;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.HeadersValue headers() {
      return _headers;
    }
  }

  public static final class M73 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData {
    private double _timestamp;
    private String _requestId;

    public M73(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M74 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData {
    private String _url;
    private String _requestId;

    public M74(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }
  }

  public static final class M75 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData {
    private double _timestamp;
    private String _errorMessage;
    private String _requestId;

    public M75(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("errorMessage")) {
          _errorMessage = readString(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public java.lang.String errorMessage() {
      return _errorMessage;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M76 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue _response;
    private String _requestId;

    public M76(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("response")) {
          _response = new M78(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue response() {
      return _response;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M77 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue _response;
    private String _requestId;

    public M77(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("response")) {
          _response = new M78(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue response() {
      return _response;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M78 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketFrameValue {
    private boolean _mask;
    private double _opcode;
    private String _payloadData;

    public M78(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("mask")) {
          _mask = readBoolean(reader, name);
        }
        else if (name.equals("opcode")) {
          _opcode = readDouble(reader, name);
        }
        else if (name.equals("payloadData")) {
          _payloadData = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number opcode() {
      return _opcode;
    }

    @Override
    public java.lang.String payloadData() {
      return _payloadData;
    }

    @Override
    public boolean mask() {
      return _mask;
    }
  }

  public static final class M79 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.inputnetwork.WebSocketResponseValue _response;
    private String _requestId;

    public M79(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("response")) {
          _response = new M81(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.WebSocketResponseValue response() {
      return _response;
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M80 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketRequestValue {
    private org.chromium.wip.protocol.inputnetwork.HeadersValue _headers;

    public M80(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.HeadersValue headers() {
      return _headers;
    }
  }

  public static final class M81 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketResponseValue {
    private org.chromium.wip.protocol.inputnetwork.HeadersValue _headers;
    private double _status;
    private String _statusText;

    public M81(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("status")) {
          _status = readDouble(reader, name);
        }
        else if (name.equals("statusText")) {
          _statusText = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number status() {
      return _status;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.HeadersValue headers() {
      return _headers;
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }
  }

  public static final class M82 extends Message implements org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData {
    private double _timestamp;
    private String _requestId;
    private org.chromium.wip.protocol.inputnetwork.WebSocketRequestValue _request;

    public M82(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, name);
        }
        else if (name.equals("request")) {
          _request = new M80(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }

    @Override
    public org.chromium.wip.protocol.inputnetwork.WebSocketRequestValue request() {
      return _request;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M83 extends Message implements org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData {
    private String _identifier;

    public M83(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("identifier")) {
          _identifier = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String identifier() {
      return _identifier;
    }
  }

  public static final class M84 extends Message implements org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData {
    private boolean _value;

    public M84(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("value")) {
          _value = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean value() {
      return _value;
    }
  }

  public static final class M85 extends Message implements org.chromium.wip.protocol.inputpage.CanOverrideDeviceMetricsData {
    private boolean _result;

    public M85(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M86 extends Message implements org.chromium.wip.protocol.inputpage.CanOverrideDeviceOrientationData {
    private boolean _result;

    public M86(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M87 extends Message implements org.chromium.wip.protocol.inputpage.CanOverrideGeolocationData {
    private boolean _result;

    public M87(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M88 extends Message implements org.chromium.wip.protocol.inputpage.CanShowDebugBordersData {
    private boolean _show;

    public M88(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("show")) {
          _show = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean show() {
      return _show;
    }
  }

  public static final class M89 extends Message implements org.chromium.wip.protocol.inputpage.CanShowFPSCounterData {
    private boolean _show;

    public M89(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("show")) {
          _show = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean show() {
      return _show;
    }
  }

  public static final class M90 extends Message implements org.chromium.wip.protocol.inputpage.CaptureScreenshotData {
    private String _data;

    public M90(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("data")) {
          _data = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String data() {
      return _data;
    }
  }

  public static final class M91 extends Message implements org.chromium.wip.protocol.inputpage.CookieValue {
    private String _name;
    private String _value;
    private long _size;
    private String _domain;
    private String _path;
    private double _expires;
    private boolean _httpOnly;
    private boolean _secure;
    private boolean _session;

    public M91(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("value")) {
          _value = readString(reader, name);
        }
        else if (name.equals("size")) {
          _size = readLong(reader, name);
        }
        else if (name.equals("domain")) {
          _domain = readString(reader, name);
        }
        else if (name.equals("path")) {
          _path = readString(reader, name);
        }
        else if (name.equals("expires")) {
          _expires = readDouble(reader, name);
        }
        else if (name.equals("httpOnly")) {
          _httpOnly = readBoolean(reader, name);
        }
        else if (name.equals("secure")) {
          _secure = readBoolean(reader, name);
        }
        else if (name.equals("session")) {
          _session = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean httpOnly() {
      return _httpOnly;
    }

    @Override
    public boolean secure() {
      return _secure;
    }

    @Override
    public java.lang.String path() {
      return _path;
    }

    @Override
    public java.lang.String domain() {
      return _domain;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public long size() {
      return _size;
    }

    @Override
    public java.lang.Number expires() {
      return _expires;
    }

    @Override
    public boolean session() {
      return _session;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M92 extends Message implements org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData {
    private double _timestamp;

    public M92(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M93 extends Message implements org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData {
    private String _frameId;

    public M93(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M94 extends Message implements org.chromium.wip.protocol.inputpage.FrameDetachedEventData {
    private String _frameId;

    public M94(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M95 extends Message implements org.chromium.wip.protocol.inputpage.FrameNavigatedEventData {
    private org.chromium.wip.protocol.inputpage.FrameValue _frame;

    public M95(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frame")) {
          _frame = new M101(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputpage.FrameValue frame() {
      return _frame;
    }
  }

  public static final class M96 extends Message implements org.chromium.wip.protocol.inputpage.FrameResourceTreeValue {
    private org.chromium.wip.protocol.inputpage.FrameValue _frame;
    private java.util.List<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue> _childFrames;
    private java.util.List<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue.Resources> _resources;

    public M96(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frame")) {
          _frame = new M101(reader);
        }
        else if (name.equals("childFrames")) {
          _childFrames = readObjectArray(reader, name, new M96F());
        }
        else if (name.equals("resources")) {
          _resources = readObjectArray(reader, name, new M97F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue> childFrames() {
      return _childFrames;
    }

    @Override
    public org.chromium.wip.protocol.inputpage.FrameValue frame() {
      return _frame;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue.Resources> resources() {
      return _resources;
    }
  }

  public static final class M97 extends Message implements org.chromium.wip.protocol.inputpage.FrameResourceTreeValue.Resources {
    private org.chromium.wip.protocol.inputpage.ResourceTypeEnum _type;
    private String _url;
    private boolean _canceled;
    private String _mimeType;
    private boolean _failed;

    public M97(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputpage.ResourceTypeEnum.class);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("canceled")) {
          _canceled = readBoolean(reader, name);
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, name);
        }
        else if (name.equals("failed")) {
          _failed = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputpage.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public java.lang.String mimeType() {
      return _mimeType;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public boolean failed() {
      return _failed;
    }

    @Override
    public boolean canceled() {
      return _canceled;
    }
  }

  public static final class M98 extends Message implements org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData {
    private String _frameId;
    private double _delay;

    public M98(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("delay")) {
          _delay = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.Number delay() {
      return _delay;
    }
  }

  public static final class M99 extends Message implements org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData {
    private String _frameId;

    public M99(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M100 extends Message implements org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData {
    private String _frameId;

    public M100(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M101 extends Message implements org.chromium.wip.protocol.inputpage.FrameValue {
    private String _name;
    private String _id;
    private String _url;
    private String _parentId;
    private String _loaderId;
    private String _mimeType;
    private String _securityOrigin;

    public M101(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("id")) {
          _id = readString(reader, name);
        }
        else if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("parentId")) {
          _parentId = readString(reader, name);
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, name);
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, name);
        }
        else if (name.equals("securityOrigin")) {
          _securityOrigin = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String securityOrigin() {
      return _securityOrigin;
    }

    @Override
    public java.lang.String mimeType() {
      return _mimeType;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String parentId() {
      return _parentId;
    }

    @Override
    public java.lang.String id() {
      return _id;
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M102 extends Message implements org.chromium.wip.protocol.inputpage.GetCompositingBordersVisibleData {
    private boolean _result;

    public M102(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M103 extends Message implements org.chromium.wip.protocol.inputpage.GetCookiesData {
    private java.util.List<org.chromium.wip.protocol.inputpage.CookieValue> _cookies;
    private String _cookiesString;

    public M103(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("cookies")) {
          _cookies = readObjectArray(reader, name, new M91F());
        }
        else if (name.equals("cookiesString")) {
          _cookiesString = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String cookiesString() {
      return _cookiesString;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.CookieValue> cookies() {
      return _cookies;
    }
  }

  public static final class M104 extends Message implements org.chromium.wip.protocol.inputpage.GetResourceContentData {
    private String _content;
    private boolean _base64Encoded;

    public M104(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("content")) {
          _content = readString(reader, name);
        }
        else if (name.equals("base64Encoded")) {
          _base64Encoded = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String content() {
      return _content;
    }

    @Override
    public boolean base64Encoded() {
      return _base64Encoded;
    }
  }

  public static final class M105 extends Message implements org.chromium.wip.protocol.inputpage.GetResourceTreeData {
    private org.chromium.wip.protocol.inputpage.FrameResourceTreeValue _frameTree;

    public M105(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameTree")) {
          _frameTree = new M96(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputpage.FrameResourceTreeValue frameTree() {
      return _frameTree;
    }
  }

  public static final class M106 extends Message implements org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData {
    private org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData.Result _result;

    public M106(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readEnum(reader, name, org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData.Result.class);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData.Result result() {
      return _result;
    }
  }

  public static final class M107 extends Message implements org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData {

    public M107(JsonReader reader) throws IOException {
      reader.beginObject();
      reader.endObject();
    }
  }

  public static final class M108 extends Message implements org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData {
    private String _message;

    public M108(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("message")) {
          _message = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String message() {
      return _message;
    }
  }

  public static final class M109 extends Message implements org.chromium.wip.protocol.inputpage.LoadEventFiredEventData {
    private double _timestamp;

    public M109(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.Number timestamp() {
      return _timestamp;
    }
  }

  public static final class M110 extends Message implements org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData {
    private boolean _isEnabled;

    public M110(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("isEnabled")) {
          _isEnabled = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean isEnabled() {
      return _isEnabled;
    }
  }

  public static final class M111 extends Message implements org.chromium.wip.protocol.inputpage.SearchInResourceData {
    private java.util.List<org.chromium.wip.protocol.inputpage.SearchMatchValue> _result;

    public M111(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readObjectArray(reader, name, new M113F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M112 extends Message implements org.chromium.wip.protocol.inputpage.SearchInResourcesData {
    private java.util.List<org.chromium.wip.protocol.inputpage.SearchResultValue> _result;

    public M112(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readObjectArray(reader, name, new M114F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputpage.SearchResultValue> result() {
      return _result;
    }
  }

  public static final class M113 extends Message implements org.chromium.wip.protocol.inputpage.SearchMatchValue {
    private double _lineNumber;
    private String _lineContent;

    public M113(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readDouble(reader, name);
        }
        else if (name.equals("lineContent")) {
          _lineContent = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String lineContent() {
      return _lineContent;
    }

    @Override
    public java.lang.Number lineNumber() {
      return _lineNumber;
    }
  }

  public static final class M114 extends Message implements org.chromium.wip.protocol.inputpage.SearchResultValue {
    private String _url;
    private String _frameId;
    private double _matchesCount;

    public M114(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("matchesCount")) {
          _matchesCount = readDouble(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.Number matchesCount() {
      return _matchesCount;
    }
  }

  public static final class M115 extends Message implements org.chromium.wip.protocol.inputruntime.CallFunctionOnData {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M115(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M116 extends Message implements org.chromium.wip.protocol.inputruntime.EvaluateData {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M116(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M117 extends Message implements org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData {
    private org.chromium.wip.protocol.inputruntime.ExecutionContextDescriptionValue _context;

    public M117(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("context")) {
          _context = new M118(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.ExecutionContextDescriptionValue context() {
      return _context;
    }
  }

  public static final class M118 extends Message implements org.chromium.wip.protocol.inputruntime.ExecutionContextDescriptionValue {
    private String _name;
    private long _id;
    private String _frameId;
    private boolean _isPageContext;

    public M118(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("id")) {
          _id = readLong(reader, name);
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, name);
        }
        else if (name.equals("isPageContext")) {
          _isPageContext = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean isPageContext() {
      return _isPageContext;
    }

    @Override
    public long id() {
      return _id;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M119 extends Message implements org.chromium.wip.protocol.inputruntime.GetPropertiesData {
    private java.util.List<org.chromium.wip.protocol.inputruntime.PropertyDescriptorValue> _result;
    private java.util.List<org.chromium.wip.protocol.inputruntime.InternalPropertyDescriptorValue> _internalProperties;

    public M119(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readObjectArray(reader, name, new M122F());
        }
        else if (name.equals("internalProperties")) {
          _internalProperties = readObjectArray(reader, name, new M120F());
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputruntime.InternalPropertyDescriptorValue> internalProperties() {
      return _internalProperties;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputruntime.PropertyDescriptorValue> result() {
      return _result;
    }
  }

  public static final class M120 extends Message implements org.chromium.wip.protocol.inputruntime.InternalPropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _value;

    public M120(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("value")) {
          _value = new M124(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue value() {
      return _value;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M121 extends Message implements org.chromium.wip.protocol.inputruntime.ObjectPreviewValue {
    private boolean _overflow;
    private java.util.List<org.chromium.wip.protocol.inputruntime.PropertyPreviewValue> _properties;
    private boolean _lossless;

    public M121(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("overflow")) {
          _overflow = readBoolean(reader, name);
        }
        else if (name.equals("properties")) {
          _properties = readObjectArray(reader, name, new M123F());
        }
        else if (name.equals("lossless")) {
          _lossless = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean overflow() {
      return _overflow;
    }

    @Override
    public boolean lossless() {
      return _lossless;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.inputruntime.PropertyPreviewValue> properties() {
      return _properties;
    }
  }

  public static final class M122 extends Message implements org.chromium.wip.protocol.inputruntime.PropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _get;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _value;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue _set;
    private boolean _wasThrown;
    private boolean _writable;
    private boolean _configurable;
    private boolean _enumerable;
    private boolean _isOwn;

    public M122(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("get")) {
          _get = new M124(reader);
        }
        else if (name.equals("value")) {
          _value = new M124(reader);
        }
        else if (name.equals("set")) {
          _set = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, name);
        }
        else if (name.equals("writable")) {
          _writable = readBoolean(reader, name);
        }
        else if (name.equals("configurable")) {
          _configurable = readBoolean(reader, name);
        }
        else if (name.equals("enumerable")) {
          _enumerable = readBoolean(reader, name);
        }
        else if (name.equals("isOwn")) {
          _isOwn = readBoolean(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public boolean configurable() {
      return _configurable;
    }

    @Override
    public boolean enumerable() {
      return _enumerable;
    }

    @Override
    public boolean writable() {
      return _writable;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue set() {
      return _set;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue get() {
      return _get;
    }

    @Override
    public boolean isOwn() {
      return _isOwn;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue value() {
      return _value;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M123 extends Message implements org.chromium.wip.protocol.inputruntime.PropertyPreviewValue {
    private String _name;
    private org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Type _type;
    private String _value;
    private org.chromium.wip.protocol.inputruntime.ObjectPreviewValue _valuePreview;
    private org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Subtype _subtype;

    public M123(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = readString(reader, name);
        }
        else if (name.equals("valuePreview")) {
          _valuePreview = new M121(reader);
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, name, org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Subtype.class);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.ObjectPreviewValue valuePreview() {
      return _valuePreview;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Type type() {
      return _type;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.PropertyPreviewValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M124 extends Message implements org.chromium.wip.protocol.inputruntime.RemoteObjectValue {
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Type _type;
    private java.lang.Object _value;
    private String _className;
    private org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Subtype _subtype;
    private String _description;
    private String _objectId;
    private org.chromium.wip.protocol.inputruntime.ObjectPreviewValue _preview;

    public M124(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, name, org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else if (name.equals("className")) {
          _className = readString(reader, name);
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, name, org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Subtype.class);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("objectId")) {
          _objectId = readString(reader, name);
        }
        else if (name.equals("preview")) {
          _preview = new M121(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String objectId() {
      return _objectId;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.ObjectPreviewValue preview() {
      return _preview;
    }

    @Override
    public java.lang.String className() {
      return _className;
    }

    @Override
    public java.lang.Object value() {
      return _value;
    }

    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue.Type type() {
      return _type;
    }
  }

  public static final class M125 extends LazyReadMessage implements org.jetbrains.wip.protocol.WipCommandResponse {
    private M129 lazy_0;
    private M127 lazy_1;
    private long _id;

    public M125(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("id")) {
          _id = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      inputReader = createValueReader(reader);
      reader.endObject();
    }

    @Override
    public M127 asError() {
      if (lazy_1 == null) {
        try {
          lazy_1 = M127.parse(new JsonReader(inputReader));
        }
        catch (IOException e) {
          throw new JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public long id() {
      return _id;
    }

    @Override
    public M129 asSuccess() {
      if (lazy_0 == null) {
        try {
          lazy_0 = M129.parse(new JsonReader(inputReader));
        }
        catch (IOException e) {
          throw new JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M126 extends LazyReadMessage implements org.jetbrains.wip.protocol.WipCommandResponse.Data {

    public M126(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }
    @Override
    public com.google.gson.stream.JsonReader getUnderlyingObject() {
return new JsonReader(inputReader);
    }}

  public static final class M127 extends Message implements org.jetbrains.wip.protocol.WipCommandResponse.Error {
    private org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo _error;
    private org.jetbrains.wip.protocol.WipCommandResponse.Data _result;

    private final org.jetbrains.wip.protocol.WipCommandResponse baseMessage;

    public M127(JsonReader reader, org.jetbrains.wip.protocol.WipCommandResponse baseMessage) throws IOException {
      this.baseMessage = baseMessage;

      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("error")) {
          _error = new M128(reader);
        }
        else if (name.equals("result")) {
          _result = new M126(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    public static M127 parse(JsonReader reader) throws IOException {
      return new M125(reader).asError();
    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse.Data data() {
      return _result;
    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo error() {
      return _error;
    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse getSuper() {
      return baseMessage;
    }}

  public static final class M128 extends Message implements org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo {
    private java.util.List<String> _data;
    private String _message;
    private long _code;

    public M128(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("data")) {
          _data = nextList(reader);
        }
        else if (name.equals("message")) {
          _message = readString(reader, name);
        }
        else if (name.equals("code")) {
          _code = readLong(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public long code() {
      return _code;
    }

    @Override
    public java.util.List<java.lang.String> data() {
      return _data;
    }

    @Override
    public java.lang.String message() {
      return _message;
    }
  }

  public static final class M129 extends Message implements org.jetbrains.wip.protocol.WipCommandResponse.Success {
    private org.jetbrains.wip.protocol.WipCommandResponse.Data _result;

    private final org.jetbrains.wip.protocol.WipCommandResponse baseMessage;

    public M129(JsonReader reader, org.jetbrains.wip.protocol.WipCommandResponse baseMessage) throws IOException {
      this.baseMessage = baseMessage;

      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M126(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    public static M129 parse(JsonReader reader) throws IOException {
      return new M125(reader).asSuccess();
    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse.Data data() {
      return _result;
    }

    @Override
    public void error() {

    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse getSuper() {
      return baseMessage;
    }}

  public static final class M130 extends Message implements org.jetbrains.wip.protocol.WipEvent {
    private String _method;
    private org.jetbrains.wip.protocol.WipEvent.Data _params;

    public M130(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("method")) {
          _method = readString(reader, name);
        }
        else if (name.equals("params")) {
          _params = new M131(reader);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String method() {
      return _method;
    }

    @Override
    public org.jetbrains.wip.protocol.WipEvent.Data data() {
      return _params;
    }
  }

  public static final class M131 extends LazyReadMessage implements org.jetbrains.wip.protocol.WipEvent.Data {

    public M131(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }
    @Override
    public com.google.gson.stream.JsonReader getUnderlyingObject() {
return new JsonReader(inputReader);
    }}

  public static final class M132 extends LazyReadMessage implements org.jetbrains.wip.protocol.WipTabList {
    private java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> lazy_0;

    public M132(JsonReader reader) throws IOException {
      reader.beginObject();
      inputReader = createValueReader(reader);
      reader.endObject();
    }

    @Override
    public java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> asTabList() {
      if (lazy_0 == null) {
        try {
          lazy_0 = readObjectArray(new JsonReader(inputReader), null, new M133F());
        }
        catch (IOException e) {
          throw new JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M133 extends Message implements org.jetbrains.wip.protocol.WipTabList.TabDescription {
    private String _url;
    private String _faviconUrl;
    private String _title;
    private String _thumbnailUrl;
    private String _devtoolsFrontendUrl;
    private String _webSocketDebuggerUrl;

    public M133(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, name);
        }
        else if (name.equals("faviconUrl")) {
          _faviconUrl = readString(reader, name);
        }
        else if (name.equals("title")) {
          _title = readString(reader, name);
        }
        else if (name.equals("thumbnailUrl")) {
          _thumbnailUrl = readString(reader, name);
        }
        else if (name.equals("devtoolsFrontendUrl")) {
          _devtoolsFrontendUrl = readString(reader, name);
        }
        else if (name.equals("webSocketDebuggerUrl")) {
          _webSocketDebuggerUrl = readString(reader, name);
        }
        else {
          skipValue(name, reader);
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String webSocketDebuggerUrl() {
      return _webSocketDebuggerUrl;
    }

    @Override
    public java.lang.String thumbnailUrl() {
      return _thumbnailUrl;
    }

    @Override
    public java.lang.String title() {
      return _title;
    }

    @Override
    public java.lang.String devtoolsFrontendUrl() {
      return _devtoolsFrontendUrl;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String faviconUrl() {
      return _faviconUrl;
    }
  }

  static final class M133F extends ObjectFactory<org.jetbrains.wip.protocol.WipTabList.TabDescription> {
    @Override
    public org.jetbrains.wip.protocol.WipTabList.TabDescription read(JsonReader reader) throws IOException {
      return new M133(reader);
    }
  }

  static final class M122F extends ObjectFactory<org.chromium.wip.protocol.inputruntime.PropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.inputruntime.PropertyDescriptorValue read(JsonReader reader) throws IOException {
      return new M122(reader);
    }
  }

  static final class M22F extends ObjectFactory<org.chromium.wip.protocol.inputdebugger.ScopeValue> {
    @Override
    public org.chromium.wip.protocol.inputdebugger.ScopeValue read(JsonReader reader) throws IOException {
      return new M22(reader);
    }
  }

  static final class M38F extends ObjectFactory<org.chromium.wip.protocol.inputdom.EventListenerValue> {
    @Override
    public org.chromium.wip.protocol.inputdom.EventListenerValue read(JsonReader reader) throws IOException {
      return new M38(reader);
    }
  }

  static final class M96F extends ObjectFactory<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue> {
    @Override
    public org.chromium.wip.protocol.inputpage.FrameResourceTreeValue read(JsonReader reader) throws IOException {
      return new M96(reader);
    }
  }

  static final class M97F extends ObjectFactory<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue.Resources> {
    @Override
    public org.chromium.wip.protocol.inputpage.FrameResourceTreeValue.Resources read(JsonReader reader) throws IOException {
      return new M97(reader);
    }
  }

  static final class M113F extends ObjectFactory<org.chromium.wip.protocol.inputpage.SearchMatchValue> {
    @Override
    public org.chromium.wip.protocol.inputpage.SearchMatchValue read(JsonReader reader) throws IOException {
      return new M113(reader);
    }
  }

  static final class M124F extends ObjectFactory<org.chromium.wip.protocol.inputruntime.RemoteObjectValue> {
    @Override
    public org.chromium.wip.protocol.inputruntime.RemoteObjectValue read(JsonReader reader) throws IOException {
      return new M124(reader);
    }
  }

  static final class M91F extends ObjectFactory<org.chromium.wip.protocol.inputpage.CookieValue> {
    @Override
    public org.chromium.wip.protocol.inputpage.CookieValue read(JsonReader reader) throws IOException {
      return new M91(reader);
    }
  }

  static final class M120F extends ObjectFactory<org.chromium.wip.protocol.inputruntime.InternalPropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.inputruntime.InternalPropertyDescriptorValue read(JsonReader reader) throws IOException {
      return new M120(reader);
    }
  }

  static final class M0F extends ObjectFactory<org.chromium.wip.protocol.inputconsole.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.inputconsole.CallFrameValue read(JsonReader reader) throws IOException {
      return new M0(reader);
    }
  }

  static final class M6F extends ObjectFactory<org.chromium.wip.protocol.inputdebugger.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.inputdebugger.CallFrameValue read(JsonReader reader) throws IOException {
      return new M6(reader);
    }
  }

  static final class M123F extends ObjectFactory<org.chromium.wip.protocol.inputruntime.PropertyPreviewValue> {
    @Override
    public org.chromium.wip.protocol.inputruntime.PropertyPreviewValue read(JsonReader reader) throws IOException {
      return new M123(reader);
    }
  }

  static final class M114F extends ObjectFactory<org.chromium.wip.protocol.inputpage.SearchResultValue> {
    @Override
    public org.chromium.wip.protocol.inputpage.SearchResultValue read(JsonReader reader) throws IOException {
      return new M114(reader);
    }
  }

  static final class M46F extends ObjectFactory<org.chromium.wip.protocol.inputdom.NodeValue> {
    @Override
    public org.chromium.wip.protocol.inputdom.NodeValue read(JsonReader reader) throws IOException {
      return new M46(reader);
    }
  }

  static final class M15F extends ObjectFactory<org.chromium.wip.protocol.inputdebugger.LocationValue> {
    @Override
    public org.chromium.wip.protocol.inputdebugger.LocationValue read(JsonReader reader) throws IOException {
      return new M15(reader);
    }
  }

}