package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.program.VarDefinition;
import java.util.List;

public class FuncType extends AbstractType {

  private List<VarDefinition> params;
  private Type returnType;

  public FuncType(int line, int column, List<VarDefinition> params, Type returnType) {
    super(line, column);
    this.params = params;
    this.returnType = returnType;
  }

  public List<VarDefinition> getParams() {
    return params;
  }

  public Type getReturnType() {
    return returnType;
  }
}
