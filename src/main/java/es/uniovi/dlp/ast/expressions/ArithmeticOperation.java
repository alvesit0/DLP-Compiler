package es.uniovi.dlp.ast.expressions;

public class ArithmeticOperation extends AbstractExpression {
    private String op;
    private AbstractExpression leftExpression;
    private AbstractExpression rightExpression;

    public ArithmeticOperation(String op, AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.op = op;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public String getOp() {
        return op;
    }

    public AbstractExpression getLeftExpression() {
        return leftExpression;
    }

    public AbstractExpression getRightExpression() {
        return rightExpression;
    }
}
