package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Array extends AbstractType {

  private int size;
  private Type type;

  public Array(int line, int column, int size, Type type) {
    super(line, column);
    this.size = size;
    this.type = type;
  }

  public int getSize() {
    return size;
  }

  public Type getType() {
    return type;
  }

  @Override
  public String toString() {
    return "array";
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
}
