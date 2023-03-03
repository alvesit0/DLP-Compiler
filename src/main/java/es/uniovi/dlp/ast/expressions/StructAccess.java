package es.uniovi.dlp.ast.expressions;

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
}
