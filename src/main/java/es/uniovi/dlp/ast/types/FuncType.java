package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;

public class FuncType implements Type {

  private VarDefinition params;
  private Type returnType;

  public FuncType(VarDefinition params, Type returnType) {
    this.params = params;
    this.returnType = returnType;
  }

  public VarDefinition getParams() {
    return params;
  }

  public Type getReturnType() {
    return returnType;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }
}
