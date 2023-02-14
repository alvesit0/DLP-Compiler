package es.uniovi.dlp.ast.expressions;

public class CharLiteral extends Expression {
  private char value;

  public CharLiteral(char value) {
    this.value = value;
  }

  public char getValue() {
    return value;
  }
}
