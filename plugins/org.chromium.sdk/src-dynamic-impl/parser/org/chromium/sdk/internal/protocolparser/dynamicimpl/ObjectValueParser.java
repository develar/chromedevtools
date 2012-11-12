// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

class ObjectValueParser<T> extends ValueParser {
  private final RefToType<T> refToType;
  private final boolean isSubtyping;

  ObjectValueParser(RefToType<T> refToType, boolean nullable, boolean isSubtyping) {
    super(nullable);

    this.refToType = refToType;
    this.isSubtyping = isSubtyping;
  }

  RefToType<T> getType() {
    return refToType;
  }

  @Override
  public ObjectValueParser<?> asJsonTypeParser() {
    return this;
  }

  public boolean isSubtyping() {
    return isSubtyping;
  }

  @Override
  public void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append(refToType.getTypeClass().getCanonicalName());
  }

  @Override
  public void appendInternalValueTypeNameJava(FileScope classScope) {
    classScope.append(classScope.getTypeImplReference(refToType.get()));
  }

  @Override
  void writeReadCode(MethodScope scope, boolean subtyping, TextOutput out) {
    out.append("new ").append(scope.getTypeImplReference(refToType.get())).append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }

  @Override
  public void writeArrayReadCode(MethodScope scope, boolean subtyping, TextOutput out) {
    beginReadCall("ObjectArray", subtyping, out);
    out.comma().append("new ").append(scope.requireFactoryGenerationAndGetName(refToType.get())).append(Util.TYPE_FACTORY_NAME_POSTFIX).append("()");
    out.append(')');
  }
}
