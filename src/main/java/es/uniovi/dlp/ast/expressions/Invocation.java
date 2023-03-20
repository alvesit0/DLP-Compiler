package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.statements.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  private List<Expression> arguments;
  private Variable variable;

  public Invocation(int line, int column, Variable variable, List<Expression> arguments) {
    super(line, column);
    this.arguments = arguments;
    this.variable = variable;
  }

  public List<Expression> getArguments() {
    return arguments;
  }

  public Variable getVariable() {
    return variable;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
