package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;

public class VarDefinition extends AbstractDefinition implements Statement {

  private String name;

  public VarDefinition(int line, int column, Type type, String name) {
    super(line, column, type);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "*** VARIABLE DEFINITION ***"
        + "\nLine: "
        + getLine()
        + "\nColumn: "
        + getColumn()
        + "\nName: "
        + getName()
        + "\nType: "
        + getType()
        + "\n\n";
  }
}
