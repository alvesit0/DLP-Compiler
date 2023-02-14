package es.uniovi.dlp.ast.expressions;

public class DoubleLiteral extends Expression {
  private double value;

  public DoubleLiteral(Double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }
}
