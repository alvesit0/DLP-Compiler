package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

import java.util.List;

public class Cast extends AbstractExpression {
    private AbstractExpression leftAbstractExpression;
    private Type rightExpression;
    private List<AbstractExpression> arguments;

    public Cast(AbstractExpression leftAbstractExpression, Type rightExpression, List<AbstractExpression> arguments) {
        this.leftAbstractExpression = leftAbstractExpression;
        this.rightExpression = rightExpression;
        this.arguments = arguments;
    }

    public AbstractExpression getLeftExpression() {
        return leftAbstractExpression;
    }

    public Type getRightExpression() {
        return rightExpression;
    }

    public List<AbstractExpression> getArguments() {
        return arguments;
    }
}
