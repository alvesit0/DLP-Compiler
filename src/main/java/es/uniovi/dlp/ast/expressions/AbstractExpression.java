package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.ast.types.Type;

public class AbstractExpression extends AbstractASTNode implements Expression {

  private Type type;
  private Definition definition;

  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Definition getDefinition() {
    return definition;
  }
}
