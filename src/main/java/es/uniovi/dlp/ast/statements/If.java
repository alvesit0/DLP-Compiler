package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class If implements Statement {

  private Expression condition;
  private List<Statement> ifBody;
  private List<Statement> elseBody;

  public If(Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }

  public Expression getCondition() {
    return condition;
  }

  public List<Statement> getIfBody() {
    return ifBody;
  }

  public List<Statement> getElseBody() {
    return elseBody;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public String toString() {
    return "*** IF STATEMENT ***"
        + "\nCondition: "
        + condition
        + "\nIf Body: \n"
        + ifBody
        + "\nElse Body: \n"
        + elseBody
        + "}\n\n";
  }
}
