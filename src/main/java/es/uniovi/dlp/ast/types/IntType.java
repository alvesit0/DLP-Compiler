package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntType extends AbstractType {

  public IntType(int line, int column) {
    super(line, column);
  }

  @Override
  public String toString() {
    return "int";
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof CharType || type instanceof IntType) {
      return this;
    }
    if (type instanceof DoubleType) {
      return new DoubleType(getLine(), getColumn());
    }
    return super.arithmetic(type);
  }

  @Override
  public Type asParam(Type type) {
    if (type instanceof CharType || type instanceof IntType) {
      return this;
    }
    if (type instanceof DoubleType) {
      return new DoubleType(getLine(), getColumn());
    }
    return super.asParam(type);
  }

  @Override
  public Type assign(Type type) {
    if (type instanceof IntType) {
      return this;
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
    if (from instanceof CharType) return from;
    if (from instanceof DoubleType) return from;
    if (from instanceof ErrorType) return from;
    else return super.cast(from);
  }

  @Override // <, >, <=, >=
  public Type comparison(Type type) {
    if (this.getClass().equals(type.getClass())
            || type instanceof DoubleType
            || type instanceof CharType) return this;
    if (type instanceof ErrorType) return type;
    return super.comparison(type);
  }

  @Override // || y &&
  public Type logical(Type type) {
    if (this.getClass().equals(type.getClass())) return this;
    if (type instanceof ErrorType) return type;
    return super.logical(type);
  }

  @Override
  public Type booleanNot() {
    return this;
  }

  @Override
  public Type isBoolean() {
    return this;
  }
}
