package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntType extends AbstractType {

  private static final IntType instance = new IntType(0, 0);

  public static Type getInstance() {
    return instance;
  }

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
      return DoubleType.getInstance();
    }
    return super.arithmetic(type);
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
    else return super.cast(from);
  }
}
