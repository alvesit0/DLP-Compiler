package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ArrayAccess extends AbstractExpression {
  private Expression array;

  private Expression index;

  public ArrayAccess(int line, int column, Expression array, Expression index) {
    super(line, column);
    this.array = array;
    this.index = index;
  }

  public Expression getArray() {
    return array;
  }

  public Expression getIndex() {
    return index;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
