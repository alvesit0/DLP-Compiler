package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
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
  public Type visit(Variable v, ReturnBytesParam param) {
    // TODO: Definir offset en todas las definitions
    VarDefinition varDefinition = (VarDefinition) v.getDefinition();
    Type intType = new IntType(varDefinition.getLine(), varDefinition.getColumn());
    // Si es variable global
    if (varDefinition.getScope() == 0) cg.pusha(varDefinition.getOffset());
    // Si es local
    else {
      cg.pushBP();
      cg.pushValue(intType, varDefinition.getOffset() + "");
      // Al ser local, AÑADIMOS el offset al BP para obtener la dirección de la variable.
      // De esta forma, lo que quedará en el tope de la pila será la dirección de dicha
      // variable.
      cg.add(intType);
    }
    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, ReturnBytesParam param) {

    var expression = arrayAccess.getArray();
    expression.accept(this, null);
    arrayAccess.getIndex().accept(valueVisitor, null);
    // TODO: Cambiar por IntType.getInstance()
    cg.pushValue(new IntType(0, 0), arrayAccess.getType().getNumberOfBytes() + "");
    cg.mul(new IntType(0, 0));
    cg.add(new IntType(0, 0));

    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, ReturnBytesParam param) {

    var expression = structAccess.getStruct();
    expression.accept(this, null);

    if (expression.getType() instanceof Struct recordType) {
      int offset = recordType.getField(structAccess.getName()).getOffset();
      Type type = recordType.getField(structAccess.getName()).getType();
      // TODO: Cambiar por IntType.getInstance()
      cg.pushValue(new IntType(0, 0), offset + "");
      cg.add(new IntType(0, 0));
    }

    return null;
  }
}
