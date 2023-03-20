package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  @Override
  public Type visit(Variable variable, Type param) {
    return null;
  }

  @Override
  public Type visit(DoubleType doubleType, Type param) {
    return null;
  }

  @Override
  public Type visit(StructField structField, Type param) {
    return null;
  }
}
