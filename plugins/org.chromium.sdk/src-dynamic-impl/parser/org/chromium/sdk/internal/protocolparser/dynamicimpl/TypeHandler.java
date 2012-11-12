// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonType;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

import java.lang.reflect.Method;
import java.util.*;

/**
 * The instance of this class corresponds to a particular json type. Primarily it serves
 * as a factory for dynamic proxy/{@link ObjectData}, but also plays a role of type
 * descriptor object.
 */
class TypeHandler<T> {
  private final Class<T> typeClass;

  private final List<VolatileFieldBinding> volatileFields;

  /** Method implementation for dynamic proxy. */
  private final Map<Method, MethodHandler> methodHandlerMap;

  /** Loaders that should read values and save them in field array on parse time. */
  private final List<FieldLoader> fieldLoaders;

  /** Set of parsers that non-lazyly check that all fields read OK. */
  private final EagerFieldParser eagerFieldParser;

  /** Holds the data about recognizing subtypes. */
  private final AlgebraicCasesData algebraicCasesData;

  /** Subtype aspects of the type or null */
  private final SubtypeAspect subtypeAspect;

  private final boolean requiresJsonObject;

  TypeHandler(Class<T> typeClass, RefToType<?> jsonSuperClass,
              List<VolatileFieldBinding> volatileFields,
              Map<Method, MethodHandler> methodHandlerMap,
              List<FieldLoader> fieldLoaders,
              List<FieldCondition> fieldConditions, EagerFieldParser eagerFieldParser,
              AlgebraicCasesData algebraicCasesData, boolean requiresJsonObject) {
    this.typeClass = typeClass;
    this.volatileFields = volatileFields;
    this.methodHandlerMap = methodHandlerMap;
    this.fieldLoaders = fieldLoaders;
    this.eagerFieldParser = eagerFieldParser;
    this.algebraicCasesData = algebraicCasesData;
    this.requiresJsonObject = requiresJsonObject;
    if (jsonSuperClass == null) {
      if (!fieldConditions.isEmpty()) {
        throw new IllegalArgumentException();
      }
      subtypeAspect = new AbsentSubtypeAspect();
    }
    else {
      subtypeAspect = new ExistingSubtypeAspect(jsonSuperClass, fieldConditions);
    }
  }

  public Class<T> getTypeClass() {
    return typeClass;
  }

  SubtypeSupport getSubtypeSupport() {
    return subtypeAspect;
  }

  void buildClosedNameSet() {
    if (!subtypeAspect.isRoot()) {
      return;
    }
    buildClosedNameSetRecursive(new ArrayList<Set<String>>(3));
  }

  private void buildClosedNameSetRecursive(List<Set<String>> namesChain) {
    Set<String> thisSet = new HashSet<String>();
    eagerFieldParser.addAllFieldNames(thisSet);
    for (FieldLoader loader : fieldLoaders) {
      thisSet.add(loader.getFieldName());
    }

    if (algebraicCasesData == null) {
      JsonType jsonAnnotation = typeClass.getAnnotation(JsonType.class);
      if (jsonAnnotation.allowsOtherProperties()) {
        return;
      }
      for (Set<String> set : namesChain) {
        thisSet.addAll(set);
      }
    } else {
      namesChain.add(thisSet);
      for (RefToType<?> subtype : algebraicCasesData.getSubtypes()) {
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
    abstract void writeGetSuperMethodJava(TextOutput out);
  }

  /**
   * Encapsulate subtype aspects of the type.
   */
  static abstract class SubtypeAspect extends SubtypeSupport {
    abstract boolean isRoot();
    abstract void writeSuperFieldJava(TextOutput out);
    abstract void writeSuperConstructorParamJava(TextOutput out);
    abstract void writeSuperConstructorInitialization(TextOutput out);
    void writeHelperMethodsJava(ClassScope classScope, TextOutput out) {
    }
  }

  private static class AbsentSubtypeAspect extends SubtypeAspect {
    @Override
    boolean isRoot() {
      return true;
    }
    @Override void writeGetSuperMethodJava(TextOutput out) {
    }
    @Override void writeSuperFieldJava(TextOutput out) {
    }
    @Override void writeSuperConstructorParamJava(TextOutput out) {
    }
    @Override
    void writeSuperConstructorInitialization(TextOutput out) {
    }
  }

  static abstract class EagerFieldParser {
    abstract void addAllFieldNames(Set<? super String> output);
  }

  public void writeStaticClassJava(FileScope fileScope) {
    TextOutput out = fileScope.getOutput();
    String valueImplClassName = fileScope.getTypeImplShortName(this);
    out.append("public static class ").append(valueImplClassName);
    out.append(" extends ").append(requiresJsonObject ? "Message" : "LazyReadMessage");

    out.append(" implements ").append(getTypeClass().getCanonicalName()).openBlock();

    ClassScope classScope = fileScope.newClassScope();
    for (VolatileFieldBinding field : volatileFields) {
      field.writeFieldDeclaration(classScope, out);
      out.newLine();
    }

    for (FieldLoader loader : fieldLoaders) {
      loader.writeFieldDeclaration(out);
      out.newLine();
    }

    subtypeAspect.writeSuperFieldJava(out);

    if (algebraicCasesData != null) {
      algebraicCasesData.writeFields(classScope);
    }

    writeConstructorMethod(valueImplClassName, classScope, out);
    out.newLine();

    for (Map.Entry<Method, MethodHandler> en : methodHandlerMap.entrySet()) {
      out.newLine();
      en.getValue().writeMethodImplementationJava(classScope, en.getKey(), out);
      out.newLine();
    }

    writeBaseMethods(classScope, out);
    subtypeAspect.writeGetSuperMethodJava(out);
    subtypeAspect.writeHelperMethodsJava(classScope, out);
    out.indentOut().append('}');
  }

  /**
   * Generates Java implementation of standard methods of JSON type class (if needed):
   * {@link org.chromium.sdk.internal.protocolparser.JsonObjectBased#getUnderlyingObject()},
   * {@link org.chromium.sdk.internal.protocolparser.AnyObjectBased#getUnderlyingObject()} and {@link org.chromium.sdk.internal.protocolparser.JsonSubtype#getSuper()}
   */
  private void writeBaseMethods(ClassScope scope, TextOutput out) {
    Class<?> typeClass = getTypeClass();
    // Generated getUnderlyingObject method if it's in interface.
    Method method;
    try {
      method = typeClass.getMethod("getUnderlyingObject");
    }
    catch (SecurityException e) {
      throw new RuntimeException(e);
    }
    catch (NoSuchMethodException e) {
      // Method not found, skip.
      return;
    }

    MethodHandler.writeMethodDeclarationJava(scope, method, Collections.<String>emptyList());
    out.openBlock();
    scope.append("return reader;");
    out.closeBlock();
  }

  private void writeConstructorMethod(String valueImplClassName, ClassScope classScope, TextOutput out) {
    out.newLine().append(valueImplClassName).append("(JsonReader ").append(Util.READER_NAME);
    subtypeAspect.writeSuperConstructorParamJava(out);
    out.append(')').append(Util.THROWS_CLAUSE).openBlock();

    MethodScope methodScope = classScope.newMethodScope();
    subtypeAspect.writeSuperConstructorInitialization(out);

    out.append(Util.READER_NAME).append(".beginObject();");
    if (!fieldLoaders.isEmpty()) {
      writeReadFields(out, methodScope);
    }

    if (!requiresJsonObject) {
      out.append("inputReader = ").append("createValueReader(").append(Util.READER_NAME).append(");");
    }

    if (algebraicCasesData != null) {
      algebraicCasesData.writeConstructorCodeJava(methodScope, out);
    }
    out.newLine().append(Util.READER_NAME).append(".endObject();");
    out.closeBlock();
  }

  private void writeReadFields(TextOutput out, MethodScope methodScope) {
    out.newLine().append("while (reader.hasNext())").openBlock();
    out.append("String name = reader.nextName();");
    boolean isFirst = true;
    String operator = "if";
    for (FieldLoader fieldLoader : fieldLoaders) {
      String fieldName = fieldLoader.getFieldName();
      out.newLine().append(operator).append(" (name.equals(\"").append(fieldName).append("\"))").openBlock();
      {
        assignField(out, fieldName);
        fieldLoader.valueParser.writeReadCode(methodScope, false, out);
        out.append(';');
      }
      out.closeBlock();

      if (isFirst) {
        isFirst = false;
        operator = "else if";
      }
    }

    out.closeBlock();
  }

  private static TextOutput assignField(TextOutput out, String fieldName) {
    return out.append(FieldLoader.FIELD_PREFIX).append(fieldName).append(" = ");
  }
}