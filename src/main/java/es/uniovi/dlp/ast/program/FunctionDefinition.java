package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statement;

public class FunctionDefinition extends Definition {
  private String name;
  private VarDefinition varDefinitions;
  private Statement statements;

  public FunctionDefinition(String name, VarDefinition varDefinitions, Statement statements) {
    this.name = name;
    this.varDefinitions = varDefinitions;
    this.statements = statements;
  }

  public String getName() {
    return name;
  }

  public VarDefinition getVarDefinitions() {
    return varDefinitions;
  }

  public Statement getStatements() {
    return statements;
  }
}
