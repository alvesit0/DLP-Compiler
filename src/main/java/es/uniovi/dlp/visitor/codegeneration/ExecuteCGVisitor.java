package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.io.OutputStreamWriter;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {
  private AddressCGVisitor addressVisitor;
  private ValueCGVisitor valueVisitor;

  private CodeGenerator cg;

  public ExecuteCGVisitor(String filename, boolean showDebug, OutputStreamWriter out) {
    cg = new CodeGenerator(filename, showDebug, out);
    addressVisitor = new AddressCGVisitor(cg);
    valueVisitor = new ValueCGVisitor(cg, addressVisitor);
  }

  public Type visit(Program program, Type type) {
    return null;
  }

  @Override
  public Type visit(Assignment a, Type param) {
    a.getLeftExpression().accept(addressVisitor, param);
    a.getRightExpression().accept(valueVisitor, param);
    cg.write("storei");
    return null;
  }
}
