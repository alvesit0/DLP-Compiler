package es.uniovi.dlp.ast.expressions;

public class ArithmeticOperation extends Expression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public ArithmeticOperation(String op, Expression leftExpression, Expression rightExpression) {
    this.op = op;
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  public String getOp() {
    return op;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Expression getRightExpression() {
    return rightExpression;
  }
}
