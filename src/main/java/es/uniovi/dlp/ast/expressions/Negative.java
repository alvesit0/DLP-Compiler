package es.uniovi.dlp.ast.expressions;

public class Negative extends AbstractExpression {
  private Expression expression;

  public Negative(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
  }
}
