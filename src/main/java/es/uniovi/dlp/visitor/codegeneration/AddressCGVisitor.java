package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

  private CodeGenerator cg;

  public AddressCGVisitor(CodeGenerator cg) {
    this.cg = cg;
  }

  @Override
  public Type visit(Variable v, Type param) {
    // cg.write("pusha\t" + v.getDefinition().getOffset());
    return null;
  }
}
