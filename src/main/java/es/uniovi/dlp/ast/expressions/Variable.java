package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.program.Definition;

public class Variable extends AbstractExpression {
    private String name;
    private Definition definition;

    public Variable(String name, Definition definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public Definition getDefinition() {
        return definition;
    }
}
