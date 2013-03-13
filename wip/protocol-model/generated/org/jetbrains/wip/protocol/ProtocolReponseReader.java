// Generated source
package org.jetbrains.wip.protocol;

@org.chromium.protocolReader.JsonParserRoot
public interface ProtocolReponseReader {
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.console.MessageAddedEventData readConsoleMessageAddedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.console.MessageRepeatCountUpdatedEventData readConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.console.MessagesClearedEventData readConsoleMessagesClearedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.BreakpointResolvedEventData readDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.CanSetScriptSourceResult readDebuggerCanSetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.CausesRecompilationResult readDebuggerCausesRecompilationResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.CompileScriptResult readDebuggerCompileScriptResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.EvaluateOnCallFrameResult readDebuggerEvaluateOnCallFrameResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.GetFunctionDetailsResult readDebuggerGetFunctionDetailsResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.GetScriptSourceResult readDebuggerGetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.GlobalObjectClearedEventData readDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.PausedEventData readDebuggerPausedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.RestartFrameResult readDebuggerRestartFrameResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.ResumedEventData readDebuggerResumedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.RunScriptResult readDebuggerRunScriptResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.ScriptFailedToParseEventData readDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.ScriptParsedEventData readDebuggerScriptParsedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.SearchInContentResult readDebuggerSearchInContentResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.SetBreakpointByUrlResult readDebuggerSetBreakpointByUrlResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.SetBreakpointResult readDebuggerSetBreakpointResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.SetScriptSourceResult readDebuggerSetScriptSourceResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.debugger.SupportsSeparateScriptCompilationAndExecutionResult readDebuggerSupportsSeparateScriptCompilationAndExecutionResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.AttributeModifiedEventData readDOMAttributeModifiedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.AttributeRemovedEventData readDOMAttributeRemovedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.CharacterDataModifiedEventData readDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ChildNodeCountUpdatedEventData readDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ChildNodeInsertedEventData readDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ChildNodeRemovedEventData readDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.DocumentUpdatedEventData readDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.GetAttributesResult readDOMGetAttributesResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.GetDocumentResult readDOMGetDocumentResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.GetEventListenersForNodeResult readDOMGetEventListenersForNodeResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.GetOuterHTMLResult readDOMGetOuterHTMLResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.GetSearchResultsResult readDOMGetSearchResultsResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.InlineStyleInvalidatedEventData readDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.MoveToResult readDOMMoveToResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.PerformSearchResult readDOMPerformSearchResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.PushNodeByPathToFrontendResult readDOMPushNodeByPathToFrontendResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.QuerySelectorAllResult readDOMQuerySelectorAllResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.QuerySelectorResult readDOMQuerySelectorResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.RequestNodeResult readDOMRequestNodeResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ResolveNodeResult readDOMResolveNodeResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.SetChildNodesEventData readDOMSetChildNodesEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.SetNodeNameResult readDOMSetNodeNameResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ShadowRootPoppedEventData readDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.dom.ShadowRootPushedEventData readDOMShadowRootPushedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.CanClearBrowserCacheResult readNetworkCanClearBrowserCacheResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.CanClearBrowserCookiesResult readNetworkCanClearBrowserCookiesResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.DataReceivedEventData readNetworkDataReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.GetResponseBodyResult readNetworkGetResponseBodyResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.LoadingFailedEventData readNetworkLoadingFailedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.LoadingFinishedEventData readNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.RequestServedFromCacheEventData readNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.RequestServedFromMemoryCacheEventData readNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.RequestWillBeSentEventData readNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.ResponseReceivedEventData readNetworkResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketClosedEventData readNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketCreatedEventData readNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketFrameErrorEventData readNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketFrameReceivedEventData readNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketFrameSentEventData readNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketHandshakeResponseReceivedEventData readNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.network.WebSocketWillSendHandshakeRequestEventData readNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.AddScriptToEvaluateOnLoadResult readPageAddScriptToEvaluateOnLoadResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanContinuouslyPaintResult readPageCanContinuouslyPaintResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanOverrideDeviceMetricsResult readPageCanOverrideDeviceMetricsResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanOverrideDeviceOrientationResult readPageCanOverrideDeviceOrientationResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanOverrideGeolocationResult readPageCanOverrideGeolocationResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanShowDebugBordersResult readPageCanShowDebugBordersResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CanShowFPSCounterResult readPageCanShowFPSCounterResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.CaptureScreenshotResult readPageCaptureScreenshotResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.DomContentEventFiredEventData readPageDomContentEventFiredEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameClearedScheduledNavigationEventData readPageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameDetachedEventData readPageFrameDetachedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameNavigatedEventData readPageFrameNavigatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameScheduledNavigationEventData readPageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameStartedLoadingEventData readPageFrameStartedLoadingEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.FrameStoppedLoadingEventData readPageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.GetCompositingBordersVisibleResult readPageGetCompositingBordersVisibleResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.GetCookiesResult readPageGetCookiesResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.GetResourceContentResult readPageGetResourceContentResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.GetResourceTreeResult readPageGetResourceTreeResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.GetScriptExecutionStatusResult readPageGetScriptExecutionStatusResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.JavascriptDialogClosedEventData readPageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.JavascriptDialogOpeningEventData readPageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.LoadEventFiredEventData readPageLoadEventFiredEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.ScriptsEnabledEventData readPageScriptsEnabledEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.SearchInResourceResult readPageSearchInResourceResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.page.SearchInResourcesResult readPageSearchInResourcesResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.runtime.CallFunctionOnResult readRuntimeCallFunctionOnResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.runtime.EvaluateResult readRuntimeEvaluateResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.runtime.ExecutionContextCreatedEventData readRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.runtime.GetPropertiesResult readRuntimeGetPropertiesResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.timeline.CanMonitorMainThreadResult readTimelineCanMonitorMainThreadResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.timeline.EventRecordedEventData readTimelineEventRecordedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.wip.protocol.timeline.SupportsFrameInstrumentationResult readTimelineSupportsFrameInstrumentationResult(com.google.gson.stream.JsonReaderEx reader);

}