package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.protocolparser.TextOutput;
import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class OutputClassScope extends ClassScope {
  OutputClassScope(DomainGenerator generator, NamePath classNamePath) {
    super(generator, classNamePath);
  }

  <P extends ItemDescriptor.Named> void generate(TextOutput out, List<P> parameters, PropertyLikeAccess<P> access) {
    if (parameters == null) {
      return;
    }

    List<P> mandatoryParameters = new ArrayList<P>();
    List<P> optionalParameters = new ArrayList<P>();
    for (P parameter : parameters) {
      if (parameter.optional()) {
        optionalParameters.add(parameter);
      }
      else {
        mandatoryParameters.add(parameter);
      }
    }

    if (!mandatoryParameters.isEmpty()) {
      generateConstructor(out, access, mandatoryParameters);
    }
    for (P parameter : optionalParameters) {
      out.newLine().newLine();
      if (parameter.description() != null) {
        out.append("/**").newLine().append(" * @param v ").append(parameter.description()).newLine().append(" */").newLine();
      }

      String type = new OutputMemberScope(parameter.name()).resolveType(parameter).getJavaType().getShortText(getClassContextNamespace());
      if (type.equals("Object")) {
        type = "String";
      }

      out.append("public ").append(getShortClassName());
      out.space().append(parameter.name()).append("(").append(type);
      out.space().append("v").append(")").openBlock();
      appendWriteValueInvocation(out, parameter.name(), "v");
      out.newLine().append("return this;");
      out.closeBlock();
    }
  }

  private <P extends ItemDescriptor.Named> void generateConstructor(TextOutput out, PropertyLikeAccess<P> access, List<P> mandatoryParameters) {
    boolean hasDoc = false;
    for (P parameter : mandatoryParameters) {
      if (parameter.description() != null) {
        hasDoc = true;
        break;
      }
    }
    if (hasDoc) {
      out.append("/**").newLine();
      for (P parameter : mandatoryParameters) {
        if (parameter.description() != null) {
          out.append(" * @param " + parameter.name() + " " + parameter.description()).newLine();
        }
      }
      out.append(" */").newLine();
    }
    out.append("public " + getShortClassName() + "(");

    boolean needComa = false;
    for (P parameter : mandatoryParameters) {
      if (needComa) {
        out.comma();
      }
      out.append(new OutputMemberScope(parameter.name()).resolveType(parameter).getJavaType().getShortText(getClassContextNamespace()));
      out.space().append(parameter.name());
      needComa = true;
    }
    out.append(")").openBlock(false);
    for (P parameter : mandatoryParameters) {
      out.newLine();
      appendWriteValueInvocation(out, parameter.name(), parameter.name());
    }
    out.closeBlock();
  }

  private void appendWriteValueInvocation(TextOutput out, String name, String valueRefName) {
    out.append("put(").quoute(name).comma().append(valueRefName).append(");");
  }

  @Override
  protected TypeData.Direction getTypeDirection() {
    return TypeData.Direction.OUTPUT;
  }

  class OutputMemberScope extends MemberScope {
    protected OutputMemberScope(String memberName) {
      super(OutputClassScope.this, memberName);
    }

    @Override
    public BoxableType generateEnum(String description, List<String> enumConstants) {
      final TextOutput out = new TextOutput(new StringBuilder());
      if (description != null) {
        out.append("/**").newLine().append(" * ").append(description).newLine().append(" */").newLine();
      }
      String enumName = Generator.capitalizeFirstChar(getMemberName());
      out.append("public enum ").append(enumName).openBlock();
      for (String constant : enumConstants) {
        out.append(EnumValueCondition.decorateEnumConstantName(constant)).append("(\"" + constant + "\")");
        if (!enumConstants.get(enumConstants.size() - 1).equals(constant)) {
          out.comma();
        }
      }
      out.append(';').newLine();
      out.newLine().append("private final String protocolValue;").newLine();
      out.newLine().append(enumName).append("(String protocolValue)").openBlock();
      out.append("this.protocolValue = protocolValue;").closeBlock();

      out.newLine().newLine().append("public String toString()").openBlock();
      out.append("return protocolValue;").closeBlock();
      out.closeBlock();

      addMember(new DeferredWriter() {
        @Override
        void writeContent(IndentWriter output) {
          output.append(out.getOut().toString());
        }
      });
      return new StandaloneType(new NamePath(enumName, getClassContextNamespace()));
    }

    @Override
    public BoxableType generateNestedObject(String description, List<WipMetamodel.ObjectProperty> propertyList) throws IOException {
      throw new UnsupportedOperationException();
    }
  }
}
