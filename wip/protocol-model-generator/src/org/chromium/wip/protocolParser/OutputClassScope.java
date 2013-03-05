package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.protocolparser.TextOutput;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class OutputClassScope extends ClassScope {
  OutputClassScope(DomainGenerator generator, NamePath classNamePath) {
    super(generator, classNamePath);
  }

  <P> void generateConstructor(TextOutput out, List<P> parameters, PropertyLikeAccess<P> access) {
    if (parameters == null) {
      return;
    }
    List<P> mandatoryParameters = new ArrayList<P>();
    for (P param : parameters) {
      if (!access.forTypedObject().getOptional(param)) {
        mandatoryParameters.add(param);
      }
    }

    boolean hasDoc = false;
    for (P param : mandatoryParameters) {
      if (access.forTypedObject().getDescription(param) != null) {
        hasDoc = true;
        break;
      }
    }
    if (hasDoc) {
      out.append("/**").newLine();
      for (P param : mandatoryParameters) {
        String propertyDescription = access.forTypedObject().getDescription(param);
        if (propertyDescription != null) {
          out.append(" * @param " + getParamName(param, access) + " " + propertyDescription).newLine();
        }
      }
      out.append(" */").newLine();
    }
    out.append("public " + getShortClassName() + "(");

    boolean needComa = false;
    for (P param : mandatoryParameters) {
      if (needComa) {
        out.comma();
      }
      String paramName = getParamName(param, access);
      out.append(newMemberScope(paramName).resolveType(param, access.forTypedObject()).getJavaType().getShortText(getClassContextNamespace()));
      out.space().append(paramName);
      needComa = true;
    }
    out.append(")").openBlock(false);
    for (P param : mandatoryParameters) {
      out.newLine().append("put(").quoute(access.getName(param)).comma().append(getParamName(param, access)).append(");");
    }
    out.closeBlock();
  }

  private static <P> String getParamName(P param, PropertyLikeAccess<P> access) {
    String paramName = access.getName(param);
    if (access.forTypedObject().getOptional(param) == Boolean.TRUE) {
      paramName = paramName + "Opt";
    }
    return paramName;
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
