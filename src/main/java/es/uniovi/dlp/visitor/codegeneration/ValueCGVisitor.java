package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
  private AddressCGVisitor addressVisitor;
  private CodeGenerator cg;

  public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressVisitor) {
    this.cg = cg;
    this.addressVisitor = addressVisitor;
  }

  @Override
  public Type visit(Variable v, Type param) {
    v.accept(addressVisitor, param);
    cg.write("loadi");
    return null;
  }
}
