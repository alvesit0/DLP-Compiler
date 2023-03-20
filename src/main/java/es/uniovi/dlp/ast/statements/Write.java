package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Write implements Statement {

  private Expression expression;

  public Write(Expression expression) {
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
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
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
