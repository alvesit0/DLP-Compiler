package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;

public abstract class Expression implements ASTNode {

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }
}
