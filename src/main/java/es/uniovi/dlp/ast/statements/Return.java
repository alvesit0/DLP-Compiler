package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.AbstractExpression;

public class Return extends Statement {
    private AbstractExpression returnValue;

    public Return(AbstractExpression returnValue) {
        this.returnValue = returnValue;
    }

    public AbstractExpression getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(AbstractExpression returnValue) {
        this.returnValue = returnValue;
    }
}
