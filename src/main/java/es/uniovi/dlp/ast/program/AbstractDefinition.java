package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

  private Type type;

  public AbstractDefinition(int line, int column, Type type) {
    super(line, column);
    this.type = type;
  }

  public Type getType() {
    return type;
  }
}
