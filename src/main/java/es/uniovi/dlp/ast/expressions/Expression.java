package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.types.Type;

public interface Expression extends ASTNode {
  Type getType();

  void setType(Type type);

  boolean getLValue();

  void setLValue(boolean lValue);
}
