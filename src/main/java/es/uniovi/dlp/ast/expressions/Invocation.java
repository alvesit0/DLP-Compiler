package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  private List<Expression> arguments;
  private String name;

  public Invocation(int line, int column, String name, List<Expression> arguments) {
    super(line, column);
    this.arguments = arguments;
  }

  public List<Expression> getArguments() {
    return arguments;
  }

  public String getName() {
    return name;
  }
}
