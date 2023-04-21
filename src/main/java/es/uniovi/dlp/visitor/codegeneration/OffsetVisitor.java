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
    for (StructField structField : struct.getFields()) {
      structField.setOffset(structFieldByteSum);
      structFieldByteSum += structField.getType().getNumberOfBytes();
    }

    return null;
  }
}
