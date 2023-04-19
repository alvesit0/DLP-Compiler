package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
  Type arithmetic(Type type);
  Type negative();
  Type booleanNot();
  Type indexing(Type indexType);
  Type dot(String field);
  Type cast(Type from);
  Type assign(Type type);
  Type subtype(Type type);
  Type comparison(Type type);
  Type logical(Type type);
  Type asParam(Type type);
  Type isBoolean();
  boolean isIndexable();
  boolean isStruct();
}
