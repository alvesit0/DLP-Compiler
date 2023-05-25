package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructField implements ASTNode {

  private int line;
  private int column;
  private String name;
  private Type type;
  private int offset = 0;

  public StructField(int line, int column, String name, Type type) {
    this.line = line;
    this.column = column;
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  @Override
  public int getLine() {
    return this.line;
  }

  @Override
  public int getColumn() {
    return this.column;
  }

  public Type getType() {
    return type;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  @Override
  public String toString() {
    return "(" + getName() + " x " + getType() + ")";
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
