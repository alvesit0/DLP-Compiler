package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.FuncType;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

  private String name;
  private List<Statement> statements;
  private List<VarDefinition> varDefinitions;

  public FunctionDefinition(
      int line,
      int column,
      FuncType funcType,
      String name,
      List<Statement> statements,
      List<VarDefinition> varDefinitions) {
    super(line, column, funcType);
    this.name = name;
    this.statements = statements;
    this.varDefinitions = varDefinitions;
  }

  public String getName() {
    return name;
  }

  public List<Statement> getStatements() {
    return statements;
  }

  public List<VarDefinition> getVarDefinitions() {
    return varDefinitions;
  }

  @Override
  public String toString() {
    return "*** FUNCTION DEFINITION ***"
        + "\nLine: "
        + getLine()
        + "\nColumn: "
        + getColumn()
        + "\nType: "
        + getType()
        + "\nName: "
        + getName()
        + "\n\n";
  }
}
