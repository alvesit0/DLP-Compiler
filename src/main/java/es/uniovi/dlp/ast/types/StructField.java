package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.AbstractDefinition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructField extends AbstractDefinition {

  private String name;

  public StructField(int line, int column, String name, Type type) {
    super(line, column, type);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
