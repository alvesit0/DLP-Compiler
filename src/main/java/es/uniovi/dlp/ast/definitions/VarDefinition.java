package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VarDefinition extends AbstractDefinition implements Statement {

  public VarDefinition(int line, int column, String name, Type type) {
    super(line, column, name, type);
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

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
