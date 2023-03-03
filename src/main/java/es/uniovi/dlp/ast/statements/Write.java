package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class Write implements Statement {

  private List<Expression> expressions;

  public Write(List<Expression> expressions) {
    this.expressions = expressions;
  }

  public List<Expression> getExpressions() {
    return expressions;
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
