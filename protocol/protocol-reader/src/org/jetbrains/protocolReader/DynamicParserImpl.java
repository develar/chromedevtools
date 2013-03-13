// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.protocolReader;

import java.util.*;

public class DynamicParserImpl<ROOT> {
  final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
  private final ParserRootImpl<ROOT> rootImpl;

  public DynamicParserImpl(boolean isStatic, Class<ROOT> parserRootClass, Class[] protocolInterfaces) {
    typeToTypeHandler = new InterfaceReader(protocolInterfaces, false).go();
    rootImpl = new ParserRootImpl<ROOT>(parserRootClass, typeToTypeHandler);
  }

  static class EagerFieldParserImpl {
    private final List<LazyHandler> onDemandHandlers;

    EagerFieldParserImpl(List<LazyHandler> onDemandHandlers) {
      this.onDemandHandlers = onDemandHandlers;
    }

    void addAllFieldNames(Set<? super String> output) {
      for (LazyHandler handler : onDemandHandlers) {
        output.add(handler.getFieldName());
      }
    }
  }

  interface LazyHandler {
    String getFieldName();
  }

  // We should use it for static analysis later.
  static class FieldMap {
    final List<String> localNames = new ArrayList<String>(5);
    final List<String> overridenNames = new ArrayList<String>(1);
  }

  public GeneratedCodeMap generateStaticParser(StringBuilder stringBuilder, String packageName, String className, Collection<GeneratedCodeMap> basePackages) {
    final GlobalScope globalScope = new GlobalScope(typeToTypeHandler.values(), basePackages);
    FileScope fileScope = globalScope.newFileScope(stringBuilder);
    final TextOutput out = fileScope.getOutput();
    out.append("// This is a generated source.");
    out.newLine().append("package ").append(packageName).append(';');
    out.newLine().newLine().append("import org.jetbrains.jsonProtocol.*;");
    out.newLine().newLine().append("import static org.jetbrains.jsonProtocol.JsonReaders.*;");
    out.newLine().newLine().append("public final class ").append(className);
    out.append(" implements ").append(rootImpl.getType().getCanonicalName()).openBlock(false);

    final ClassScope rootClassScope = fileScope.newClassScope();
    rootImpl.writeStaticMethodJava(rootClassScope);

    for (TypeHandler<?> typeHandler : typeToTypeHandler.values()) {
      out.newLine();
      typeHandler.writeStaticClassJava(rootClassScope);
      out.newLine();
    }

    for (TypeHandler<?> typeHandler : globalScope.getTypeFactories()) {
      String name = globalScope.getTypeImplShortName(typeHandler);
      String originName = typeHandler.getTypeClass().getCanonicalName();
      out.newLine().append("static final class ").append(name).append(Util.TYPE_FACTORY_NAME_POSTFIX).append(" extends ObjectFactory<");
      out.append(originName).append('>').openBlock();
      out.append("@Override").newLine().append("public ").append(originName).append(" read(").append(Util.JSON_READER_PARAMETER_DEF);
      out.append(')').openBlock();
      out.append("return ");
      typeHandler.writeInstantiateCode(rootClassScope, out);
      out.append('(').append(Util.READER_NAME).append(");").closeBlock();
      out.closeBlock();
      out.newLine();
    }

    out.closeBlock();

    Map<Class<?>, String> typeToImplClassName = new HashMap<Class<?>, String>();
    for (TypeHandler<?> typeHandler : typeToTypeHandler.values()) {
      String shortName = fileScope.getTypeImplShortName(typeHandler);
      String fullReference = packageName + "." + className + "." + shortName;
      typeToImplClassName.put(typeHandler.getTypeClass(), fullReference);
    }

    return new GeneratedCodeMap(typeToImplClassName);
  }
}