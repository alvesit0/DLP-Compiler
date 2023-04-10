package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;
import java.util.*;

public class SymbolTable {
  private int scope = 0;

  // Por cada scope, encontramos un Map de definiciones diferentes
  private List<Map<String, Definition>> table;

  public SymbolTable() {
    this.table = new ArrayList<>();
    this.table.add(new HashMap<String, Definition>());
  }

  // Ejecutado al entrar a un ámbito, se incrementa el scope
  public void set() {
    this.scope++;
    this.table.add(new HashMap<String, Definition>());
  }

  // Ejecutado al salir de un ámbito
  public void reset() {
    this.scope--;
    this.table.remove(table.size() - 1);
  }

  public boolean insert(Definition definition) {
    definition.setScope(scope);
    if (findInCurrentScope(definition.getName()) != null) return false;

    table.get(scope).put(definition.getName(), definition);

    return true;
  }

  public Definition find(String id) {
    int currentScope = scope;
    while (currentScope >= 0) {
      if (table.get(currentScope).containsKey(id))
        return table.get(currentScope).get(id);
      currentScope--;
    }
    return null;
  }

  public Definition findInCurrentScope(String id) {
    return table.get(scope).get(id);
  }
}
