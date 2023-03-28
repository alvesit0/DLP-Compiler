package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {
  private double value;

  public DoubleLiteral(int line, int column, Double value) {
    super(line, column);
    this.value = value;
    setType(DoubleType.getInstance());
  }

  public double getValue() {
    return value;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
