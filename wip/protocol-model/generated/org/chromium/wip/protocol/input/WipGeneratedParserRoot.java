// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input;

@org.chromium.protocolParser.JsonParserRoot
public interface WipGeneratedParserRoot {
  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessageAddedEventData parseConsoleMessageAddedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessageRepeatCountUpdatedEventData parseConsoleMessageRepeatCountUpdatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputconsole.MessagesClearedEventData parseConsoleMessagesClearedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.BreakpointResolvedEventData parseDebuggerBreakpointResolvedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CanSetScriptSourceData parseDebuggerCanSetScriptSourceData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CausesRecompilationData parseDebuggerCausesRecompilationData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.CompileScriptData parseDebuggerCompileScriptData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.EvaluateOnCallFrameData parseDebuggerEvaluateOnCallFrameData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GetFunctionDetailsData parseDebuggerGetFunctionDetailsData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GetScriptSourceData parseDebuggerGetScriptSourceData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.GlobalObjectClearedEventData parseDebuggerGlobalObjectClearedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.PausedEventData parseDebuggerPausedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.RestartFrameData parseDebuggerRestartFrameData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ResumedEventData parseDebuggerResumedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.RunScriptData parseDebuggerRunScriptData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ScriptFailedToParseEventData parseDebuggerScriptFailedToParseEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.ScriptParsedEventData parseDebuggerScriptParsedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SearchInContentData parseDebuggerSearchInContentData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetBreakpointByUrlData parseDebuggerSetBreakpointByUrlData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetBreakpointData parseDebuggerSetBreakpointData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SetScriptSourceData parseDebuggerSetScriptSourceData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdebugger.SupportsSeparateScriptCompilationAndExecutionData parseDebuggerSupportsSeparateScriptCompilationAndExecutionData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.AttributeModifiedEventData parseDOMAttributeModifiedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.AttributeRemovedEventData parseDOMAttributeRemovedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.CharacterDataModifiedEventData parseDOMCharacterDataModifiedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeCountUpdatedEventData parseDOMChildNodeCountUpdatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData parseDOMChildNodeInsertedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ChildNodeRemovedEventData parseDOMChildNodeRemovedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData parseDOMDocumentUpdatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetAttributesData parseDOMGetAttributesData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetDocumentData parseDOMGetDocumentData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetEventListenersForNodeData parseDOMGetEventListenersForNodeData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetOuterHTMLData parseDOMGetOuterHTMLData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.GetSearchResultsData parseDOMGetSearchResultsData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData parseDOMInlineStyleInvalidatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.MoveToData parseDOMMoveToData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.PerformSearchData parseDOMPerformSearchData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.PushNodeByPathToFrontendData parseDOMPushNodeByPathToFrontendData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.QuerySelectorAllData parseDOMQuerySelectorAllData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.QuerySelectorData parseDOMQuerySelectorData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.RequestNodeData parseDOMRequestNodeData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ResolveNodeData parseDOMResolveNodeData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.SetChildNodesEventData parseDOMSetChildNodesEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.SetNodeNameData parseDOMSetNodeNameData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ShadowRootPoppedEventData parseDOMShadowRootPoppedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputdom.ShadowRootPushedEventData parseDOMShadowRootPushedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.CanClearBrowserCacheData parseNetworkCanClearBrowserCacheData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.CanClearBrowserCookiesData parseNetworkCanClearBrowserCookiesData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.DataReceivedEventData parseNetworkDataReceivedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.GetResponseBodyData parseNetworkGetResponseBodyData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.LoadingFailedEventData parseNetworkLoadingFailedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.LoadingFinishedEventData parseNetworkLoadingFinishedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestServedFromCacheEventData parseNetworkRequestServedFromCacheEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestServedFromMemoryCacheEventData parseNetworkRequestServedFromMemoryCacheEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.RequestWillBeSentEventData parseNetworkRequestWillBeSentEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.ResponseReceivedEventData parseNetworkResponseReceivedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData parseNetworkWebSocketClosedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketCreatedEventData parseNetworkWebSocketCreatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameErrorEventData parseNetworkWebSocketFrameErrorEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameReceivedEventData parseNetworkWebSocketFrameReceivedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketFrameSentEventData parseNetworkWebSocketFrameSentEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketHandshakeResponseReceivedEventData parseNetworkWebSocketHandshakeResponseReceivedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputnetwork.WebSocketWillSendHandshakeRequestEventData parseNetworkWebSocketWillSendHandshakeRequestEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.AddScriptToEvaluateOnLoadData parsePageAddScriptToEvaluateOnLoadData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData parsePageCanContinuouslyPaintData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideDeviceMetricsData parsePageCanOverrideDeviceMetricsData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideDeviceOrientationData parsePageCanOverrideDeviceOrientationData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanOverrideGeolocationData parsePageCanOverrideGeolocationData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanShowDebugBordersData parsePageCanShowDebugBordersData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CanShowFPSCounterData parsePageCanShowFPSCounterData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.CaptureScreenshotData parsePageCaptureScreenshotData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.DomContentEventFiredEventData parsePageDomContentEventFiredEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameClearedScheduledNavigationEventData parsePageFrameClearedScheduledNavigationEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameDetachedEventData parsePageFrameDetachedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameNavigatedEventData parsePageFrameNavigatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameScheduledNavigationEventData parsePageFrameScheduledNavigationEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameStartedLoadingEventData parsePageFrameStartedLoadingEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.FrameStoppedLoadingEventData parsePageFrameStoppedLoadingEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetCompositingBordersVisibleData parsePageGetCompositingBordersVisibleData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetCookiesData parsePageGetCookiesData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetResourceContentData parsePageGetResourceContentData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetResourceTreeData parsePageGetResourceTreeData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.GetScriptExecutionStatusData parsePageGetScriptExecutionStatusData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData parsePageJavascriptDialogClosedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData parsePageJavascriptDialogOpeningEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.LoadEventFiredEventData parsePageLoadEventFiredEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.ScriptsEnabledEventData parsePageScriptsEnabledEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.SearchInResourceData parsePageSearchInResourceData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputpage.SearchInResourcesData parsePageSearchInResourcesData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.CallFunctionOnData parseRuntimeCallFunctionOnData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.EvaluateData parseRuntimeEvaluateData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.ExecutionContextCreatedEventData parseRuntimeExecutionContextCreatedEventData(JsonReader reader);

  @org.chromium.protocolParser.JsonParseMethod
  org.chromium.wip.protocol.inputruntime.GetPropertiesData parseRuntimeGetPropertiesData(JsonReader reader);

}
