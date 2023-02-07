package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.AbstractExpression;

import java.util.List;

public class While extends Statement {
    private AbstractExpression condition;
    private List<Statement> body;

    public While(AbstractExpression condition, List<Statement> body) {
        this.condition = condition;
        // Condition no puede ser nulo
        this.body = body;
    }

    public AbstractExpression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }
}
