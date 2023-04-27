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

  public Type getArrayType() {
    Type result = this.type;
    while(true) {
      if (result instanceof Array)
        result = ((Array) result).getType();
      else break;
    }
    return result;
  }

  @Override
  public String getSuffix() {
    return getArrayType().getSuffix();
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
  public Type indexing(Type type) {
    if (type instanceof ErrorType) return type;
    if (type instanceof IntType) return this.getType();
    return super.indexing(type);
  }

  @Override
  public Type assign(Type type) {
    if (type instanceof IntType) return new IntType(getLine(), getColumn());
    if (type instanceof DoubleType) return new DoubleType(getLine(), getColumn());
    if (type instanceof CharType) return new CharType(getLine(), getColumn());
    return super.assign(type);
  }

  @Override
  public boolean isIndexable() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    return size * type.getNumberOfBytes();
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
