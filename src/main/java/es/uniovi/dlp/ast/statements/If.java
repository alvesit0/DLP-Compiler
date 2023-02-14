package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

import java.util.List;

public class If extends Statement {

    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public If(Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        this.condition = condition;
        // Condition no puede ser nulo
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}
