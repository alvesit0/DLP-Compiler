package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.Type;

import java.util.List;

public class Cast extends Expression {
    private Expression leftExpression;
    private Type rightExpression;
    private List<Expression> arguments;

    public Cast(Expression leftExpression, Type rightExpression, List<Expression> arguments) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.arguments = arguments;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public Type getRightExpression() {
        return rightExpression;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}
