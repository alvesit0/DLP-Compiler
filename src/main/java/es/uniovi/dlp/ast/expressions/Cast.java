package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

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
}
