package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Cast extends AbstractExpression {
  private Expression leftExpression;

  public Cast(int line, int column, Expression leftExpression, Type type) {
    super(line, column);
    super.setType(type);
    this.leftExpression = leftExpression;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
