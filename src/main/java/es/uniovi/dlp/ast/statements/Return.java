package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Return implements Statement {
  private Expression returnValue;

  public Return(Expression returnValue) {
    this.returnValue = returnValue;
  }

  public Expression getReturnValue() {
    return returnValue;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
