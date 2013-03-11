// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.GeneratedCodeMap;
import org.chromium.protocolparser.ReaderGeneratorBase;
import org.chromium.sdk.internal.v8native.protocol.input.*;
import org.chromium.sdk.internal.v8native.protocol.input.data.*;
import org.jetbrains.v8.protocol.input.GeneratedReaderInterfaceList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A main class that generates V8 protocol static parser implementation.
 */
public class V8ReaderGenerator extends ReaderGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, createConfiguration());
  }

  public static GenerateConfiguration createConfiguration() {
    Class[] interfaces = new Class[]{
      IncomingMessage.class,
      EventNotification.class,
      EventNotificationBody.class,
      SuccessCommandResponse.class,
      FailedCommandResponse.class,
      CommandResponse.class,
      BreakEventBody.class,
      CommandResponseBody.class,
      BacktraceCommandBody.class,
      FrameObject.class,
      BreakpointBody.class,
      ScopeBody.class,
      ScopeRef.class,
      AfterCompileBody.class,
      ChangeLiveBody.class,
      RestartFrameBody.class,
      ListBreakpointsBody.class,
      ScriptCollectedBody.class,
      FlagsBody.class,

      SomeHandle.class,
      ScriptHandle.class,
      ValueHandle.class,
      RefWithDisplayData.class,
      PropertyObject.class,
      PropertyWithRef.class,
      PropertyWithValue.class,
      ObjectValueHandle.class,
      FunctionValueHandle.class,
      SomeRef.class,
      SomeSerialized.class,
      ContextHandle.class,
      ContextData.class,
      BreakpointInfo.class,
      ScriptWithId.class
    };

    List<Class> classes = Arrays.asList(interfaces);
    classes.addAll(Arrays.asList(GeneratedReaderInterfaceList.LIST));
    GeneratedCodeMap liveEditParserMap = buildParserMap(LiveEditReaderGenerator.createConfiguration());
    return new GenerateConfiguration("org.chromium.v8.protocol",
        "V8ProtocolReaderImpl", new DynamicParserImpl<V8ProtocolReader>(true, V8ProtocolReader.class, classes.toArray(new Class[classes.size()])),
        Collections.singletonList(liveEditParserMap));
  }
}
