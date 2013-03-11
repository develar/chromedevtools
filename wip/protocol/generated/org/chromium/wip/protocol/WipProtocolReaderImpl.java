// This is a generated source.
package org.chromium.wip.protocol;

import org.jetbrains.jsonProtocol.*;

import static org.jetbrains.jsonProtocol.JsonReaders.*;
import java.io.IOException;

public final class WipProtocolReaderImpl implements org.jetbrains.wip.protocol.WipProtocolReader {
  @Override
  public org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData parsePageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M100(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData parseConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M3(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetBreakpointData parseDebuggerSetBreakpointData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M27(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData parseDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M55(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData parseNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M66(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.console.MessagesClearedEventData parseConsoleMessagesClearedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M4(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.LoadingFinishedEventData parseNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M65(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.EvaluateData parseRuntimeEvaluateData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M116(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData parseDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M37(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData parseRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M117(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.DataReceivedEventData parseNetworkDataReceivedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M60(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.RequestWillBeSentEventData parseNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M69(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData parsePageCanOverrideDeviceOrientationData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M86(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData parsePageAddScriptToEvaluateOnLoadData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M83(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData parseDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M34(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData parseTimelineCanMonitorMainThreadData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M125(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.EventRecordedEventData parseTimelineEventRecordedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M126(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.ResumedEventData parseDebuggerResumedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M20(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.RunScriptData parseDebuggerRunScriptData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M21(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.ResponseReceivedEventData parseNetworkResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M71(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.MoveToData parseDOMMoveToData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M45(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.LoadEventFiredEventData parsePageLoadEventFiredEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M109(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData parseNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M82(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketCreatedEventData parseNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M74(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideGeolocationData parsePageCanOverrideGeolocationData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M87(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.PausedEventData parseDebuggerPausedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M16(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.RemoteObjectValue parseRemoteObjectValue(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M124(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData parsePageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M107(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipEvent parseWipEvent(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M135(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceTreeData parsePageGetResourceTreeData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M105(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketFrameErrorEventData parseNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M75(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowFPSCounterData parsePageCanShowFPSCounterData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M89(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourcesData parsePageSearchInResourcesData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M112(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetScriptSourceData parseDebuggerSetScriptSourceData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M28(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData parseNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M76(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData parseDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M35(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData parseDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M33(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData parseDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M36(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipTabList parseTabList(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M137(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.CallFunctionOnData parseRuntimeCallFunctionOnData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M115(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCacheData parseNetworkCanClearBrowserCacheData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M58(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData parseDebuggerCanSetScriptSourceData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M7(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.SearchInResourceData parsePageSearchInResourceData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M111(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData parsePageGetScriptExecutionStatusData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M106(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PerformSearchData parseDOMPerformSearchData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M47(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceContentData parsePageGetResourceContentData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M104(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData parsePageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M108(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CausesRecompilationData parseDebuggerCausesRecompilationData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M8(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData parseNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M79(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData parsePageGetCompositingBordersVisibleData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M102(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.SetChildNodesEventData parseDOMSetChildNodesEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M53(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData parseDebuggerEvaluateOnCallFrameData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M10(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.FrameClearedScheduledNavigationEventData parsePageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M93(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorAllData parseDOMQuerySelectorAllData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M49(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.LoadingFailedEventData parseNetworkLoadingFailedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M64(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData parsePageFrameStartedLoadingEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M99(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetAttributesData parseDOMGetAttributesData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M39(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData parseNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M67(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData parsePageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M98(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData parseDebuggerGetFunctionDetailsData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M12(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorData parseDOMQuerySelectorData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M50(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData parseDOMShadowRootPushedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M56(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetSearchResultsData parseDOMGetSearchResultsData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M43(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M30(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.DomContentEventFiredEventData parsePageDomContentEventFiredEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M92(reader);
  }

  @Override
  public org.jetbrains.wip.protocol.WipCommandResponse parseWipCommandResponse(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M130(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.ScriptParsedEventData parseDebuggerScriptParsedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M24(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData parsePageCanOverrideDeviceMetricsData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M85(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.FrameNavigatedEventData parsePageFrameNavigatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M95(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanContinuouslyPaintData parsePageCanContinuouslyPaintData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M84(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CaptureScreenshotData parsePageCaptureScreenshotData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M90(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.RequestNodeData parseDOMRequestNodeData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M51(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetDocumentData parseDOMGetDocumentData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M40(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData parseDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M5(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData parseNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M77(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.FrameDetachedEventData parsePageFrameDetachedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M94(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetOuterHTMLData parseDOMGetOuterHTMLData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M42(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.AttributeModifiedEventData parseDOMAttributeModifiedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M31(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData parseDebuggerSetBreakpointByUrlData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M26(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData parseDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M23(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData parseTimelineSupportsFrameInstrumentationData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M127(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData parseDOMGetEventListenersForNodeData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M41(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.WebSocketClosedEventData parseNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M73(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCookiesData parsePageGetCookiesData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M103(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ResolveNodeData parseDOMResolveNodeData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M52(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData parseDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M14(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.runtime.GetPropertiesData parseRuntimeGetPropertiesData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M119(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.AttributeRemovedEventData parseDOMAttributeRemovedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M32(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CompileScriptData parseDebuggerCompileScriptData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M9(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData parseNetworkCanClearBrowserCookiesData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M59(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.SearchInContentData parseDebuggerSearchInContentData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M25(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.network.GetResponseBodyData parseNetworkGetResponseBodyData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M61(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData parseDOMPushNodeByPathToFrontendData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M48(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.ScriptsEnabledEventData parsePageScriptsEnabledEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M110(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.RestartFrameData parseDebuggerRestartFrameData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M18(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.SetNodeNameData parseDOMSetNodeNameData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M54(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData parseDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M44(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.console.MessageAddedEventData parseConsoleMessageAddedEventData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M2(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanShowDebugBordersData parsePageCanShowDebugBordersData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M88(reader);
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.GetScriptSourceData parseDebuggerGetScriptSourceData(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
    return new M13(reader);
  }

  public static final class M0 implements org.chromium.wip.protocol.input.console.CallFrameValue {
    private int _lineNumber;
    private String _url;
    private String _functionName;
    private int _columnNumber;

    public M0(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public int columnNumber() {
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

    @Override
    public int lineNumber() {
      return _lineNumber;
    }
  }

  public static final class M1 implements org.chromium.wip.protocol.input.console.ConsoleMessageValue {
    private org.chromium.wip.protocol.input.console.ConsoleMessageValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> _stackTrace;
    private String _url;
    private String _text;
    private org.chromium.wip.protocol.input.console.ConsoleMessageValue.Source _source;
    private org.chromium.wip.protocol.input.console.ConsoleMessageValue.Level _level;
    private int _line;
    private int _repeatCount;
    private java.util.List<org.chromium.wip.protocol.input.runtime.RemoteObjectValue> _parameters;
    private String _networkRequestId;

    public M1(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.console.ConsoleMessageValue.Type.class);
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
          _source = readEnum(reader, "source", org.chromium.wip.protocol.input.console.ConsoleMessageValue.Source.class);
        }
        else if (name.equals("level")) {
          _level = readEnum(reader, "level", org.chromium.wip.protocol.input.console.ConsoleMessageValue.Level.class);
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
    public java.lang.String networkRequestId() {
      return _networkRequestId;
    }

    @Override
    public java.lang.String text() {
      return _text;
    }

    @Override
    public org.chromium.wip.protocol.input.console.ConsoleMessageValue.Level level() {
      return _level;
    }

    @Override
    public org.chromium.wip.protocol.input.console.ConsoleMessageValue.Source source() {
      return _source;
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
    public java.util.List<org.chromium.wip.protocol.input.runtime.RemoteObjectValue> parameters() {
      return _parameters;
    }

    @Override
    public org.chromium.wip.protocol.input.console.ConsoleMessageValue.Type type() {
      return _type;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> stackTrace() {
      return _stackTrace;
    }
  }

  public static final class M2 implements org.chromium.wip.protocol.input.console.MessageAddedEventData {
    private org.chromium.wip.protocol.input.console.ConsoleMessageValue _message;

    public M2(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.console.ConsoleMessageValue message() {
      return _message;
    }
  }

  public static final class M3 implements org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData {
    private int _count;

    public M3(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M4 implements org.chromium.wip.protocol.input.console.MessagesClearedEventData {

    public M4(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M5 implements org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData {
    private org.chromium.wip.protocol.input.debugger.LocationValue _location;
    private String _breakpointId;

    public M5(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.debugger.LocationValue location() {
      return _location;
    }
  }

  public static final class M6 implements org.chromium.wip.protocol.input.debugger.CallFrameValue {
    private org.chromium.wip.protocol.input.debugger.LocationValue _location;
    private String _functionName;
    private String _callFrameId;
    private java.util.List<org.chromium.wip.protocol.input.debugger.ScopeValue> _scopeChain;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _this;

    public M6(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.debugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue getThis() {
      return _this;
    }

    @Override
    public java.lang.String functionName() {
      return _functionName;
    }

    @Override
    public java.lang.String callFrameId() {
      return _callFrameId;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.LocationValue location() {
      return _location;
    }
  }

  public static final class M7 implements org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData {
    private boolean _result;

    public M7(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M8 implements org.chromium.wip.protocol.input.debugger.CausesRecompilationData {
    private boolean _result;

    public M8(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M9 implements org.chromium.wip.protocol.input.debugger.CompileScriptData {
    private String _scriptId;
    private String _syntaxErrorMessage;

    public M9(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M10 implements org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M10(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M11 implements org.chromium.wip.protocol.input.debugger.FunctionDetailsValue {
    private String _name;
    private String _displayName;
    private org.chromium.wip.protocol.input.debugger.LocationValue _location;
    private java.util.List<org.chromium.wip.protocol.input.debugger.ScopeValue> _scopeChain;
    private String _inferredName;

    public M11(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.debugger.ScopeValue> scopeChain() {
      return _scopeChain;
    }

    @Override
    public java.lang.String displayName() {
      return _displayName;
    }

    @Override
    public java.lang.String inferredName() {
      return _inferredName;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.LocationValue location() {
      return _location;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M12 implements org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData {
    private org.chromium.wip.protocol.input.debugger.FunctionDetailsValue _details;

    public M12(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.debugger.FunctionDetailsValue details() {
      return _details;
    }
  }

  public static final class M13 implements org.chromium.wip.protocol.input.debugger.GetScriptSourceData {
    private String _scriptSource;

    public M13(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M14 implements org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData {

    public M14(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M15 implements org.chromium.wip.protocol.input.debugger.LocationValue {
    private int _lineNumber;
    private int _columnNumber;
    private String _scriptId;

    public M15(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String scriptId() {
      return _scriptId;
    }

    @Override
    public int lineNumber() {
      return _lineNumber;
    }

    @Override
    public int columnNumber() {
      return _columnNumber;
    }
  }

  public static final class M16 implements org.chromium.wip.protocol.input.debugger.PausedEventData {
    private org.chromium.wip.protocol.input.debugger.PausedEventData.Data _data;
    private java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> _callFrames;
    private org.chromium.wip.protocol.input.debugger.PausedEventData.Reason _reason;

    public M16(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
          _reason = readEnum(reader, "reason", org.chromium.wip.protocol.input.debugger.PausedEventData.Reason.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.PausedEventData.Reason reason() {
      return _reason;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.PausedEventData.Data data() {
      return _data;
    }
  }

  public static final class M18 implements org.chromium.wip.protocol.input.debugger.RestartFrameData {
    private org.chromium.wip.protocol.input.debugger.RestartFrameData.Result _result;
    private java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> _callFrames;

    public M18(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.debugger.RestartFrameData.Result result() {
      return _result;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }
  }

  public static final class M20 implements org.chromium.wip.protocol.input.debugger.ResumedEventData {

    public M20(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M21 implements org.chromium.wip.protocol.input.debugger.RunScriptData {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M21(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M22 implements org.chromium.wip.protocol.input.debugger.ScopeValue {
    private org.chromium.wip.protocol.input.debugger.ScopeValue.Type _type;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _object;

    public M22(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.debugger.ScopeValue.Type.class);
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue object() {
      return _object;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.ScopeValue.Type type() {
      return _type;
    }
  }

  public static final class M23 implements org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData {
    private String _url;
    private String _scriptSource;
    private int _startLine;
    private int _errorLine;
    private String _errorMessage;

    public M23(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String url() {
      return _url;
    }

    @Override
    public int errorLine() {
      return _errorLine;
    }

    @Override
    public java.lang.String scriptSource() {
      return _scriptSource;
    }

    @Override
    public int startLine() {
      return _startLine;
    }

    @Override
    public java.lang.String errorMessage() {
      return _errorMessage;
    }
  }

  public static final class M24 implements org.chromium.wip.protocol.input.debugger.ScriptParsedEventData {
    private String _url;
    private String _scriptId;
    private int _startLine;
    private int _startColumn;
    private int _endLine;
    private int _endColumn;
    private boolean _isContentScript;
    private String _sourceMapURL;
    private boolean _hasSourceURL;

    public M24(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String scriptId() {
      return _scriptId;
    }

    @Override
    public int startColumn() {
      return _startColumn;
    }

    @Override
    public int endLine() {
      return _endLine;
    }

    @Override
    public java.lang.String sourceMapURL() {
      return _sourceMapURL;
    }

    @Override
    public boolean hasSourceURL() {
      return _hasSourceURL;
    }

    @Override
    public int startLine() {
      return _startLine;
    }
  }

  public static final class M25 implements org.chromium.wip.protocol.input.debugger.SearchInContentData {
    private java.util.List<org.chromium.wip.protocol.input.page.SearchMatchValue> _result;

    public M25(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.page.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M26 implements org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData {
    private String _breakpointId;
    private java.util.List<org.chromium.wip.protocol.input.debugger.LocationValue> _locations;

    public M26(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String breakpointId() {
      return _breakpointId;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.debugger.LocationValue> locations() {
      return _locations;
    }
  }

  public static final class M27 implements org.chromium.wip.protocol.input.debugger.SetBreakpointData {
    private String _breakpointId;
    private org.chromium.wip.protocol.input.debugger.LocationValue _actualLocation;

    public M27(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.debugger.LocationValue actualLocation() {
      return _actualLocation;
    }

    @Override
    public java.lang.String breakpointId() {
      return _breakpointId;
    }
  }

  public static final class M28 implements org.chromium.wip.protocol.input.debugger.SetScriptSourceData {
    private org.chromium.wip.protocol.input.debugger.SetScriptSourceData.Result _result;
    private java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> _callFrames;

    public M28(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames() {
      return _callFrames;
    }

    @Override
    public org.chromium.wip.protocol.input.debugger.SetScriptSourceData.Result result() {
      return _result;
    }
  }

  public static final class M30 implements org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData {
    private boolean _result;

    public M30(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M31 implements org.chromium.wip.protocol.input.dom.AttributeModifiedEventData {
    private String _name;
    private String _value;
    private int _nodeId;

    public M31(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String value() {
      return _value;
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

  public static final class M32 implements org.chromium.wip.protocol.input.dom.AttributeRemovedEventData {
    private String _name;
    private int _nodeId;

    public M32(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M33 implements org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData {
    private int _nodeId;
    private String _characterData;

    public M33(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public int nodeId() {
      return _nodeId;
    }

    @Override
    public java.lang.String characterData() {
      return _characterData;
    }
  }

  public static final class M34 implements org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData {
    private int _nodeId;
    private int _childNodeCount;

    public M34(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M35 implements org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData {
    private org.chromium.wip.protocol.input.dom.NodeValue _node;
    private int _parentNodeId;
    private int _previousNodeId;

    public M35(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.dom.NodeValue node() {
      return _node;
    }
  }

  public static final class M36 implements org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData {
    private int _nodeId;
    private int _parentNodeId;

    public M36(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M37 implements org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData {

    public M37(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M38 implements org.chromium.wip.protocol.input.dom.EventListenerValue {
    private String _type;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _handler;
    private org.chromium.wip.protocol.input.debugger.LocationValue _location;
    private int _nodeId;
    private boolean _useCapture;
    private boolean _isAttribute;
    private String _handlerBody;
    private String _sourceName;

    public M38(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue handler() {
      return _handler;
    }

    @Override
    public java.lang.String type() {
      return _type;
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
    public org.chromium.wip.protocol.input.debugger.LocationValue location() {
      return _location;
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
  }

  public static final class M39 implements org.chromium.wip.protocol.input.dom.GetAttributesData {
    private java.util.List<String> _attributes;

    public M39(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M40 implements org.chromium.wip.protocol.input.dom.GetDocumentData {
    private org.chromium.wip.protocol.input.dom.NodeValue _root;

    public M40(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.dom.NodeValue root() {
      return _root;
    }
  }

  public static final class M41 implements org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData {
    private java.util.List<org.chromium.wip.protocol.input.dom.EventListenerValue> _listeners;

    public M41(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.dom.EventListenerValue> listeners() {
      return _listeners;
    }
  }

  public static final class M42 implements org.chromium.wip.protocol.input.dom.GetOuterHTMLData {
    private String _outerHTML;

    public M42(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M43 implements org.chromium.wip.protocol.input.dom.GetSearchResultsData {
    private int[] _nodeIds;

    public M43(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M44 implements org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData {
    private int[] _nodeIds;

    public M44(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M45 implements org.chromium.wip.protocol.input.dom.MoveToData {
    private int _nodeId;

    public M45(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M46 implements org.chromium.wip.protocol.input.dom.NodeValue {
    private String _name;
    private String _value;
    private java.util.List<String> _attributes;
    private int _nodeId;
    private int _childNodeCount;
    private int _nodeType;
    private String _nodeName;
    private String _localName;
    private String _nodeValue;
    private java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> _children;
    private String _documentURL;
    private String _baseURL;
    private String _publicId;
    private String _systemId;
    private String _internalSubset;
    private String _xmlVersion;
    private String _frameId;
    private org.chromium.wip.protocol.input.dom.NodeValue _contentDocument;
    private java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> _shadowRoots;
    private org.chromium.wip.protocol.input.dom.NodeValue _templateContent;

    public M46(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String systemId() {
      return _systemId;
    }

    @Override
    public java.util.List<java.lang.String> attributes() {
      return _attributes;
    }

    @Override
    public org.chromium.wip.protocol.input.dom.NodeValue templateContent() {
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
    public org.chromium.wip.protocol.input.dom.NodeValue contentDocument() {
      return _contentDocument;
    }

    @Override
    public int nodeType() {
      return _nodeType;
    }

    @Override
    public int nodeId() {
      return _nodeId;
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
    public java.lang.String xmlVersion() {
      return _xmlVersion;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> children() {
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
    public java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> shadowRoots() {
      return _shadowRoots;
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
    public int childNodeCount() {
      return _childNodeCount;
    }

    @Override
    public java.lang.String internalSubset() {
      return _internalSubset;
    }
  }

  public static final class M47 implements org.chromium.wip.protocol.input.dom.PerformSearchData {
    private String _searchId;
    private int _resultCount;

    public M47(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String searchId() {
      return _searchId;
    }

    @Override
    public int resultCount() {
      return _resultCount;
    }
  }

  public static final class M48 implements org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData {
    private int _nodeId;

    public M48(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M49 implements org.chromium.wip.protocol.input.dom.QuerySelectorAllData {
    private int[] _nodeIds;

    public M49(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M50 implements org.chromium.wip.protocol.input.dom.QuerySelectorData {
    private int _nodeId;

    public M50(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M51 implements org.chromium.wip.protocol.input.dom.RequestNodeData {
    private int _nodeId;

    public M51(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M52 implements org.chromium.wip.protocol.input.dom.ResolveNodeData {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _object;

    public M52(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue object() {
      return _object;
    }
  }

  public static final class M53 implements org.chromium.wip.protocol.input.dom.SetChildNodesEventData {
    private int _parentId;
    private java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> _nodes;

    public M53(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> nodes() {
      return _nodes;
    }
  }

  public static final class M54 implements org.chromium.wip.protocol.input.dom.SetNodeNameData {
    private int _nodeId;

    public M54(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M55 implements org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData {
    private int _hostId;
    private int _rootId;

    public M55(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public int hostId() {
      return _hostId;
    }

    @Override
    public int rootId() {
      return _rootId;
    }
  }

  public static final class M56 implements org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData {
    private org.chromium.wip.protocol.input.dom.NodeValue _root;
    private int _hostId;

    public M56(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public int hostId() {
      return _hostId;
    }

    @Override
    public org.chromium.wip.protocol.input.dom.NodeValue root() {
      return _root;
    }
  }

  public static final class M57 implements org.chromium.wip.protocol.input.network.CachedResourceValue {
    private org.chromium.wip.protocol.input.page.ResourceTypeEnum _type;
    private String _url;
    private org.chromium.wip.protocol.input.network.ResponseValue _response;
    private double _bodySize;

    public M57(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.page.ResourceTypeEnum.class);
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
    public org.chromium.wip.protocol.input.page.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public org.chromium.wip.protocol.input.network.ResponseValue response() {
      return _response;
    }

    @Override
    public double bodySize() {
      return _bodySize;
    }
  }

  public static final class M58 implements org.chromium.wip.protocol.input.network.CanClearBrowserCacheData {
    private boolean _result;

    public M58(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M59 implements org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData {
    private boolean _result;

    public M59(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M60 implements org.chromium.wip.protocol.input.network.DataReceivedEventData {
    private double _timestamp;
    private String _requestId;
    private int _dataLength;
    private int _encodedDataLength;

    public M60(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M61 implements org.chromium.wip.protocol.input.network.GetResponseBodyData {
    private String _body;
    private boolean _base64Encoded;

    public M61(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean base64Encoded() {
      return _base64Encoded;
    }

    @Override
    public java.lang.String body() {
      return _body;
    }
  }

  public static final class M62 implements org.chromium.wip.protocol.input.network.HeadersValue {

    public M62(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M63 implements org.chromium.wip.protocol.input.network.InitiatorValue {
    private org.chromium.wip.protocol.input.network.InitiatorValue.Type _type;
    private java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> _stackTrace;
    private double _lineNumber;
    private String _url;

    public M63(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.network.InitiatorValue.Type.class);
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
    public java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> stackTrace() {
      return _stackTrace;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }

    @Override
    public org.chromium.wip.protocol.input.network.InitiatorValue.Type type() {
      return _type;
    }

    @Override
    public double lineNumber() {
      return _lineNumber;
    }
  }

  public static final class M64 implements org.chromium.wip.protocol.input.network.LoadingFailedEventData {
    private double _timestamp;
    private String _requestId;
    private String _errorText;
    private boolean _canceled;

    public M64(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M65 implements org.chromium.wip.protocol.input.network.LoadingFinishedEventData {
    private double _timestamp;
    private String _requestId;

    public M65(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M66 implements org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData {
    private String _requestId;

    public M66(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M67 implements org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.input.network.InitiatorValue _initiator;
    private org.chromium.wip.protocol.input.network.CachedResourceValue _resource;

    public M67(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.CachedResourceValue resource() {
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
    public java.lang.String loaderId() {
      return _loaderId;
    }

    @Override
    public org.chromium.wip.protocol.input.network.InitiatorValue initiator() {
      return _initiator;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M68 implements org.chromium.wip.protocol.input.network.RequestValue {
    private String _method;
    private String _url;
    private org.chromium.wip.protocol.input.network.HeadersValue _headers;
    private String _postData;

    public M68(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String postData() {
      return _postData;
    }

    @Override
    public org.chromium.wip.protocol.input.network.HeadersValue headers() {
      return _headers;
    }

    @Override
    public java.lang.String method() {
      return _method;
    }

    @Override
    public java.lang.String url() {
      return _url;
    }
  }

  public static final class M69 implements org.chromium.wip.protocol.input.network.RequestWillBeSentEventData {
    private double _timestamp;
    private String _documentURL;
    private String _frameId;
    private String _requestId;
    private String _loaderId;
    private org.chromium.wip.protocol.input.network.InitiatorValue _initiator;
    private org.chromium.wip.protocol.input.network.RequestValue _request;
    private org.chromium.wip.protocol.input.network.ResponseValue _redirectResponse;

    public M69(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.InitiatorValue initiator() {
      return _initiator;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.input.network.RequestValue request() {
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
    public org.chromium.wip.protocol.input.network.ResponseValue redirectResponse() {
      return _redirectResponse;
    }
  }

  public static final class M70 implements org.chromium.wip.protocol.input.network.ResourceTimingValue {
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

    public M70(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
  }

  public static final class M71 implements org.chromium.wip.protocol.input.network.ResponseReceivedEventData {
    private org.chromium.wip.protocol.input.page.ResourceTypeEnum _type;
    private double _timestamp;
    private String _frameId;
    private org.chromium.wip.protocol.input.network.ResponseValue _response;
    private String _requestId;
    private String _loaderId;

    public M71(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.page.ResourceTypeEnum.class);
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
    public org.chromium.wip.protocol.input.page.ResourceTypeEnum type() {
      return _type;
    }

    @Override
    public org.chromium.wip.protocol.input.network.ResponseValue response() {
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

  public static final class M72 implements org.chromium.wip.protocol.input.network.ResponseValue {
    private String _url;
    private org.chromium.wip.protocol.input.network.HeadersValue _headers;
    private double _status;
    private String _statusText;
    private String _headersText;
    private String _mimeType;
    private org.chromium.wip.protocol.input.network.HeadersValue _requestHeaders;
    private String _requestHeadersText;
    private boolean _connectionReused;
    private double _connectionId;
    private boolean _fromDiskCache;
    private org.chromium.wip.protocol.input.network.ResourceTimingValue _timing;

    public M72(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean fromDiskCache() {
      return _fromDiskCache;
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
    public org.chromium.wip.protocol.input.network.ResourceTimingValue timing() {
      return _timing;
    }

    @Override
    public java.lang.String requestHeadersText() {
      return _requestHeadersText;
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }

    @Override
    public double connectionId() {
      return _connectionId;
    }

    @Override
    public org.chromium.wip.protocol.input.network.HeadersValue requestHeaders() {
      return _requestHeaders;
    }

    @Override
    public double status() {
      return _status;
    }

    @Override
    public boolean connectionReused() {
      return _connectionReused;
    }

    @Override
    public java.lang.String headersText() {
      return _headersText;
    }

    @Override
    public org.chromium.wip.protocol.input.network.HeadersValue headers() {
      return _headers;
    }
  }

  public static final class M73 implements org.chromium.wip.protocol.input.network.WebSocketClosedEventData {
    private double _timestamp;
    private String _requestId;

    public M73(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M74 implements org.chromium.wip.protocol.input.network.WebSocketCreatedEventData {
    private String _url;
    private String _requestId;

    public M74(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String url() {
      return _url;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }
  }

  public static final class M75 implements org.chromium.wip.protocol.input.network.WebSocketFrameErrorEventData {
    private double _timestamp;
    private String _errorMessage;
    private String _requestId;

    public M75(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String errorMessage() {
      return _errorMessage;
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

  public static final class M76 implements org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.input.network.WebSocketFrameValue _response;
    private String _requestId;

    public M76(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.WebSocketFrameValue response() {
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

  public static final class M77 implements org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.input.network.WebSocketFrameValue _response;
    private String _requestId;

    public M77(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.WebSocketFrameValue response() {
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

  public static final class M78 implements org.chromium.wip.protocol.input.network.WebSocketFrameValue {
    private boolean _mask;
    private double _opcode;
    private String _payloadData;

    public M78(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String payloadData() {
      return _payloadData;
    }

    @Override
    public double opcode() {
      return _opcode;
    }

    @Override
    public boolean mask() {
      return _mask;
    }
  }

  public static final class M79 implements org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData {
    private double _timestamp;
    private org.chromium.wip.protocol.input.network.WebSocketResponseValue _response;
    private String _requestId;

    public M79(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.WebSocketResponseValue response() {
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

  public static final class M80 implements org.chromium.wip.protocol.input.network.WebSocketRequestValue {
    private org.chromium.wip.protocol.input.network.HeadersValue _headers;

    public M80(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.HeadersValue headers() {
      return _headers;
    }
  }

  public static final class M81 implements org.chromium.wip.protocol.input.network.WebSocketResponseValue {
    private org.chromium.wip.protocol.input.network.HeadersValue _headers;
    private double _status;
    private String _statusText;

    public M81(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.network.HeadersValue headers() {
      return _headers;
    }

    @Override
    public double status() {
      return _status;
    }

    @Override
    public java.lang.String statusText() {
      return _statusText;
    }
  }

  public static final class M82 implements org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData {
    private double _timestamp;
    private String _requestId;
    private org.chromium.wip.protocol.input.network.WebSocketRequestValue _request;

    public M82(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public double timestamp() {
      return _timestamp;
    }

    @Override
    public java.lang.String requestId() {
      return _requestId;
    }

    @Override
    public org.chromium.wip.protocol.input.network.WebSocketRequestValue request() {
      return _request;
    }
  }

  public static final class M83 implements org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData {
    private String _identifier;

    public M83(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M84 implements org.chromium.wip.protocol.input.page.CanContinuouslyPaintData {
    private boolean _value;

    public M84(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M85 implements org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData {
    private boolean _result;

    public M85(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M86 implements org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData {
    private boolean _result;

    public M86(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M87 implements org.chromium.wip.protocol.input.page.CanOverrideGeolocationData {
    private boolean _result;

    public M87(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M88 implements org.chromium.wip.protocol.input.page.CanShowDebugBordersData {
    private boolean _show;

    public M88(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M89 implements org.chromium.wip.protocol.input.page.CanShowFPSCounterData {
    private boolean _show;

    public M89(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M90 implements org.chromium.wip.protocol.input.page.CaptureScreenshotData {
    private String _data;

    public M90(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M91 implements org.chromium.wip.protocol.input.page.CookieValue {
    private String _name;
    private String _value;
    private int _size;
    private String _domain;
    private String _path;
    private double _expires;
    private boolean _httpOnly;
    private boolean _secure;
    private boolean _session;

    public M91(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public double expires() {
      return _expires;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public boolean session() {
      return _session;
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
    public int size() {
      return _size;
    }
  }

  public static final class M92 implements org.chromium.wip.protocol.input.page.DomContentEventFiredEventData {
    private double _timestamp;

    public M92(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M93 implements org.chromium.wip.protocol.input.page.FrameClearedScheduledNavigationEventData {
    private String _frameId;

    public M93(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M94 implements org.chromium.wip.protocol.input.page.FrameDetachedEventData {
    private String _frameId;

    public M94(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M95 implements org.chromium.wip.protocol.input.page.FrameNavigatedEventData {
    private org.chromium.wip.protocol.input.page.FrameValue _frame;

    public M95(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.page.FrameValue frame() {
      return _frame;
    }
  }

  public static final class M96 implements org.chromium.wip.protocol.input.page.FrameResourceTreeValue {
    private org.chromium.wip.protocol.input.page.FrameValue _frame;
    private java.util.List<org.chromium.wip.protocol.input.page.FrameResourceTreeValue> _childFrames;
    private java.util.List<org.chromium.wip.protocol.input.page.FrameResourceTreeValue.Resources> _resources;

    public M96(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.page.FrameResourceTreeValue> childFrames() {
      return _childFrames;
    }

    @Override
    public org.chromium.wip.protocol.input.page.FrameValue frame() {
      return _frame;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.page.FrameResourceTreeValue.Resources> resources() {
      return _resources;
    }
  }

  public static final class M98 implements org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData {
    private String _frameId;
    private double _delay;

    public M98(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String frameId() {
      return _frameId;
    }

    @Override
    public double delay() {
      return _delay;
    }
  }

  public static final class M99 implements org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData {
    private String _frameId;

    public M99(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M100 implements org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData {
    private String _frameId;

    public M100(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M101 implements org.chromium.wip.protocol.input.page.FrameValue {
    private String _name;
    private String _id;
    private String _url;
    private String _parentId;
    private String _loaderId;
    private String _mimeType;
    private String _securityOrigin;

    public M101(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String id() {
      return _id;
    }

    @Override
    public java.lang.String parentId() {
      return _parentId;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String loaderId() {
      return _loaderId;
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
    public java.lang.String securityOrigin() {
      return _securityOrigin;
    }
  }

  public static final class M102 implements org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData {
    private boolean _result;

    public M102(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M103 implements org.chromium.wip.protocol.input.page.GetCookiesData {
    private java.util.List<org.chromium.wip.protocol.input.page.CookieValue> _cookies;
    private String _cookiesString;

    public M103(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String cookiesString() {
      return _cookiesString;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.page.CookieValue> cookies() {
      return _cookies;
    }
  }

  public static final class M104 implements org.chromium.wip.protocol.input.page.GetResourceContentData {
    private String _content;
    private boolean _base64Encoded;

    public M104(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M105 implements org.chromium.wip.protocol.input.page.GetResourceTreeData {
    private org.chromium.wip.protocol.input.page.FrameResourceTreeValue _frameTree;

    public M105(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.page.FrameResourceTreeValue frameTree() {
      return _frameTree;
    }
  }

  public static final class M106 implements org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData {
    private org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData.Result _result;

    public M106(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("result")) {
          _result = readEnum(reader, "result", org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData.Result.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData.Result result() {
      return _result;
    }
  }

  public static final class M107 implements org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData {

    public M107(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.skipValue();
    }
  }

  public static final class M108 implements org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData {
    private String _message;

    public M108(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M109 implements org.chromium.wip.protocol.input.page.LoadEventFiredEventData {
    private double _timestamp;

    public M109(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M110 implements org.chromium.wip.protocol.input.page.ScriptsEnabledEventData {
    private boolean _isEnabled;

    public M110(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M111 implements org.chromium.wip.protocol.input.page.SearchInResourceData {
    private java.util.List<org.chromium.wip.protocol.input.page.SearchMatchValue> _result;

    public M111(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.page.SearchMatchValue> result() {
      return _result;
    }
  }

  public static final class M112 implements org.chromium.wip.protocol.input.page.SearchInResourcesData {
    private java.util.List<org.chromium.wip.protocol.input.page.SearchResultValue> _result;

    public M112(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.page.SearchResultValue> result() {
      return _result;
    }
  }

  public static final class M113 implements org.chromium.wip.protocol.input.page.SearchMatchValue {
    private double _lineNumber;
    private String _lineContent;

    public M113(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M114 implements org.chromium.wip.protocol.input.page.SearchResultValue {
    private String _url;
    private String _frameId;
    private double _matchesCount;

    public M114(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String url() {
      return _url;
    }

    @Override
    public double matchesCount() {
      return _matchesCount;
    }

    @Override
    public java.lang.String frameId() {
      return _frameId;
    }
  }

  public static final class M115 implements org.chromium.wip.protocol.input.runtime.CallFunctionOnData {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M115(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue result() {
      return _result;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }
  }

  public static final class M116 implements org.chromium.wip.protocol.input.runtime.EvaluateData {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _result;
    private boolean _wasThrown;

    public M116(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue result() {
      return _result;
    }
  }

  public static final class M117 implements org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData {
    private org.chromium.wip.protocol.input.runtime.ExecutionContextDescriptionValue _context;

    public M117(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.runtime.ExecutionContextDescriptionValue context() {
      return _context;
    }
  }

  public static final class M118 implements org.chromium.wip.protocol.input.runtime.ExecutionContextDescriptionValue {
    private String _name;
    private int _id;
    private String _frameId;
    private boolean _isPageContext;

    public M118(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

    @Override
    public boolean isPageContext() {
      return _isPageContext;
    }
  }

  public static final class M119 implements org.chromium.wip.protocol.input.runtime.GetPropertiesData {
    private java.util.List<org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue> _result;
    private java.util.List<org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue> _internalProperties;

    public M119(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue> internalProperties() {
      return _internalProperties;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue> result() {
      return _result;
    }
  }

  public static final class M120 implements org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _value;

    public M120(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue value() {
      return _value;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M121 implements org.chromium.wip.protocol.input.runtime.ObjectPreviewValue {
    private boolean _overflow;
    private java.util.List<org.chromium.wip.protocol.input.runtime.PropertyPreviewValue> _properties;
    private boolean _lossless;

    public M121(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.util.List<org.chromium.wip.protocol.input.runtime.PropertyPreviewValue> properties() {
      return _properties;
    }

    @Override
    public boolean lossless() {
      return _lossless;
    }

    @Override
    public boolean overflow() {
      return _overflow;
    }
  }

  public static final class M122 implements org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue {
    private String _name;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _get;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _value;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue _set;
    private boolean _wasThrown;
    private boolean _writable;
    private boolean _configurable;
    private boolean _enumerable;
    private boolean _isOwn;

    public M122(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public boolean isOwn() {
      return _isOwn;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue value() {
      return _value;
    }

    @Override
    public boolean wasThrown() {
      return _wasThrown;
    }

    @Override
    public boolean configurable() {
      return _configurable;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue set() {
      return _set;
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue get() {
      return _get;
    }
  }

  public static final class M123 implements org.chromium.wip.protocol.input.runtime.PropertyPreviewValue {
    private String _name;
    private org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Type _type;
    private String _value;
    private org.chromium.wip.protocol.input.runtime.ObjectPreviewValue _valuePreview;
    private org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Subtype _subtype;

    public M123(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, "name");
        }
        else if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = readString(reader, "value");
        }
        else if (name.equals("valuePreview")) {
          _valuePreview = new M121(reader);
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, "subtype", org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Subtype.class);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.ObjectPreviewValue valuePreview() {
      return _valuePreview;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Type type() {
      return _type;
    }

    @Override
    public java.lang.String value() {
      return _value;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M124 implements org.chromium.wip.protocol.input.runtime.RemoteObjectValue {
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Type _type;
    private java.lang.Object _value;
    private String _className;
    private org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Subtype _subtype;
    private String _description;
    private String _objectId;
    private org.chromium.wip.protocol.input.runtime.ObjectPreviewValue _preview;

    public M124(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Type.class);
        }
        else if (name.equals("value")) {
          _value = reader;
        }
        else if (name.equals("className")) {
          _className = readString(reader, "className");
        }
        else if (name.equals("subtype")) {
          _subtype = readEnum(reader, "subtype", org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Subtype.class);
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
    public org.chromium.wip.protocol.input.runtime.ObjectPreviewValue preview() {
      return _preview;
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
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Subtype subtype() {
      return _subtype;
    }

    @Override
    public java.lang.Object value() {
      return _value;
    }

    @Override
    public java.lang.String className() {
      return _className;
    }

    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue.Type type() {
      return _type;
    }
  }

  public static final class M125 implements org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData {
    private boolean _result;

    public M125(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M126 implements org.chromium.wip.protocol.input.timeline.EventRecordedEventData {
    private org.chromium.wip.protocol.input.timeline.TimelineEventValue _record;

    public M126(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.chromium.wip.protocol.input.timeline.TimelineEventValue record() {
      return _record;
    }
  }

  public static final class M127 implements org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData {
    private boolean _result;

    public M127(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M128 implements org.chromium.wip.protocol.input.timeline.TimelineEventValue {
    private String _type;
    private String _thread;
    private org.chromium.wip.protocol.input.timeline.TimelineEventValue.Data _data;
    private java.util.List<org.chromium.wip.protocol.input.timeline.TimelineEventValue> _children;

    public M128(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public java.lang.String thread() {
      return _thread;
    }

    @Override
    public org.chromium.wip.protocol.input.timeline.TimelineEventValue.Data data() {
      return _data;
    }

    @Override
    public java.util.List<org.chromium.wip.protocol.input.timeline.TimelineEventValue> children() {
      return _children;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M17 implements org.chromium.wip.protocol.input.debugger.PausedEventData.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M17(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M19 implements org.chromium.wip.protocol.input.debugger.RestartFrameData.Result {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M19(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M29 implements org.chromium.wip.protocol.input.debugger.SetScriptSourceData.Result {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M29(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M97 implements org.chromium.wip.protocol.input.page.FrameResourceTreeValue.Resources {
    private org.chromium.wip.protocol.input.page.ResourceTypeEnum _type;
    private String _url;
    private boolean _canceled;
    private String _mimeType;
    private boolean _failed;

    public M97(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readEnum(reader, "type", org.chromium.wip.protocol.input.page.ResourceTypeEnum.class);
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
    public boolean canceled() {
      return _canceled;
    }

    @Override
    public boolean failed() {
      return _failed;
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
    public org.chromium.wip.protocol.input.page.ResourceTypeEnum type() {
      return _type;
    }
  }

  public static final class M129 implements org.chromium.wip.protocol.input.timeline.TimelineEventValue.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M129(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M130 implements org.jetbrains.wip.protocol.WipCommandResponse {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private M134 lazy_0;
    private M132 lazy_1;
    private long _id;

    public M130(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.beginObject();
      while (reader.hasNext()) {
        if (reader.nextName().equals("id")) {
          _id = readLong(reader, "id");
          break;
        }
        else {
          reader.skipValue();
        }
      }
    }

    @Override
    public M132 asError() {
      if (lazy_1 == null) {
        try {
          lazy_1 = new M132(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
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
    public M134 asSuccess() {
      if (lazy_0 == null) {
        try {
          lazy_0 = new M134(inputReader);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M131 implements org.jetbrains.wip.protocol.WipCommandResponse.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M131(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M132 implements org.jetbrains.wip.protocol.WipCommandResponse.Error {
    private org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo _error;
    private org.jetbrains.wip.protocol.WipCommandResponse.Data _result;

    public M132(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.jetbrains.wip.protocol.WipCommandResponse.Data data() {
      return _result;
    }

    @Override
    public org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo error() {
      return _error;
    }
  }

  public static final class M133 implements org.jetbrains.wip.protocol.WipCommandResponse.Error.ErrorInfo {
    private java.util.List<String> _data;
    private String _message;
    private long _code;

    public M133(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  public static final class M134 implements org.jetbrains.wip.protocol.WipCommandResponse.Success {
    private org.jetbrains.wip.protocol.WipCommandResponse.Data _result;

    public M134(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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
    public org.jetbrains.wip.protocol.WipCommandResponse.Data data() {
      return _result;
    }

    @Override
    public void error() {

    }
  }

  public static final class M135 implements org.jetbrains.wip.protocol.WipEvent {
    private String _method;
    private org.jetbrains.wip.protocol.WipEvent.Data _params;

    public M135(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("method")) {
          _method = readString(reader, "method");
        }
        else if (name.equals("params")) {
          _params = new M136(reader);
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

  public static final class M136 implements org.jetbrains.wip.protocol.WipEvent.Data {
    private com.google.gson.stream.JsonReaderEx inputReader;

    public M136(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public com.google.gson.stream.JsonReaderEx getDeferredReader() {
      return inputReader;
    }}

  public static final class M137 implements org.jetbrains.wip.protocol.WipTabList {
    private com.google.gson.stream.JsonReaderEx inputReader;
    private java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> lazy_0;

    public M137(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      inputReader = reader.subReader();
      reader.skipValue();
    }

    @Override
    public java.util.List<org.jetbrains.wip.protocol.WipTabList.TabDescription> asTabList() {
      if (lazy_0 == null) {
        try {
          lazy_0 = readObjectArray(inputReader, null, new M138F(), false);
        }
        catch (IOException e) {
          throw new com.google.gson.JsonParseException(e);
        }
        inputReader = null;
      }
      return lazy_0;
    }
  }

  public static final class M138 implements org.jetbrains.wip.protocol.WipTabList.TabDescription {
    private String _url;
    private String _faviconUrl;
    private String _title;
    private String _thumbnailUrl;
    private String _devtoolsFrontendUrl;
    private String _webSocketDebuggerUrl;

    public M138(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
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

  static final class M22F extends ObjectFactory<org.chromium.wip.protocol.input.debugger.ScopeValue> {
    @Override
    public org.chromium.wip.protocol.input.debugger.ScopeValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M22(reader);
    }
  }

  static final class M128F extends ObjectFactory<org.chromium.wip.protocol.input.timeline.TimelineEventValue> {
    @Override
    public org.chromium.wip.protocol.input.timeline.TimelineEventValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M128(reader);
    }
  }

  static final class M6F extends ObjectFactory<org.chromium.wip.protocol.input.debugger.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.input.debugger.CallFrameValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M6(reader);
    }
  }

  static final class M113F extends ObjectFactory<org.chromium.wip.protocol.input.page.SearchMatchValue> {
    @Override
    public org.chromium.wip.protocol.input.page.SearchMatchValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M113(reader);
    }
  }

  static final class M122F extends ObjectFactory<org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M122(reader);
    }
  }

  static final class M138F extends ObjectFactory<org.jetbrains.wip.protocol.WipTabList.TabDescription> {
    @Override
    public org.jetbrains.wip.protocol.WipTabList.TabDescription read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M138(reader);
    }
  }

  static final class M15F extends ObjectFactory<org.chromium.wip.protocol.input.debugger.LocationValue> {
    @Override
    public org.chromium.wip.protocol.input.debugger.LocationValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M15(reader);
    }
  }

  static final class M91F extends ObjectFactory<org.chromium.wip.protocol.input.page.CookieValue> {
    @Override
    public org.chromium.wip.protocol.input.page.CookieValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M91(reader);
    }
  }

  static final class M38F extends ObjectFactory<org.chromium.wip.protocol.input.dom.EventListenerValue> {
    @Override
    public org.chromium.wip.protocol.input.dom.EventListenerValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M38(reader);
    }
  }

  static final class M96F extends ObjectFactory<org.chromium.wip.protocol.input.page.FrameResourceTreeValue> {
    @Override
    public org.chromium.wip.protocol.input.page.FrameResourceTreeValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M96(reader);
    }
  }

  static final class M97F extends ObjectFactory<org.chromium.wip.protocol.input.page.FrameResourceTreeValue.Resources> {
    @Override
    public org.chromium.wip.protocol.input.page.FrameResourceTreeValue.Resources read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M97(reader);
    }
  }

  static final class M46F extends ObjectFactory<org.chromium.wip.protocol.input.dom.NodeValue> {
    @Override
    public org.chromium.wip.protocol.input.dom.NodeValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M46(reader);
    }
  }

  static final class M114F extends ObjectFactory<org.chromium.wip.protocol.input.page.SearchResultValue> {
    @Override
    public org.chromium.wip.protocol.input.page.SearchResultValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M114(reader);
    }
  }

  static final class M0F extends ObjectFactory<org.chromium.wip.protocol.input.console.CallFrameValue> {
    @Override
    public org.chromium.wip.protocol.input.console.CallFrameValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M0(reader);
    }
  }

  static final class M120F extends ObjectFactory<org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue> {
    @Override
    public org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M120(reader);
    }
  }

  static final class M124F extends ObjectFactory<org.chromium.wip.protocol.input.runtime.RemoteObjectValue> {
    @Override
    public org.chromium.wip.protocol.input.runtime.RemoteObjectValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M124(reader);
    }
  }

  static final class M123F extends ObjectFactory<org.chromium.wip.protocol.input.runtime.PropertyPreviewValue> {
    @Override
    public org.chromium.wip.protocol.input.runtime.PropertyPreviewValue read(com.google.gson.stream.JsonReaderEx reader) throws java.io.IOException {
      return new M123(reader);
    }
  }

}