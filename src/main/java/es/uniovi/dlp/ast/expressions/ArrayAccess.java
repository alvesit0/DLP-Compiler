package es.uniovi.dlp.ast.expressions;

import java.util.List;

public class ArrayAccess extends AbstractExpression {
  private Expression array;
  private List<Expression> params;

  public ArrayAccess(int line, int column, Expression array, List<Expression> params) {
    super(line, column);
    this.array = array;
    this.params = params;
  }

  public Expression getArray() {
    return array;
  }

  public List<Expression> getParams() {
    return params;
  }
}
