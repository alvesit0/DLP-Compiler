package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.expressions.Expression;
import java.util.List;

public class Read extends Statement {

  private List<Expression> expressions;

  public Read(List<Expression> expressions) {
    this.expressions = expressions;
    // Expressions no puede estar vacio
  }

  public List<Expression> getExpressions() {
    return expressions;
  }
}
