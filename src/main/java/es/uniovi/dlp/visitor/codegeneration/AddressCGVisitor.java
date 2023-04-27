package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.Expression;
import es.uniovi.dlp.ast.expressions.StructAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Array;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

  private CodeGenerator cg;
  private ValueCGVisitor valueVisitor;

  public AddressCGVisitor(CodeGenerator cg) {
    this.cg = cg;
  }

  public void setValueVisitor(ValueCGVisitor valueVisitor) {
    this.valueVisitor = valueVisitor;
  }

  @Override
  public Type visit(Variable v, Type param) {
    VarDefinition varDefinition = (VarDefinition) v.getDefinition();
    Type intType = new IntType(varDefinition.getLine(), varDefinition.getColumn());
    // Si es variable global
    if (varDefinition.getScope() == 0) cg.pusha(varDefinition.getOffset());
    // Si es local
    else {
      cg.pushBP();
      cg.pushValue(intType, varDefinition.getOffset() + "");
      cg.add(intType);
    }
    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, Type param) {
    arrayAccess.getArray().accept(this, param);
    Array type = (Array) arrayAccess.getArray().getType();
    for (int i = 1; i < arrayAccess.getIndexes().size() + 1; i++) {
      Expression index = arrayAccess.getIndexes().get(i - 1);
      index.accept(valueVisitor, param);
      Type aux = type.getTypeAtIndex(i - 1);

      if (aux instanceof Array)
        cg.pushValue(index.getType(), type.getArrayType().getNumberOfBytes() * ((Array)aux).getSize() + "");
      else
        cg.pushValue(index.getType(), type.getArrayType().getNumberOfBytes() + "");

      cg.mul(index.getType());
      cg.add(index.getType());
    }

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
