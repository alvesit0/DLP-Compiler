package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AbstractDefinition extends AbstractASTNode implements Definition {

  private Type type;

  public AbstractDefinition(int line, int column, Type type) {
    super(line, column);
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null; // TODO
  }
}
