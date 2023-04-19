package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

  private int scope;
  private Type type;
  private String name;

  private int offset;

  public AbstractDefinition(int line, int column, String name, Type type) {
    super(line, column);
    this.type = type;
    this.name = name;
  }

  public Type getType() {
    return type;
  }

  @Override
  public int getScope() {
    return scope;
  }

  @Override
  public void setScope(int scope) {
    this.scope = scope;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getOffset() {
    return offset;
  }
}
