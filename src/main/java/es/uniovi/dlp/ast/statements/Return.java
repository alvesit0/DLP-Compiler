package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;

public class Return implements Statement {
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

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }
}
