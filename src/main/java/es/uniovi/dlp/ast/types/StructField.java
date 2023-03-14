package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.AbstractDefinition;

public class StructField extends AbstractDefinition {

  private String name;

  public StructField(int line, int column, String name, Type type) {
    super(line, column, type);
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
