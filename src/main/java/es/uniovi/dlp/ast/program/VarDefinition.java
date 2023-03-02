package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractDefinition {

  private String name;

  public VarDefinition(int line, int column, Type type, String name) {
    super(line, column, type);
    this.name = name;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public Type getType() {
    return null;
  }
}
