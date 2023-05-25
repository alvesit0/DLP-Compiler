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

  public StructField getField(String name) {
    for (StructField structField : fields)
      if (structField.getName().equals(name)) return structField;
    return null;
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
  public Type dot(String field) {
    for (StructField s : fields) if (s.getName().equals(field)) return s.getType();
    return null;
  }

  @Override
  public boolean isStruct() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    int result = 0;
    for (StructField structField : fields) {
      result += structField.getType().getNumberOfBytes();
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder recordData = new StringBuilder();
    if (fields.size() > 0) {
      recordData.append(fields.get(0).toString());
      for (int i = 1; i < fields.size(); i++)
        recordData.append(" :: ").append(fields.get(i).toString());
    }
    return "record (" + recordData + ")";
  }
}
