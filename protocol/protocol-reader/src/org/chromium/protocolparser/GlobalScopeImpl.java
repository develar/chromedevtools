package org.chromium.protocolparser;

import gnu.trove.THashMap;
import gnu.trove.THashSet;
import gnu.trove.TObjectProcedure;

import java.util.*;

public class GlobalScopeImpl implements GlobalScope {
  private final State state;

  public GlobalScopeImpl(Collection<TypeHandler<?>> typeHandlers, Collection<GeneratedCodeMap> basePackages) {
    state = new State(typeHandlers, basePackages);
  }

  public GlobalScopeImpl(GlobalScopeImpl globalScopeImpl) {
    state = globalScopeImpl.state;
  }

  @Override
  public String getTypeImplReference(TypeHandler<?> typeHandler) {
    return state.getTypeImplReference(typeHandler);
  }

  @Override
  public String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler) {
    return state.requireFactoryGenerationAndGetName(typeHandler);
  }

  @Override
  public String getTypeImplShortName(TypeHandler<?> typeHandler) {
    return state.getTypeImplShortName(typeHandler);
  }

  @Override
  public FileScope newFileScope(StringBuilder output) {
    return new FileScopeImpl(this, output);
  }

  @Override
  public void forEachTypeFactory(TObjectProcedure<TypeHandler> procedure) {
    state.typesWithFactories.forEach(procedure);
  }

  private static class State {
    private final Map<TypeHandler<?>, String> typeToName;
    private final Collection<GeneratedCodeMap> basePackages;
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final THashSet<TypeHandler> typesWithFactories = new THashSet<TypeHandler>();

    State(Collection<TypeHandler<?>> typeHandlers, Collection<GeneratedCodeMap> basePackages) {
      this.basePackages = basePackages;
      typeToName = buildLocalTypeNameMap(typeHandlers);
    }

    String getTypeImplReference(TypeHandler<?> typeHandler) {
      String localName = typeToName.get(typeHandler);
      if (localName != null) {
        return localName;
      }

      for (GeneratedCodeMap base : basePackages) {
        String result = base.getTypeImplementationReference(typeHandler.getTypeClass());
        if (result != null) {
          return result;
        }
      }

      throw new RuntimeException();
    }

    public String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler) {
      String name = getTypeImplShortName(typeHandler);
      typesWithFactories.add(typeHandler);
      return name;
    }

    String getTypeImplShortName(TypeHandler<?> typeHandler) {
      String result = typeToName.get(typeHandler);
      if (result == null) {
        throw new RuntimeException();
      }
      return result;
    }

    private static Map<TypeHandler<?>, String> buildLocalTypeNameMap(
        Collection<TypeHandler<?>> typeHandlers) {
      List<TypeHandler<?>> list = new ArrayList<TypeHandler<?>>(typeHandlers);

      // Sort to produce consistent GeneratedCodeMap later.
      Collections.sort(list, new Comparator<TypeHandler<?>>() {
        @Override
        public int compare(TypeHandler<?> o1, TypeHandler<?> o2) {
          return getName(o1).compareTo(getName(o2));
        }

        private String getName(TypeHandler<?> handler) {
          return handler.getTypeClass().getName();
        }
      });

      int uniqueCode = 0;
      Map<TypeHandler<?>, String> result = new THashMap<TypeHandler<?>, String>();
      for (TypeHandler<?> handler : list) {
        Object conflict = result.put(handler, Util.TYPE_NAME_PREFIX + Integer.toString(uniqueCode++));
        if (conflict != null) {
          throw new RuntimeException();
        }
      }
      return result;
    }
  }
}
