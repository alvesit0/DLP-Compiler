package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.AbstractExpression;

import java.util.List;

public class Write extends Statement {

    private List<AbstractExpression> abstractExpressions;

    public Write(List<AbstractExpression> abstractExpressions) {
        this.abstractExpressions = abstractExpressions;
        // Expressions no puede estar vacio
    }

    public List<AbstractExpression> getExpressions() {
        return abstractExpressions;
    }
}
