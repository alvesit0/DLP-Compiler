package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.program.Definition;

public class Variable extends AbstractExpression {
  private String name;
  private Definition definition;

  public Variable(int line, int column, String name, Definition definition) {
    super(line, column);
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
