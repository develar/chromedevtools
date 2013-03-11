// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import org.chromium.protocolparser.JavaCodeGenerator.MethodScope;

class ObjectValueParser<T> extends ValueParser {
  private final RefImpl<T> refToType;
  private final boolean isSubtyping;

  ObjectValueParser(RefImpl<T> refToType, boolean nullable, boolean isSubtyping) {
    super(nullable);

    this.refToType = refToType;
    this.isSubtyping = isSubtyping;
  }

  RefImpl<T> getType() {
    return refToType;
  }

  @Override
  public ObjectValueParser asJsonTypeParser() {
    return this;
  }

  public boolean isSubtyping() {
    return isSubtyping;
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append(refToType.getTypeClass().getCanonicalName());
  }

  @Override
  public void appendInternalValueTypeName(FileScope classScope, TextOutput out) {
    out.append(classScope.getTypeImplReference(refToType.get()));
  }

  @Override
  void writeReadCode(MethodScope scope, boolean subtyping, String fieldName, TextOutput out) {
    refToType.get().writeInstantiateCode(scope.getRootClassScope(), subtyping, out);
    out.append('(');
    addReaderParameter(subtyping, out);
    if (subtyping && refToType.get().getSubtypeSupport() instanceof ExistingSubtypeAspect) {
      out.comma().append("this");
    }
    out.append(')');
  }

  @Override
  public void writeArrayReadCode(MethodScope scope, boolean subtyping, boolean nullable, String fieldName, TextOutput out) {
    beginReadCall("ObjectArray", subtyping, out, fieldName);
    out.comma().append("new ").append(scope.requireFactoryGenerationAndGetName(refToType.get())).append(Util.TYPE_FACTORY_NAME_POSTFIX).append("()");
    out.comma().append(nullable).append(')');
  }
}