// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import gnu.trove.THashSet;
import org.chromium.protocolReader.JsonType;
import org.chromium.protocolparser.JavaCodeGenerator.MethodScope;
import org.jetbrains.jsonProtocol.JsonObjectBased;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class TypeHandler<T> {
  private final Class<T> typeClass;

  private final List<VolatileFieldBinding> volatileFields;

  /** Method implementation for dynamic proxy. */
  private final Map<Method, MethodHandler> methodHandlerMap;

  /** Loaders that should read values and save them in field array on parse time. */
  private final List<FieldLoader> fieldLoaders;

  /** Set of parsers that non-lazily check that all fields read OK. */
  private final EagerFieldParser eagerFieldParser;

  /** Holds the data about recognizing subtypes. */
  private final AlgebraicCasesData algebraicCasesData;

  /** Subtype aspects of the type or null */
  private final SubtypeAspect subtypeAspect;

  private final boolean hasLazyFields;

  TypeHandler(Class<T> typeClass, RefToType<?> jsonSuperClass,
              List<VolatileFieldBinding> volatileFields,
              Map<Method, MethodHandler> methodHandlerMap,
              List<FieldLoader> fieldLoaders,
              EagerFieldParser eagerFieldParser,
              AlgebraicCasesData algebraicCasesData, boolean hasLazyFields) {
    this.typeClass = typeClass;
    this.volatileFields = volatileFields;
    this.methodHandlerMap = methodHandlerMap;
    this.fieldLoaders = fieldLoaders;
    this.eagerFieldParser = eagerFieldParser;
    this.algebraicCasesData = algebraicCasesData;
    this.hasLazyFields = hasLazyFields;
    if (jsonSuperClass == null) {
      subtypeAspect = new AbsentSubtypeAspect();
    }
    else {
      subtypeAspect = new ExistingSubtypeAspect(jsonSuperClass);
    }
  }

  public Class<T> getTypeClass() {
    return typeClass;
  }

  void buildClosedNameSet() {
    if (subtypeAspect.isRoot()) {
      buildClosedNameSetRecursive(new ArrayList<Set<String>>(3));
    }
  }

  private void buildClosedNameSetRecursive(List<Set<String>> namesChain) {
    Set<String> thisSet = new THashSet<String>();
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
      for (RefToType<?> subtype : algebraicCasesData.subtypes) {
        subtype.get().buildClosedNameSetRecursive(namesChain);
      }
      namesChain.remove(namesChain.size() - 1);
    }
  }

  public SubtypeAspect getSubtypeSupport() {
    return subtypeAspect;
  }

  public void writeInstantiateCode(ClassScope scope, TextOutput out) {
    writeInstantiateCode(scope, false, out);
  }

  public void writeInstantiateCode(ClassScope scope, boolean deferredReading, TextOutput out) {
    String className = scope.getTypeImplReference(this);
    if (deferredReading) {
      out.append("new ").append(className);
    }
    else {
      subtypeAspect.writeInstantiateCode(className, out);
    }
  }

  static abstract class EagerFieldParser {
    abstract void addAllFieldNames(Set<? super String> output);
  }

  public void writeStaticClassJava(FileScope fileScope) {
    TextOutput out = fileScope.getOutput();
    String valueImplClassName = fileScope.getTypeImplShortName(this);
    out.append("public static final class ").append(valueImplClassName);

    out.append(" implements ").append(getTypeClass().getCanonicalName()).openBlock();

    if (hasLazyFields || JsonObjectBased.class.isAssignableFrom(typeClass)) {
      out.append("private ").append(Util.JSON_READER_CLASS_NAME).space().append(Util.PENDING_INPUT_READER_NAME).semi().newLine();
    }

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

    subtypeAspect.writeParseMethod(valueImplClassName, classScope, out);

    for (Map.Entry<Method, MethodHandler> en : methodHandlerMap.entrySet()) {
      out.newLine();
      en.getValue().writeMethodImplementationJava(classScope, en.getKey(), out);
      out.newLine();
    }

    writeBaseMethods(out);
    subtypeAspect.writeGetSuperMethodJava(out);
    out.indentOut().append('}');
  }

  /**
   * Generates Java implementation of standard methods of JSON type class (if needed):
   * {@link org.jetbrains.jsonProtocol.JsonObjectBased#getDeferredReader()}
   */
  private void writeBaseMethods(TextOutput out) {
    Class<?> typeClass = getTypeClass();
    Method method;
    try {
      method = typeClass.getMethod("getDeferredReader");
    }
    catch (SecurityException e) {
      throw new RuntimeException(e);
    }
    catch (NoSuchMethodException ignored) {
      // Method not found, skip.
      return;
    }

    out.newLine();
    MethodHandler.writeMethodDeclarationJava(out, method);
    out.openBlock();
    out.append("return ").append(Util.PENDING_INPUT_READER_NAME).semi();
    out.closeBlock();
  }

  private void writeConstructorMethod(String valueImplClassName, ClassScope classScope, TextOutput out) {
    out.newLine().append("public ").append(valueImplClassName).append("(").append(Util.JSON_READER_PARAMETER_DEF);
    subtypeAspect.writeSuperConstructorParamJava(out);
    out.append(')').append(Util.THROWS_CLAUSE).openBlock();

    MethodScope methodScope = classScope.newMethodScope();
    subtypeAspect.writeSuperConstructorInitialization(out);

    if (JsonObjectBased.class.isAssignableFrom(typeClass) || hasLazyFields) {
      out.append(Util.PENDING_INPUT_READER_NAME).append(" = ").append(Util.READER_NAME).append(".subReader();").newLine();
    }

    if (fieldLoaders.isEmpty()) {
      out.append(Util.READER_NAME).append(".skipValue()").semi();
      assert algebraicCasesData == null || !(algebraicCasesData instanceof AutoAlgebraicCasesData);
    }
    else {
      out.append(Util.READER_NAME).append(".beginObject();");
      writeReadFields(out, methodScope);
      if (algebraicCasesData != null) {
        algebraicCasesData.writeConstructorCodeJava(methodScope, out);
      }

      // we don't read all data if we have lazy fields, so, we should not check end of stream
      if (!hasLazyFields) {
        out.newLine().append(Util.READER_NAME).append(".endObject();");
      }
    }
    out.closeBlock();
  }

  private void writeReadFields(TextOutput out, MethodScope methodScope) {
    boolean stopIfAllFieldsWereRead = hasLazyFields;
    boolean hasOnlyOneFieldLoader = fieldLoaders.size() == 1;
    boolean isTracedStop = stopIfAllFieldsWereRead && !hasOnlyOneFieldLoader;
    if (isTracedStop) {
      out.newLine().append("int i = 0").semi();
    }

    out.newLine().append("while (reader.hasNext())").openBlock(!hasOnlyOneFieldLoader);
    if (!hasOnlyOneFieldLoader) {
      out.append("String name = reader.nextName();");
    }

    boolean isFirst = true;
    String operator = "if";
    for (FieldLoader fieldLoader : fieldLoaders) {
      String fieldName = fieldLoader.getFieldName();
      out.newLine().append(operator).append(" (").append(hasOnlyOneFieldLoader ? "reader.nextName()" : "name");
      out.append(".equals(\"").append(fieldName).append("\"))").openBlock();
      {
        assignField(out, fieldName);
        fieldLoader.valueParser.writeReadCode(methodScope, false, fieldName, out);
        out.semi();
        if (stopIfAllFieldsWereRead && !isTracedStop) {
          out.newLine().append("break").semi();
        }
      }
      out.closeBlock();

      if (isFirst) {
        isFirst = false;
        operator = "else if";
      }
    }

    out.newLine().append("else").openBlock().append("reader.skipValue();");
    if (isTracedStop) {
      out.newLine().append("continue").semi();
    }
    out.closeBlock();
    if (isTracedStop) {
      out.newLine().newLine().append("if (i == ").append(fieldLoaders.size() - 1).append(")").openBlock();
      out.append("break").semi().closeBlock();
      out.newLine().append("else").openBlock().append("i++").semi().closeBlock();
    }
    out.closeBlock();
  }

  private static TextOutput assignField(TextOutput out, String fieldName) {
    return out.append(FieldLoader.FIELD_PREFIX).append(fieldName).append(" = ");
  }
}