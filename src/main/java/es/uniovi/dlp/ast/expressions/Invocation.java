package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  private List<Expression> arguments;
  private Expression expression;

  public Invocation(int line, int column, Expression expression, List<Expression> arguments) {
    super(line, column);
    this.arguments = arguments;
    this.expression = expression;
  }

  public List<Expression> getArguments() {
    return arguments;
  }

  public Expression getExpression() {
    return expression;
  }
}
