package es.uniovi.dlp.ast.expressions;

public class DoubleLiteral extends AbstractExpression {
    private double value;

    public DoubleLiteral(Double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
