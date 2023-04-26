package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
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
    VarDefinition varDefinition = (VarDefinition) v.getDefinition();
    // Si es variable global
    if (varDefinition.getOffset() == 0) cg.pusha(varDefinition.getOffset());
    // Si es local
    else {
      cg.pushBP();
      cg.pushValue(varDefinition.getType(), varDefinition.getOffset() + "");
      cg.add(varDefinition.getType());
    }
    return null;
  }
}
