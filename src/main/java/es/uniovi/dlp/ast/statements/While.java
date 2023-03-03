package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class While implements Statement {
  private Expression condition;
  private List<Statement> body;

  public While(Expression condition, List<Statement> body) {
    this.condition = condition;
    // Condition no puede ser nulo
    this.body = body;
  }

  public Expression getCondition() {
    return condition;
  }

  public List<Statement> getBody() {
    return body;
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
  public String toString() {
    return "*** WHILE STATEMENT ***" + "\nCondition: " + condition + "\nBody: \n" + body + "}\n\n";
  }
}
