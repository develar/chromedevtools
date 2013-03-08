package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.Enums;
import org.chromium.protocolparser.TextOutput;
import org.jetbrains.jsonProtocol.ItemDescriptor;
import org.jetbrains.jsonProtocol.ProtocolMetaModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class OutputClassScope extends ClassScope {
  OutputClassScope(DomainGenerator generator, NamePath classNamePath) {
    super(generator, classNamePath);
  }

  <P extends ItemDescriptor.Named> void generate(TextOutput out, List<P> parameters) {
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
      generateConstructor(out, mandatoryParameters);
    }

    // generate enum classes after constructor
    for (P parameter : parameters) {
      if (parameter.getEnum() != null) {
        out.newLine().newLine();
        appendEnumClass(out, parameter.description(), parameter.getEnum(), Generator.capitalizeFirstChar((parameter.name())));
      }
    }

    for (P parameter : optionalParameters) {
      out.newLine().newLine();
      if (parameter.description() != null) {
        out.append("/**").newLine().append(" * @param v ").append(parameter.description()).newLine().append(" */").newLine();
      }

      CharSequence type = new OutputMemberScope(parameter.name()).resolveType(parameter).getJavaType().getShortText(getClassContextNamespace());
      if (type.equals("Object")) {
        type = "String";
      }

      out.append("public ").append(getShortClassName());
      out.space().append(parameter.name()).append("(").append(type);
      out.space().append("v").append(")").openBlock();
      appendWriteValueInvocation(out, parameter, "v");
      out.newLine().append("return this;");
      out.closeBlock();
    }
  }

  private <P extends ItemDescriptor.Named> void generateConstructor(TextOutput out, List<P> mandatoryParameters) {
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
      appendWriteValueInvocation(out, parameter, parameter.name());
    }
    out.closeBlock();
  }

  private void appendWriteValueInvocation(TextOutput out, ItemDescriptor.Named parameter, String valueRefName) {
    BoxableType type = new OutputMemberScope(parameter.name()).resolveType(parameter).getJavaType();
    boolean blockOpened = false;
    if (parameter.optional()) {
      String nullValue;
      if (type == BoxableType.STRING) {
        nullValue = "null";
      }
      else if (parameter.name().equals("columnNumber") || parameter.name().equals("column")) {
        // todo generic solution
        nullValue = "-1";
      }
      else {
        nullValue = null;
      }

      if (nullValue != null) {
        blockOpened = true;
        out.append("if (v != ").append(nullValue).append(")").openBlock();
      }
    }
    out.append(type.getWriteMethodName()).append("(");
    out.quoute(parameter.name()).comma().append(valueRefName).append(");");
    if (blockOpened) {
      out.closeBlock();
    }
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
    public BoxableType generateEnum(final String description, final List<String> enumConstants) {
      //final String enumName = Generator.capitalizeFirstChar(getMemberName());
      //addMember(new TextOutConsumer() {
      //  @Override
      //  public void append(TextOutput out) throws IOException {
      //    appendEnumClass(out, description, enumConstants, enumName);
      //  }
      //});
      return new StandaloneType(new NamePath(Generator.capitalizeFirstChar(getMemberName()), getClassContextNamespace()));
    }

    @Override
    public BoxableType generateNestedObject(String description, List<ProtocolMetaModel.ObjectProperty> propertyList) throws IOException {
      throw new UnsupportedOperationException();
    }
  }

  private void appendEnumClass(TextOutput out, String description, List<String> enumConstants, String enumName) {
    out.doc(description);
    Enums.appendEnums(enumConstants, enumName, false, out);
    out.newLine().append("private final String protocolValue;").newLine();
    out.newLine().append(enumName).append("(String protocolValue)").openBlock();
    out.append("this.protocolValue = protocolValue;").closeBlock();

    out.newLine().newLine().append("public String toString()").openBlock();
    out.append("return protocolValue;").closeBlock();
    out.closeBlock();
  }
}
