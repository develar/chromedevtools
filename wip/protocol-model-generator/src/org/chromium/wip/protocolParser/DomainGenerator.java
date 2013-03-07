package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.Enums;
import org.chromium.protocolparser.TextOutput;
import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
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
        String className = Naming.COMMAND_DATA.getShortName(command.name());
        JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.COMMAND_DATA, domain, command.name());
        generateJsonProtocolInterface(fileUpdater.out, className, command.description(), command.returns(), null);
        fileUpdater.update();
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

  private void generateCommandParams(final WipMetamodel.Command command, final boolean hasResponse) throws IOException {
    StringBuilder baseTypeBuilder = new StringBuilder();
    baseTypeBuilder.append("org.jetbrains.wip.protocol.");
    if (hasResponse) {
      baseTypeBuilder.append("WipRequestWithResponse<");
      baseTypeBuilder.append(Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText());
      baseTypeBuilder.append(">");
    }
    else {
      baseTypeBuilder.append("WipRequest");
    }

    TextOutConsumer memberBuilder = new TextOutConsumer() {
      @Override
      public void append(TextOutput out) {
        out.newLine().append("@Override").newLine().append("public String getMethodName()").openBlock();
        out.append("return \"").append(domain.domain()).append('.').append(command.name()).append("\";").closeBlock();

        if (hasResponse) {
          CharSequence dataInterfaceFullName = Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText();
          out.newLine().newLine().append("@Override").newLine().append("public ").append(dataInterfaceFullName)
            .append(" parseResponse(" +
                    "org.jetbrains.wip.protocol.WipCommandResponse.Data data, " +
                    "org.chromium.wip.protocol.input." + Generator.READER_INTERFACE_NAME + " parser) throws java.io.IOException")
            .openBlock();
          out.append("return parser.").append(Naming.COMMAND_DATA.getParseMethodName(domain.domain(), command.name()));
          out.append("(data.getDeferredReader());");
          out.closeBlock();
        }
      }
    };
    generateTopLevelOutputClass(Naming.PARAMS, command.name(), command.description(), baseTypeBuilder.toString(),
                                memberBuilder, command.parameters());
  }

  void generateCommandAdditionalParam(WipMetamodel.StandaloneType type) throws IOException {
    generateTopLevelOutputClass(Naming.ADDITIONAL_PARAM, type.id(), type.description(),
        null, null, type.properties());
  }

  private <P extends ItemDescriptor.Named> void generateTopLevelOutputClass(ClassNameScheme nameScheme,
                                                                            String baseName,
                                                                            String description,
                                                                            String baseType,
                                                                            TextOutConsumer additionalMemberText,
                                                                            List<P> properties) throws IOException {
    JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, baseName);
    TextOutput out = fileUpdater.out;
    NamePath classNamePath = nameScheme.getFullName(domain.domain(), baseName);
    generateOutputClass(out, classNamePath, description, baseType, additionalMemberText, properties);
    fileUpdater.update();
  }

  private <P extends ItemDescriptor.Named> void generateOutputClass(TextOutput out,
                                                                    NamePath classNamePath,
                                                                    String description,
                                                                    @Nullable String baseType,
                                                                    TextOutConsumer additionalMemberText,
                                                                    List<P> properties) throws IOException {
    out.doc(description);
    out.append("public class ").append(classNamePath.getLastComponent());
    out.append(" extends ").append(baseType == null ? "org.jetbrains.jsonProtocol.OutMessage" : baseType);

    OutputClassScope classScope = new OutputClassScope(this, classNamePath);
    if (additionalMemberText != null) {
      classScope.addMember(additionalMemberText);
    }

    out.openBlock();
    classScope.generate(out, properties);
    classScope.writeAdditionalMembers(out);
    out.closeBlock();
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
          public <T extends ItemDescriptor> QualifiedTypeData resolveType(T typedObject) {
            throw new UnsupportedOperationException();
          }

          @Override
          public BoxableType generateNestedObject(String description, List<WipMetamodel.ObjectProperty> properties) {
            throw new UnsupportedOperationException();
          }
        };
        QualifiedTypeData itemTypeData = generator.resolveType(items, resolveAndGenerateScope);
        BoxableType itemBoxableType = itemTypeData.getJavaType();

        final BoxableType arrayType = BoxableType.createList(itemBoxableType);

        StandaloneTypeBinding.Target target = new StandaloneTypeBinding.Target() {
          @Override
          public BoxableType resolve(ResolveContext context) {
            return arrayType;
          }
        };

        return createTypedefTypeBinding(getType(), target, Naming.INPUT_TYPEDEF, TypeData.Direction.INPUT);
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
        return new StandaloneType(fullTypeName);
      }

      @Override
      public void generate() throws IOException {
        NamePath className = Naming.INPUT_VALUE.getFullName(domain.domain(), name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.INPUT_VALUE, domain, name);
        TextOutput out = fileUpdater.out;
        if (type.description() != null) {
          out.doc(type.description());
        }

        out.append("@org.chromium.protocolParser.JsonType").newLine();
        out.append("public interface ").append(className.getLastComponent()).openBlock();
        InputClassScope classScope = new InputClassScope(DomainGenerator.this, className);
        classScope.generateStandaloneTypeBody(out, properties);
        classScope.writeAdditionalMembers(out);
        out.closeBlock();
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
      @Override
      public BoxableType getJavaType() {
        return new StandaloneType(Naming.INPUT_ENUM.getFullName(domain.domain(), name));
      }

      @Override
      public void generate() throws IOException {
        JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.INPUT_ENUM, domain, name);
        fileUpdater.out.doc(type.description());
        Enums.appendEnums(enumConstants, Naming.INPUT_ENUM.getShortName(name), true, fileUpdater.out);
        fileUpdater.update();
      }

      @Override
      public TypeData.Direction getDirection() {
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
    final List<TextOutput> deferredWriters = new ArrayList<TextOutput>();

    class ResolveContextImpl implements StandaloneTypeBinding.Target.ResolveContext {
      @Override
      public BoxableType generateNestedObject(String shortName, String description, List<WipMetamodel.ObjectProperty> properties) throws IOException {
        NamePath classNamePath = new NamePath(shortName, typedefJavaName);
        if (direction == null) {
          throw new RuntimeException("Unsupported");
        }

        switch (direction) {
          case INPUT:
            throw new RuntimeException("TODO");
          case OUTPUT:
            // "org.json.simple.JSONObject"
            TextOutput out = new TextOutput(new StringBuilder());
            generateOutputClass(out, classNamePath, description, null, null, properties);
            deferredWriters.add(out);
            break;
          default:
            throw new RuntimeException();
        }
        return new StandaloneType(new NamePath(shortName, typedefJavaName));
      }
    }

    ResolveContextImpl resolveContext = new ResolveContextImpl();
    final BoxableType actualJavaType = target.resolve(resolveContext);
    return new StandaloneTypeBinding() {
      @Override
      public BoxableType getJavaType() {
        return actualJavaType;
      }

      @Override
      public void generate() throws IOException {
        String className = nameScheme.getShortName(name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, name);
        TextOutput out = fileUpdater.out;
        out.doc(type.description());
        out.append("public class ").append(className).openBlock();
        out.doc("The class is 'typedef'. It merely holds a type javadoc and its only field refers to an actual type");
        out.append(actualJavaType.getShortText(typedefJavaName) + " actualType;").newLine();
        for (TextOutput memberWriter : deferredWriters) {
          out.getOut().append(memberWriter.getOut());
        }
        out.closeBlock();
        fileUpdater.update();
      }

      @Override
      public TypeData.Direction getDirection() {
        return direction;
      }
    };
  }

  private void generateEvenData(final WipMetamodel.Event event) throws IOException {
    String className = Naming.EVENT_DATA.getShortName(event.name());
    JavaFileUpdater fileUpdater = generator.startJavaFile(Naming.EVENT_DATA, domain, event.name());
    final String domainName = domain.domain();
    final CharSequence fullName = Naming.EVENT_DATA.getFullName(domainName, event.name()).getFullText();
    generateJsonProtocolInterface(fileUpdater.out, className, event.description(), event.parameters(), new TextOutConsumer() {
      @Override
      public void append(TextOutput out) {
        out.newLine().append("public static final org.jetbrains.wip.protocol.WipEventType<").append(fullName).append("> TYPE").newLine();
        out.append("\t= new org.jetbrains.wip.protocol.WipEventType<").append(fullName).append(">");
        out.append("(\"" + domainName + "" + event.name() + "\", ").append(fullName).append(".class)").openBlock();
        {
          out.append("@Override").newLine().append("public ").append(fullName).append(" parse(");
          out.append(Generator.INPUT_PACKAGE).append('.').append(Generator.READER_INTERFACE_NAME + " parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException").openBlock();
          out.append("return parser.").append(Naming.EVENT_DATA.getParseMethodName(domainName, event.name())).append("(reader);").closeBlock();
        }
        out.closeBlock();
        out.semi();
      }
    });
    fileUpdater.update();
  }

  private void generateJsonProtocolInterface(TextOutput out, String className, String description, List<WipMetamodel.Parameter> parameters, TextOutConsumer additionalMembersText) throws IOException {
    if (description != null) {
      out.doc(description);
    }
    out.append("@org.chromium.protocolParser.JsonType").newLine().append("public interface ").append(className).openBlock();
    InputClassScope classScope = new InputClassScope(this, new NamePath(className, new NamePath(ClassNameScheme.getPackageName(Generator.INPUT_PACKAGE, domain.domain()))));
    if (additionalMembersText != null) {
      classScope.addMember(additionalMembersText);
    }
    classScope.generateMainJsonProtocolInterfaceBody(out, parameters);
    classScope.writeAdditionalMembers(out);
    out.closeBlock();
  }
}