package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;

public class FuncType extends AbstractType {

  private VarDefinition params;
  private Type returnType;

  public FuncType(int line, int column, VarDefinition params, Type returnType) {
    super(line, column);
    this.params = params;
    this.returnType = returnType;
  }

  public VarDefinition getParams() {
    return params;
  }

  public Type getReturnType() {
    return returnType;
  }
}
