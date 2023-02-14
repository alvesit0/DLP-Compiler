package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class While extends Statement {
    private Expression condition;
    private List<Statement> body;

    public While(Expression condition, List<Statement> body) {
        this.condition = condition;
        // Condition no puede ser nulo
        this.body = body;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }
}
