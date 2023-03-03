package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.ASTNode;
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
  public String toString() {
    return "Line: " + line + "\nColumn: " + column;
  }
}
