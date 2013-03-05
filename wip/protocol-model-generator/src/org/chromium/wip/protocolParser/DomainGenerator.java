package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.EnumValueCondition;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

class DomainGenerator {
  private final WipMetamodel.Domain domain;
  private Generator generator;

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
      baseTypeBuilder.append("WipParamsWithResponse<")
        .append(Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText()).append(">");
    } else {
      baseTypeBuilder.append("WipParams");
    }

    DeferredWriter additionalMemberBuilder = new DeferredWriter();
    additionalMemberBuilder.append("\t  public static final String METHOD_NAME = " +
        "org.jetbrains.wip.protocol.BasicConstants.Domain." +
        domain.domain().toUpperCase() + " + \"." + command.name() + "\";\n");
    additionalMemberBuilder.append("\n");


    additionalMemberBuilder.append("\t  @Override protected String getRequestName() {\n");
    additionalMemberBuilder.append("\t    return METHOD_NAME;\n");
    additionalMemberBuilder.append("\t  }\n");
    additionalMemberBuilder.append("\t\n");

    if (hasResponse) {
      String dataInterfaceFullname =
          Naming.COMMAND_DATA.getFullName(domain.domain(), command.name()).getFullText();
      additionalMemberBuilder.append(
          "\t  @Override public " + dataInterfaceFullname + " parseResponse(" +
          "org.jetbrains.wip.protocol.WipCommandResponse.Data data, " +
          "org.chromium.wip.protocol.input." + Generator.READER_INTERFACE_NAME + " parser) throws java.io.IOException {\n");
      additionalMemberBuilder.append("\t    return parser." +
          Naming.COMMAND_DATA.getParseMethodName(domain.domain(), command.name()) +
          "(data.getUnderlyingObject());\n");
      additionalMemberBuilder.append("\t  }\n");
      additionalMemberBuilder.append("\t\n");
    }

    generateTopLevelOutputClass(Naming.PARAMS, command.name(), command.description(), baseTypeBuilder.toString(),
                                additionalMemberBuilder, command.parameters(), PropertyLikeAccess.PARAMETER);
  }

  private void generateCommandAdditionalParam(WipMetamodel.StandaloneType type) throws IOException {
    generateTopLevelOutputClass(Naming.ADDITIONAL_PARAM, type.id(), type.description(),
        null, null, type.properties(), PropertyLikeAccess.PROPERTY);
  }

  private <P> void generateTopLevelOutputClass(ClassNameScheme nameScheme, String baseName,
      String description, String baseType, DeferredWriter additionalMemberText,
      List<P> properties, PropertyLikeAccess<P> propertyAccess) throws IOException {
    JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, baseName);

    Writer writer = fileUpdater.getWriter();
    IndentWriter indentWriter = new IndentWriterImpl(writer, "");
    NamePath classNamePath = nameScheme.getFullName(domain.domain(), baseName);

    generateOutputClass(indentWriter, classNamePath, description, baseType, additionalMemberText,
        properties, propertyAccess);

    writer.close();

    fileUpdater.update();
  }

  private <P> void generateOutputClass(IndentWriter writer, NamePath classNamePath,
      String description, String baseType, DeferredWriter additionalMemberText,
      List<P> properties, PropertyLikeAccess<P> propertyAccess) throws IOException {
    if (description != null) {
      writer.append("\t/**\n" + description + "\n */\n");
    }
    writer.append("\tpublic class " + classNamePath.getLastComponent());
    if (baseType != null) {
      writer.append(" extends " + baseType);
    }
    writer.append(" {\n");

    OutputClassScope classScope = new OutputClassScope(classNamePath);

    if (additionalMemberText != null) {
      classScope.addMember(additionalMemberText);
    }

    classScope.generateCommandParamsBody(writer, properties, propertyAccess
    );

    classScope.writeAdditionalMembers(writer);

    writer.append("\t}\n");
  }

  StandaloneTypeBinding createStandaloneOutputTypeBinding(WipMetamodel.StandaloneType type,
      final String name) {
    return Generator.switchByType(type, TypedObjectAccess.FOR_STANDALONE,
                                  new CreateStandalonTypeBindingVisitorBase(this, type) {
                                    @Override
                                    public StandaloneTypeBinding visitObject(List<WipMetamodel.ObjectProperty> properties) {
                                      return new StandaloneTypeBinding() {
                                        @Override
                                        public BoxableType getJavaType() {
                                          return BoxableType.createReference(
                                            Naming.ADDITIONAL_PARAM.getFullName(domain.domain(), name));
                                        }

                                        @Override
                                        public void generate() throws IOException {
                                          generateCommandAdditionalParam(getType());
                                        }

                                        @Override
                                        public TypeData.Direction getDirection() {
                                          return TypeData.Direction.OUTPUT;
                                        }
                                      };
                                    }

                                    @Override
                                    public StandaloneTypeBinding visitEnum(List<String> enumConstants) {
                                      throw new RuntimeException();
                                    }

                                    @Override
                                    public StandaloneTypeBinding visitArray(final WipMetamodel.ArrayItemType items) {
                                      StandaloneTypeBinding.Target target = new StandaloneTypeBinding.Target() {
                                        @Override
                                        public BoxableType resolve(final ResolveContext context) {
                                          ResolveAndGenerateScope resolveAndGenerateScope =
                                            new ResolveAndGenerateScope() {
                                              // This class is responsible for generating ad hoc type.
                                              // If we ever are to do it, we should generate into string buffer and put strings
                                              // inside TypeDef class.
                                              @Override
                                              public String getDomainName() {
                                                return domain.domain();
                                              }

                                              @Override
                                              public TypeData.Direction getTypeDirection() {
                                                return TypeData.Direction.OUTPUT;
                                              }

                                              @Override
                                              public BoxableType generateEnum(String description,
                                                                                        List<String> enumConstants) {
                                                throw new UnsupportedOperationException();
                                              }

                                              @Override
                                              public <T> QualifiedTypeData resolveType(T typedObject, TypedObjectAccess<T> access) {
                                                throw new UnsupportedOperationException();
                                              }

                                              @Override
                                              public BoxableType generateNestedObject(String description,
                                                                                                List<WipMetamodel.ObjectProperty> properties)
                                                throws IOException {
                                                return context.generateNestedObject("Item", description, properties);
                                              }
                                            };
                                          QualifiedTypeData itemTypeData = generator.resolveType(items, TypedObjectAccess.FOR_ARRAY_ITEM, resolveAndGenerateScope);
                                          BoxableType itemBoxableType = itemTypeData.getJavaType();
                                          return BoxableType.createList(itemBoxableType);
                                        }
                                      };

                                      return createTypedefTypeBinding(getType(), target, Naming.OUTPUT_TYPEDEF, TypeData.Direction.OUTPUT);
                                    }
                                  });
  }

  StandaloneTypeBinding createStandaloneInputTypeBinding(WipMetamodel.StandaloneType type) {
    return Generator.switchByType(type, TypedObjectAccess.FOR_STANDALONE,
                                  new CreateStandalonTypeBindingVisitorBase(this, type) {
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
                                        public <T> QualifiedTypeData resolveType(T typedObject, TypedObjectAccess<T> access) {
                                          throw new UnsupportedOperationException();
                                        }

                                        @Override
                                        public BoxableType generateNestedObject(String description,
                                                                                          List<WipMetamodel.ObjectProperty> properties) {
                                          throw new UnsupportedOperationException();
                                        }
                                      };
                                      QualifiedTypeData itemTypeData =
                                        generator.resolveType(items, TypedObjectAccess.FOR_ARRAY_ITEM, resolveAndGenerateScope);
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
        return BoxableType.createReference(fullTypeName);
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

        InputClassScope classScope = new InputClassScope(className);
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
        return BoxableType.createReference(Naming.INPUT_ENUM.getFullName(domain.domain(), name));
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
    final BoxableType typedefJavaType = BoxableType.createReference(typedefJavaName);

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
            generateOutputClass(writer, classNamePath, description, null,
                null, properties, PropertyLikeAccess.PROPERTY);
            break;
          default:
            throw new RuntimeException();
          }
        }

        deferredWriters.add(writer);

        return BoxableType.createReference(new NamePath(shortName, typedefJavaName));
      }
    }

    ResolveContextImpl resolveContext = new ResolveContextImpl();

    final BoxableType actualJavaType = target.resolve(resolveContext);
    return new StandaloneTypeBinding() {
      @Override public BoxableType getJavaType() {
        return new DecoratedBoxableType(actualJavaType);
      }

      class DecoratedBoxableType extends BoxableType {
        private final BoxableType original;

        DecoratedBoxableType(BoxableType original) {
          this.original = original;
        }

        @Override
        String getFullText() {
          return original.getFullText();
          //return decorateTypeName(original.getFullText(), typedefJavaType.getFullText());
        }

        @Override
        String getShortText(NamePath contextNamespace) {
          return original.getShortText(contextNamespace);
          //return decorateTypeName(original.getShortText(contextNamespace),
          //                        typedefJavaType.getShortText(contextNamespace));
        }

        @Override
        BoxableType convertToPureReference() {
          BoxableType pureReference = original.convertToPureReference();
          if (pureReference == original) {
            return this;
          }
          else {
            return new DecoratedBoxableType(pureReference);
          }
        }

        private String decorateTypeName(String actualTypeName, String innerTypeName) {
          return actualTypeName + "/*See " + innerTypeName + "*/";
        }
      }

      @Override
      public void generate() throws IOException {
        String description = type.description();

        String className = nameScheme.getShortName(name);
        JavaFileUpdater fileUpdater = generator.startJavaFile(nameScheme, domain, name);

        IndentWriter writer = new IndentWriterImpl(fileUpdater.getWriter(), "");
        if (description != null) {
          writer.append("\t/**\n " + description + "\n */\n");
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

    InputClassScope classScope = new InputClassScope(new NamePath(className, new NamePath(ClassNameScheme.getPackageName(Generator.INPUT_PACKAGE, domain.domain()))));
    if (additionalMembersText != null) {
      classScope.addMember(additionalMembersText);
    }
    classScope.generateMainJsonProtocolInterfaceBody(writer, parameters);
    classScope.writeAdditionalMembers(writer);
    writer.append("\t}\n");
  }

  private abstract class ClassScope {
    private final List<DeferredWriter> additionalMemberTexts = new ArrayList<DeferredWriter>(2);
    private final NamePath contextNamespace;

    ClassScope(NamePath classNamespace) {
      contextNamespace = classNamespace;
    }

    protected String getShortClassName() {
      return contextNamespace.getLastComponent();
    }

    String getFullName() {
      return contextNamespace.getFullText();
    }

    NamePath getClassContextNamespace() {
      return contextNamespace;
    }

    void addMember(DeferredWriter deferredWriter) {
      additionalMemberTexts.add(deferredWriter);
    }

    void writeAdditionalMembers(IndentWriter writer) throws IOException {
      for (DeferredWriter deferredWriter : additionalMemberTexts) {
        deferredWriter.writeContent(writer);
      }
    }

    protected abstract TypeData.Direction getTypeDirection();

    /**
     * Member scope is used to generate additional types that are used only from method.
     * These types will be named after this method.
     */
    protected abstract class MemberScope implements ResolveAndGenerateScope {
      private final String memberName;

      protected MemberScope(String memberName) {
        this.memberName = memberName;
      }

      private QualifiedTypeData resolveType(WipMetamodel.ObjectProperty objectProperty) {
        return resolveType(objectProperty, TypedObjectAccess.FOR_OBJECT_PROPERTY);
      }

      private QualifiedTypeData resolveType(WipMetamodel.Parameter parameter) {
        return resolveType(parameter, TypedObjectAccess.FOR_PARAMETER);
      }

      @Override
      public <T> QualifiedTypeData resolveType(T typedObject, TypedObjectAccess<T> access) {
        return generator.resolveType(typedObject, access, this);
      }

      protected String getMemberName() {
        return memberName;
      }

      public abstract BoxableType generateEnum(String description, List<String> enumConstants);
      public abstract BoxableType generateNestedObject(String description,
          List<WipMetamodel.ObjectProperty> propertyList) throws IOException;

      @Override
      public String getDomainName() {
        return domain.domain();
      }

      @Override
      public TypeData.Direction getTypeDirection() {
        return ClassScope.this.getTypeDirection();
      }
    }
  }

  class InputClassScope extends ClassScope {
    InputClassScope(NamePath namePath) {
      super(namePath);
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
      return new InputClassScope.InputMemberScope(memberName);
    }

    class InputMemberScope extends MemberScope {
      InputMemberScope(String memberName) {
        super(memberName);
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

        return BoxableType.createReference(new NamePath(enumName, getClassContextNamespace()));
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
        generator.jsonProtocolParserClassNames.add(getFullName() + '.' + objectName);
        return BoxableType.createReference(new NamePath(objectName, getClassContextNamespace()));
      }
    }
  }

  class OutputClassScope extends ClassScope {
    OutputClassScope(NamePath classNamePath) {
      super(classNamePath);
    }

    <P> void generateCommandParamsBody(IndentWriter writer, List<P> parameters,
                                       PropertyLikeAccess<P> access) throws IOException {

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
      return new OutputClassScope.OutputMemberScope(memberName);
    }

    class OutputMemberScope extends MemberScope {
      protected OutputMemberScope(String memberName) {
        super(memberName);
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
}
