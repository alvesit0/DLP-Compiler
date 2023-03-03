package es.uniovi.dlp.ast.expressions;

public class BooleanNot extends AbstractExpression {
  private Expression expression;

  public BooleanNot(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
  }
}
