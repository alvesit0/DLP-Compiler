package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharType extends AbstractType {

  private static final CharType instance = new CharType(0, 0);

  public static Type getInstance() {
    return instance;
  }

  public CharType(int line, int column) {
    super(line, column);
  }

  @Override
  public String toString() {
    return "char";
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
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
