// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;
import org.json.simple.JSONObject;

/**
 * A parser that generates dynamic proxy implementation of JsonType interface
 * for a {@link JSONObject}.
 * It creates dynamic proxy instance in 2 steps. First {@link }
 * outputs {@link ObjectData}, which gets stored in field storage array. Later, when we are
 * about to return the value to a user, it is converted to a dynamic proxy instance by
 * {@link #VALUE_FINISHER} converter. We have to store an intermediate value for easier data
 * manipulation (dynamic proxy does not have any interfaces that we could make use of).
 */
class JsonTypeParser<T> extends ValueParser<ObjectData> {
  private final RefToType<T> refToType;
  private final boolean isSubtyping;

  JsonTypeParser(RefToType<T> refToType, boolean nullable, boolean isSubtyping) {
    super(nullable);

    this.refToType = refToType;
    this.isSubtyping = isSubtyping;
  }

  RefToType<T> getType() {
    return refToType;
  }

  @Override
  public FieldLoadedFinisher getValueFinisher() {
    return VALUE_FINISHER;
  }

  @Override
  public JsonTypeParser<?> asJsonTypeParser() {
    return this;
  }

  public boolean isSubtyping() {
    return isSubtyping;
  }

  private static final FieldLoadedFinisher VALUE_FINISHER = new FieldLoadedFinisher() {
    @Override
    Object getValueForUser(Object cachedValue) {
      if (cachedValue == null) {
        return null;
      }
      ObjectData data = (ObjectData) cachedValue;
      return data.getProxy();
    }
  };

  @Override
  public void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append(refToType.getTypeClass().getCanonicalName());
  }

  @Override
  public void appendInternalValueTypeNameJava(FileScope classScope) {
    classScope.append(classScope.getTypeImplReference(refToType.get()));
  }

  @Override
  void writeReadCode(MethodScope scope, TextOutput out) {
    out.append("new ").append(scope.getTypeImplReference(refToType.get())).append('(').append(Util.READER_NAME).append(')');
  }

  @Override
  public void writeArrayReadCode(MethodScope scope, TextOutput out) {
    out.append("readObjectArray").append('(').append(Util.READER_NAME);
    out.comma().append("new ").append(scope.requireFactoryGenerationAndGetName(refToType.get())).append(Util.TYPE_FACTORY_NAME_POSTFIX).append("()");
    out.append(')');
  }
}
