package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Return extends Statement {
  private Expression returnValue;

  public Return(Expression returnValue) {
    this.returnValue = returnValue;
  }

  public Expression getReturnValue() {
    return returnValue;
  }

  public void setReturnValue(Expression returnValue) {
    this.returnValue = returnValue;
  }
}
