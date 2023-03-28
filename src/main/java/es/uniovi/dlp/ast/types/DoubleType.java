package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleType extends AbstractType {

  private static final DoubleType instance = new DoubleType(0,0);

  public static Type getInstance() {
    return instance;
  }

  public DoubleType(int line, int column) {
    super(line, column);
  }

  @Override
  public String toString() {
    return "double";
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
