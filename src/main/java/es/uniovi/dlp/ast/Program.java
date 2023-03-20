package es.uniovi.dlp.ast;

import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Program implements ASTNode {

  private List<Definition> definitionList;

  private int line;
  private int column;

  public Program(int line, int column, List<Definition> definitionList) {
    this.line = line;
    this.column = column;
    this.definitionList = definitionList;
  }

  public List<Definition> getDefinitionList() {
    return definitionList;
  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getColumn() {
    return column;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public String toString() {
    return "Line: " + line + "\nColumn: " + column;
  }

  public List<Definition> getDefinitions() {
    return definitionList;
  }
}
