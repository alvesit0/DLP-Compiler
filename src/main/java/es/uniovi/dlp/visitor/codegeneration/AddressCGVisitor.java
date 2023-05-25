package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.Indexing;
import es.uniovi.dlp.ast.expressions.StructAccess;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, ReturnBytesParam> {

  private CodeGenerator cg;
  private ValueCGVisitor valueVisitor;

  public AddressCGVisitor(CodeGenerator cg) {
    this.cg = cg;
  }

  public void setValueVisitor(ValueCGVisitor valueVisitor) {
    this.valueVisitor = valueVisitor;
  }

  @Override
  public Type visit(Variable variable, ReturnBytesParam param) {
    Type intType = new IntType(variable.getLine(), variable.getColumn());
    // Si es variable global
    if (variable.getDefinition().getScope() == 0) cg.pusha(variable.getDefinition().getOffset());
    // Si es local
    else {
      cg.pushBP();
      cg.pushValue(intType, variable.getDefinition().getOffset() + "");
      // Al ser local, AÑADIMOS el offset al BP para obtener la dirección de la variable.
      // De esta forma, lo que quedará en el tope de la pila será la dirección de dicha
      // variable.
      cg.add(intType);
    }
    return null;
  }

  @Override
  public Type visit(Indexing indexing, ReturnBytesParam param) {

    var expression = indexing.getArray();
    expression.accept(this, null);
    indexing.getIndex().accept(valueVisitor, null);
    Type intType = new IntType(indexing.getLine(), indexing.getColumn());
    cg.pushValue(intType, indexing.getType().getNumberOfBytes() + "");
    cg.mul(intType);
    cg.add(intType);

    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, ReturnBytesParam param) {

    var expression = structAccess.getStruct();
    expression.accept(this, null);

    if (expression.getType() instanceof Struct recordType) {
      int offset = recordType.getField(structAccess.getName()).getOffset();
      Type intType = new IntType(structAccess.getLine(), structAccess.getColumn());
      cg.pushValue(intType, offset + "");
      cg.add(intType);
    }

    return null;
  }
}
