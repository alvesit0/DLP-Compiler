package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class Invocation extends Expression {
    private List<Expression> arguments;

    public Invocation(List<Expression> arguments) {
        this.arguments = arguments;
    }

    public List<Expression> getArguments() {
        return arguments;
    }
}
