package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.AbstractExpression;

import java.util.List;

public class Read extends Statement {

    private List<AbstractExpression> abstractExpressions;

    public Read(List<AbstractExpression> abstractExpressions) {
        this.abstractExpressions = abstractExpressions;
        // Expressions no puede estar vacio
    }

    public List<AbstractExpression> getExpressions() {
        return abstractExpressions;
    }
}
