package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.types.FuncType;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Type, Type> {

  int globalByteSum = 0;

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    super.visit(functionDefinition, param);

    // En las definiciones de funciones habrá VARIABLES LOCALES, por tanto, no les hacemos el
    // visit sino que les asignamos el offset manualmente.
    // Se apilan por orden DE ARRIBA A ABAJO (de menor a mayor dirección)
    int localByteSum = 0;
    for (VarDefinition varDefinition : functionDefinition.getVarDefinitions()) {
      localByteSum += varDefinition.getType().getNumberOfBytes();
      varDefinition.setOffset(-localByteSum);
    }

    return null;
  }

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    super.visit(varDefinition, param);

    // Las VarDefinition visitadas serán VARIABLES GLOBALES, ya que estas no se han encontrado
    // dentro de una función. Dado que el AbstractVisitor también visitará las variables de
    // las FunctionDefinition, hacemos la comprobación de que la variable visitada es global:
    if (varDefinition.getScope() == 0) {
      varDefinition.setOffset(globalByteSum);
      globalByteSum += varDefinition.getType().getNumberOfBytes();
    }

    return null;
  }

  @Override
  public Type visit(FuncType funcType, Type param) {
    super.visit(funcType, param);

    int paramBytesSum = 0;
    // Para el offset de los parámetros, este se calculará de manera similar que las variables
    // locales, pero en positivo y a partir de 4 espacios reservados para la dirección de
    // retorno y el valor del BP.
    for (int i = funcType.getParams().size() - 1; i >= 0; i--) {
      VarDefinition varDefinition = funcType.getParams().get(i);
      varDefinition.setOffset(4 + paramBytesSum);
      paramBytesSum += varDefinition.getType().getNumberOfBytes();
    }

    return null;
  }

  @Override
  public Type visit(Struct struct, Type param) {
    super.visit(struct, param);

    int structFieldByteSum = 0;
    // Para los structs vamos uno a uno
    for (StructField structField : struct.getFields()) {
      structField.setOffset(structFieldByteSum);
      structFieldByteSum += structField.getType().getNumberOfBytes();
    }

    return null;
  }

  // Los arrays ya lo hacen solos
}
