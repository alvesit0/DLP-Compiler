package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class Write extends Statement {

  private List<Expression> expressions;

  public Write(List<Expression> expressions) {
    this.expressions = expressions;
    // Expressions no puede estar vacio
  }

  public List<Expression> getExpressions() {
    return expressions;
  }
}
