package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Definition extends ASTNode {
  Type getType();

  int getOffset();

  void setOffset(int offset);

  String getName();

  int getScope();

  void setScope(int scope);
}
