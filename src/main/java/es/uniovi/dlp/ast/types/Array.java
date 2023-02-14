package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public class Array implements ASTNode {

  private int size;
  private Type type;

  public Array(int size, Type type) {
    this.size = size;
    this.type = type;
  }

  public int getSize() {
    return size;
  }

  public Type getType() {
    return type;
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
