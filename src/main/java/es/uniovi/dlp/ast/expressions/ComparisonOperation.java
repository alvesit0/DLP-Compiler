package es.uniovi.dlp.ast.expressions;

public class ComparisonOperation extends AbstractExpression {
    private String op;
    private AbstractExpression leftAbstractExpression;
    private AbstractExpression rightAbstractExpression;

    public ComparisonOperation(String op, AbstractExpression leftAbstractExpression, AbstractExpression rightAbstractExpression) {
        this.op = op;
        this.leftAbstractExpression = leftAbstractExpression;
        this.rightAbstractExpression = rightAbstractExpression;
    }

    public String getOp() {
        return op;
    }

    public AbstractExpression getLeftExpression() {
        return leftAbstractExpression;
    }

    public AbstractExpression getRightExpression() {
        return rightAbstractExpression;
    }
}
