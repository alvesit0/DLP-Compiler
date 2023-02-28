package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;

import java.util.List;

public class Program extends AbstractASTNode {

  private List<Definition> definitionList;
  public Program(int line, int column, List<Definition> definitionList) {
    super(line, column);
    this.definitionList = definitionList;
  }
}
