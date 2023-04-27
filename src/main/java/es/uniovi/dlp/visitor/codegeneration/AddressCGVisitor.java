package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.StructAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Array;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Struct;
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
    if (varDefinition.getScope() == 0) cg.pusha(varDefinition.getOffset());
    // Si es local
    else {
      cg.pushBP();
      cg.pushValue(varDefinition.getType(), varDefinition.getOffset() + "");
      cg.add(varDefinition.getType());
    }
    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, Type param) {
    arrayAccess.getArray().accept(this, param);
    arrayAccess.getIndexes().forEach(i -> i.accept(this, param));
    Type indexType = new IntType(arrayAccess.getLine(), arrayAccess.getColumn());

    cg.pushValue(indexType, indexType.getNumberOfBytes() + "");
    cg.mul(indexType);
    cg.add(indexType);

    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, Type param) {
    Struct struct = (Struct) structAccess.getStruct().getType();

    structAccess.getStruct().accept(this, param);
    cg.pushValue(struct, struct.getField(structAccess.getName()).getOffset() + "");
    cg.add(struct);

    return null;
  }


}
