// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.protocolReader;

import org.jetbrains.protocolReader.DynamicParserImpl;
import org.jetbrains.protocolReader.GeneratedCodeMap;
import org.jetbrains.protocolReader.ReaderGenerator;
import org.chromium.sdk.internal.v8native.protocol.input.*;
import org.chromium.sdk.internal.v8native.protocol.input.data.*;
import org.jetbrains.v8.protocol.GeneratedReaderInterfaceList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class V8ReaderGenerator extends ReaderGenerator {
  public static void main(String[] args) throws IOException {
    mainImpl(args, createConfiguration());
  }

  public static GenerateConfiguration createConfiguration() {
    Class<?>[] interfaces = new Class<?>[]{
      IncomingMessage.class,
      EventNotification.class,
      EventNotificationBody.class,
      CommandResponse.class,
      BreakEventBody.class,
      CommandResponseBody.class,
      BacktraceCommandBody.class,
      FrameObject.class,
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
      PropertyObject.class,
      ObjectValueHandle.class,
      ContextHandle.class,
      ContextData.class,
      BreakpointInfo.class,
      ScriptWithId.class
    };

    List<Class<?>> classes = new ArrayList<Class<?>>(Arrays.asList(interfaces));
    classes.addAll(Arrays.asList(GeneratedReaderInterfaceList.LIST));
    GeneratedCodeMap liveEditParserMap = buildParserMap(LiveEditReaderGenerator.createConfiguration());
    return new GenerateConfiguration("org.chromium.v8.protocol",
        "V8ProtocolReaderImpl", new DynamicParserImpl<V8ProtocolReader>(V8ProtocolReader.class, classes.toArray(new Class[classes.size()])),
        Collections.singletonList(liveEditParserMap));
  }
}
