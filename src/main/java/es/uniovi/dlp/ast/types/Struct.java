package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.statements.Statement;

import java.util.List;

public class Struct implements ASTNode {

    private List<Statement> fields;

    public Struct(List<Statement> fields) {
        this.fields = fields;
    }

    public List<Statement> getFields() {
        return fields;
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
