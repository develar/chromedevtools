package org.chromium.wip.protocolParser;

import org.jetbrains.jsonProtocol.ProtocolMetaModel;

abstract class CreateStandaloneTypeBindingVisitorBase implements TypeVisitor<StandaloneTypeBinding> {
  private final ProtocolMetaModel.StandaloneType type;
  private DomainGenerator generator;

  CreateStandaloneTypeBindingVisitorBase(DomainGenerator generator, ProtocolMetaModel.StandaloneType type) {
    this.generator = generator;
    this.type = type;
  }

  protected ProtocolMetaModel.StandaloneType getType() {
    return type;
  }

  @Override
  public StandaloneTypeBinding visitString() {
    return generator.createTypedefTypeBinding(type, StandaloneTypeBinding.PredefinedTarget.STRING, Naming.COMMON_TYPEDEF, null);
  }
  @Override
  public StandaloneTypeBinding visitInteger() {
    return generator.createTypedefTypeBinding(type, StandaloneTypeBinding.PredefinedTarget.INT, Naming.COMMON_TYPEDEF, null);
  }
  @Override
  public StandaloneTypeBinding visitRef(String refName) {
    throw new RuntimeException();
  }
  @Override
  public StandaloneTypeBinding visitBoolean() {
    throw new RuntimeException();
  }
  @Override
  public StandaloneTypeBinding visitNumber() {
    return generator.createTypedefTypeBinding(type, StandaloneTypeBinding.PredefinedTarget.NUMBER,
                                              Naming.COMMON_TYPEDEF, null);
  }
  @Override public StandaloneTypeBinding visitUnknown() {
    throw new RuntimeException();
  }
}
