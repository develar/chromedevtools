package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

/**
 * Member scope is used to generate additional types that are used only from method.
 * These types will be named after this method.
 */
abstract class MemberScope implements ResolveAndGenerateScope {
  private final String memberName;
  private final ClassScope classScope;

  MemberScope(ClassScope classScope, String memberName) {
    this.classScope = classScope;
    this.memberName = memberName;
  }

  public QualifiedTypeData resolveType(WipMetamodel.ObjectProperty objectProperty) {
    return resolveType(objectProperty, TypedObjectAccess.FOR_OBJECT_PROPERTY);
  }

  public QualifiedTypeData resolveType(WipMetamodel.Parameter parameter) {
    return resolveType(parameter, TypedObjectAccess.FOR_PARAMETER);
  }

  @Override
  public <T> QualifiedTypeData resolveType(T typedObject, TypedObjectAccess<T> access) {
    return classScope.generator.generator.resolveType(typedObject, access, this);
  }

  protected String getMemberName() {
    return memberName;
  }

  public abstract BoxableType generateEnum(String description, List<String> enumConstants);
  public abstract BoxableType generateNestedObject(String description,
      List<WipMetamodel.ObjectProperty> propertyList) throws IOException;

  @Override
  public String getDomainName() {
    return classScope.generator.domain.domain();
  }

  @Override
  public TypeData.Direction getTypeDirection() {
    return classScope.getTypeDirection();
  }
}
