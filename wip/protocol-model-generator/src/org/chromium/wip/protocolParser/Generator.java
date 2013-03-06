// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

import static org.chromium.wip.schemaParser.WipMetamodel.*;

/**
 * Read metamodel and generates set of files with Java classes/interfaces for the protocol.
 */
class Generator {
  private static final String ROOT_PACKAGE = "org.chromium.wip.protocol";
  static final String OUTPUT_PACKAGE = ROOT_PACKAGE + ".output";
  static final String INPUT_PACKAGE = ROOT_PACKAGE + ".input";
  static final String COMMON_PACKAGE = ROOT_PACKAGE + ".common";
  private static final String PARSER_INTERFACE_LIST_CLASS_NAME = "GeneratedParserInterfaceList";
  static final String READER_INTERFACE_NAME = "GeneratedWipProtocolReader";

  final List<String> jsonProtocolParserClassNames = new ArrayList<String>();
  final List<ParserRootInterfaceItem> parserRootInterfaceItems = new ArrayList<ParserRootInterfaceItem>();
  final TypeMap typeMap = new TypeMap();

  private final FileSet fileSet;

  Generator(String outputDir) {
    fileSet = new FileSet(new File(outputDir));
  }

  void go(Root metamodel) throws IOException {
    initializeKnownTypes();

    Set<String> domainTodoList = new HashSet<String>(Arrays.asList(DOMAIN_WHITE_LIST));
    List<Domain> domainList = metamodel.domains();
    Map<String, DomainGenerator> domainGeneratorMap = new HashMap<String, DomainGenerator>();
    for (Domain domain : domainList) {
      if (!domainTodoList.remove(domain.domain())) {
        System.out.println("Domain skipped: " + domain.domain());
        continue;
      }

      DomainGenerator domainGenerator = new DomainGenerator(this, domain);
      domainGeneratorMap.put(domain.domain(), domainGenerator);
      domainGenerator.registerTypes();
    }

    typeMap.setDomainGeneratorMap(domainGeneratorMap);

    if (!domainTodoList.isEmpty()) {
      throw new RuntimeException("Domains expected but not found: " + domainTodoList);
    }

    for (DomainGenerator domainGenerator : domainGeneratorMap.values()) {
      domainGenerator.generateCommandsAndEvents();
    }

    typeMap.generateRequestedTypes();
    generateParserInterfaceList();
    generateParserRoot(parserRootInterfaceItems);
    fileSet.deleteOtherFiles();
  }

  QualifiedTypeData resolveType(final ItemDescriptor typedObject, final ResolveAndGenerateScope scope) {
    UnqualifiedTypeData unqualifiedType = switchByType(typedObject, new TypeVisitor<UnqualifiedTypeData>() {
        @Override
        public UnqualifiedTypeData visitRef(String refName) {
          return new UnqualifiedTypeData(resolveRefType(scope.getDomainName(), refName, scope.getTypeDirection()));
        }

        @Override
        public UnqualifiedTypeData visitBoolean() {
          return UnqualifiedTypeData.BOOLEAN;
        }

        @Override
        public UnqualifiedTypeData visitEnum(List<String> enumConstants) {
          BoxableType enumName = scope.generateEnum(getDescription(), enumConstants);
          return new UnqualifiedTypeData(enumName);
        }

        @Override
        public UnqualifiedTypeData visitString() {
          return UnqualifiedTypeData.STRING;
        }

        @Override
        public UnqualifiedTypeData visitInteger() {
          return UnqualifiedTypeData.LONG;
        }

        @Override
        public UnqualifiedTypeData visitNumber() {
          return UnqualifiedTypeData.NUMBER;
        }

        @Override
        public UnqualifiedTypeData visitArray(ArrayItemType items) {
          QualifiedTypeData itemQualifiedType =
            scope.resolveType(items);
          return new UnqualifiedTypeData(BoxableType.createList(itemQualifiedType.getJavaType()));
        }

        @Override
        public UnqualifiedTypeData visitObject(List<ObjectProperty> properties) {
          BoxableType nestedObjectName;
          try {
            nestedObjectName = scope.generateNestedObject(getDescription(), properties);
          }
          catch (IOException e) {
            throw new RuntimeException(e);
          }
          return new UnqualifiedTypeData(nestedObjectName, false);
        }

        @Override
        public UnqualifiedTypeData visitUnknown() {
          return UnqualifiedTypeData.ANY;
        }

        private String getDescription() {
          return typedObject.description();
        }
      });

    return unqualifiedType.getQualifiedType(typedObject instanceof ItemDescriptor.Named && ((ItemDescriptor.Named)typedObject).optional());
  }

  private static class UnqualifiedTypeData {
    private final BoxableType typeRef;
    private final boolean nullable;

    UnqualifiedTypeData(BoxableType typeRef) {
      this(typeRef, false);
    }

    UnqualifiedTypeData(BoxableType typeRef, boolean nullable) {
      this.typeRef = typeRef;
      this.nullable = nullable;
    }

    QualifiedTypeData getQualifiedType(boolean optional) {
      BoxableType ref;
      if (optional) {
        ref = typeRef.convertToPureReference();
      }
      else {
        ref = typeRef;
      }
      return new QualifiedTypeData(ref, optional, nullable);
    }

    static final UnqualifiedTypeData BOOLEAN = new UnqualifiedTypeData(BoxableType.BOOLEAN, false);
    static final UnqualifiedTypeData STRING = new UnqualifiedTypeData(BoxableType.STRING, false);
    static final UnqualifiedTypeData LONG = new UnqualifiedTypeData(BoxableType.LONG, false);
    static final UnqualifiedTypeData NUMBER = new UnqualifiedTypeData(BoxableType.NUMBER, false);
    static final UnqualifiedTypeData ANY = new UnqualifiedTypeData(BoxableType.OBJECT, true);
  }

  private void generateParserInterfaceList() throws IOException {
    JavaFileUpdater fileUpdater = startJavaFile(INPUT_PACKAGE, PARSER_INTERFACE_LIST_CLASS_NAME + ".java");

    // Write classes in stable order.
    Collections.sort(jsonProtocolParserClassNames);

    Writer writer = fileUpdater.getWriter();
    writer.write("public class " + PARSER_INTERFACE_LIST_CLASS_NAME + " {\n");
    writer.write("\tpublic static final Class<?>[] LIST = {\n");
    for (String name : jsonProtocolParserClassNames) {
      writer.write("\t\t" + name + ".class" + ",\n");
    }
    writer.write("\t};\n");
    writer.write("}\n");

    fileUpdater.update();
  }

  private void generateParserRoot(List<ParserRootInterfaceItem> parserRootInterfaceItems) throws IOException {
    JavaFileUpdater fileUpdater = startJavaFile(INPUT_PACKAGE, READER_INTERFACE_NAME + ".java");
    // Write classes in stable order.
    Collections.sort(parserRootInterfaceItems);

    Writer writer = fileUpdater.getWriter();
    writer.write("@org.chromium.protocolParser.JsonParserRoot\n");
    writer.write("public interface " + READER_INTERFACE_NAME + " {\n");
    for (ParserRootInterfaceItem item : parserRootInterfaceItems) {
      item.writeCode(writer);
    }
    writer.write("}\n");
    fileUpdater.update();
  }

  /**
   * Resolve absolute (DOMAIN.TYPE) or relative (TYPE) typename.
   */
  private BoxableType resolveRefType(String scopeDomainName, String refName,
                                     TypeData.Direction direction) {
    int pos = refName.indexOf('.');
    String domainName;
    String shortName;
    if (pos == -1) {
      domainName = scopeDomainName;
      shortName = refName;
    }
    else {
      domainName = refName.substring(0, pos);
      shortName = refName.substring(pos + 1);
    }
    return typeMap.resolve(domainName, shortName, direction);
  }

  static String generateMethodNameSubstitute(String originalName, IndentWriter output) {
    if (!BAD_METHOD_NAMES.contains(originalName)) {
      return originalName;
    }
    output.append("\t  @org.chromium.protocolParser.JsonField(jsonLiteralName=\"" +
                  originalName + "\")\n");
    return "get" + Character.toUpperCase(originalName.charAt(0)) + originalName.substring(1);
  }

  static String capitalizeFirstChar(String str) {
    if (Character.isLowerCase(str.charAt(0))) {
      str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
    return str;
  }

  JavaFileUpdater startJavaFile(ClassNameScheme nameScheme, Domain domain, String baseName) throws IOException {
    String packageName = nameScheme.getPackageNameVirtual(domain.domain());
    String fileName = nameScheme.getShortName(baseName) + ".java";
    return startJavaFile(packageName, fileName);
  }

  private JavaFileUpdater startJavaFile(String packageName, String filename) throws IOException {
    String filePath = packageName.replace('.', '/');

    JavaFileUpdater fileUpdater = fileSet.createFileUpdater(filePath + "/" + filename);
    Writer writer = fileUpdater.getWriter();
    writer.write("// Generated source.\n");
    writer.write("// Generator: " + getClass().getCanonicalName() + "\n");
    writer.write("package " + packageName + ";\n\n");
    return fileUpdater;
  }

  static <R> R switchByType(ItemDescriptor typedObject, TypeVisitor<R> visitor) {
    String refName = typedObject instanceof ItemDescriptor.Referenceable ? ((ItemDescriptor.Referenceable)typedObject).ref() : null;
    if (refName != null) {
      return visitor.visitRef(refName);
    }
    String typeName = typedObject.type();
    if (WipMetamodel.BOOLEAN_TYPE.equals(typeName)) {
      return visitor.visitBoolean();
    }
    else if (WipMetamodel.STRING_TYPE.equals(typeName)) {
      if (typedObject.getEnum() != null) {
        return visitor.visitEnum(typedObject.getEnum());
      }
      return visitor.visitString();
    }
    else if (WipMetamodel.INTEGER_TYPE.equals(typeName)) {
      return visitor.visitInteger();
    }
    else if (WipMetamodel.NUMBER_TYPE.equals(typeName)) {
      return visitor.visitNumber();
    }
    else if (WipMetamodel.ARRAY_TYPE.equals(typeName)) {
      return visitor.visitArray(typedObject.items());
    }
    else if (WipMetamodel.OBJECT_TYPE.equals(typeName)) {
      return visitor.visitObject(access.getProperties(typedObject));
    }
    else if (WipMetamodel.ANY_TYPE.equals(typeName)) {
      return visitor.visitUnknown();
    }
    else if (WipMetamodel.UNKNOWN_TYPE.equals(typeName)) {
      return visitor.visitUnknown();
    }
    throw new RuntimeException("Unrecognized type " + typeName);
  }

  /**
   * Records a list of files in the root directory and deletes files that were not re-generated.
   */
  private static class FileSet {
    private final File rootDir;
    private final Set<File> unusedFiles;

    FileSet(File rootDir) {
      this.rootDir = rootDir;
      List<File> files = new ArrayList<File>();
      collectFilesRecursive(rootDir, files);
      unusedFiles = new HashSet<File>(files);
    }

    JavaFileUpdater createFileUpdater(String filePath) {
      File file = new File(rootDir, filePath);
      unusedFiles.remove(file);
      return new JavaFileUpdater(file);
    }

    void deleteOtherFiles() {
      for (File file : unusedFiles) {
        //noinspection ResultOfMethodCallIgnored
        file.delete();
      }
    }

    private static void collectFilesRecursive(File file, Collection<File> list) {
      if (file.isFile()) {
        list.add(file);
      }
      else if (file.isDirectory()) {
        //noinspection ConstantConditions
        for (File inner : file.listFiles()) {
          collectFilesRecursive(inner, list);
        }
      }
    }
  }

  private static final String[] DOMAIN_WHITE_LIST = {
    "Debugger",
    "Runtime",
    "Page",
    "Network",
    "Console",
    "DOM",
  };

  private static void initializeKnownTypes() {
    // Code example:
    // typeMap.getTypeData("Page", "Cookie").getInput().setJavaTypeName("Object");
  }

  private static final Set<String> BAD_METHOD_NAMES = new HashSet<String>(Arrays.asList(
    "this"
  ));
}