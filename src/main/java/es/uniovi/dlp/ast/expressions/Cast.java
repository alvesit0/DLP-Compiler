package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

public class Cast extends AbstractExpression {
  private Expression leftExpression;
  private Type type;

  public Cast(int line, int column, Expression leftExpression, Type type) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.type = type;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Type getType() {
    return type;
  }
}
