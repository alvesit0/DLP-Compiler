package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.ASTNode;

public class Statement implements ASTNode {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
