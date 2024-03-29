package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.FuncType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

  private List<Statement> statements;
  private List<VarDefinition> varDefinitions;

  public FunctionDefinition(
      int line,
      int column,
      FuncType funcType,
      String name,
      List<Statement> statements,
      List<VarDefinition> varDefinitions) {
    super(line, column, name, funcType);
    this.statements = statements;
    this.varDefinitions = varDefinitions;
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

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
