package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class BooleanOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public BooleanOperation(
      int line, int column, String op, Expression leftExpression, Expression rightExpression) {
    super(line, column);
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

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
