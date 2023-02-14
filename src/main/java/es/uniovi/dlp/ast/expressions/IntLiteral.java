package es.uniovi.dlp.ast.expressions;

public class IntLiteral extends Expression {
    private int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
