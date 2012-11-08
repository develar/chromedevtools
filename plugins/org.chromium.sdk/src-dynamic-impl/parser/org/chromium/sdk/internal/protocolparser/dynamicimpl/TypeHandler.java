// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.protocolparser.JsonType;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl.VolatileFieldBinding;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;
import org.json.simple.JSONObject;

/**
 * The instance of this class corresponds to a particular json type. Primarily it serves
 * as a factory for dynamic proxy/{@link ObjectData}, but also plays a role of type
 * descriptor object.
 */
class TypeHandler<T> {

  private final Class<T> typeClass;
  private Constructor<? extends T> proxyClassConstructor;

  /** Size of array that holds type-specific instance data. */
  private final int fieldArraySize;

  private final List<VolatileFieldBinding> volatileFields;

  /** Method implementation for dynamic proxy. */
  private final Map<Method, MethodHandler> methodHandlerMap;

  /** Loaders that should read values and save them in field array on parse time. */
  private final List<FieldLoader> fieldLoaders;

  /** Set of parsers that non-lazyly check that all fields read OK. */
  private final EagerFieldParser eagerFieldParser;

  /** Holds the data about recognizing subtypes. */
  private final AlgebraicCasesData algCasesData;

  /** Full set of allowed field names. Should be used to check that JSON object is well-formed. */
  private Set<String> closedNameSet;

  /** Subtype aspects of the type or null */
  private final SubtypeAspect subtypeAspect;

  private final boolean requiresJsonObject;

  private final boolean checkLazyParsedFields;

  TypeHandler(Class<T> typeClass, RefToType<?> jsonSuperClass, int fieldArraySize,
      List<VolatileFieldBinding> volatileFields,
      Map<Method, MethodHandler> methodHandlerMap,
      List<FieldLoader> fieldLoaders,
      List<FieldCondition> fieldConditions, EagerFieldParser eagerFieldParser,
      AlgebraicCasesData algCasesData, boolean requiresJsonObject,
      boolean checkLazyParsedFields) {
    this.typeClass = typeClass;
    this.fieldArraySize = fieldArraySize;
    this.volatileFields = volatileFields;
    this.methodHandlerMap = methodHandlerMap;
    this.fieldLoaders = fieldLoaders;
    this.eagerFieldParser = eagerFieldParser;
    this.algCasesData = algCasesData;
    this.requiresJsonObject = requiresJsonObject;
    this.checkLazyParsedFields = checkLazyParsedFields;
    if (jsonSuperClass == null) {
      if (!fieldConditions.isEmpty()) {
        throw new IllegalArgumentException();
      }
      subtypeAspect = new AbsentSubtypeAspect();
    } else {
      subtypeAspect = new ExistingSubtypeAspect(jsonSuperClass, fieldConditions);
    }
  }

  public Class<T> getTypeClass() {
    return typeClass;
  }

  public ObjectData parse(Object input, ObjectData superObjectData)
      throws JsonProtocolParseException {
    try {
      subtypeAspect.checkSuperObject(superObjectData);

      Map<?, ?> jsonProperties = null;
      if (input instanceof JSONObject) {
        jsonProperties = (JSONObject) input;
      }

      ObjectData objectData = new ObjectData(this, input, fieldArraySize, volatileFields.size(),
          superObjectData);
      if (requiresJsonObject && jsonProperties == null) {
        throw new JsonProtocolParseException("JSON object input expected");
      }

      for (FieldLoader fieldLoader : fieldLoaders) {
        String fieldName = fieldLoader.getFieldName();
        Object value = jsonProperties.get(fieldName);
        boolean hasValue = value != null || jsonProperties.containsKey(fieldName);
        fieldLoader.parse(hasValue, value, objectData);
      }

      if (closedNameSet != null) {
        for (Object fieldNameObject : jsonProperties.keySet()) {
          if (!closedNameSet.contains(fieldNameObject)) {
            throw new JsonProtocolParseException("Unexpected field " + fieldNameObject);
          }
        }
      }

      parseObjectSubtype(objectData, jsonProperties, input);

      if (checkLazyParsedFields) {
        eagerFieldParser.parseAllFields(objectData);
      }
      wrapInProxy(objectData, methodHandlerMap);
      return objectData;
    } catch (JsonProtocolParseException e) {
      throw new JsonProtocolParseException("Failed to parse type " + getTypeClass().getName(), e);
    }
  }

  public T parseRoot(Object input) throws JsonProtocolParseException {
    ObjectData baseData = parseRootImpl(input);
    return typeClass.cast(baseData.getProxy());
  }

  public ObjectData parseRootImpl(Object input) throws JsonProtocolParseException {
    return subtypeAspect.parseFromSuper(input);
  }

  SubtypeSupport getSubtypeSupport() {
    return subtypeAspect;
  }

  @SuppressWarnings("unchecked")
  <S> TypeHandler<S> cast(Class<S> typeClass) {
    if (this.typeClass != typeClass) {
      throw new RuntimeException();
    }
    return (TypeHandler<S>)this;
  }

  void buildClosedNameSet() {
    if (!subtypeAspect.isRoot()) {
      return;
    }
    List<Set<String>> namesChain = new ArrayList<Set<String>>(3);
    buildClosedNameSetRecursive(namesChain);
  }

  private void buildClosedNameSetRecursive(List<Set<String>> namesChain) {
    Set<String> thisSet = new HashSet<String>();
    eagerFieldParser.addAllFieldNames(thisSet);
    for (FieldLoader loader : fieldLoaders) {
      thisSet.add(loader.getFieldName());
    }

    if (algCasesData == null) {
      JsonType jsonAnnotation = typeClass.getAnnotation(JsonType.class);
      if (jsonAnnotation.allowsOtherProperties()) {
        return;
      }
      for (Set<String> set : namesChain) {
        thisSet.addAll(set);
      }
      closedNameSet = thisSet;
    } else {
      namesChain.add(thisSet);
      for (RefToType<?> subtype : algCasesData.getSubtypes()) {
        subtype.get().buildClosedNameSetRecursive(namesChain);
      }
      namesChain.remove(namesChain.size() - 1);
    }
  }

  String getShortName() {
    String name = typeClass.getName();
    int dotPos = name.lastIndexOf('.');
    if (dotPos != -1) {
      name = name.substring(dotPos + 1);
    }
    return name;
  }

  static abstract class SubtypeSupport {
    abstract void setSubtypeCaster(SubtypeCaster subtypeCaster)
        throws JsonProtocolModelParseException;
    abstract void checkHasSubtypeCaster() throws JsonProtocolModelParseException;
    abstract void writeGetSuperMethodJava(ClassScope scope);

    abstract boolean checkConditions(Map<?, ?> jsonProperties) throws JsonProtocolParseException;
  }

  private void parseObjectSubtype(ObjectData objectData, Map<?, ?> jsonProperties, Object input)
      throws JsonProtocolParseException {
    if (algCasesData == null) {
      return;
    }
    algCasesData.parseObjectSubtype(objectData, jsonProperties, input);
  }

  /**
   * Encapsulate subtype aspects of the type.
   */
  private static abstract class SubtypeAspect extends SubtypeSupport {
    abstract void checkSuperObject(ObjectData superObjectData) throws JsonProtocolParseException;
    abstract ObjectData parseFromSuper(Object input) throws JsonProtocolParseException;
    abstract boolean isRoot();
    abstract void writeSuperFieldJava(ClassScope scope);
    abstract void writeSuperConstructorParamJava(ClassScope scope);
    abstract void writeSuperConstructorInitializationJava(MethodScope scope);
    abstract void writeHelperMethodsJava(ClassScope classScope);
    abstract void writeParseMethodJava(ClassScope classScope, String valueTypeName,
        String inputRef);
  }

  private class AbsentSubtypeAspect extends SubtypeAspect {
    @Override
    void checkSuperObject(ObjectData superObjectData) throws JsonProtocolParseException {
      if (superObjectData != null) {
        throw new JsonProtocolParseException("super object is not expected");
      }
    }
    @Override
    boolean checkConditions(Map<?, ?> jsonProperties) throws JsonProtocolParseException {
      throw new JsonProtocolParseException("Not a subtype: " + typeClass.getName());
    }
    @Override
    ObjectData parseFromSuper(Object input) throws JsonProtocolParseException {
      return parse(input, null);
    }
    @Override
    void checkHasSubtypeCaster() {
    }
    @Override
    void setSubtypeCaster(SubtypeCaster subtypeCaster) throws JsonProtocolModelParseException {
      throw new JsonProtocolModelParseException("Not a subtype: " + typeClass.getName());
    }
    @Override
    boolean isRoot() {
      return true;
    }
    @Override void writeGetSuperMethodJava(ClassScope scope) {
    }
    @Override void writeSuperFieldJava(ClassScope scope) {
    }
    @Override void writeSuperConstructorParamJava(ClassScope scope) {
    }
    @Override void writeSuperConstructorInitializationJava(MethodScope scope) {
    }
    @Override void writeHelperMethodsJava(ClassScope classScope) {
    }
    @Override void writeParseMethodJava(ClassScope scope, String valueTypeName, String inputRef) {
      scope.getOutput().append("return new " + valueTypeName + "(" + inputRef + ");");
    }
  }

  private class ExistingSubtypeAspect extends SubtypeAspect {
    private final RefToType<?> jsonSuperClass;

    /** Set of conditions that check whether this type conforms as subtype. */
    private final List<FieldCondition> fieldConditions;

    /** The helper that casts base type instance to instance of our type */
    private SubtypeCaster subtypeCaster = null;

    private ExistingSubtypeAspect(RefToType<?> jsonSuperClass,
        List<FieldCondition> fieldConditions) {
      this.jsonSuperClass = jsonSuperClass;
      this.fieldConditions = fieldConditions;
    }

    @Override
    boolean checkConditions(Map<?, ?> map) throws JsonProtocolParseException {
      for (FieldCondition condition : fieldConditions) {
        String name = condition.getPropertyName();
        Object value = map.get(name);
        boolean hasValue = value != null || map.containsKey(name);
        boolean conditionRes = condition.checkValue(hasValue, value);
        if (!conditionRes) {
          return false;
        }
      }
      return true;
    }

    @Override
    void checkSuperObject(ObjectData superObjectData) throws JsonProtocolParseException {
      if (jsonSuperClass == null) {
        return;
      }
      if (!jsonSuperClass.getTypeClass().isAssignableFrom(
          superObjectData.getTypeHandler().getTypeClass())) {
        throw new JsonProtocolParseException("Unexpected type of super object");
      }
    }

    @Override
    ObjectData parseFromSuper(Object input) throws JsonProtocolParseException {
      ObjectData base = jsonSuperClass.get().parseRootImpl(input);
      ObjectData subtypeObject = subtypeCaster.getSubtypeObjectData(base);
      if (subtypeObject == null) {
        throw new JsonProtocolParseException("Failed to get subtype object while parsing");
      }
      return subtypeObject;
    }
    @Override
    void checkHasSubtypeCaster() throws JsonProtocolModelParseException {
      if (subtypeCaster == null) {
        throw new JsonProtocolModelParseException("Subtype caster should have been set in " +
            typeClass.getName());
      }
    }

    @Override
    void setSubtypeCaster(SubtypeCaster subtypeCaster) throws JsonProtocolModelParseException {
      if (jsonSuperClass == null) {
        throw new JsonProtocolModelParseException(typeClass.getName() +
            " does not have supertype declared" +
            " (accessed from " + subtypeCaster.getBaseType().getName() + ")");
      }
      if (subtypeCaster.getBaseType() != jsonSuperClass.getTypeClass()) {
        throw new JsonProtocolModelParseException("Wrong base type in " + typeClass.getName() +
            ", expected " + subtypeCaster.getBaseType().getName());
      }
      if (subtypeCaster.getSubtype() != typeClass) {
        throw new JsonProtocolModelParseException("Wrong subtype");
      }
      if (this.subtypeCaster != null) {
        throw new JsonProtocolModelParseException("Subtype caster is already set");
      }
      this.subtypeCaster = subtypeCaster;
    }
    @Override
    boolean isRoot() {
      return false;
    }

    @Override
    void writeGetSuperMethodJava(ClassScope scope) {
      scope.startLine("@Override public " +
          jsonSuperClass.get().getTypeClass().getCanonicalName() + " getSuper() {\n");
      scope.startLine("  return superTypeValue;\n");
      scope.startLine("}\n");
    }

    @Override
    void writeSuperFieldJava(ClassScope scope) {
      scope.startLine("private final " + jsonSuperClass.get().getTypeClass().getCanonicalName() +
          " superTypeValue;\n");
    }

    @Override
    void writeSuperConstructorParamJava(ClassScope scope) {
      scope.append(", " + jsonSuperClass.get().getTypeClass().getCanonicalName() +
          " superValueParam");
    }

    @Override
    void writeSuperConstructorInitializationJava(MethodScope scope) {
      scope.startLine("this.superTypeValue = superValueParam;\n");
    }

    @Override
    void writeHelperMethodsJava(ClassScope classScope) {
      classScope.startLine("public static boolean checkSubtypeConditions(" +
          "org.json.simple.JSONObject input)" + Util.THROWS_CLAUSE + " {\n");
      MethodScope methodScope = classScope.newMethodScope();
      methodScope.indentIn();
      for (FieldCondition condition : fieldConditions) {
        String name = condition.getPropertyName();
        methodScope.startLine("{\n");
        methodScope.startLine("  Object value = input.get(\"" + name + "\");\n");
        methodScope.startLine("  boolean hasValue;\n");
        methodScope.startLine("  if (value == null) {\n");
        methodScope.startLine("    hasValue = input.containsKey(\"" + name + "\");\n");
        methodScope.startLine("  } else {\n");
        methodScope.startLine("    hasValue = true;\n");
        methodScope.startLine("  }\n");
        condition.writeCheckJava(methodScope, "value", "hasValue", "conditionRes");
        methodScope.startLine("  if (!conditionRes) {\n");
        methodScope.startLine("    return false;\n");
        methodScope.startLine("  }\n");
        methodScope.startLine("}\n");
      }
      methodScope.startLine("return true;\n");
      methodScope.indentOut();
      methodScope.startLine("}\n");
    }

    @Override
    void writeParseMethodJava(ClassScope scope, String valueTypeName, String inputRef) {
      String superTypeName = scope.getTypeImplReference(jsonSuperClass.get());
      scope.startLine(superTypeName + " superTypeValue = " + superTypeName + ".parse(" +
          inputRef + ");\n");
      subtypeCaster.writeJava(scope, valueTypeName, "superTypeValue", "result");
      scope.startLine("if (result == null) {\n");
      scope.startLine("  throw new " + Util.BASE_PACKAGE + ".JsonProtocolParseException(" +
          "\"Failed to get subtype object while parsing\");\n");
      scope.startLine("}\n");
      scope.startLine("return result;\n");
    }
  }

  private void wrapInProxy(ObjectData data, Map<Method, MethodHandler> methodHandlerMap) {
    InvocationHandler handler = new JsonInvocationHandler(data, methodHandlerMap);
    T proxy = createProxy(handler);
    data.initProxy(proxy);
  }

  @SuppressWarnings("unchecked")
  private T createProxy(InvocationHandler invocationHandler) {
    if (proxyClassConstructor == null) {
      Class<?>[] interfaces = new Class<?>[] { typeClass };
      Class<?> proxyClass = Proxy.getProxyClass(typeClass.getClassLoader(), interfaces);
      Constructor<?> c;
      try {
        c = proxyClass.getConstructor(InvocationHandler.class);
      } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
      }
      proxyClassConstructor = (Constructor<? extends T>) c;
    }
    try {
      return proxyClassConstructor.newInstance(invocationHandler);
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }

  static abstract class EagerFieldParser {
    abstract void parseAllFields(ObjectData objectData) throws JsonProtocolParseException;
    abstract void addAllFieldNames(Set<? super String> output);
  }

  static abstract class AlgebraicCasesData {
    abstract void parseObjectSubtype(ObjectData objectData, Map<?, ?> jsonProperties, Object input)
        throws JsonProtocolParseException;
    abstract List<RefToType<?>> getSubtypes();
    abstract void writeConstructorCodeJava(MethodScope methodScope);
    abstract void writeFiledsJava(ClassScope classScope);
  }

  public void writeStaticClassJava(FileScope fileScope) {
    TextOutput out = fileScope.getOutput();
    String valueImplClassName = fileScope.getTypeImplShortName(this);
    out.append("public static class ").append(valueImplClassName);
    out.append(" extends ").append(requiresJsonObject ? "JsonValueBase" : "ObjectValueBase");

    out.append(" implements ").append(getShortName().replace('$', '.')).openBlock();

    ClassScope classScope = fileScope.newClassScope();
    for (VolatileFieldBinding field : volatileFields) {
      field.writeFieldDeclarationJava(classScope, out);
      out.newLine();
    }

    for (FieldLoader loader : fieldLoaders) {
      loader.writeFieldDeclaration(classScope);
      out.newLine();
    }

    if (algCasesData != null) {
      algCasesData.writeFiledsJava(classScope);
    }

    writeConstructorMethod(valueImplClassName, classScope, out);
    out.newLine();

    subtypeAspect.writeSuperFieldJava(classScope);

    for (Map.Entry<Method, MethodHandler> en : methodHandlerMap.entrySet()) {
      out.newLine();
      en.getValue().writeMethodImplementationJava(classScope, en.getKey(), out);
      out.newLine();
    }

    BaseHandlersLibrary.writeBaseMethodsJava(classScope, this);
    subtypeAspect.writeHelperMethodsJava(classScope);
    out.indentOut().append('}');
  }

  private void writeConstructorMethod(String valueImplClassName, ClassScope classScope, TextOutput out) {
    out.newLine().append(valueImplClassName).append("(JsonReader ").append(Util.READER_NAME);
    subtypeAspect.writeSuperConstructorParamJava(classScope);
    out.append(')').append(Util.THROWS_CLAUSE).openBlock();

    MethodScope methodScope = classScope.newMethodScope();
    subtypeAspect.writeSuperConstructorInitializationJava(methodScope);

    out.append(Util.READER_NAME).append(".beginObject();");
    out.newLine().append("while (reader.hasNext())").openBlock();
    out.append("String name = reader.nextName();");
    boolean isFirst = true;
    String operator = "if";
    for (FieldLoader fieldLoader : fieldLoaders) {
      String fieldName = fieldLoader.getFieldName();
      out.newLine().append(operator).append(" (name.equals(\"").append(fieldName).append("\"))").openBlock();
      {
        assignField(out, fieldName);
        fieldLoader.parser.writeReadCode(fieldName, methodScope, out);
        out.append(';');
      }
      out.closeBlock();

      if (isFirst) {
        isFirst = false;
        operator = "else if";
      }
    }

    out.closeBlock();
    out.newLine().append(Util.READER_NAME).append(".endObject();");

    if (algCasesData != null) {
      algCasesData.writeConstructorCodeJava(methodScope);
    }

    out.closeBlock();
  }

  private static TextOutput assignField(TextOutput out, String fieldName) {
    return out.append(FieldLoader.FIELD_PREFIX).append(fieldName).append(" = ");
  }
}