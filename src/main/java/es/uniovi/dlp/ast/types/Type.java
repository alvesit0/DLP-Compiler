package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
    Type arithmetic(Type type);
    // Type logical(Type type);
    // Type indexing(Type indexType);
    // Type dot(String field);
    // Type cast(Type from);
    // Type comparison(Type leftType);
    // boolean promotableTo(Type to);
    // boolean isIndexable();




}
