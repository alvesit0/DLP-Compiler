package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructAccess extends AbstractExpression {
  private Expression struct;
  private String name;

  public StructAccess(int line, int column, Expression struct, String name) {
    super(line, column);
    this.struct = struct;
    this.name = name;
  }

  public Expression getStruct() {
    return struct;
  }

  public String getName() {
    return name;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
