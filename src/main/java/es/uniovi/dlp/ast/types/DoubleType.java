package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleType extends AbstractType {

  public DoubleType(int line, int column) {
    super(line, column);
  }

  @Override
  public String toString() {
    return "double";
  }

  @Override
  public String getSuffix() {
    return "f";
  }

  @Override
  public String convert(Type type) {
    if (type instanceof IntType) return "f2i";
    if (type instanceof CharType) return "f2i\n\ti2b";
    if (type instanceof DoubleType) return "";
    return " ERROR: NOT SUPPORTED ";
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof CharType || type instanceof IntType || type instanceof DoubleType) {
      return this;
    }
    return super.arithmetic(type);
  }

  @Override
  public Type asParam(Type type) {
    if (type instanceof CharType || type instanceof IntType || type instanceof DoubleType) {
      return this;
    }
    return super.asParam(type);
  }

  @Override
  public int getNumberOfBytes() {
    return 4;
  }

  @Override
  public Type assign(Type type) {
    if (type instanceof DoubleType) {
      return this;
    }
    if (type instanceof IntType) {
      return new IntType(getLine(), getColumn());
    }
    if (type instanceof CharType) {
      return new CharType(getLine(), getColumn());
    }
    if (type instanceof ErrorType) {
      return type;
    }
    return super.assign(type);
  }

  @Override
  public Type negative() {
    return this;
  }

  @Override
  public Type cast(Type from) {
    if (from instanceof IntType) return from;
    else if (from instanceof CharType) return from;
    else if (from instanceof DoubleType) return from;
    if (from instanceof ErrorType) return from;
    else return super.cast(from);
  }

  @Override
  public Type comparison(Type type) {
    if (this.getClass().equals(type.getClass())
        || type instanceof IntType
        || type instanceof CharType) return new IntType(getLine(), getColumn());
    if (type instanceof ErrorType) return type;
    return super.comparison(type);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
