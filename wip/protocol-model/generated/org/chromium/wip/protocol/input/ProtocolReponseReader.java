// Generated source
package org.chromium.wip.protocol.input;

@org.chromium.protocolReader.JsonParserRoot
public interface ProtocolReponseReader {
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.console.MessageAddedEventData readConsoleMessageAddedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData readConsoleMessageRepeatCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.console.MessagesClearedEventData readConsoleMessagesClearedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData readDebuggerBreakpointResolvedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData readDebuggerCanSetScriptSourceData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.CausesRecompilationData readDebuggerCausesRecompilationData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.CompileScriptData readDebuggerCompileScriptData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData readDebuggerEvaluateOnCallFrameData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData readDebuggerGetFunctionDetailsData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.GetScriptSourceData readDebuggerGetScriptSourceData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData readDebuggerGlobalObjectClearedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.PausedEventData readDebuggerPausedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.RestartFrameData readDebuggerRestartFrameData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.ResumedEventData readDebuggerResumedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.RunScriptData readDebuggerRunScriptData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData readDebuggerScriptFailedToParseEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.ScriptParsedEventData readDebuggerScriptParsedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.SearchInContentData readDebuggerSearchInContentData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData readDebuggerSetBreakpointByUrlData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.SetBreakpointData readDebuggerSetBreakpointData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.SetScriptSourceData readDebuggerSetScriptSourceData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData readDebuggerSupportsSeparateScriptCompilationAndExecutionData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.AttributeModifiedEventData readDOMAttributeModifiedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.AttributeRemovedEventData readDOMAttributeRemovedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData readDOMCharacterDataModifiedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData readDOMChildNodeCountUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData readDOMChildNodeInsertedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData readDOMChildNodeRemovedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData readDOMDocumentUpdatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.GetAttributesData readDOMGetAttributesData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.GetDocumentData readDOMGetDocumentData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData readDOMGetEventListenersForNodeData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.GetOuterHTMLData readDOMGetOuterHTMLData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.GetSearchResultsData readDOMGetSearchResultsData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData readDOMInlineStyleInvalidatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.MoveToData readDOMMoveToData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.PerformSearchData readDOMPerformSearchData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData readDOMPushNodeByPathToFrontendData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.QuerySelectorAllData readDOMQuerySelectorAllData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.QuerySelectorData readDOMQuerySelectorData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.RequestNodeData readDOMRequestNodeData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ResolveNodeData readDOMResolveNodeData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.SetChildNodesEventData readDOMSetChildNodesEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.SetNodeNameData readDOMSetNodeNameData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData readDOMShadowRootPoppedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData readDOMShadowRootPushedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.CanClearBrowserCacheData readNetworkCanClearBrowserCacheData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData readNetworkCanClearBrowserCookiesData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.DataReceivedEventData readNetworkDataReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.GetResponseBodyData readNetworkGetResponseBodyData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.LoadingFailedEventData readNetworkLoadingFailedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.LoadingFinishedEventData readNetworkLoadingFinishedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData readNetworkRequestServedFromCacheEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData readNetworkRequestServedFromMemoryCacheEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.RequestWillBeSentEventData readNetworkRequestWillBeSentEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.ResponseReceivedEventData readNetworkResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketClosedEventData readNetworkWebSocketClosedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketCreatedEventData readNetworkWebSocketCreatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketFrameErrorEventData readNetworkWebSocketFrameErrorEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData readNetworkWebSocketFrameReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData readNetworkWebSocketFrameSentEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData readNetworkWebSocketHandshakeResponseReceivedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData readNetworkWebSocketWillSendHandshakeRequestEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData readPageAddScriptToEvaluateOnLoadData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanContinuouslyPaintData readPageCanContinuouslyPaintData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData readPageCanOverrideDeviceMetricsData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData readPageCanOverrideDeviceOrientationData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanOverrideGeolocationData readPageCanOverrideGeolocationData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanShowDebugBordersData readPageCanShowDebugBordersData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CanShowFPSCounterData readPageCanShowFPSCounterData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.CaptureScreenshotData readPageCaptureScreenshotData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.DomContentEventFiredEventData readPageDomContentEventFiredEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameClearedScheduledNavigationEventData readPageFrameClearedScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameDetachedEventData readPageFrameDetachedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameNavigatedEventData readPageFrameNavigatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData readPageFrameScheduledNavigationEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData readPageFrameStartedLoadingEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData readPageFrameStoppedLoadingEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData readPageGetCompositingBordersVisibleData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.GetCookiesData readPageGetCookiesData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.GetResourceContentData readPageGetResourceContentData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.GetResourceTreeData readPageGetResourceTreeData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData readPageGetScriptExecutionStatusData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData readPageJavascriptDialogClosedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData readPageJavascriptDialogOpeningEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.LoadEventFiredEventData readPageLoadEventFiredEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.ScriptsEnabledEventData readPageScriptsEnabledEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.SearchInResourceData readPageSearchInResourceData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.page.SearchInResourcesData readPageSearchInResourcesData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.runtime.CallFunctionOnData readRuntimeCallFunctionOnData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.runtime.EvaluateData readRuntimeEvaluateData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData readRuntimeExecutionContextCreatedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.runtime.GetPropertiesData readRuntimeGetPropertiesData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.timeline.CanMonitorMainThreadData readTimelineCanMonitorMainThreadData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.timeline.EventRecordedEventData readTimelineEventRecordedEventData(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.chromium.wip.protocol.input.timeline.SupportsFrameInstrumentationData readTimelineSupportsFrameInstrumentationData(com.google.gson.stream.JsonReaderEx reader);

}