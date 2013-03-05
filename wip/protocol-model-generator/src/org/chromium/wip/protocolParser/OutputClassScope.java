package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

class OutputClassScope extends ClassScope {
  OutputClassScope(DomainGenerator generator, NamePath classNamePath) {
    super(generator, classNamePath);
  }

  <P> void generateCommandParamsBody(IndentWriter writer, List<P> parameters, PropertyLikeAccess<P> access) throws IOException {

    if (parameters != null) {
      boolean hasDoc = false;
      for (P param : parameters) {
        if (access.forTypedObject().getDescription(param) != null) {
          hasDoc = true;
          break;
        }
      }
      if (hasDoc) {
        writer.append("\t  /**\n");
        for (P param : parameters) {
          String propertyDescription = access.forTypedObject().getDescription(param);
          if (propertyDescription != null) {
            writer.append("\t   @param " + Generator.getParamName(param, access) + " " +
                propertyDescription + "\n");
          }
        }
        writer.append("\t   */\n");
      }
    }
    writer.append("\t  public " + getShortClassName() +"(");
    {
      boolean needComa = false;
      if (parameters != null) {
        for (P param : parameters) {
          if (needComa) {
            writer.append(", ");
          }
          String paramName = Generator.getParamName(param, access);
          MemberScope memberScope = newMemberScope(paramName);
          QualifiedTypeData paramTypeData =
              memberScope.resolveType(param, access.forTypedObject());
          writer.append(paramTypeData.getJavaType().getShortText(getClassContextNamespace()) +
              " " + paramName);
          needComa = true;
        }
      }
    }
    writer.append(") {\n");
    if (parameters != null) {
      for (P param : parameters) {
        boolean isOptional = access.forTypedObject().getOptional(param) == Boolean.TRUE;
        String paramName = Generator.getParamName(param, access);
        //if (isOptional) {
        //  writer.append("\t    if (" + paramName + " != null) {\n  ");
        //}
        writer.append("\t    //this.put(\"" + access.getName(param) + "\", " + paramName + ");\n");
        //noinspection StatementWithEmptyBody
        if (isOptional) {
          //writer.append("\t    }\n");
        }
      }
    }
    writer.append("\t  }\n");
    writer.append("\n");
  }

  @Override
  protected TypeData.Direction getTypeDirection() {
    return TypeData.Direction.OUTPUT;
  }

  private MemberScope newMemberScope(String memberName) {
    return new OutputMemberScope(memberName);
  }

  class OutputMemberScope extends MemberScope {
    protected OutputMemberScope(String memberName) {
      super(OutputClassScope.this, memberName);
    }

    @Override
    public BoxableType generateEnum(String description, List<String> enumConstants) {
      DeferredWriter builder = new DeferredWriter();
      if (description != null) {
        builder.append("\t  /**\n   " + description + "\n   */\n");
      }
      String enumName = Generator.capitalizeFirstChar(getMemberName());
      // JSONAware
      builder.append("\t  public enum " + enumName +
          " {\n");
      for (String constant : enumConstants) {
        builder.append("\t    " + EnumValueCondition.decorateEnumConstantName(constant) +
            "(\"" + constant + "\"),\n");
      }
      builder.append("\t    ;\n");
      builder.append("\t    private final String protocolValue;\n");
      builder.append("\t\n");
      builder.append("\t    " + enumName + "(String protocolValue) {\n");
      builder.append("\t      this.protocolValue = protocolValue;\n");
      builder.append("\t    }\n");
      builder.append("\t\n");
      builder.append("\t    public String toJSONString() {\n");
      builder.append("\t      return '\"' + protocolValue + '\"';\n");
      builder.append("\t    }\n");
      builder.append("\t  }\n");
      addMember(builder);

      return BoxableType.createReference(new NamePath(enumName, getClassContextNamespace()));
    }

    @Override
    public BoxableType generateNestedObject(String description,
        List<WipMetamodel.ObjectProperty> propertyList) throws IOException {
      throw new UnsupportedOperationException();
    }
  }
}
