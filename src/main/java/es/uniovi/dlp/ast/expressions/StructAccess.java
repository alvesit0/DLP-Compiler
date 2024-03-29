package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructAccess extends AbstractExpression {
  private Expression struct;
  private String index;

  public StructAccess(int line, int column, Expression struct, String index) {
    super(line, column);
    this.struct = struct;
    this.index = index;
  }

  public Expression getStruct() {
    return struct;
  }

  public String getName() {
    return index;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
