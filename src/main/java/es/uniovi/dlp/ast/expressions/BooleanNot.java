package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class BooleanNot extends AbstractExpression {
  private Expression expression;

  public BooleanNot(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
