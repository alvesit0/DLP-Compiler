package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class Invocation extends AbstractExpression {
  private List<Expression> arguments;

  public Invocation(int line, int column, List<Expression> arguments) {
    super(line, column);
    this.arguments = arguments;
  }

  public List<Expression> getArguments() {
    return arguments;
  }
}
