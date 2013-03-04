// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import gnu.trove.TObjectProcedure;

import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Java dynamic-proxy based implementation of {@_link JsonProtocolParser}. It analyses
 * interfaces with reflection and provides their implementation by {@link Proxy} factory.
 * User-friendly 'root' interface is available by {@link #getParserRoot()} method.
 * @param <ROOT> root user-provided type (see {@link org.chromium.protocolParser.JsonParserRoot})
 */
public class DynamicParserImpl<ROOT> {
  final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
  private final ParserRootImpl<ROOT> rootImpl;

  public DynamicParserImpl(boolean isStatic, Class<ROOT> parserRootClass, Class[] protocolInterfaces) {
    typeToTypeHandler = new InterfaceReader(protocolInterfaces, isStatic, false).go();
    rootImpl = new ParserRootImpl<ROOT>(parserRootClass, typeToTypeHandler);
  }

  public ROOT getParserRoot() {
    return rootImpl.getInstance();
  }

  static class EagerFieldParserImpl extends TypeHandler.EagerFieldParser {
    private final List<LazyHandler> onDemandHandlers;

    EagerFieldParserImpl(List<LazyHandler> onDemandHandlers) {
      this.onDemandHandlers = onDemandHandlers;
    }

    @Override
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

  public GeneratedCodeMap generateStaticParser(StringBuilder stringBuilder, String packageName,
      String className, Collection<GeneratedCodeMap> basePackages) {
    JavaCodeGenerator generator = new JavaCodeGenerator.Impl();

    final JavaCodeGenerator.GlobalScope globalScope = generator.newGlobalScope(typeToTypeHandler.values(), basePackages);

    JavaCodeGenerator.FileScope fileScope = globalScope.newFileScope(stringBuilder);
    final TextOutput out = fileScope.getOutput();
    out.append("// This is a generated source.");
    out.newLine().append("package ").append(packageName).append(';');
    out.newLine().newLine().append("import org.jetbrains.jsonProtocol.*;");
    out.newLine().append("import com.google.gson.stream.JsonReader;");
    out.newLine().append("import com.google.gson.JsonParseException;");
    out.newLine().append("import java.io.IOException;");
    out.newLine().newLine().append("public final class ").append(className);
    out.append(" implements ").append(rootImpl.getType().getCanonicalName()).openBlock(false);

    final ClassScope rootClassScope = fileScope.newClassScope();
    rootImpl.writeStaticMethodJava(rootClassScope);

    for (TypeHandler<?> typeHandler : typeToTypeHandler.values()) {
      out.newLine();
      typeHandler.writeStaticClassJava(rootClassScope);
      out.newLine();
    }

    globalScope.forEachTypeFactory(new TObjectProcedure<TypeHandler>() {
      @Override
      public boolean execute(TypeHandler typeHandler) {
        String name = globalScope.getTypeImplShortName(typeHandler);
        String originName = typeHandler.getTypeClass().getCanonicalName();
        out.newLine().append("static final class ").append(name).append(Util.TYPE_FACTORY_NAME_POSTFIX).append(" extends ObjectFactory<").append(originName).append('>').openBlock();
        out.append("@Override").newLine().append("public ").append(originName).append(" read(JsonReader ").append(Util.READER_NAME).append(
          ')');
        out.append(Util.THROWS_CLAUSE).openBlock();
        out.append("return ");
        typeHandler.writeInstantiateCode(rootClassScope, out);
        out.append('(').append(Util.READER_NAME).append(");").closeBlock();
        out.closeBlock();
        out.newLine();
        return true;
      }
    });

    rootClassScope.writeClassMembers();
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
