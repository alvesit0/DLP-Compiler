package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class Write implements Statement {

  private Expression expression;

  public Write(Expression expression) {
    this.expression = expression;
  }

  public Expression getExpressions() {
    return expression;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }
}
