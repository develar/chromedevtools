// This is a generated source.
package org.chromium.wip.protocol;

import org.jetbrains.jsonProtocol.*;

import static org.jetbrains.jsonProtocol.JsonReaders.*;

public final class WipProtocolReaderImpl implements org.jetbrains.wip.protocol.WipProtocolReader {
  @Override
  public org.chromium.wip.protocol.debugger.SearchInContentResult readDebuggerSearchInContentResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M25(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanOverrideDeviceMetricsResult readPageCanOverrideDeviceMetricsResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M85(reader);
  }

  @Override
  public org.chromium.wip.protocol.runtime.CallFunctionOnResult readRuntimeCallFunctionOnResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M115(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData readNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M82(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.GetResourceContentResult readPageGetResourceContentResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M104(reader);
  }

  @Override
  public org.chromium.wip.protocol.timeline.CanMonitorMainThreadResult readTimelineCanMonitorMainThreadResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M125(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.ScriptsEnabledEventData readPageScriptsEnabledEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M110(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.DocumentUpdatedEventData readDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M37(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanShowFPSCounterResult readPageCanShowFPSCounterResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M89(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.GlobalObjectClearedEventData readDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M14(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketFrameReceivedEventData readNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M76(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ShadowRootPoppedEventData readDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M55(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.RequestServedFromMemoryCacheEventData readNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M67(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.GetScriptExecutionStatusResult readPageGetScriptExecutionStatusResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M106(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.AttributeRemovedEventData readDOMAttributeRemovedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M32(reader);
  }

  @Override
  public org.chromium.wip.protocol.console.MessageRepeatCountUpdatedEventData readConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M3(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.ResumedEventData readDebuggerResumedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M20(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.DomContentEventFiredEventData readPageDomContentEventFiredEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M92(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.SetNodeNameResult readDOMSetNodeNameResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M54(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.CanClearBrowserCacheResult readNetworkCanClearBrowserCacheResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M58(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.MoveToResult readDOMMoveToResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M45(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameStartedLoadingEventData readPageFrameStartedLoadingEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M99(reader);
  }

  @Override
  public org.chromium.wip.protocol.runtime.RemoteObjectValue parseRemoteObjectValue(com.google.gson.stream.JsonReaderEx reader) {
    return new M124(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameScheduledNavigationEventData readPageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M98(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketClosedEventData readNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M73(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.GetResponseBodyResult readNetworkGetResponseBodyResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M61(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanOverrideGeolocationResult readPageCanOverrideGeolocationResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M87(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.AttributeModifiedEventData readDOMAttributeModifiedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M31(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameDetachedEventData readPageFrameDetachedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M94(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.GetCompositingBordersVisibleResult readPageGetCompositingBordersVisibleResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M102(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.SetChildNodesEventData readDOMSetChildNodesEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M53(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData readDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M23(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData readNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M79(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanContinuouslyPaintResult readPageCanContinuouslyPaintResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M84(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanOverrideDeviceOrientationResult readPageCanOverrideDeviceOrientationResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M86(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.SetBreakpointByUrlResult readDebuggerSetBreakpointByUrlResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M26(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.LoadEventFiredEventData readPageLoadEventFiredEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M109(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipTabList parseTabList(com.google.gson.stream.JsonReaderEx reader) {
    return new M138(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameNavigatedEventData readPageFrameNavigatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M95(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.IncomingMessage readIncomingMessage(com.google.gson.stream.JsonReaderEx reader) {
    return new M135(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketFrameSentEventData readNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M77(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.RequestServedFromCacheEventData readNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M66(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CaptureScreenshotResult readPageCaptureScreenshotResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M90(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.CompileScriptResult readDebuggerCompileScriptResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M9(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.CharacterDataModifiedEventData readDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M33(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketFrameErrorEventData readNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M75(reader);
  }

  @Override
  public org.chromium.wip.protocol.console.MessageAddedEventData readConsoleMessageAddedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M2(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.ResponseReceivedEventData readNetworkResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M71(reader);
  }

  @Override
  public org.chromium.wip.protocol.runtime.ExecutionContextCreatedEventData readRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M117(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.QuerySelectorResult readDOMQuerySelectorResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M50(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.GetAttributesResult readDOMGetAttributesResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M39(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.SearchInResourceResult readPageSearchInResourceResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M111(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.PerformSearchResult readDOMPerformSearchResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M47(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameClearedScheduledNavigationEventData readPageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M93(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.DataReceivedEventData readNetworkDataReceivedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M60(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ChildNodeCountUpdatedEventData readDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M34(reader);
  }

  @Override
  public org.chromium.wip.protocol.runtime.EvaluateResult readRuntimeEvaluateResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M116(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.LoadingFailedEventData readNetworkLoadingFailedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M64(reader);
  }

  @Override
  public org.chromium.wip.protocol.timeline.EventRecordedEventData readTimelineEventRecordedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M126(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.CanShowDebugBordersResult readPageCanShowDebugBordersResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M88(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.RequestNodeResult readDOMRequestNodeResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M51(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.SupportsSeparateScriptCompilationAndExecutionResult readDebuggerSupportsSeparateScriptCompilationAndExecutionResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M30(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ResolveNodeResult readDOMResolveNodeResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M52(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.RunScriptResult readDebuggerRunScriptResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M21(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.GetOuterHTMLResult readDOMGetOuterHTMLResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M42(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.WebSocketCreatedEventData readNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M74(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ChildNodeRemovedEventData readDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M36(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.SetScriptSourceResult readDebuggerSetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M28(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ChildNodeInsertedEventData readDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M35(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.ScriptParsedEventData readDebuggerScriptParsedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M24(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.SearchInResourcesResult readPageSearchInResourcesResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M112(reader);
  }

  @Override
  public org.chromium.wip.protocol.timeline.SupportsFrameInstrumentationResult readTimelineSupportsFrameInstrumentationResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M127(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.CanSetScriptSourceResult readDebuggerCanSetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M7(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.QuerySelectorAllResult readDOMQuerySelectorAllResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M49(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.ShadowRootPushedEventData readDOMShadowRootPushedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M56(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.GetResourceTreeResult readPageGetResourceTreeResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M105(reader);
  }

  @Override
  public org.chromium.wip.protocol.runtime.GetPropertiesResult readRuntimeGetPropertiesResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M119(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.CausesRecompilationResult readDebuggerCausesRecompilationResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M8(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.GetFunctionDetailsResult readDebuggerGetFunctionDetailsResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M12(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.RestartFrameResult readDebuggerRestartFrameResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M18(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.GetScriptSourceResult readDebuggerGetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M13(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.SetBreakpointResult readDebuggerSetBreakpointResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M27(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.EvaluateOnCallFrameResult readDebuggerEvaluateOnCallFrameResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M10(reader);
  }

  @Override
  public org.chromium.wip.protocol.console.MessagesClearedEventData readConsoleMessagesClearedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M4(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData readDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M44(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.LoadingFinishedEventData readNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M65(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.AddScriptToEvaluateOnLoadResult readPageAddScriptToEvaluateOnLoadResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M83(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.GetDocumentResult readDOMGetDocumentResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M40(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.JavascriptDialogClosedEventData readPageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M107(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.JavascriptDialogOpeningEventData readPageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M108(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.PushNodeByPathToFrontendResult readDOMPushNodeByPathToFrontendResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M48(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.RequestWillBeSentEventData readNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M69(reader);
  }

  @Override
  public org.chromium.wip.protocol.network.CanClearBrowserCookiesResult readNetworkCanClearBrowserCookiesResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M59(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.GetCookiesResult readPageGetCookiesResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M103(reader);
  }

  @Override
  public org.chromium.wip.protocol.page.FrameStoppedLoadingEventData readPageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M100(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.GetSearchResultsResult readDOMGetSearchResultsResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M43(reader);
  }

  @Override
  public org.chromium.wip.protocol.dom.GetEventListenersForNodeResult readDOMGetEventListenersForNodeResult(com.google.gson.stream.JsonReaderEx reader) {
    return new M41(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.PausedEventData readDebuggerPausedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M16(reader);
  }

  @Override
  public org.chromium.wip.protocol.debugger.BreakpointResolvedEventData readDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReaderEx reader) {
    return new M5(reader);
  }

  public static final class M0 implements org.chromium.wip.protocol.console.CallFrameValue {
    private int _lineNumber;
    private String _url;
    private String _functionName;
    private int _columnNumber;

    public M0(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readInt(reader, "lineNumber");
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("functionName")) {
          _functionName = readString(reader, "functionName");
        }
        else if (name.equals("columnNumber")) {
          _columnNumber = readInt(reader, "columnNumber");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int lineNumber() {
      return _lineNumber;
    }

    @Override
    public java.lang.String functionName() {
      return _functionName;
    }

    @Override
    public int columnNumber() {
      return _columnNumber;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }
  }

  public static final class M1 implements org.chromium.wip.protocol.console.ConsoleMessageValue {
    private org.chromium.wip.protocol.console.ConsoleMessageValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.console.CallFrameValue> _stackTrace;
    private String _url;
    private String _text;
    private org.chromium.wip.protocol.console.ConsoleMessageValue.Source _source;
    private org.chromium.wip.protocol.console.ConsoleMessageValue.Level _level;
    private int _line;
    private int _repeatCount;
    private java.util.List<org.chromium.wip.protocol.runtime.RemoteObjectValue> _parameters;
    private String _networkRequestId;

    public M1(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.console.ConsoleMessageValue.Type.class);
        }
        else if (name.equals("stackTrace")) {
          _stackTrace = readObjectArray(reader, "stackTrace", new M0F(), true);
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("text")) {
          _text = readString(reader, "text");
        }
        else if (name.equals("source")) {
          _source = readEnum(reader, "source", org.chromium.wip.protocol.console.ConsoleMessageValue.Source.class);
        }
        else if (name.equals("level")) {
          _level = readEnum(reader, "level", org.chromium.wip.protocol.console.ConsoleMessageValue.Level.class);
        }
        else if (name.equals("line")) {
          _line = readInt(reader, "line");
        }
        else if (name.equals("repeatCount")) {
          _repeatCount = readInt(reader, "repeatCount");
        }
        else if (name.equals("parameters")) {
          _parameters = readObjectArray(reader, "parameters", new M124F(), true);
        }
        else if (name.equals("networkRequestId")) {
          _networkRequestId = readString(reader, "networkRequestId");
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
    public int repeatCount() {
      return _repeatCount;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.runtime.RemoteObjectValue> parameters() {
      return _parameters;
    }

    @Override
    public org.chromium.wip.protocol.console.ConsoleMessageValue.Type type() {
      return _type;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.console.CallFrameValue> stackTrace() {
      return _stackTrace;
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
    public org.chromium.wip.protocol.console.ConsoleMessageValue.Level level() {
      return _level;
    }

    @Override
    public org.chromium.wip.protocol.console.ConsoleMessageValue.Source source() {
      return _source;
    }
  }

  public static final class M2 implements org.chromium.wip.protocol.console.MessageAddedEventData {
    private org.chromium.wip.protocol.console.ConsoleMessageValue _message;

    public M2(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("message")) {
          _message = new M1(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.console.ConsoleMessageValue message() {
      return _message;
    }
  }

  public static final class M3 implements org.chromium.wip.protocol.console.MessageRepeatCountUpdatedEventData {
    private int _count;

    public M3(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("count")) {
          _count = readInt(reader, "count");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int count() {
      return _count;
    }
  }

  public static final class M4 implements org.chromium.wip.protocol.console.MessagesClearedEventData {

    public M4(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M5 implements org.chromium.wip.protocol.debugger.BreakpointResolvedEventData {
    private org.chromium.wip.protocol.debugger.LocationValue _location;
    private String _breakpointId;

    public M5(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, "breakpointId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }

    @Override
    public org.chromium.wip.protocol.debugger.LocationValue location() {
      return _location;
    }
  }

  public static final class M6 implements org.chromium.wip.protocol.debugger.CallFrameValue {
    private org.chromium.wip.protocol.debugger.LocationValue _location;
    private String _functionName;
    private String _callFrameId;
    private java.util.List<org.chromium.wip.protocol.debugger.ScopeValue> _scopeChain;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _this;

    public M6(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("functionName")) {
          _functionName = readString(reader, "functionName");
        }
        else if (name.equals("callFrameId")) {
          _callFrameId = readString(reader, "callFrameId");
        }
        else if (name.equals("scopeChain")) {
          _scopeChain = readObjectArray(reader, "scopeChain", new M22F(), false);
        }
        else if (name.equals("this")) {
          _this = new M124(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.LocationValue location() {
      return _location;
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue getThis() {
      return _this;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }

    @Override
    public java.lang.String callFrameId() {
      return _callFrameId;
    }

    @Override
    public java.lang.String functionName() {
      return _functionName;
    }
  }

  public static final class M7 implements org.chromium.wip.protocol.debugger.CanSetScriptSourceResult {
    private boolean _result;

    public M7(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M8 implements org.chromium.wip.protocol.debugger.CausesRecompilationResult {
    private boolean _result;

    public M8(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M9 implements org.chromium.wip.protocol.debugger.CompileScriptResult {
    private String _scriptId;
    private String _syntaxErrorMessage;

    public M9(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("scriptId")) {
          _scriptId = readString(reader, "scriptId");
        }
        else if (name.equals("syntaxErrorMessage")) {
          _syntaxErrorMessage = readString(reader, "syntaxErrorMessage");
        }
        else {
          reader.skipValue();
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

  public static final class M10 implements org.chromium.wip.protocol.debugger.EvaluateOnCallFrameResult {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M10(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, "wasThrown");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M11 implements org.chromium.wip.protocol.debugger.FunctionDetailsValue {
    private String _name;
    private String _displayName;
    private org.chromium.wip.protocol.debugger.LocationValue _location;
    private java.util.List<org.chromium.wip.protocol.debugger.ScopeValue> _scopeChain;
    private String _inferredName;

    public M11(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("displayName")) {
          _displayName = readString(reader, "displayName");
        }
        else if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("scopeChain")) {
          _scopeChain = readObjectArray(reader, "scopeChain", new M22F(), true);
        }
        else if (name.equals("inferredName")) {
          _inferredName = readString(reader, "inferredName");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public org.chromium.wip.protocol.debugger.LocationValue location() {
      return _location;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }

    @Override
    public java.lang.String displayName() {
      return _displayName;
    }
  }

  public static final class M12 implements org.chromium.wip.protocol.debugger.GetFunctionDetailsResult {
    private org.chromium.wip.protocol.debugger.FunctionDetailsValue _details;

    public M12(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("details")) {
          _details = new M11(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.FunctionDetailsValue details() {
      return _details;
    }
  }

  public static final class M13 implements org.chromium.wip.protocol.debugger.GetScriptSourceResult {
    private String _scriptSource;

    public M13(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("scriptSource")) {
          _scriptSource = readString(reader, "scriptSource");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String scriptSource() {
      return _scriptSource;
    }
  }

  public static final class M14 implements org.chromium.wip.protocol.debugger.GlobalObjectClearedEventData {

    public M14(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M15 implements org.chromium.wip.protocol.debugger.LocationValue {
    private int _lineNumber;
    private int _columnNumber;
    private String _scriptId;

    public M15(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readInt(reader, "lineNumber");
        }
        else if (name.equals("columnNumber")) {
          _columnNumber = readInt(reader, "columnNumber");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readString(reader, "scriptId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int columnNumber() {
      return _columnNumber;
    }

    @Override
    public int lineNumber() {
      return _lineNumber;
    }

    @Override
    public java.lang.String scriptId() {
      return _scriptId;
    }
  }

  public static final class M16 implements org.chromium.wip.protocol.debugger.PausedEventData {
    private org.chromium.wip.protocol.debugger.PausedEventData.Data _data;
    private java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> _callFrames;
    private org.chromium.wip.protocol.debugger.PausedEventData.Reason _reason;

    public M16(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("data")) {
          _data = new M17(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, "callFrames", new M6F(), false);
        }
        else if (name.equals("reason")) {
          _reason = readEnum(reader, "reason", org.chromium.wip.protocol.debugger.PausedEventData.Reason.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.PausedEventData.Reason reason() {
      return _reason;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }

    @Override
    public org.chromium.wip.protocol.debugger.PausedEventData.Data data() {
      return _data;
    }
  }

  public static final class M18 implements org.chromium.wip.protocol.debugger.RestartFrameResult {
    private org.chromium.wip.protocol.debugger.RestartFrameResult.Result _result;
    private java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> _callFrames;

    public M18(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M19(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, "callFrames", new M6F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.RestartFrameResult.Result result() {
      return _result;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }
  }

  public static final class M20 implements org.chromium.wip.protocol.debugger.ResumedEventData {

    public M20(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M21 implements org.chromium.wip.protocol.debugger.RunScriptResult {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M21(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, "wasThrown");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M22 implements org.chromium.wip.protocol.debugger.ScopeValue {
    private org.chromium.wip.protocol.debugger.ScopeValue.Type _type;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _object;

    public M22(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.debugger.ScopeValue.Type.class);
        }
        else if (name.equals("object")) {
          _object = new M124(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue object() {
      return _object;
    }

    @Override
    public org.chromium.wip.protocol.debugger.ScopeValue.Type type() {
      return _type;
    }
  }

  public static final class M23 implements org.chromium.wip.protocol.debugger.ScriptFailedToParseEventData {
    private String _url;
    private String _scriptSource;
    private int _startLine;
    private int _errorLine;
    private String _errorMessage;

    public M23(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("scriptSource")) {
          _scriptSource = readString(reader, "scriptSource");
        }
        else if (name.equals("startLine")) {
          _startLine = readInt(reader, "startLine");
        }
        else if (name.equals("errorLine")) {
          _errorLine = readInt(reader, "errorLine");
        }
        else if (name.equals("errorMessage")) {
          _errorMessage = readString(reader, "errorMessage");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int startLine() {
      return _startLine;
    }

    @Override
    public java.lang.String errorMessage() {
      return _errorMessage;
    }

    @Override
    public java.lang.String scriptSource() {
      return _scriptSource;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public int errorLine() {
      return _errorLine;
    }
  }

  public static final class M24 implements org.chromium.wip.protocol.debugger.ScriptParsedEventData {
    private String _url;
    private String _scriptId;
    private int _startLine;
    private int _startColumn;
    private int _endLine;
    private int _endColumn;
    private boolean _isContentScript;
    private String _sourceMapURL;
    private boolean _hasSourceURL;

    public M24(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("scriptId")) {
          _scriptId = readString(reader, "scriptId");
        }
        else if (name.equals("startLine")) {
          _startLine = readInt(reader, "startLine");
        }
        else if (name.equals("startColumn")) {
          _startColumn = readInt(reader, "startColumn");
        }
        else if (name.equals("endLine")) {
          _endLine = readInt(reader, "endLine");
        }
        else if (name.equals("endColumn")) {
          _endColumn = readInt(reader, "endColumn");
        }
        else if (name.equals("isContentScript")) {
          _isContentScript = readBoolean(reader, "isContentScript");
        }
        else if (name.equals("sourceMapURL")) {
          _sourceMapURL = readString(reader, "sourceMapURL");
        }
        else if (name.equals("hasSourceURL")) {
          _hasSourceURL = readBoolean(reader, "hasSourceURL");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String sourceMapURL() {
      return _sourceMapURL;
    }

    @Override
    public int endLine() {
      return _endLine;
    }

    @Override
    public boolean hasSourceURL() {
      return _hasSourceURL;
    }

    @Override
    public int startLine() {
      return _startLine;
    }

    @Override
    public boolean isContentScript() {
      return _isContentScript;
    }

    @Override
    public int endColumn() {
      return _endColumn;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public int startColumn() {
      return _startColumn;
    }

    @Override
    public java.lang.String scriptId() {
      return _scriptId;
    }
  }

  public static final class M25 implements org.chromium.wip.protocol.debugger.SearchInContentResult {
    private java.util.List<org.chromium.wip.protocol.page.SearchMatchValue> _result;

    public M25(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readObjectArray(reader, "result", new M113F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M26 implements org.chromium.wip.protocol.debugger.SetBreakpointByUrlResult {
    private String _breakpointId;
    private java.util.List<org.chromium.wip.protocol.debugger.LocationValue> _locations;

    public M26(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, "breakpointId");
        }
        else if (name.equals("locations")) {
          _locations = readObjectArray(reader, "locations", new M15F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.LocationValue> locations() {
      return _locations;
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }
  }

  public static final class M27 implements org.chromium.wip.protocol.debugger.SetBreakpointResult {
    private String _breakpointId;
    private org.chromium.wip.protocol.debugger.LocationValue _actualLocation;

    public M27(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("breakpointId")) {
          _breakpointId = readString(reader, "breakpointId");
        }
        else if (name.equals("actualLocation")) {
          _actualLocation = new M15(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.LocationValue actualLocation() {
      return _actualLocation;
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }
  }

  public static final class M28 implements org.chromium.wip.protocol.debugger.SetScriptSourceResult {
    private org.chromium.wip.protocol.debugger.SetScriptSourceResult.Result _result;
    private java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> _callFrames;

    public M28(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M29(reader);
        }
        else if (name.equals("callFrames")) {
          _callFrames = readObjectArray(reader, "callFrames", new M6F(), true);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.debugger.SetScriptSourceResult.Result result() {
      return _result;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }
  }

  public static final class M30 implements org.chromium.wip.protocol.debugger.SupportsSeparateScriptCompilationAndExecutionResult {
    private boolean _result;

    public M30(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M31 implements org.chromium.wip.protocol.dom.AttributeModifiedEventData {
    private String _name;
    private String _value;
    private int _nodeId;

    public M31(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
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
    public int nodeId() {
      return _nodeId;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }
  }

  public static final class M32 implements org.chromium.wip.protocol.dom.AttributeRemovedEventData {
    private String _name;
    private int _nodeId;

    public M32(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M33 implements org.chromium.wip.protocol.dom.CharacterDataModifiedEventData {
    private int _nodeId;
    private String _characterData;

    public M33(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else if (name.equals("characterData")) {
          _characterData = readString(reader, "characterData");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String characterData() {
      return _characterData;
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M34 implements org.chromium.wip.protocol.dom.ChildNodeCountUpdatedEventData {
    private int _nodeId;
    private int _childNodeCount;

    public M34(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else if (name.equals("childNodeCount")) {
          _childNodeCount = readInt(reader, "childNodeCount");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int childNodeCount() {
      return _childNodeCount;
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M35 implements org.chromium.wip.protocol.dom.ChildNodeInsertedEventData {
    private org.chromium.wip.protocol.dom.NodeValue _node;
    private int _parentNodeId;
    private int _previousNodeId;

    public M35(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("node")) {
          _node = new M46(reader);
        }
        else if (name.equals("parentNodeId")) {
          _parentNodeId = readInt(reader, "parentNodeId");
        }
        else if (name.equals("previousNodeId")) {
          _previousNodeId = readInt(reader, "previousNodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int previousNodeId() {
      return _previousNodeId;
    }

    @Override
    public int parentNodeId() {
      return _parentNodeId;
    }

    @Override
    public org.chromium.wip.protocol.dom.NodeValue node() {
      return _node;
    }
  }

  public static final class M36 implements org.chromium.wip.protocol.dom.ChildNodeRemovedEventData {
    private int _nodeId;
    private int _parentNodeId;

    public M36(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else if (name.equals("parentNodeId")) {
          _parentNodeId = readInt(reader, "parentNodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }

    @Override
    public int parentNodeId() {
      return _parentNodeId;
    }
  }

  public static final class M37 implements org.chromium.wip.protocol.dom.DocumentUpdatedEventData {

    public M37(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M38 implements org.chromium.wip.protocol.dom.EventListenerValue {
    private String _type;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _handler;
    private org.chromium.wip.protocol.debugger.LocationValue _location;
    private int _nodeId;
    private boolean _useCapture;
    private boolean _isAttribute;
    private String _handlerBody;
    private String _sourceName;

    public M38(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("handler")) {
          _handler = new M124(reader);
        }
        else if (name.equals("location")) {
          _location = new M15(reader);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else if (name.equals("useCapture")) {
          _useCapture = readBoolean(reader, "useCapture");
        }
        else if (name.equals("isAttribute")) {
          _isAttribute = readBoolean(reader, "isAttribute");
        }
        else if (name.equals("handlerBody")) {
          _handlerBody = readString(reader, "handlerBody");
        }
        else if (name.equals("sourceName")) {
          _sourceName = readString(reader, "sourceName");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
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
    public java.lang.String sourceName() {
      return _sourceName;
    }

    @Override
    public boolean isAttribute() {
      return _isAttribute;
    }

    @Override
    public org.chromium.wip.protocol.debugger.LocationValue location() {
      return _location;
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue handler() {
      return _handler;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M39 implements org.chromium.wip.protocol.dom.GetAttributesResult {
    private java.util.List<String> _attributes;

    public M39(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("attributes")) {
          _attributes = nextList(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<java.lang.String> attributes() {
      return _attributes;
    }
  }

  public static final class M40 implements org.chromium.wip.protocol.dom.GetDocumentResult {
    private org.chromium.wip.protocol.dom.NodeValue _root;

    public M40(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("root")) {
          _root = new M46(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.dom.NodeValue root() {
      return _root;
    }
  }

  public static final class M41 implements org.chromium.wip.protocol.dom.GetEventListenersForNodeResult {
    private java.util.List<org.chromium.wip.protocol.dom.EventListenerValue> _listeners;

    public M41(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("listeners")) {
          _listeners = readObjectArray(reader, "listeners", new M38F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.dom.EventListenerValue> listeners() {
      return _listeners;
    }
  }

  public static final class M42 implements org.chromium.wip.protocol.dom.GetOuterHTMLResult {
    private String _outerHTML;

    public M42(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("outerHTML")) {
          _outerHTML = readString(reader, "outerHTML");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String outerHTML() {
      return _outerHTML;
    }
  }

  public static final class M43 implements org.chromium.wip.protocol.dom.GetSearchResultsResult {
    private int[] _nodeIds;

    public M43(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeIds")) {
          _nodeIds = readIntArray(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M44 implements org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData {
    private int[] _nodeIds;

    public M44(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeIds")) {
          _nodeIds = readIntArray(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M45 implements org.chromium.wip.protocol.dom.MoveToResult {
    private int _nodeId;

    public M45(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M46 implements org.chromium.wip.protocol.dom.NodeValue {
    private String _name;
    private String _value;
    private java.util.List<String> _attributes;
    private int _nodeId;
    private int _childNodeCount;
    private int _nodeType;
    private String _nodeName;
    private String _localName;
    private String _nodeValue;
    private java.util.List<org.chromium.wip.protocol.dom.NodeValue> _children;
    private String _documentURL;
    private String _baseURL;
    private String _publicId;
    private String _systemId;
    private String _internalSubset;
    private String _xmlVersion;
    private String _frameId;
    private org.chromium.wip.protocol.dom.NodeValue _contentDocument;
    private java.util.List<org.chromium.wip.protocol.dom.NodeValue> _shadowRoots;
    private org.chromium.wip.protocol.dom.NodeValue _templateContent;

    public M46(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("attributes")) {
          _attributes = nextList(reader);
        }
        else if (name.equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else if (name.equals("childNodeCount")) {
          _childNodeCount = readInt(reader, "childNodeCount");
        }
        else if (name.equals("nodeType")) {
          _nodeType = readInt(reader, "nodeType");
        }
        else if (name.equals("nodeName")) {
          _nodeName = readString(reader, "nodeName");
        }
        else if (name.equals("localName")) {
          _localName = readString(reader, "localName");
        }
        else if (name.equals("nodeValue")) {
          _nodeValue = readString(reader, "nodeValue");
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M46F(), true);
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, "documentURL");
        }
        else if (name.equals("baseURL")) {
          _baseURL = readString(reader, "baseURL");
        }
        else if (name.equals("publicId")) {
          _publicId = readString(reader, "publicId");
        }
        else if (name.equals("systemId")) {
          _systemId = readString(reader, "systemId");
        }
        else if (name.equals("internalSubset")) {
          _internalSubset = readString(reader, "internalSubset");
        }
        else if (name.equals("xmlVersion")) {
          _xmlVersion = readString(reader, "xmlVersion");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("contentDocument")) {
          _contentDocument = new M46(reader);
        }
        else if (name.equals("shadowRoots")) {
          _shadowRoots = readObjectArray(reader, "shadowRoots", new M46F(), true);
        }
        else if (name.equals("templateContent")) {
          _templateContent = new M46(reader);
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
    public java.lang.String documentURL() {
      return _documentURL;
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }

    @Override
    public org.chromium.wip.protocol.dom.NodeValue contentDocument() {
      return _contentDocument;
    }

    @Override
    public int nodeType() {
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
    public org.chromium.wip.protocol.dom.NodeValue templateContent() {
      return _templateContent;
    }

    @Override
    public java.lang.String internalSubset() {
      return _internalSubset;
    }

    @Override
    public java.lang.String localName() {
      return _localName;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public int childNodeCount() {
      return _childNodeCount;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.dom.NodeValue> shadowRoots() {
      return _shadowRoots;
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
    public java.lang.String xmlVersion() {
      return _xmlVersion;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.dom.NodeValue> children() {
      return _children;
    }
  }

  public static final class M47 implements org.chromium.wip.protocol.dom.PerformSearchResult {
    private String _searchId;
    private int _resultCount;

    public M47(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("searchId")) {
          _searchId = readString(reader, "searchId");
        }
        else if (name.equals("resultCount")) {
          _resultCount = readInt(reader, "resultCount");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int resultCount() {
      return _resultCount;
    }

    @Override
    public java.lang.String searchId() {
      return _searchId;
    }
  }

  public static final class M48 implements org.chromium.wip.protocol.dom.PushNodeByPathToFrontendResult {
    private int _nodeId;

    public M48(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M49 implements org.chromium.wip.protocol.dom.QuerySelectorAllResult {
    private int[] _nodeIds;

    public M49(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeIds")) {
          _nodeIds = readIntArray(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] nodeIds() {
      return _nodeIds;
    }
  }

  public static final class M50 implements org.chromium.wip.protocol.dom.QuerySelectorResult {
    private int _nodeId;

    public M50(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M51 implements org.chromium.wip.protocol.dom.RequestNodeResult {
    private int _nodeId;

    public M51(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M52 implements org.chromium.wip.protocol.dom.ResolveNodeResult {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _object;

    public M52(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("object")) {
          _object = new M124(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue object() {
      return _object;
    }
  }

  public static final class M53 implements org.chromium.wip.protocol.dom.SetChildNodesEventData {
    private int _parentId;
    private java.util.List<org.chromium.wip.protocol.dom.NodeValue> _nodes;

    public M53(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("parentId")) {
          _parentId = readInt(reader, "parentId");
        }
        else if (name.equals("nodes")) {
          _nodes = readObjectArray(reader, "nodes", new M46F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int parentId() {
      return _parentId;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.dom.NodeValue> nodes() {
      return _nodes;
    }
  }

  public static final class M54 implements org.chromium.wip.protocol.dom.SetNodeNameResult {
    private int _nodeId;

    public M54(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("nodeId")) {
          _nodeId = readInt(reader, "nodeId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int nodeId() {
      return _nodeId;
    }
  }

  public static final class M55 implements org.chromium.wip.protocol.dom.ShadowRootPoppedEventData {
    private int _hostId;
    private int _rootId;

    public M55(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("hostId")) {
          _hostId = readInt(reader, "hostId");
        }
        else if (name.equals("rootId")) {
          _rootId = readInt(reader, "rootId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int rootId() {
      return _rootId;
    }

    @Override
    public int hostId() {
      return _hostId;
    }
  }

  public static final class M56 implements org.chromium.wip.protocol.dom.ShadowRootPushedEventData {
    private org.chromium.wip.protocol.dom.NodeValue _root;
    private int _hostId;

    public M56(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("root")) {
          _root = new M46(reader);
        }
        else if (name.equals("hostId")) {
          _hostId = readInt(reader, "hostId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.dom.NodeValue root() {
      return _root;
    }

    @Override
    public int hostId() {
      return _hostId;
    }
  }

  public static final class M57 implements org.chromium.wip.protocol.network.CachedResourceValue {
    private org.chromium.wip.protocol.page.ResourceTypeEnum _type;
    private String _url;
    private org.chromium.wip.protocol.network.ResponseValue _response;
    private double _bodySize;

    public M57(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.page.ResourceTypeEnum.class);
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("response")) {
          _response = new M72(reader);
        }
        else if (name.equals("bodySize")) {
          _bodySize = readDouble(reader, "bodySize");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public org.chromium.wip.protocol.page.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public double bodySize() {
      return _bodySize;
    }

    @Override
    public org.chromium.wip.protocol.network.ResponseValue response() {
      return _response;
    }
  }

  public static final class M58 implements org.chromium.wip.protocol.network.CanClearBrowserCacheResult {
    private boolean _result;

    public M58(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M59 implements org.chromium.wip.protocol.network.CanClearBrowserCookiesResult {
    private boolean _result;

    public M59(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M60 implements org.chromium.wip.protocol.network.DataReceivedEventData {
    private double _timestamp;
    private String _requestId;
    private int _dataLength;
    private int _encodedDataLength;

    public M60(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("dataLength")) {
          _dataLength = readInt(reader, "dataLength");
        }
        else if (name.equals("encodedDataLength")) {
          _encodedDataLength = readInt(reader, "encodedDataLength");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public int encodedDataLength() {
      return _encodedDataLength;
    }

    @Override
    public int dataLength() {
      return _dataLength;
    }
  }

  public static final class M61 implements org.chromium.wip.protocol.network.GetResponseBodyResult {
    private String _body;
    private boolean _base64Encoded;

    public M61(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("body")) {
          _body = readString(reader, "body");
        }
        else if (name.equals("base64Encoded")) {
          _base64Encoded = readBoolean(reader, "base64Encoded");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String body() {
      return _body;
    }

    @Override
    public boolean base64Encoded() {
      return _base64Encoded;
    }
  }

  public static final class M62 implements org.chromium.wip.protocol.network.HeadersValue {

    public M62(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M63 implements org.chromium.wip.protocol.network.InitiatorValue {
    private org.chromium.wip.protocol.network.InitiatorValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.console.CallFrameValue> _stackTrace;
    private double _lineNumber;
    private String _url;

    public M63(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.network.InitiatorValue.Type.class);
        }
        else if (name.equals("stackTrace")) {
          _stackTrace = readObjectArray(reader, "stackTrace", new M0F(), true);
        }
        else if (name.equals("lineNumber")) {
          _lineNumber = readDouble(reader, "lineNumber");
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.InitiatorValue.Type type() {
      return _type;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.console.CallFrameValue> stackTrace() {
      return _stackTrace;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public double lineNumber() {
      return _lineNumber;
    }
  }

  public static final class M64 implements org.chromium.wip.protocol.network.LoadingFailedEventData {
    private double _timestamp;
    private String _requestId;
    private String _errorText;
    private boolean _canceled;

    public M64(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("errorText")) {
          _errorText = readString(reader, "errorText");
        }
        else if (name.equals("canceled")) {
          _canceled = readBoolean(reader, "canceled");
        }
        else {
          reader.skipValue();
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
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M65 implements org.chromium.wip.protocol.network.LoadingFinishedEventData {
    private double _timestamp;
    private String _requestId;

    public M65(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M66 implements org.chromium.wip.protocol.network.RequestServedFromCacheEventData {
    private String _requestId;

    public M66(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M67 implements org.chromium.wip.protocol.network.RequestServedFromMemoryCacheEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.network.InitiatorValue _initiator;
    private org.chromium.wip.protocol.network.CachedResourceValue _resource;

    public M67(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, "documentURL");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, "loaderId");
        }
        else if (name.equals("initiator")) {
          _initiator = new M63(reader);
        }
        else if (name.equals("resource")) {
          _resource = new M57(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.CachedResourceValue resource() {
      return _resource;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String documentURL() {
      return _documentURL;
    }

    @Override
    public org.chromium.wip.protocol.network.InitiatorValue initiator() {
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
  }

  public static final class M68 implements org.chromium.wip.protocol.network.RequestValue {
    private String _method;
    private String _url;
    private org.chromium.wip.protocol.network.HeadersValue _headers;
    private String _postData;

    public M68(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("method")) {
          _method = readString(reader, "method");
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("postData")) {
          _postData = readString(reader, "postData");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.HeadersValue headers() {
      return _headers;
    }

    @Override
    public java.lang.String postData() {
      return _postData;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String method() {
      return _method;
    }
  }

  public static final class M69 implements org.chromium.wip.protocol.network.RequestWillBeSentEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.network.InitiatorValue _initiator;
    private org.chromium.wip.protocol.network.RequestValue _request;
    private org.chromium.wip.protocol.network.ResponseValue _redirectResponse;

    public M69(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("documentURL")) {
          _documentURL = readString(reader, "documentURL");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, "loaderId");
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
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public org.chromium.wip.protocol.network.InitiatorValue initiator() {
      return _initiator;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.network.RequestValue request() {
      return _request;
    }

    @Override
    public java.lang.String documentURL() {
      return _documentURL;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public org.chromium.wip.protocol.network.ResponseValue redirectResponse() {
      return _redirectResponse;
    }
  }

  public static final class M70 implements org.chromium.wip.protocol.network.ResourceTimingValue {
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

    public M70(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("requestTime")) {
          _requestTime = readDouble(reader, "requestTime");
        }
        else if (name.equals("proxyStart")) {
          _proxyStart = readDouble(reader, "proxyStart");
        }
        else if (name.equals("proxyEnd")) {
          _proxyEnd = readDouble(reader, "proxyEnd");
        }
        else if (name.equals("dnsStart")) {
          _dnsStart = readDouble(reader, "dnsStart");
        }
        else if (name.equals("dnsEnd")) {
          _dnsEnd = readDouble(reader, "dnsEnd");
        }
        else if (name.equals("connectStart")) {
          _connectStart = readDouble(reader, "connectStart");
        }
        else if (name.equals("connectEnd")) {
          _connectEnd = readDouble(reader, "connectEnd");
        }
        else if (name.equals("sslStart")) {
          _sslStart = readDouble(reader, "sslStart");
        }
        else if (name.equals("sslEnd")) {
          _sslEnd = readDouble(reader, "sslEnd");
        }
        else if (name.equals("sendStart")) {
          _sendStart = readDouble(reader, "sendStart");
        }
        else if (name.equals("sendEnd")) {
          _sendEnd = readDouble(reader, "sendEnd");
        }
        else if (name.equals("receiveHeadersEnd")) {
          _receiveHeadersEnd = readDouble(reader, "receiveHeadersEnd");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double connectStart() {
      return _connectStart;
    }

    @Override
    public double proxyStart() {
      return _proxyStart;
    }

    @Override
    public double connectEnd() {
      return _connectEnd;
    }

    @Override
    public double requestTime() {
      return _requestTime;
    }

    @Override
    public double sslEnd() {
      return _sslEnd;
    }

    @Override
    public double dnsStart() {
      return _dnsStart;
    }

    @Override
    public double sslStart() {
      return _sslStart;
    }

    @Override
    public double dnsEnd() {
      return _dnsEnd;
    }

    @Override
    public double proxyEnd() {
      return _proxyEnd;
    }

    @Override
    public double sendEnd() {
      return _sendEnd;
    }

    @Override
    public double receiveHeadersEnd() {
      return _receiveHeadersEnd;
    }

    @Override
    public double sendStart() {
      return _sendStart;
    }
  }

  public static final class M71 implements org.chromium.wip.protocol.network.ResponseReceivedEventData {
    private org.chromium.wip.protocol.page.ResourceTypeEnum _type;
    private double _timestamp;
    private String _frameId;
    private org.chromium.wip.protocol.network.ResponseValue _response;
    private String _requestId;
    private String _loaderId;

    public M71(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.page.ResourceTypeEnum.class);
        }
        else if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("response")) {
          _response = new M72(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, "loaderId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.page.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public org.chromium.wip.protocol.network.ResponseValue response() {
      return _response;
    }

    @Override
    public double timestamp() {
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
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M72 implements org.chromium.wip.protocol.network.ResponseValue {
    private String _url;
    private org.chromium.wip.protocol.network.HeadersValue _headers;
    private double _status;
    private String _statusText;
    private String _headersText;
    private String _mimeType;
    private org.chromium.wip.protocol.network.HeadersValue _requestHeaders;
    private String _requestHeadersText;
    private boolean _connectionReused;
    private double _connectionId;
    private boolean _fromDiskCache;
    private org.chromium.wip.protocol.network.ResourceTimingValue _timing;

    public M72(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("status")) {
          _status = readDouble(reader, "status");
        }
        else if (name.equals("statusText")) {
          _statusText = readString(reader, "statusText");
        }
        else if (name.equals("headersText")) {
          _headersText = readString(reader, "headersText");
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, "mimeType");
        }
        else if (name.equals("requestHeaders")) {
          _requestHeaders = new M62(reader);
        }
        else if (name.equals("requestHeadersText")) {
          _requestHeadersText = readString(reader, "requestHeadersText");
        }
        else if (name.equals("connectionReused")) {
          _connectionReused = readBoolean(reader, "connectionReused");
        }
        else if (name.equals("connectionId")) {
          _connectionId = readDouble(reader, "connectionId");
        }
        else if (name.equals("fromDiskCache")) {
          _fromDiskCache = readBoolean(reader, "fromDiskCache");
        }
        else if (name.equals("timing")) {
          _timing = new M70(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double connectionId() {
      return _connectionId;
    }

    @Override
    public boolean connectionReused() {
      return _connectionReused;
    }

    @Override
    public org.chromium.wip.protocol.network.HeadersValue requestHeaders() {
      return _requestHeaders;
    }

    @Override
    public double status() {
      return _status;
    }

    @Override
    public java.lang.String headersText() {
      return _headersText;
    }

    @Override
    public org.chromium.wip.protocol.network.HeadersValue headers() {
      return _headers;
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
    public org.chromium.wip.protocol.network.ResourceTimingValue timing() {
      return _timing;
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }

    @Override
    public java.lang.String requestHeadersText() {
      return _requestHeadersText;
    }
  }

  public static final class M73 implements org.chromium.wip.protocol.network.WebSocketClosedEventData {
    private double _timestamp;
    private String _requestId;

    public M73(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M74 implements org.chromium.wip.protocol.network.WebSocketCreatedEventData {
    private String _url;
    private String _requestId;

    public M74(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
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

  public static final class M75 implements org.chromium.wip.protocol.network.WebSocketFrameErrorEventData {
    private double _timestamp;
    private String _errorMessage;
    private String _requestId;

    public M75(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("errorMessage")) {
          _errorMessage = readString(reader, "errorMessage");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
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
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M76 implements org.chromium.wip.protocol.network.WebSocketFrameReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.network.WebSocketFrameValue _response;
    private String _requestId;

    public M76(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("response")) {
          _response = new M78(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.WebSocketFrameValue response() {
      return _response;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M77 implements org.chromium.wip.protocol.network.WebSocketFrameSentEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.network.WebSocketFrameValue _response;
    private String _requestId;

    public M77(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("response")) {
          _response = new M78(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.network.WebSocketFrameValue response() {
      return _response;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M78 implements org.chromium.wip.protocol.network.WebSocketFrameValue {
    private boolean _mask;
    private double _opcode;
    private String _payloadData;

    public M78(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("mask")) {
          _mask = readBoolean(reader, "mask");
        }
        else if (name.equals("opcode")) {
          _opcode = readDouble(reader, "opcode");
        }
        else if (name.equals("payloadData")) {
          _payloadData = readString(reader, "payloadData");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean mask() {
      return _mask;
    }

    @Override
    public java.lang.String payloadData() {
      return _payloadData;
    }

    @Override
    public double opcode() {
      return _opcode;
    }
  }

  public static final class M79 implements org.chromium.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.network.WebSocketResponseValue _response;
    private String _requestId;

    public M79(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("response")) {
          _response = new M81(reader);
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.WebSocketResponseValue response() {
      return _response;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M80 implements org.chromium.wip.protocol.network.WebSocketRequestValue {
    private org.chromium.wip.protocol.network.HeadersValue _headers;

    public M80(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("headers")) {
          _headers = new M62(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.HeadersValue headers() {
      return _headers;
    }
  }

  public static final class M81 implements org.chromium.wip.protocol.network.WebSocketResponseValue {
    private org.chromium.wip.protocol.network.HeadersValue _headers;
    private double _status;
    private String _statusText;

    public M81(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("headers")) {
          _headers = new M62(reader);
        }
        else if (name.equals("status")) {
          _status = readDouble(reader, "status");
        }
        else if (name.equals("statusText")) {
          _statusText = readString(reader, "statusText");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }

    @Override
    public org.chromium.wip.protocol.network.HeadersValue headers() {
      return _headers;
    }

    @Override
    public double status() {
      return _status;
    }
  }

  public static final class M82 implements org.chromium.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData {
    private double _timestamp;
    private String _requestId;
    private org.chromium.wip.protocol.network.WebSocketRequestValue _request;

    public M82(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else if (name.equals("requestId")) {
          _requestId = readString(reader, "requestId");
        }
        else if (name.equals("request")) {
          _request = new M80(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.network.WebSocketRequestValue request() {
      return _request;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M83 implements org.chromium.wip.protocol.page.AddScriptToEvaluateOnLoadResult {
    private String _identifier;

    public M83(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("identifier")) {
          _identifier = readString(reader, "identifier");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String identifier() {
      return _identifier;
    }
  }

  public static final class M84 implements org.chromium.wip.protocol.page.CanContinuouslyPaintResult {
    private boolean _value;

    public M84(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("value")) {
          _value = readBoolean(reader, "value");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean value() {
      return _value;
    }
  }

  public static final class M85 implements org.chromium.wip.protocol.page.CanOverrideDeviceMetricsResult {
    private boolean _result;

    public M85(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M86 implements org.chromium.wip.protocol.page.CanOverrideDeviceOrientationResult {
    private boolean _result;

    public M86(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M87 implements org.chromium.wip.protocol.page.CanOverrideGeolocationResult {
    private boolean _result;

    public M87(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M88 implements org.chromium.wip.protocol.page.CanShowDebugBordersResult {
    private boolean _show;

    public M88(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("show")) {
          _show = readBoolean(reader, "show");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean show() {
      return _show;
    }
  }

  public static final class M89 implements org.chromium.wip.protocol.page.CanShowFPSCounterResult {
    private boolean _show;

    public M89(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("show")) {
          _show = readBoolean(reader, "show");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean show() {
      return _show;
    }
  }

  public static final class M90 implements org.chromium.wip.protocol.page.CaptureScreenshotResult {
    private String _data;

    public M90(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("data")) {
          _data = readString(reader, "data");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String data() {
      return _data;
    }
  }

  public static final class M91 implements org.chromium.wip.protocol.page.CookieValue {
    private String _name;
    private String _value;
    private int _size;
    private String _domain;
    private String _path;
    private double _expires;
    private boolean _httpOnly;
    private boolean _secure;
    private boolean _session;

    public M91(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("size")) {
          _size = readInt(reader, "size");
        }
        else if (name.equals("domain")) {
          _domain = readString(reader, "domain");
        }
        else if (name.equals("path")) {
          _path = readString(reader, "path");
        }
        else if (name.equals("expires")) {
          _expires = readDouble(reader, "expires");
        }
        else if (name.equals("httpOnly")) {
          _httpOnly = readBoolean(reader, "httpOnly");
        }
        else if (name.equals("secure")) {
          _secure = readBoolean(reader, "secure");
        }
        else if (name.equals("session")) {
          _session = readBoolean(reader, "session");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int size() {
      return _size;
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
    public boolean httpOnly() {
      return _httpOnly;
    }

    @Override
    public boolean session() {
      return _session;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public double expires() {
      return _expires;
    }
  }

  public static final class M92 implements org.chromium.wip.protocol.page.DomContentEventFiredEventData {
    private double _timestamp;

    public M92(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M93 implements org.chromium.wip.protocol.page.FrameClearedScheduledNavigationEventData {
    private String _frameId;

    public M93(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M94 implements org.chromium.wip.protocol.page.FrameDetachedEventData {
    private String _frameId;

    public M94(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M95 implements org.chromium.wip.protocol.page.FrameNavigatedEventData {
    private org.chromium.wip.protocol.page.FrameValue _frame;

    public M95(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frame")) {
          _frame = new M101(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.page.FrameValue frame() {
      return _frame;
    }
  }

  public static final class M96 implements org.chromium.wip.protocol.page.FrameResourceTreeValue {
    private org.chromium.wip.protocol.page.FrameValue _frame;
    private java.util.List<org.chromium.wip.protocol.page.FrameResourceTreeValue> _childFrames;
    private java.util.List<org.chromium.wip.protocol.page.FrameResourceTreeValue.Resources> _resources;

    public M96(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frame")) {
          _frame = new M101(reader);
        }
        else if (name.equals("childFrames")) {
          _childFrames = readObjectArray(reader, "childFrames", new M96F(), true);
        }
        else if (name.equals("resources")) {
          _resources = readObjectArray(reader, "resources", new M97F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.FrameResourceTreeValue> childFrames() {
      return _childFrames;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.FrameResourceTreeValue.Resources> resources() {
      return _resources;
    }

    @Override
    public org.chromium.wip.protocol.page.FrameValue frame() {
      return _frame;
    }
  }

  public static final class M98 implements org.chromium.wip.protocol.page.FrameScheduledNavigationEventData {
    private String _frameId;
    private double _delay;

    public M98(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("delay")) {
          _delay = readDouble(reader, "delay");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double delay() {
      return _delay;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M99 implements org.chromium.wip.protocol.page.FrameStartedLoadingEventData {
    private String _frameId;

    public M99(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M100 implements org.chromium.wip.protocol.page.FrameStoppedLoadingEventData {
    private String _frameId;

    public M100(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M101 implements org.chromium.wip.protocol.page.FrameValue {
    private String _name;
    private String _id;
    private String _url;
    private String _parentId;
    private String _loaderId;
    private String _mimeType;
    private String _securityOrigin;

    public M101(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("id")) {
          _id = readString(reader, "id");
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("parentId")) {
          _parentId = readString(reader, "parentId");
        }
        else if (name.equals("loaderId")) {
          _loaderId = readString(reader, "loaderId");
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, "mimeType");
        }
        else if (name.equals("securityOrigin")) {
          _securityOrigin = readString(reader, "securityOrigin");
        }
        else {
          reader.skipValue();
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
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String parentId() {
      return _parentId;
    }

    @Override
    public java.lang.String id() {
      return _id;
    }
  }

  public static final class M102 implements org.chromium.wip.protocol.page.GetCompositingBordersVisibleResult {
    private boolean _result;

    public M102(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M103 implements org.chromium.wip.protocol.page.GetCookiesResult {
    private java.util.List<org.chromium.wip.protocol.page.CookieValue> _cookies;
    private String _cookiesString;

    public M103(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("cookies")) {
          _cookies = readObjectArray(reader, "cookies", new M91F(), false);
        }
        else if (name.equals("cookiesString")) {
          _cookiesString = readString(reader, "cookiesString");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.CookieValue> cookies() {
      return _cookies;
    }

    @Override
    public java.lang.String cookiesString() {
      return _cookiesString;
    }
  }

  public static final class M104 implements org.chromium.wip.protocol.page.GetResourceContentResult {
    private String _content;
    private boolean _base64Encoded;

    public M104(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("content")) {
          _content = readString(reader, "content");
        }
        else if (name.equals("base64Encoded")) {
          _base64Encoded = readBoolean(reader, "base64Encoded");
        }
        else {
          reader.skipValue();
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

  public static final class M105 implements org.chromium.wip.protocol.page.GetResourceTreeResult {
    private org.chromium.wip.protocol.page.FrameResourceTreeValue _frameTree;

    public M105(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("frameTree")) {
          _frameTree = new M96(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.page.FrameResourceTreeValue frameTree() {
      return _frameTree;
    }
  }

  public static final class M106 implements org.chromium.wip.protocol.page.GetScriptExecutionStatusResult {
    private org.chromium.wip.protocol.page.GetScriptExecutionStatusResult.Result _result;

    public M106(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readEnum(reader, "result", org.chromium.wip.protocol.page.GetScriptExecutionStatusResult.Result.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.page.GetScriptExecutionStatusResult.Result result() {
      return _result;
    }
  }

  public static final class M107 implements org.chromium.wip.protocol.page.JavascriptDialogClosedEventData {

    public M107(com.google.gson.stream.JsonReaderEx reader) {
      reader.skipValue();
    }
  }

  public static final class M108 implements org.chromium.wip.protocol.page.JavascriptDialogOpeningEventData {
    private String _message;

    public M108(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("message")) {
          _message = readString(reader, "message");
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
  }

  public static final class M109 implements org.chromium.wip.protocol.page.LoadEventFiredEventData {
    private double _timestamp;

    public M109(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("timestamp")) {
          _timestamp = readDouble(reader, "timestamp");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double timestamp() {
      return _timestamp;
    }
  }

  public static final class M110 implements org.chromium.wip.protocol.page.ScriptsEnabledEventData {
    private boolean _isEnabled;

    public M110(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("isEnabled")) {
          _isEnabled = readBoolean(reader, "isEnabled");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean isEnabled() {
      return _isEnabled;
    }
  }

  public static final class M111 implements org.chromium.wip.protocol.page.SearchInResourceResult {
    private java.util.List<org.chromium.wip.protocol.page.SearchMatchValue> _result;

    public M111(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readObjectArray(reader, "result", new M113F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M112 implements org.chromium.wip.protocol.page.SearchInResourcesResult {
    private java.util.List<org.chromium.wip.protocol.page.SearchResultValue> _result;

    public M112(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readObjectArray(reader, "result", new M114F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.page.SearchResultValue> result() {
      return _result;
    }
  }

  public static final class M113 implements org.chromium.wip.protocol.page.SearchMatchValue {
    private double _lineNumber;
    private String _lineContent;

    public M113(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("lineNumber")) {
          _lineNumber = readDouble(reader, "lineNumber");
        }
        else if (name.equals("lineContent")) {
          _lineContent = readString(reader, "lineContent");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double lineNumber() {
      return _lineNumber;
    }

    @Override
    public java.lang.String lineContent() {
      return _lineContent;
    }
  }

  public static final class M114 implements org.chromium.wip.protocol.page.SearchResultValue {
    private String _url;
    private String _frameId;
    private double _matchesCount;

    public M114(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("matchesCount")) {
          _matchesCount = readDouble(reader, "matchesCount");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public double matchesCount() {
      return _matchesCount;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }
  }

  public static final class M115 implements org.chromium.wip.protocol.runtime.CallFunctionOnResult {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M115(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, "wasThrown");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M116 implements org.chromium.wip.protocol.runtime.EvaluateResult {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M116(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = new M124(reader);
        }
        else if (name.equals("wasThrown")) {
          _wasThrown = readBoolean(reader, "wasThrown");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M117 implements org.chromium.wip.protocol.runtime.ExecutionContextCreatedEventData {
    private org.chromium.wip.protocol.runtime.ExecutionContextDescriptionValue _context;

    public M117(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("context")) {
          _context = new M118(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.ExecutionContextDescriptionValue context() {
      return _context;
    }
  }

  public static final class M118 implements org.chromium.wip.protocol.runtime.ExecutionContextDescriptionValue {
    private String _name;
    private int _id;
    private String _frameId;
    private boolean _isPageContext;

    public M118(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("id")) {
          _id = readInt(reader, "id");
        }
        else if (name.equals("frameId")) {
          _frameId = readString(reader, "frameId");
        }
        else if (name.equals("isPageContext")) {
          _isPageContext = readBoolean(reader, "isPageContext");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean isPageContext() {
      return _isPageContext;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public int id() {
      return _id;
    }
  }

  public static final class M119 implements org.chromium.wip.protocol.runtime.GetPropertiesResult {
    private java.util.List<org.chromium.wip.protocol.runtime.PropertyDescriptorValue> _result;
    private java.util.List<org.chromium.wip.protocol.runtime.InternalPropertyDescriptorValue> _internalProperties;

    public M119(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("result")) {
          _result = readObjectArray(reader, "result", new M122F(), false);
        }
        else if (name.equals("internalProperties")) {
          _internalProperties = readObjectArray(reader, "internalProperties", new M120F(), true);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.runtime.InternalPropertyDescriptorValue> internalProperties() {
      return _internalProperties;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.runtime.PropertyDescriptorValue> result() {
      return _result;
    }
  }

  public static final class M120 implements org.chromium.wip.protocol.runtime.InternalPropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _value;

    public M120(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("value")) {
          _value = new M124(reader);
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
    public org.chromium.wip.protocol.runtime.RemoteObjectValue value() {
      return _value;
    }
  }

  public static final class M121 implements org.chromium.wip.protocol.runtime.ObjectPreviewValue {
    private boolean _overflow;
    private java.util.List<org.chromium.wip.protocol.runtime.PropertyPreviewValue> _properties;
    private boolean _lossless;

    public M121(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("overflow")) {
          _overflow = readBoolean(reader, "overflow");
        }
        else if (name.equals("properties")) {
          _properties = readObjectArray(reader, "properties", new M123F(), false);
        }
        else if (name.equals("lossless")) {
          _lossless = readBoolean(reader, "lossless");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.runtime.PropertyPreviewValue> properties() {
      return _properties;
    }

    @Override
    public boolean overflow() {
      return _overflow;
    }

    @Override
    public boolean lossless() {
      return _lossless;
    }
  }

  public static final class M122 implements org.chromium.wip.protocol.runtime.PropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _get;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _value;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue _set;
    private boolean _wasThrown;
    private boolean _writable;
    private boolean _configurable;
    private boolean _enumerable;
    private boolean _isOwn;

    public M122(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
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
          _wasThrown = readBoolean(reader, "wasThrown");
        }
        else if (name.equals("writable")) {
          _writable = readBoolean(reader, "writable");
        }
        else if (name.equals("configurable")) {
          _configurable = readBoolean(reader, "configurable");
        }
        else if (name.equals("enumerable")) {
          _enumerable = readBoolean(reader, "enumerable");
        }
        else if (name.equals("isOwn")) {
          _isOwn = readBoolean(reader, "isOwn");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue get() {
      return _get;
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
    public org.chromium.wip.protocol.runtime.RemoteObjectValue set() {
      return _set;
    }

    @Override
    public boolean configurable() {
      return _configurable;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue value() {
      return _value;
    }

    @Override
    public boolean isOwn() {
      return _isOwn;
    }
  }

  public static final class M123 implements org.chromium.wip.protocol.runtime.PropertyPreviewValue {
    private String _name;
    private org.chromium.wip.protocol.runtime.PropertyPreviewValue.Type _type;
    private String _value;
    private org.chromium.wip.protocol.runtime.ObjectPreviewValue _valuePreview;
    private org.chromium.wip.protocol.runtime.PropertyPreviewValue.Subtype _subtype;

    public M123(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.runtime.PropertyPreviewValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("valuePreview")) {
          _valuePreview = new M121(reader);
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, "subtype", org.chromium.wip.protocol.runtime.PropertyPreviewValue.Subtype.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.PropertyPreviewValue.Type type() {
      return _type;
    }

    @Override
    public org.chromium.wip.protocol.runtime.ObjectPreviewValue valuePreview() {
      return _valuePreview;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public org.chromium.wip.protocol.runtime.PropertyPreviewValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M124 implements org.chromium.wip.protocol.runtime.RemoteObjectValue {
    private org.chromium.wip.protocol.runtime.RemoteObjectValue.Type _type;
    private java.lang.Object _value;
    private String _className;
    private org.chromium.wip.protocol.runtime.RemoteObjectValue.Subtype _subtype;
    private String _description;
    private String _objectId;
    private org.chromium.wip.protocol.runtime.ObjectPreviewValue _preview;

    public M124(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.runtime.RemoteObjectValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, "subtype", org.chromium.wip.protocol.runtime.RemoteObjectValue.Subtype.class);
        }
        else if (name.equals("description")) {
          _description = readString(reader, "description");
        }
        else if (name.equals("objectId")) {
          _objectId = readString(reader, "objectId");
        }
        else if (name.equals("preview")) {
          _preview = new M121(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue.Type type() {
      return _type;
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
    public java.lang.String objectId() {
      return _objectId;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public org.chromium.wip.protocol.runtime.ObjectPreviewValue preview() {
      return _preview;
    }
  }

  public static final class M125 implements org.chromium.wip.protocol.timeline.CanMonitorMainThreadResult {
    private boolean _result;

    public M125(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M126 implements org.chromium.wip.protocol.timeline.EventRecordedEventData {
    private org.chromium.wip.protocol.timeline.TimelineEventValue _record;

    public M126(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("record")) {
          _record = new M128(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.timeline.TimelineEventValue record() {
      return _record;
    }
  }

  public static final class M127 implements org.chromium.wip.protocol.timeline.SupportsFrameInstrumentationResult {
    private boolean _result;

    public M127(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readBoolean(reader, "result");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean result() {
      return _result;
    }
  }

  public static final class M128 implements org.chromium.wip.protocol.timeline.TimelineEventValue {
    private String _type;
    private String _thread;
    private org.chromium.wip.protocol.timeline.TimelineEventValue.Data _data;
    private java.util.List<org.chromium.wip.protocol.timeline.TimelineEventValue> _children;

    public M128(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, "type");
        }
        else if (name.equals("thread")) {
          _thread = readString(reader, "thread");
        }
        else if (name.equals("data")) {
          _data = new M129(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, "children", new M128F(), true);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.timeline.TimelineEventValue.Data data() {
      return _data;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.timeline.TimelineEventValue> children() {
      return _children;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public java.lang.String thread() {
      return _thread;
    }
  }

  public static final class M17 implements org.chromium.wip.protocol.debugger.PausedEventData.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M17(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M19 implements org.chromium.wip.protocol.debugger.RestartFrameResult.Result {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M19(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M29 implements org.chromium.wip.protocol.debugger.SetScriptSourceResult.Result {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M29(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M97 implements org.chromium.wip.protocol.page.FrameResourceTreeValue.Resources {
    private org.chromium.wip.protocol.page.ResourceTypeEnum _type;
    private String _url;
    private boolean _canceled;
    private String _mimeType;
    private boolean _failed;

    public M97(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.page.ResourceTypeEnum.class);
        }
        else if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("canceled")) {
          _canceled = readBoolean(reader, "canceled");
        }
        else if (name.equals("mimeType")) {
          _mimeType = readString(reader, "mimeType");
        }
        else if (name.equals("failed")) {
          _failed = readBoolean(reader, "failed");
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
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
    public org.chromium.wip.protocol.page.ResourceTypeEnum type() {
      return _type;
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

  public static final class M129 implements org.chromium.wip.protocol.timeline.TimelineEventValue.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M129(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M135 implements org.jetbrains.wip.protocol.IncomingMessage {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M130 lazy_0;
    private M136 lazy_1;
    private int _id;

    public M135(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("id")) {
          _id = readInt(reader, "id");
          break;
        }
        else {
          reader.skipValue();
        }
      }
    }

    @Override
    public M136 asNotification() {
      if (lazy_1 == null) {
        lazy_1 = new M136(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public M130 asResponse() {
      if (lazy_0 == null) {
        lazy_0 = new M130(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public int id() {
      return _id;
    }
  }

  public static final class M136 implements org.jetbrains.wip.protocol.WipEvent {
    private String _method;
    private org.jetbrains.wip.protocol.WipEvent.Data _params;

    public M136(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("method")) {
          _method = readString(reader, "method");
        }
        else if (name.equals("params")) {
          _params = new M137(reader);
        }
        else {
          reader.skipValue();
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

  public static final class M137 implements org.jetbrains.wip.protocol.WipEvent.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M137(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M130 implements org.jetbrains.wip.protocol.CommandResponse {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M134 lazy_0;
    private M132 lazy_1;
    private int _id;

    public M130(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("id")) {
          _id = readInt(reader, "id");
          break;
        }
        else {
          reader.skipValue();
        }
      }
    }

    @Override
    public M134 asSuccess() {
      if (lazy_0 == null) {
        lazy_0 = new M134(inputReader);
        inputReader = null;
      }
      return lazy_0;
    }

    @Override
    public M132 asError() {
      if (lazy_1 == null) {
        lazy_1 = new M132(inputReader);
        inputReader = null;
      }
      return lazy_1;
    }

    @Override
    public int id() {
      return _id;
    }
  }

  public static final class M131 implements org.jetbrains.wip.protocol.CommandResponse.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M131(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M132 implements org.jetbrains.wip.protocol.CommandResponse.Error {
    private org.jetbrains.wip.protocol.CommandResponse.Error.ErrorInfo _error;
    private org.jetbrains.wip.protocol.CommandResponse.Data _result;

    public M132(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("error")) {
          _error = new M133(reader);
        }
        else if (name.equals("result")) {
          _result = new M131(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.jetbrains.wip.protocol.CommandResponse.Error.ErrorInfo error() {
      return _error;
    }

    @Override
    public org.jetbrains.wip.protocol.CommandResponse.Data data() {
      return _result;
    }
  }

  public static final class M133 implements org.jetbrains.wip.protocol.CommandResponse.Error.ErrorInfo {
    private java.util.List<String> _data;
    private String _message;
    private long _code;

    public M133(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("data")) {
          _data = nextList(reader);
        }
        else if (name.equals("message")) {
          _message = readString(reader, "message");
        }
        else if (name.equals("code")) {
          _code = readLong(reader, "code");
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
    public java.util.List<java.lang.String> data() {
      return _data;
    }

    @Override
    public long code() {
      return _code;
    }
  }

  public static final class M134 implements org.jetbrains.wip.protocol.CommandResponse.Success {
    private org.jetbrains.wip.protocol.CommandResponse.Data _result;

    public M134(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = new M131(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.jetbrains.wip.protocol.CommandResponse.Data data() {
      return _result;
    }

    @Override
    public void error() {

    }
  }

  public static final class M138 implements org.jetbrains.wip.protocol.WipTabList {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> lazy_0;

    public M138(com.google.gson.stream.JsonReaderEx reader) {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> asTabList() {
      if (lazy_0 == null) {
        lazy_0 = readObjectArray(inputReader, null, new M139F(), false);
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M139 implements org.jetbrains.wip.protocol.WipTabList.TabDescription {
    private String _url;
    private String _faviconUrl;
    private String _title;
    private String _thumbnailUrl;
    private String _devtoolsFrontendUrl;
    private String _webSocketDebuggerUrl;

    public M139(com.google.gson.stream.JsonReaderEx reader) {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("url")) {
          _url = readString(reader, "url");
        }
        else if (name.equals("faviconUrl")) {
          _faviconUrl = readString(reader, "faviconUrl");
        }
        else if (name.equals("title")) {
          _title = readString(reader, "title");
        }
        else if (name.equals("thumbnailUrl")) {
          _thumbnailUrl = readString(reader, "thumbnailUrl");
        }
        else if (name.equals("devtoolsFrontendUrl")) {
          _devtoolsFrontendUrl = readString(reader, "devtoolsFrontendUrl");
        }
        else if (name.equals("webSocketDebuggerUrl")) {
          _webSocketDebuggerUrl = readString(reader, "webSocketDebuggerUrl");
        }
        else {
          reader.skipValue();
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

  static final class M38F extends ObjectFactory<org.chromium.wip.protocol.dom.EventListenerValue> {
    @Override
    public org.chromium.wip.protocol.dom.EventListenerValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M38(reader);
    }
  }

  static final class M139F extends ObjectFactory<org.jetbrains.wip.protocol.WipTabList.TabDescription> {
    @Override
    public org.jetbrains.wip.protocol.WipTabList.TabDescription read(com.google.gson.stream.JsonReaderEx reader) {
      return new M139(reader);
    }
  }

  static final class M114F extends ObjectFactory<org.chromium.wip.protocol.page.SearchResultValue> {
    @Override
    public org.chromium.wip.protocol.page.SearchResultValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M114(reader);
    }
  }

  static final class M97F extends ObjectFactory<org.chromium.wip.protocol.page.FrameResourceTreeValue.Resources> {
    @Override
    public org.chromium.wip.protocol.page.FrameResourceTreeValue.Resources read(com.google.gson.stream.JsonReaderEx reader) {
      return new M97(reader);
    }
  }

  static final class M46F extends ObjectFactory<org.chromium.wip.protocol.dom.NodeValue> {
    @Override
    public org.chromium.wip.protocol.dom.NodeValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M46(reader);
    }
  }

  static final class M22F extends ObjectFactory<org.chromium.wip.protocol.debugger.ScopeValue> {
    @Override
    public org.chromium.wip.protocol.debugger.ScopeValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M22(reader);
    }
  }

  static final class M120F extends ObjectFactory<org.chromium.wip.protocol.runtime.InternalPropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.runtime.InternalPropertyDescriptorValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M120(reader);
    }
  }

  static final class M6F extends ObjectFactory<org.chromium.wip.protocol.debugger.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.debugger.CallFrameValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M6(reader);
    }
  }

  static final class M91F extends ObjectFactory<org.chromium.wip.protocol.page.CookieValue> {
    @Override
    public org.chromium.wip.protocol.page.CookieValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M91(reader);
    }
  }

  static final class M128F extends ObjectFactory<org.chromium.wip.protocol.timeline.TimelineEventValue> {
    @Override
    public org.chromium.wip.protocol.timeline.TimelineEventValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M128(reader);
    }
  }

  static final class M15F extends ObjectFactory<org.chromium.wip.protocol.debugger.LocationValue> {
    @Override
    public org.chromium.wip.protocol.debugger.LocationValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M15(reader);
    }
  }

  static final class M0F extends ObjectFactory<org.chromium.wip.protocol.console.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.console.CallFrameValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M0(reader);
    }
  }

  static final class M113F extends ObjectFactory<org.chromium.wip.protocol.page.SearchMatchValue> {
    @Override
    public org.chromium.wip.protocol.page.SearchMatchValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M113(reader);
    }
  }

  static final class M122F extends ObjectFactory<org.chromium.wip.protocol.runtime.PropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.runtime.PropertyDescriptorValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M122(reader);
    }
  }

  static final class M123F extends ObjectFactory<org.chromium.wip.protocol.runtime.PropertyPreviewValue> {
    @Override
    public org.chromium.wip.protocol.runtime.PropertyPreviewValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M123(reader);
    }
  }

  static final class M124F extends ObjectFactory<org.chromium.wip.protocol.runtime.RemoteObjectValue> {
    @Override
    public org.chromium.wip.protocol.runtime.RemoteObjectValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M124(reader);
    }
  }

  static final class M96F extends ObjectFactory<org.chromium.wip.protocol.page.FrameResourceTreeValue> {
    @Override
    public org.chromium.wip.protocol.page.FrameResourceTreeValue read(com.google.gson.stream.JsonReaderEx reader) {
      return new M96(reader);
    }
  }

}