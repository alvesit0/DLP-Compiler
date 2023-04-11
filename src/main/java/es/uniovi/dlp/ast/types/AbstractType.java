package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {

  public AbstractType(int line, int column) {
    super(line, column);
  }

  @Override
  public Type arithmetic(Type type) {
    return null;
  }

  @Override
  public Type cast(Type type) {
    return null;
  }

  @Override
  public Type negative() {
    return null;
  }
}
