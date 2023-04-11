package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Struct extends AbstractType {

  private List<StructField> fields;

  public Struct(int line, int column, List<StructField> fields) {
    super(line, column);
    this.fields = fields;
  }

  public List<StructField> getFields() {
    return fields;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public Type negative() {
    return super.negative();
  }

  @Override
  public Type cast(Type from) {
    return super.cast(from);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public String toString() {
    return "struct";
  }
}
