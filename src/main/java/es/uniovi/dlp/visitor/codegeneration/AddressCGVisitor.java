package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.IntType;
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

    var expression = arrayAccess.getArray();
    expression.accept(this, null);
    arrayAccess.getIndex().accept(valueVisitor, null);
    cg.pushValue(arrayAccess.getType(), arrayAccess.getType().getNumberOfBytes() + "");
    cg.mul(arrayAccess.getType());
    cg.add(arrayAccess.getType());

    return null;
  }

  // @Override
  // public Type visit(StructAccess structAccess, Type param) {
  //
  //  var expression = structAccess.getStruct();
  //  expression.accept(this, null);
  //
  //  if (expression.getType() instanceof Struct recordType) {
  //    int offset = recordType.getField(structAccess.getName()).getOffset();
  //    Type type = recordType.getField(structAccess.getName()).getType();
  //    cg.pushValue(type, offset + "");
  //    cg.add(type);
  //  }
  //
  //  return null;
  // }
}
