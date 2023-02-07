package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;

public abstract class Type implements ASTNode {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
