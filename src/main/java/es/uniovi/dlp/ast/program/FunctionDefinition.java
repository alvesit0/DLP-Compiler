package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

  private String name;
  private VarDefinition varDefinition;
  private List<Statement> statements;

  public FunctionDefinition(int line, int column, Type type, String name, VarDefinition varDefinition, List<Statement> statements) {
    super(line, column, type);
    this.name = name;
    this.varDefinition = varDefinition;
    this.statements = statements;
  }

  public String getName() {
    return name;
  }

  public VarDefinition getVarDefinition() {
    return varDefinition;
  }

  public List<Statement> getStatements() {
    return statements;
  }
}
