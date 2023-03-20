package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

  private Type type;
  private boolean lValue;

  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  public Type getType() {
    return type;
  }

  @Override
  public boolean getLValue() {
    return this.lValue;
  }

  @Override
  public void setLValue(boolean lValue) {
    this.lValue = lValue;
  }

  public void setType(Type type) {
    this.type = type;
  }
}
