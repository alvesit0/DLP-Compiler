package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class ArrayAccess extends AbstractExpression {
  private Expression array;
  private List<Expression> indexes;

  public ArrayAccess(int line, int column, Expression array, List<Expression> indexes) {
    super(line, column);
    this.array = array;
    this.indexes = indexes;
  }

  public Expression getArray() {
    return array;
  }

  public List<Expression> getIndexes() {
    return indexes;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
