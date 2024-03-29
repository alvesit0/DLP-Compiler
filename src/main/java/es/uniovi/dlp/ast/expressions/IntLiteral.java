package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {
  private int value;

  public IntLiteral(int line, int column, int value) {
    super(line, column);
    this.value = value;
    setType(new IntType(getLine(), getColumn()));
  }

  public int getValue() {
    return value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
