package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class Invocation extends AbstractExpression {
    private List<AbstractExpression> arguments;

    public Invocation(List<AbstractExpression> arguments) {
        this.arguments = arguments;
    }

    public List<AbstractExpression> getArguments() {
        return arguments;
    }
}
