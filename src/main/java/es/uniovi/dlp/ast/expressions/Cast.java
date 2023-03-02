package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public class Cast extends AbstractExpression {
  private Expression leftExpression;
  private Type rightExpression;

  public Cast(int line, int column, Expression leftExpression, Type rightExpression) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Type getRightExpression() {
    return rightExpression;
  }
}
