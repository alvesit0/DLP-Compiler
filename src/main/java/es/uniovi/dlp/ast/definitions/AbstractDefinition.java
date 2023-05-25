package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.types.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

  private int scope;
  private Type type;
  private String name;
  private int offset = 0;

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
  public int getOffset() {
    return offset;
  }

  @Override
  public void setOffset(int offset) {
    this.offset = offset;
  }

  @Override
  public String getName() {
    return name;
  }
}
