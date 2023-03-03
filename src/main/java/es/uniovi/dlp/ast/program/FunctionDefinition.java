package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

  private String name;
  private List<VarDefinition> params;
  private List<Statement> statements;

  public FunctionDefinition(
      int line,
      int column,
      Type type,
      String name,
      List<VarDefinition> params,
      List<Statement> statements) {
    super(line, column, type);
    this.name = name;
    this.params = params;
    this.statements = statements;
  }

  public String getName() {
    return name;
  }

  public List<Statement> getStatements() {
    return statements;
  }

  public List<VarDefinition> getParams() {
    return params;
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
        + "\nParams: "
        + getParams()
        + "\nName: "
        + getName()
        + "\n\n";
  }
}
