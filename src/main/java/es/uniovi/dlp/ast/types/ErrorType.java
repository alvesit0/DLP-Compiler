package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ErrorType extends AbstractType {

  private static final ErrorType instance = new ErrorType(0, 0);

  public static Type getInstance() {
    return instance;
  }

  public ErrorType(int line, int column) {
    super(line, column);
  }

  @Override
  public Type assign(Type type) {
    return this;
  }

  @Override
  public Type isBoolean() {
    return this;
  }

  @Override
  public String toString() {
    return "error";
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
