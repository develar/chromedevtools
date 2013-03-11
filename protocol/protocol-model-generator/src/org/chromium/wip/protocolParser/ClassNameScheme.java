package org.chromium.wip.protocolParser;

abstract class ClassNameScheme {
  private final String suffix;
  private final String rootPackage;

  private ClassNameScheme(String suffix, String rootPackage) {
    this.suffix = suffix;
    this.rootPackage = rootPackage;
  }

  NamePath getFullName(String domainName, String baseName) {
    return new NamePath(getShortName(baseName), new NamePath(getPackageNameVirtual(domainName)));
  }

  String getShortName(String baseName) {
    return Generator.capitalizeFirstChar(baseName) + suffix;
  }

  protected String getPackageNameVirtual(String domainName) {
    return getPackageName(rootPackage, domainName);
  }

  public static String getPackageName(String rootPackage, String domain) {
    if (domain.isEmpty()) {
      return rootPackage;
    }
    return rootPackage + '.' + domain.toLowerCase();
  }

  static class Input extends ClassNameScheme {
    Input(String suffix, String rootPackage) {
      super(suffix, rootPackage);
    }

    String getParseMethodName(String domain, String name) {
      return "parse" + Generator.capitalizeFirstChar(domain) + getShortName(name);
    }
  }

  static class Output extends ClassNameScheme {
    Output(String suffix, String rootPackage) {
      super(suffix, rootPackage);
    }
  }

  static class Common extends ClassNameScheme {
    Common(String suffix, String rootPackage) {
      super(suffix, rootPackage);
    }
  }
}