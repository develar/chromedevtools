// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import gnu.trove.TObjectObjectProcedure;
import org.chromium.sdk.internal.protocolparser.JsonParserRoot;
import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.GlobalScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;
import org.chromium.sdk.internal.protocolparser.implutil.CommonImpl.ParseRuntimeException;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * Java dynamic-proxy based implementation of {@ link JsonProtocolParser}. It analyses
 * interfaces with reflection and provides their implementation by {@link Proxy} factory.
 * User-friendly 'root' interface is available by {@link #getParserRoot()} method.
 * @param <ROOT> root user-provided type (see {@link JsonParserRoot})
 */
public class DynamicParserImpl<ROOT> {
  final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
  private final ParserRootImpl<ROOT> rootImpl;

  /**
   * Constructs parser from a set of type interfaces and a list of base packages. Type interfaces
   * may reference to type interfaces from base packages.
   * @param basePackages list of base packages in form of list of {@link DynamicParserImpl}'s
   */
  public DynamicParserImpl(boolean isStatic, Class<ROOT> parserRootClass,
                           Class[] protocolInterfaces,
      List<DynamicParserImpl> basePackages) throws JsonProtocolModelParseException {
    this(isStatic, parserRootClass, protocolInterfaces, basePackages, false);
  }

  public DynamicParserImpl(boolean isStatic, Class<ROOT> parserRootClass, Class[] protocolInterfaces, List<DynamicParserImpl> basePackages, boolean strictMode) throws JsonProtocolModelParseException {
    typeToTypeHandler = readTypes(protocolInterfaces, basePackages, isStatic, strictMode);
    rootImpl = new ParserRootImpl<ROOT>(parserRootClass, typeToTypeHandler);
  }

  public DynamicParserImpl(boolean isStatic, Class<ROOT> parserRootClass, Class[] protocolInterfaces) throws JsonProtocolModelParseException {
    typeToTypeHandler = readTypes(protocolInterfaces, null, isStatic, false);
    rootImpl = new ParserRootImpl<ROOT>(parserRootClass, typeToTypeHandler);
  }

  public ROOT getParserRoot() {
    return rootImpl.getInstance();
  }

  private static Map<Class<?>, TypeHandler<?>> readTypes(Class[] protocolInterfaces,
                                                         List<DynamicParserImpl> basePackages,
                                                         boolean isStatic, boolean strictMode) throws JsonProtocolModelParseException {
    ReadInterfacesSession session = new ReadInterfacesSession(protocolInterfaces, basePackages, isStatic, strictMode);
    session.go();
    return session.getResult();
  }

  static class EagerFieldParserImpl extends TypeHandler.EagerFieldParser {
    private final List<LazyHandler> onDemandHandlers;

    EagerFieldParserImpl(List<LazyHandler> onDemandHandlers) {
      this.onDemandHandlers = onDemandHandlers;
    }

    @Override
    void parseAllFields(ObjectData objectData) throws JsonProtocolParseException {
      for (LazyHandler handler : onDemandHandlers) {
        handler.parseEager(objectData);
      }
    }
    @Override
    void addAllFieldNames(Set<? super String> output) {
      for (LazyHandler handler : onDemandHandlers) {
        output.add(handler.getFieldName());
      }
    }
  }

  interface LazyHandler {
    void parseEager(ObjectData objectData) throws JsonProtocolParseException;
    String getFieldName();
  }

  static class PreparsedFieldMethodHandler extends MethodHandler {
    private final int pos;
    private final FieldLoadedFinisher valueFinisher;
    private final String fieldName;

    PreparsedFieldMethodHandler(int pos, FieldLoadedFinisher valueFinisher, String fieldName) {
      this.pos = pos;
      this.valueFinisher = valueFinisher;
      this.fieldName = fieldName;
    }

    @Override
    Object handle(ObjectData objectData, Object[] args) throws Throwable {
      Object val = objectData.getFieldArray()[pos];
      if (valueFinisher != null) {
        val = valueFinisher.getValueForUser(val);
      }
      return val;
    }

    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(scope, m, Collections.<String>emptyList());
      out.openBlock();
      out.append("return ").append(FieldLoader.FIELD_PREFIX).append(fieldName).append(';');
      out.closeBlock();
    }
  }

  static SlowParser<Void> VOID_PARSER = new QuickParser<Void>(true) {
    @Override
    public Void parseValueQuick(Object value) {
      return null;
    }

    @Override
    public void appendFinishedValueTypeNameJava(TextOutput out) {
      out.append("Void");
    }

    @Override
    void writeParseQuickCode(MethodScope scope, String valueRef, String resultRef) {
      scope.startLine("Void " + resultRef + " = null;\n");
    }

    @Override
    void writeReadCode(MethodScope methodScope, TextOutput out) {
      out.append("null");
    }
  };

  static class SimpleCastParser<T> extends QuickParser<T> {
    private final Class<T> fieldType;

    SimpleCastParser(Class<T> fieldType, boolean nullable) {
      super(nullable);

      this.fieldType = fieldType;
    }

    @Override
    void writeReadCode(MethodScope methodScope, TextOutput out) {

    }

    @Override
    public T parseValueQuick(Object value) throws JsonProtocolParseException {
      if (value == null) {
        if (isNullable()) {
          return null;
        } else {
          throw new JsonProtocolParseException("Field must have type " + fieldType.getName());
        }
      }
      try {
        return fieldType.cast(value);
      } catch (ClassCastException e) {
        throw new JsonProtocolParseException("Field must have type " + fieldType.getName(), e);
      }
    }

    @Override
    public FieldLoadedFinisher getValueFinisher() {
      return null;
    }

    @Override
    public void appendFinishedValueTypeNameJava(TextOutput out) {
      out.append(fieldType.getCanonicalName());
    }

    @Override
    public void writeParseQuickCode(MethodScope scope, String valueRef,
        String resultRef) {
      TextOutput out = scope.getOutput();
      out.newLine().append(fieldType.getCanonicalName()).append(" ").append(resultRef);
      out.append(" = (").append(fieldType.getCanonicalName()).append(") ").append(valueRef).append(";");
    }

    //@Override
    //void writeReadCode(MethodScope methodScope, TextOutput out) {
    //
    //}
  }

  static MethodHandler RETURN_NULL_METHOD_HANDLER = new MethodHandler() {
    @Override
    Object handle(ObjectData objectData, Object[] args) throws Throwable {
      return null;
    }

    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(scope, m, Collections.<String>emptyList());
      out.openBlock();
      out.closeBlock();
    }
  };

  static class AutoSubtypeMethodHandler extends MethodHandler {
    private final int variantCodeField;
    private final int variantValueField;
    private final int code;

    AutoSubtypeMethodHandler(int variantCodeField, int variantValueField, int code) {
      this.variantCodeField = variantCodeField;
      this.variantValueField = variantValueField;
      this.code = code;
    }

    ObjectData getFieldObjectData(ObjectData objectData) {
      Object[] array = objectData.getFieldArray();
      Integer actualCode = (Integer) array[variantCodeField];
      if (code == actualCode) {
        return (ObjectData) array[variantValueField];
      } else {
        return null;
      }
    }

    @Override
    Object handle(ObjectData objectData, Object[] args) {
      ObjectData resData = getFieldObjectData(objectData);
      if (resData == null) {
        return null;
      } else {
        return resData.getProxy();
      }
    }

    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(scope, m, Collections.<String>emptyList());
      out.openBlock();
      out.append("return ").append(AutoAlgebraicCasesData.getAutoAlgFieldNameJava(code)).append(';');
      out.closeBlock();
    }
  }

  static class ManualAlgebraicCasesDataImpl extends AlgebraicCasesData {
    final List<RefToType<?>> subtypes = new ArrayList<RefToType<?>>();

    @Override
    List<RefToType<?>> getSubtypes() {
      return subtypes;
    }

    @Override
    void parseObjectSubtype(ObjectData objectData, Map<?, ?> jsonProperties, Object input) {
    }

    @Override
    void writeConstructorCodeJava(MethodScope methodScope) {
    }

    @Override
    void writeFiledsJava(ClassScope classScope) {
    }
  }

  static class RefImpl<T> extends RefToType<T> {
    final Class<T> typeClass;
    private TypeHandler<T> type;

    RefImpl(Class<T> typeClass) {
      this.typeClass = typeClass;
    }

    RefImpl(Class<T> typeClass, TypeHandler<T> typeHandler) {
      this.typeClass = typeClass;
      type = typeHandler;
    }

    @Override
    Class<?> getTypeClass() {
      return typeClass;
    }

    @Override
    TypeHandler<T> get() {
      return type;
    }

    void set(TypeHandler<?> type) {
      //noinspection unchecked
      this.type = (TypeHandler<T>)type;
    }
  }

  // We should use it for static analysis later.
  static class FieldMap {
    final List<String> localNames = new ArrayList<String>(5);
    final List<String> overridenNames = new ArrayList<String>(1);
  }

  public GeneratedCodeMap generateStaticParser(StringBuilder stringBuilder, String packageName,
      String className, Collection<GeneratedCodeMap> basePackages) {
    JavaCodeGenerator generator = new JavaCodeGenerator.Impl();

    GlobalScope globalScope = generator.newGlobalScope(typeToTypeHandler.values(), basePackages);

    FileScope fileScope = globalScope.newFileScope(stringBuilder);
    final TextOutput out = fileScope.getOutput();
    out.append("// This is a generated source.");
    out.newLine().append("package ").append(packageName).append(';');
    out.newLine().newLine().append("import org.jetbrains.jsonProtocol.LazyReadMessage;");
    out.newLine().newLine().append("import org.jetbrains.jsonProtocol.Message;");
    out.newLine().append("import org.jetbrains.jsonProtocol.ObjectFactory;");
    out.newLine().append("import com.google.gson.stream.JsonReader;");
    out.newLine().append("import java.io.IOException;");
    out.newLine().newLine().append("public class ").append(className);
    out.append(" implements ").append(rootImpl.getType().getCanonicalName()).openBlock();

    ClassScope rootClassScope = fileScope.newClassScope();
    rootImpl.writeStaticMethodJava(rootClassScope);
    out.newLine();

    for (TypeHandler<?> typeHandler : typeToTypeHandler.values()) {
      out.newLine();
      typeHandler.writeStaticClassJava(rootClassScope);
      out.newLine();
    }

    globalScope.forEachTypeFactory(new TObjectObjectProcedure<String, String>() {
      @Override
      public boolean execute(String name, String originName) {
        out.newLine().append("static final class ").append(name).append(Util.TYPE_FACTORY_NAME_POSTFIX).append(" extends ObjectFactory<").append(originName).append('>').openBlock();
        out.append("@Override").newLine().append("public ").append(originName).append(" read(JsonReader ").append(Util.READER_NAME).append(')').append(
          Util.THROWS_CLAUSE).openBlock();
        out.append("return new ").append(name).append("(reader);").closeBlock();
        out.closeBlock();
        return true;
      }
    });

    rootClassScope.writeClassMembers();
    out.closeBlock();
    out.newLine();

    Map<Class<?>, String> typeToImplClassName = new HashMap<Class<?>, String>();
    for (TypeHandler<?> typeHandler : typeToTypeHandler.values()) {
      String shortName = fileScope.getTypeImplShortName(typeHandler);
      String fullReference = packageName + "." + className + "." + shortName;
      typeToImplClassName.put(typeHandler.getTypeClass(), fullReference);
    }

    return new GeneratedCodeMap(typeToImplClassName);
  }
}
