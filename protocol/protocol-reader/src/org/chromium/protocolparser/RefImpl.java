package org.chromium.protocolparser;

class RefImpl<T> {
  final Class<T> typeClass;
  private TypeHandler<T> type;

  RefImpl(Class<T> typeClass) {
    this.typeClass = typeClass;
  }

  Class<?> getTypeClass() {
    return typeClass;
  }

  TypeHandler<T> get() {
    return type;
  }

  void set(TypeHandler<?> type) {
    //noinspection unchecked
    this.type = (TypeHandler<T>)type;
  }
}
