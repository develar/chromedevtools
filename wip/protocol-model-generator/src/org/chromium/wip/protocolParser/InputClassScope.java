package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

class InputClassScope extends ClassScope {
  InputClassScope(DomainGenerator generator, NamePath namePath) {
    super(generator, namePath);
  }

  public void generateMainJsonProtocolInterfaceBody(IndentWriter writer,
      List<WipMetamodel.Parameter> parameters) throws IOException {
    if (parameters != null) {
      for (WipMetamodel.Parameter param : parameters) {
        if (param.description() != null) {
          writer.append("\t  /**\n   " + param.description() + "\n   */\n");
        }

        String methodName = Generator.generateMethodNameSubstitute(param.name(), writer);
        MemberScope memberScope = newMemberScope(param.name());
        QualifiedTypeData paramTypeData = memberScope.resolveType(param);
        paramTypeData.writeAnnotations(writer, "  ");
        writer.append("\t  " +
            paramTypeData.getJavaType().getShortText(getClassContextNamespace()) + " " +
            methodName + "();\n");
        writer.append("\t\n");
      }
    }
  }

  void generateStandaloneTypeBody(IndentWriter writer, List<WipMetamodel.ObjectProperty> properties)
      throws IOException {
    if (properties != null) {
      for (WipMetamodel.ObjectProperty objectProperty : properties) {
        String propertyName = objectProperty.name();

        if (objectProperty.description() != null) {
          writer.append("\t  /**\n   " + objectProperty.description() + "\n   */\n");
        }

        String methodName = Generator.generateMethodNameSubstitute(propertyName, writer);
        MemberScope memberScope = newMemberScope(propertyName);
        QualifiedTypeData propertyTypeData = memberScope.resolveType(objectProperty);
        propertyTypeData.writeAnnotations(writer, "  ");

        writer.append("\t  " +
            propertyTypeData.getJavaType().getShortText(getClassContextNamespace()) + " " +
            methodName + "();\n");
        writer.append("\t\n");
      }
    }
  }

  @Override
  protected TypeData.Direction getTypeDirection() {
    return TypeData.Direction.INPUT;
  }

  private MemberScope newMemberScope(String memberName) {
    return new InputMemberScope(memberName);
  }

  class InputMemberScope extends MemberScope {
    InputMemberScope(String memberName) {
      super(InputClassScope.this, memberName);
    }

    @Override
    public BoxableType generateEnum(String description, List<String> enumConstants) {
      DeferredWriter builder = new DeferredWriter();
      if (description != null) {
        builder.append("\t  /**\n   " + description + "\n   */\n");
      }

      String enumName = Generator.capitalizeFirstChar(getMemberName());
      builder.append("\t  public enum " + enumName + " {\n");
      for (String constant : enumConstants) {
        builder.append("\t    " +
            EnumValueCondition.decorateEnumConstantName(constant) + ",\n");
      }
      builder.append("\t  }\n");
      addMember(builder);

      return new StandaloneType(new NamePath(enumName, getClassContextNamespace()));
    }

    @Override
    public BoxableType generateNestedObject(String description, List<WipMetamodel.ObjectProperty> propertyList) throws IOException {
      DeferredWriter builder = new DeferredWriter();
      if (description != null) {
        builder.append("\t  /**\n   " + description + "\n   */\n");
      }

      String objectName = Generator.capitalizeFirstChar(getMemberName());
      if (propertyList == null) {
        builder.append("\t  @org.chromium.protocolParser.JsonType(" +
            "allowsOtherProperties=true)\n");
        builder.append("\t  public interface " + objectName +
            " extends org.chromium.protocolParser.JsonObjectBased {\n");
        builder.append("\t  }\n");
      } else {
        builder.append("\t  @org.chromium.protocolParser.JsonType\n");
        builder.append("\t  public interface " + objectName + " {\n");
        for (WipMetamodel.ObjectProperty property : propertyList) {
          if (property.description() != null) {
            builder.append("\t    /**\n     " + property.description() + "\n     */\n");
          }

          String methodName = Generator.generateMethodNameSubstitute(property.name(), builder);
          MemberScope memberScope = newMemberScope(property.name());
          QualifiedTypeData propertyTypeData = memberScope.resolveType(property);
          propertyTypeData.writeAnnotations(builder, "    ");

          builder.append("\t    " +
              propertyTypeData.getJavaType().getShortText(getClassContextNamespace()) + " " +
              methodName +  "();\n");
          builder.append("\t\n");
        }
        builder.append("\t  }\n");
      }

      addMember(builder);
      generator.generator.jsonProtocolParserClassNames.add(getFullName() + '.' + objectName);
      return new StandaloneType(new NamePath(objectName, getClassContextNamespace()));
    }
  }
}
