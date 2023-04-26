package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharLiteral extends AbstractExpression {
  private char value;

  public CharLiteral(int line, int column, char value) {
    super(line, column);
    this.value = value;
    setType(new CharType(getLine(), getColumn()));
  }

  public char getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "CharLiteral{" + "value=" + value + '}';
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
