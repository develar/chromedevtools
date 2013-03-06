package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.protocolparser.TextOutput;
import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

class DomainGenerator {
  final WipMetamodel.Domain domain;
  final Generator generator;

  DomainGenerator(Generator generator, WipMetamodel.Domain domain) {
    this.generator = generator;
    this.domain = domain;
  }

  void registerTypes() {
    if (domain.types() != null) {
      for (WipMetamodel.StandaloneType type : domain.types()) {
        generator.typeMap.getTypeData(domain.domain(), type.id()).setType(type);
      }
    }
  }

  void generateCommandsAndEvents() throws IOException {
    for (WipMetamodel.Command command : domain.commands()) {
      boolean hasResponse = command.returns() != null;
      generateCommandParams(command, hasResponse);
      if (hasResponse) {
        generateCommandData(command);
        String dataFullName = Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText();
        generator.jsonProtocolParserClassNames.add(dataFullName);
        generator.parserRootInterfaceItems.add(new ParserRootInterfaceItem(domain.domain(), command.name(), Naming.COMMAND_DATA));
      }
    }

    if (domain.events() != null) {
      for (WipMetamodel.Event event : domain.events()) {
        generateEvenData(event);
        generator.jsonProtocolParserClassNames.add(Naming.EVENT_DATA.getFullName(domain.domain(), event.name()).getFullText());
        generator.parserRootInterfaceItems.add(new ParserRootInterfaceItem(domain.domain(), event.name(), Naming.EVENT_DATA));
      }
    }
  }

  private void generateCommandParams(WipMetamodel.Command command, boolean hasResponse) throws IOException {
    StringBuilder baseTypeBuilder = new StringBuilder();
    baseTypeBuilder.append("org.jetbrains.wip.protocol.");
    if (hasResponse) {
      baseTypeBuilder.append("WipParamsWithResponse<");
      baseTypeBuilder.append(Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText());
      baseTypeBuilder.append(">");
    }
    else {
      baseTypeBuilder.append("WipParams");
    }

    TextOutput memberBuilder = new TextOutput(new StringBuilder());
    memberBuilder.indentIn().newLine();
    memberBuilder.append("public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.");
    memberBuilder.append(domain.domain().toUpperCase()).append(" + \".").append(command.name()).append("\";");
    memberBuilder.newLine().newLine().append("@Override").newLine().append("public String getCommand()").openBlock();
    memberBuilder.append("return METHOD_NAME;").closeBlock();

    if (hasResponse) {
      String dataInterfaceFullName = Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText();
      memberBuilder.newLine().newLine().append("@Override").newLine().append("public ").append(dataInterfaceFullName).append(" parseResponse(" +
        "org.jetbrains.wip.protocol.WipCommandResponse.Data data, " +
        "org.chromium.wip.protocol.input." + Generator.READER_INTERFACE_NAME + " parser) throws java.io.IOException").openBlock();
      memberBuilder.append("return parser.").append(Naming.COMMAND_DATA.getParseMethodName(domain.domain(), command.name()));
      memberBuilder.append("(data.getUnderlyingObject());");
      memberBuilder.closeBlock();
    }

    memberBuilder.indentOut().newLine();
    generateTopLevelOutputClass(Naming.PARAMS, command.name(), command.description(), baseTypeBuilder.toString(),
                                memberBuilder, command.parameters(), PropertyLikeAccess.PARAMETER);
  }

  void generateCommandAdditionalParam(WipMetamodel.StandaloneType type) throws IOException {
    generateTopLevelOutputClass(Naming.ADDITIONAL_PARAM, type.id(), type.description(),
        null, null, type.properties(), PropertyLikeAccess.PROPERTY);
  }

  private <P extends ItemDescriptor.Named> void generateTopLevelOutputClass(ClassNameScheme nameScheme, String baseName,
      String description, String baseType, TextOutput additionalMemberText,
      List<P> properties, PropertyLikeAccess<P> propertyAccess) throws IOException {
    JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, baseName);
    Writer writer = fileUpdater.getWriter();
    IndentWriter indentWriter = new IndentWriterImpl(writer, "");
    NamePath classNamePath = nameScheme.getFullName(domain.domain(), baseName);
    generateOutputClass(indentWriter, classNamePath, description, baseType, additionalMemberText, properties, propertyAccess);
    writer.close();
    fileUpdater.update();
  }

  private <P extends ItemDescriptor.Named> void generateOutputClass(IndentWriter writer, NamePath classNamePath,
      String description, @Nullable String baseType, final TextOutput additionalMemberText,
      List<P> properties, PropertyLikeAccess<P> propertyAccess) {
    TextOutput out = new TextOutput(new StringBuilder());
    if (description != null) {
      out.append("/**").newLine().append(" * ").append(description).newLine().append(" */").newLine();
    }
    out.append("public class ").append(classNamePath.getLastComponent());
    out.append(" extends ").append(baseType == null ? "org.jetbrains.jsonProtocol.OutMessage" : baseType);

    OutputClassScope classScope = new OutputClassScope(this, classNamePath);
    if (additionalMemberText != null) {
      classScope.addMember(new DeferredWriter() {
        @Override
        void writeContent(IndentWriter output) {
          output.append(additionalMemberText.getOut().toString());
        }
      });
    }

    out.openBlock();
    classScope.generate(out, properties, propertyAccess);
    classScope.writeAdditionalMembers(new IndentWriterImpl(out.getOut(), ""));
    out.closeBlock();
    writer.append(out.getOut().toString());
  }

  StandaloneTypeBinding createStandaloneOutputTypeBinding(WipMetamodel.StandaloneType type, String name) {
    return Generator.switchByType(type, new MyCreateStandaloneTypeBindingVisitorBase(this, type, name));
  }

  StandaloneTypeBinding createStandaloneInputTypeBinding(WipMetamodel.StandaloneType type) {
    return Generator.switchByType(type, new CreateStandaloneTypeBindingVisitorBase(this, type) {
      @Override
      public StandaloneTypeBinding visitObject(List<WipMetamodel.ObjectProperty> properties) {
        return createStandaloneObjectInputTypeBinding(getType(), properties);
      }

      @Override
      public StandaloneTypeBinding visitEnum(List<String> enumConstants) {
        return createStandaloneEnumInputTypeBinding(getType(), enumConstants,
                                                    TypeData.Direction.INPUT);
      }

      @Override
      public StandaloneTypeBinding visitArray(WipMetamodel.ArrayItemType items) {
        ResolveAndGenerateScope resolveAndGenerateScope = new ResolveAndGenerateScope() {
          // This class is responsible for generating ad hoc type.
          // If we ever are to do it, we should generate into string buffer and put strings
          // inside TypeDef class.
          @Override
          public String getDomainName() {
            return domain.domain();
          }

          @Override
          public TypeData.Direction getTypeDirection() {
            return TypeData.Direction.INPUT;
          }

          @Override
          public BoxableType generateEnum(String description,
                                          List<String> enumConstants) {
            throw new UnsupportedOperationException();
          }

          @Override
          public <T extends ItemDescriptor> QualifiedTypeData resolveType(T typedObject) {
            throw new UnsupportedOperationException();
          }

          @Override
          public BoxableType generateNestedObject(String description,
                                                  List<WipMetamodel.ObjectProperty> properties) {
            throw new UnsupportedOperationException();
          }
        };
        QualifiedTypeData itemTypeData =
          generator.resolveType(items, resolveAndGenerateScope);
        BoxableType itemBoxableType = itemTypeData.getJavaType();

        final BoxableType arrayType = BoxableType.createList(itemBoxableType);

        StandaloneTypeBinding.Target target = new StandaloneTypeBinding.Target() {
          @Override
          public BoxableType resolve(ResolveContext context) {
            return arrayType;
          }
        };

        return createTypedefTypeBinding(getType(), target,
                                        Naming.INPUT_TYPEDEF, TypeData.Direction.INPUT);
      }
    });
  }

  StandaloneTypeBinding createStandaloneObjectInputTypeBinding(final WipMetamodel.StandaloneType type,
      final List<WipMetamodel.ObjectProperty> properties) {
    final String name = type.id();
    final NamePath fullTypeName = Naming.INPUT_VALUE.getFullName(domain.domain(), name);
    generator.jsonProtocolParserClassNames.add(fullTypeName.getFullText());

    return new StandaloneTypeBinding() {
      @Override public BoxableType getJavaType() {
        return new Reference(fullTypeName);
      }

      @Override
      public void generate() throws IOException {
        String description = type.description();

        NamePath className = Naming.INPUT_VALUE.getFullName(domain.domain(), name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.INPUT_VALUE, domain, name);

        IndentWriter writer = new IndentWriterImpl(fileUpdater.getWriter(), "");
        if (description != null) {
          writer.append("\t/**\n " + description + "\n */\n");
        }

        writer.append("\t@org.chromium.protocolParser.JsonType\n");
        writer.append("\tpublic interface " + className.getLastComponent() +" {\n");

        InputClassScope classScope = new InputClassScope(DomainGenerator.this, className);
        classScope.generateStandaloneTypeBody(writer, properties);
        classScope.writeAdditionalMembers(writer);
        writer.append("\t}\n");
        fileUpdater.update();
      }

      @Override public TypeData.Direction getDirection() {
        return TypeData.Direction.INPUT;
      }
    };
  }

  StandaloneTypeBinding createStandaloneEnumInputTypeBinding(final WipMetamodel.StandaloneType type,
      final List<String> enumConstants, final TypeData.Direction direction) {
    final String name = type.id();
    return new StandaloneTypeBinding() {
      @Override public BoxableType getJavaType() {
        return new Reference(Naming.INPUT_ENUM.getFullName(domain.domain(), name));
      }

      @Override
      public void generate() throws IOException {
        String description = type.description();

        String className = Naming.INPUT_ENUM.getShortName(name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.INPUT_ENUM, domain, name);

        Writer writer = fileUpdater.getWriter();

        if (description != null) {
          writer.write("/**\n " + description + "\n */\n");
        }

        writer.write("public enum " + className +" {\n");

        boolean first = true;
        for (String constName : enumConstants) {
          if (first) {
            writer.write("\n  ");
          } else {
            writer.write(",\n  ");
          }
          writer.write(EnumValueCondition.decorateEnumConstantName(constName));
          first = false;
        }
        writer.write("\n");

        writer.write("}\n");

        fileUpdater.update();
      }

      @Override public TypeData.Direction getDirection() {
        return direction;
      }
    };
  }

  /**
   * Typedef is an empty class that just holds description and
   * refers to an actual type (such as String).
   */
  StandaloneTypeBinding createTypedefTypeBinding(final WipMetamodel.StandaloneType type, StandaloneTypeBinding.Target target,
       final ClassNameScheme nameScheme, final TypeData.Direction direction) {
    final String name = type.id();
    final NamePath typedefJavaName = nameScheme.getFullName(domain.domain(), name);
    final List<DeferredWriter> deferredWriters = new ArrayList<DeferredWriter>(0);

    class ResolveContextImpl implements StandaloneTypeBinding.Target.ResolveContext {
      @Override
      public BoxableType generateNestedObject(String shortName,
          String description, List<WipMetamodel.ObjectProperty> properties)
          throws IOException {

        DeferredWriter writer = new DeferredWriter();

        NamePath classNamePath = new NamePath(shortName, typedefJavaName);

        if (direction == null) {
          throw new RuntimeException("Unsupported");
        } else {
          switch (direction) {
          case INPUT:
            throw new RuntimeException("TODO");
          case OUTPUT:
            // "org.json.simple.JSONObject"
            generateOutputClass(writer, classNamePath, description, null, null, properties, PropertyLikeAccess.PROPERTY);
            break;
          default:
            throw new RuntimeException();
          }
        }

        deferredWriters.add(writer);

        return new Reference(new NamePath(shortName, typedefJavaName));
      }
    }

    ResolveContextImpl resolveContext = new ResolveContextImpl();

    final BoxableType actualJavaType = target.resolve(resolveContext);
    return new StandaloneTypeBinding() {
      @Override public BoxableType getJavaType() {
        return new DecoratedBoxableType(actualJavaType);
      }

      @Override
      public void generate() throws IOException {
        String className = nameScheme.getShortName(name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, name);
        IndentWriter writer = new IndentWriterImpl(fileUpdater.getWriter(), "");
        if (type.description() != null) {
          writer.append("\t/**\n " + type.description() + "\n */\n");
        }

        writer.append("\tpublic class " + className + " {\n");
        writer.append("\t  /*\n   The class is 'typedef'.\n" +
            "\t   It merely holds a type javadoc and its only field refers to an " +
            "actual type.\n" +
            "\t   */\n");
        writer.append("\t  " + actualJavaType.getShortText(typedefJavaName) + " actualType;\n");

        IndentWriter innerWriter = writer.createInner();
        for (DeferredWriter memberWriter : deferredWriters) {
          memberWriter.writeContent(innerWriter);
        }

        writer.append("\t}\n");
        fileUpdater.update();
      }

      @Override
      public TypeData.Direction getDirection() {
        return direction;
      }
    };
  }

  private void generateCommandData(WipMetamodel.Command command) throws IOException {
    String className = Naming.COMMAND_DATA.getShortName(command.name());
    JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.COMMAND_DATA, domain, command.name());
    IndentWriter writer = new IndentWriterImpl(fileUpdater.getWriter(), "");
    generateJsonProtocolInterface(writer, className, command.description(), command.returns(), null);
    fileUpdater.update();
  }

  private void generateEvenData(WipMetamodel.Event event) throws IOException {
    String className = Naming.EVENT_DATA.getShortName(event.name());
    JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.EVENT_DATA, domain, event.name());
    String domainName = domain.domain();
    String fullName = Naming.EVENT_DATA.getFullName(domainName, event.name()).getFullText();

    DeferredWriter eventTypeMemberText = new DeferredWriter();
    eventTypeMemberText.append(
        "\t  public static final org.jetbrains.wip.protocol.WipEventType<" +
        fullName +
        "> TYPE\n\t      = new org.jetbrains.wip.protocol.WipEventType<" +
        fullName +
        ">(\"" + domainName + "" + event.name() + "\", " + fullName + ".class) {\n" +
        "\t    @Override public " + fullName + " parse(" + Generator.INPUT_PACKAGE + "." +
        Generator.READER_INTERFACE_NAME + " parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {\n" +
        "\t      return parser." +
        Naming.EVENT_DATA.getParseMethodName(domainName, event.name()) +
        "(reader);\n" +
        "\t    }\n" +
        "\t  };\n");

    IndentWriter writer = new IndentWriterImpl(fileUpdater.getWriter(), "");
    generateJsonProtocolInterface(writer, className, event.description(), event.parameters(), eventTypeMemberText);
    fileUpdater.update();
  }

  private void generateJsonProtocolInterface(IndentWriter writer, String className,
      String description, List<WipMetamodel.Parameter> parameters, DeferredWriter additionalMembersText)
      throws IOException {
    if (description != null) {
      writer.append("\t/**\n " + description + "\n */\n");
    }

    writer.append("\t@org.chromium.protocolParser.JsonType\n");
    writer.append("\tpublic interface " + className +" {\n");

    InputClassScope classScope = new InputClassScope(this, new NamePath(className, new NamePath(ClassNameScheme.getPackageName(Generator.INPUT_PACKAGE, domain.domain()))));
    if (additionalMembersText != null) {
      classScope.addMember(additionalMembersText);
    }
    classScope.generateMainJsonProtocolInterfaceBody(writer, parameters);
    classScope.writeAdditionalMembers(writer);
    writer.append("\t}\n");
  }
}