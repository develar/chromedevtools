// Generated source
package org.chromium.wip.protocol.input;

public class GeneratedParserInterfaceList {
  public static final Class<?>[] LIST = {
    org.chromium.wip.protocol.input.console.CallFrameValue.class,
    org.chromium.wip.protocol.input.console.ConsoleMessageValue.class,
    org.chromium.wip.protocol.input.console.MessageAddedEventData.class,
    org.chromium.wip.protocol.input.console.MessageRepeatCountUpdatedEventData.class,
    org.chromium.wip.protocol.input.console.MessagesClearedEventData.class,
    org.chromium.wip.protocol.input.debugger.BreakpointResolvedEventData.class,
    org.chromium.wip.protocol.input.debugger.CallFrameValue.class,
    org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData.class,
    org.chromium.wip.protocol.input.debugger.CausesRecompilationData.class,
    org.chromium.wip.protocol.input.debugger.CompileScriptData.class,
    org.chromium.wip.protocol.input.debugger.EvaluateOnCallFrameData.class,
    org.chromium.wip.protocol.input.debugger.FunctionDetailsValue.class,
    org.chromium.wip.protocol.input.debugger.GetFunctionDetailsData.class,
    org.chromium.wip.protocol.input.debugger.GetScriptSourceData.class,
    org.chromium.wip.protocol.input.debugger.GlobalObjectClearedEventData.class,
    org.chromium.wip.protocol.input.debugger.LocationValue.class,
    org.chromium.wip.protocol.input.debugger.PausedEventData.class,
    org.chromium.wip.protocol.input.debugger.RestartFrameData.class,
    org.chromium.wip.protocol.input.debugger.ResumedEventData.class,
    org.chromium.wip.protocol.input.debugger.RunScriptData.class,
    org.chromium.wip.protocol.input.debugger.ScopeValue.class,
    org.chromium.wip.protocol.input.debugger.ScriptFailedToParseEventData.class,
    org.chromium.wip.protocol.input.debugger.ScriptParsedEventData.class,
    org.chromium.wip.protocol.input.debugger.SearchInContentData.class,
    org.chromium.wip.protocol.input.debugger.SetBreakpointByUrlData.class,
    org.chromium.wip.protocol.input.debugger.SetBreakpointData.class,
    org.chromium.wip.protocol.input.debugger.SetScriptSourceData.class,
    org.chromium.wip.protocol.input.debugger.SupportsSeparateScriptCompilationAndExecutionData.class,
    org.chromium.wip.protocol.input.dom.AttributeModifiedEventData.class,
    org.chromium.wip.protocol.input.dom.AttributeRemovedEventData.class,
    org.chromium.wip.protocol.input.dom.CharacterDataModifiedEventData.class,
    org.chromium.wip.protocol.input.dom.ChildNodeCountUpdatedEventData.class,
    org.chromium.wip.protocol.input.dom.ChildNodeInsertedEventData.class,
    org.chromium.wip.protocol.input.dom.ChildNodeRemovedEventData.class,
    org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData.class,
    org.chromium.wip.protocol.input.dom.EventListenerValue.class,
    org.chromium.wip.protocol.input.dom.GetAttributesData.class,
    org.chromium.wip.protocol.input.dom.GetDocumentData.class,
    org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData.class,
    org.chromium.wip.protocol.input.dom.GetOuterHTMLData.class,
    org.chromium.wip.protocol.input.dom.GetSearchResultsData.class,
    org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData.class,
    org.chromium.wip.protocol.input.dom.MoveToData.class,
    org.chromium.wip.protocol.input.dom.NodeValue.class,
    org.chromium.wip.protocol.input.dom.PerformSearchData.class,
    org.chromium.wip.protocol.input.dom.PushNodeByPathToFrontendData.class,
    org.chromium.wip.protocol.input.dom.QuerySelectorAllData.class,
    org.chromium.wip.protocol.input.dom.QuerySelectorData.class,
    org.chromium.wip.protocol.input.dom.RequestNodeData.class,
    org.chromium.wip.protocol.input.dom.ResolveNodeData.class,
    org.chromium.wip.protocol.input.dom.SetChildNodesEventData.class,
    org.chromium.wip.protocol.input.dom.SetNodeNameData.class,
    org.chromium.wip.protocol.input.dom.ShadowRootPoppedEventData.class,
    org.chromium.wip.protocol.input.dom.ShadowRootPushedEventData.class,
    org.chromium.wip.protocol.input.network.CachedResourceValue.class,
    org.chromium.wip.protocol.input.network.CanClearBrowserCacheData.class,
    org.chromium.wip.protocol.input.network.CanClearBrowserCookiesData.class,
    org.chromium.wip.protocol.input.network.DataReceivedEventData.class,
    org.chromium.wip.protocol.input.network.GetResponseBodyData.class,
    org.chromium.wip.protocol.input.network.HeadersValue.class,
    org.chromium.wip.protocol.input.network.InitiatorValue.class,
    org.chromium.wip.protocol.input.network.LoadingFailedEventData.class,
    org.chromium.wip.protocol.input.network.LoadingFinishedEventData.class,
    org.chromium.wip.protocol.input.network.RequestServedFromCacheEventData.class,
    org.chromium.wip.protocol.input.network.RequestServedFromMemoryCacheEventData.class,
    org.chromium.wip.protocol.input.network.RequestValue.class,
    org.chromium.wip.protocol.input.network.RequestWillBeSentEventData.class,
    org.chromium.wip.protocol.input.network.ResourceTimingValue.class,
    org.chromium.wip.protocol.input.network.ResponseReceivedEventData.class,
    org.chromium.wip.protocol.input.network.ResponseValue.class,
    org.chromium.wip.protocol.input.network.WebSocketClosedEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketCreatedEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketFrameErrorEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketFrameReceivedEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketFrameSentEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketFrameValue.class,
    org.chromium.wip.protocol.input.network.WebSocketHandshakeResponseReceivedEventData.class,
    org.chromium.wip.protocol.input.network.WebSocketRequestValue.class,
    org.chromium.wip.protocol.input.network.WebSocketResponseValue.class,
    org.chromium.wip.protocol.input.network.WebSocketWillSendHandshakeRequestEventData.class,
    org.chromium.wip.protocol.input.page.AddScriptToEvaluateOnLoadData.class,
    org.chromium.wip.protocol.input.page.CanContinuouslyPaintData.class,
    org.chromium.wip.protocol.input.page.CanOverrideDeviceMetricsData.class,
    org.chromium.wip.protocol.input.page.CanOverrideDeviceOrientationData.class,
    org.chromium.wip.protocol.input.page.CanOverrideGeolocationData.class,
    org.chromium.wip.protocol.input.page.CanShowDebugBordersData.class,
    org.chromium.wip.protocol.input.page.CanShowFPSCounterData.class,
    org.chromium.wip.protocol.input.page.CaptureScreenshotData.class,
    org.chromium.wip.protocol.input.page.CookieValue.class,
    org.chromium.wip.protocol.input.page.DomContentEventFiredEventData.class,
    org.chromium.wip.protocol.input.page.FrameClearedScheduledNavigationEventData.class,
    org.chromium.wip.protocol.input.page.FrameDetachedEventData.class,
    org.chromium.wip.protocol.input.page.FrameNavigatedEventData.class,
    org.chromium.wip.protocol.input.page.FrameResourceTreeValue.class,
    org.chromium.wip.protocol.input.page.FrameScheduledNavigationEventData.class,
    org.chromium.wip.protocol.input.page.FrameStartedLoadingEventData.class,
    org.chromium.wip.protocol.input.page.FrameStoppedLoadingEventData.class,
    org.chromium.wip.protocol.input.page.FrameValue.class,
    org.chromium.wip.protocol.input.page.GetCompositingBordersVisibleData.class,
    org.chromium.wip.protocol.input.page.GetCookiesData.class,
    org.chromium.wip.protocol.input.page.GetResourceContentData.class,
    org.chromium.wip.protocol.input.page.GetResourceTreeData.class,
    org.chromium.wip.protocol.input.page.GetScriptExecutionStatusData.class,
    org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData.class,
    org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData.class,
    org.chromium.wip.protocol.input.page.LoadEventFiredEventData.class,
    org.chromium.wip.protocol.input.page.ScriptsEnabledEventData.class,
    org.chromium.wip.protocol.input.page.SearchInResourceData.class,
    org.chromium.wip.protocol.input.page.SearchInResourcesData.class,
    org.chromium.wip.protocol.input.page.SearchMatchValue.class,
    org.chromium.wip.protocol.input.page.SearchResultValue.class,
    org.chromium.wip.protocol.input.runtime.CallFunctionOnData.class,
    org.chromium.wip.protocol.input.runtime.EvaluateData.class,
    org.chromium.wip.protocol.input.runtime.ExecutionContextCreatedEventData.class,
    org.chromium.wip.protocol.input.runtime.ExecutionContextDescriptionValue.class,
    org.chromium.wip.protocol.input.runtime.GetPropertiesData.class,
    org.chromium.wip.protocol.input.runtime.InternalPropertyDescriptorValue.class,
    org.chromium.wip.protocol.input.runtime.ObjectPreviewValue.class,
    org.chromium.wip.protocol.input.runtime.PropertyDescriptorValue.class,
    org.chromium.wip.protocol.input.runtime.PropertyPreviewValue.class,
    org.chromium.wip.protocol.input.runtime.RemoteObjectValue.class,

  };
}