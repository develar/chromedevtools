// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input;

@org.chromium.protocolParser.JsonParserRoot
public interface WipGeneratedParserRoot {
  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessageAddedEventData parseConsoleMessageAddedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData parseConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessagesClearedEventData parseConsoleMessagesClearedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData parseDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CanSetScriptSourceData parseDebuggerCanSetScriptSourceData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CausesRecompilationData parseDebuggerCausesRecompilationData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CompileScriptData parseDebuggerCompileScriptData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData parseDebuggerEvaluateOnCallFrameData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData parseDebuggerGetFunctionDetailsData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GetScriptSourceData parseDebuggerGetScriptSourceData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData parseDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.PausedEventData parseDebuggerPausedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.RestartFrameData parseDebuggerRestartFrameData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ResumedEventData parseDebuggerResumedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.RunScriptData parseDebuggerRunScriptData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData parseDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData parseDebuggerScriptParsedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SearchInContentData parseDebuggerSearchInContentData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData parseDebuggerSetBreakpointByUrlData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetBreakpointData parseDebuggerSetBreakpointData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetScriptSourceData parseDebuggerSetScriptSourceData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.AttributeModifiedEventData parseDOMAttributeModifiedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.AttributeRemovedEventData parseDOMAttributeRemovedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData parseDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeCountUpdatedEventData parseDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData parseDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData parseDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData parseDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetAttributesData parseDOMGetAttributesData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetDocumentData parseDOMGetDocumentData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData parseDOMGetEventListenersForNodeData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetOuterHTMLData parseDOMGetOuterHTMLData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetSearchResultsData parseDOMGetSearchResultsData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData parseDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.MoveToData parseDOMMoveToData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.PerformSearchData parseDOMPerformSearchData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData parseDOMPushNodeByPathToFrontendData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.QuerySelectorAllData parseDOMQuerySelectorAllData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.QuerySelectorData parseDOMQuerySelectorData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.RequestNodeData parseDOMRequestNodeData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ResolveNodeData parseDOMResolveNodeData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.SetChildNodesEventData parseDOMSetChildNodesEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.SetNodeNameData parseDOMSetNodeNameData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ShadowRootPoppedEventData parseDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData parseDOMShadowRootPushedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.CanClearBrowserCacheData parseNetworkCanClearBrowserCacheData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData parseNetworkCanClearBrowserCookiesData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.DataReceivedEventData parseNetworkDataReceivedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.GetResponseBodyData parseNetworkGetResponseBodyData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData parseNetworkLoadingFailedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData parseNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData parseNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData parseNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData parseNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData parseNetworkResponseReceivedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData parseNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData parseNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData parseNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData parseNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData parseNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData parseNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData parseNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData parsePageAddScriptToEvaluateOnLoadData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData parsePageCanContinuouslyPaintData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideDeviceMetricsData parsePageCanOverrideDeviceMetricsData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideDeviceOrientationData parsePageCanOverrideDeviceOrientationData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideGeolocationData parsePageCanOverrideGeolocationData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanShowDebugBordersData parsePageCanShowDebugBordersData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanShowFPSCounterData parsePageCanShowFPSCounterData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CaptureScreenshotData parsePageCaptureScreenshotData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData parsePageDomContentEventFiredEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData parsePageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameDetachedEventData parsePageFrameDetachedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameNavigatedEventData parsePageFrameNavigatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData parsePageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData parsePageFrameStartedLoadingEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData parsePageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetCompositingBordersVisibleData parsePageGetCompositingBordersVisibleData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetCookiesData parsePageGetCookiesData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetResourceContentData parsePageGetResourceContentData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetResourceTreeData parsePageGetResourceTreeData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData parsePageGetScriptExecutionStatusData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData parsePageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData parsePageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.LoadEventFiredEventData parsePageLoadEventFiredEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData parsePageScriptsEnabledEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.SearchInResourceData parsePageSearchInResourceData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.SearchInResourcesData parsePageSearchInResourcesData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.CallFunctionOnData parseRuntimeCallFunctionOnData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.EvaluateData parseRuntimeEvaluateData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData parseRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.GetPropertiesData parseRuntimeGetPropertiesData(com.google.gson.stream.JsonReader reader) throws java.io.IOException;

}
