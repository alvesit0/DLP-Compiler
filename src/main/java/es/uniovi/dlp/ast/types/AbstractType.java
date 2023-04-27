package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {

  public AbstractType(int line, int column) {
    super(line, column);
  }

  @Override
  public String getSuffix() {
    return " ERROR: NOT IMPLEMENTED ";
  }

  @Override
  public String convert(Type type) {
    return " ERROR: NOT SUPPORTED ";
  }

  @Override
  public String toInt() {
    return " ERROR: NOT SUPPORTED";
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

  @Override
  public Type booleanNot() {
    return null;
  }

  @Override
  public Type assign(Type type) {
    return null;
  }

  @Override
  public Type indexing(Type type) {
    return null;
  }

  @Override
  public Type subtype(Type type) {
    if (this.getClass().equals(type.getClass())) return this;
    return null;
  }

  @Override
  public Type asParam(Type type) {
    return null;
  }

  @Override
  public Type dot(String field) {
    return null;
  }

  @Override
  public Type comparison(Type type) {
    return null;
  }

  @Override
  public Type logical(Type type) {
    return null;
  }

  @Override
  public Type isBoolean() {
    return null;
  }

  @Override
  public boolean isIndexable() {
    return false;
  }

  @Override
  public boolean isStruct() {
    return false;
  }
}
