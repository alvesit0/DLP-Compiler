package es.uniovi.dlp.ast.expressions;

public class IntLiteral extends AbstractExpression {
    private int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
