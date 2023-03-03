package es.uniovi.dlp.ast.types;

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
  public String toString() {
    return "struct";
  }
}
