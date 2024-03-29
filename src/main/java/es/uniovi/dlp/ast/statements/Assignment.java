package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

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

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Expression getRightExpression() {
    return rightExpression;
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
