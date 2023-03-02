package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Assignment implements Statement {

  public Expression leftExpression;
  public Expression rightExpression;

  public Assignment(Expression leftExpression, Expression rightExpression) {

    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public String toString() {
    return "Assigment{"
        + "leftHandSide="
        + leftExpression.toString()
        + ", rightHandSide="
        + rightExpression.toString()
        + '}';
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }
}
