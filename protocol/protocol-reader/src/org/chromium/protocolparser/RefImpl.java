package org.chromium.protocolparser;

class RefImpl<T> extends RefToType<T> {
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
