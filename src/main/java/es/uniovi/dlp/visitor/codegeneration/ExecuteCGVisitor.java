package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.statements.Write;
import es.uniovi.dlp.ast.types.FuncType;
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

  public Type visit(Program program, Type param) {

    program
        .getDefinitions()
        .forEach(
            definition -> {
              if (definition instanceof VarDefinition) definition.accept(this, param);
            });

    cg.main();

    program
        .getDefinitions()
        .forEach(
            definition -> {
              if (definition instanceof FunctionDefinition) definition.accept(this, param);
            });

    return null;
  }

  @Override
  public Type visit(Assignment assignment, Type param) {
    cg.newLine(assignment.getLeftExpression().getLine());
    assignment.getLeftExpression().accept(addressVisitor, param);
    assignment.getRightExpression().accept(valueVisitor, param);
    cg.store(assignment.getLeftExpression().getType());
    return null;
  }

  @Override
  public Type visit(Read read, Type param) {
    cg.newLine(read.getExpression().getLine());
    cg.comment("Read");
    read.getExpression().accept(addressVisitor, param);
    cg.in(read.getExpression().getType());
    cg.store(read.getExpression().getType());

    return null;
  }

  @Override
  public Type visit(Write write, Type param) {
    cg.newLine(write.getExpression().getLine());
    cg.comment("Write");
    write.getExpression().accept(valueVisitor, param);
    cg.out(write.getExpression().getType());

    return null;
  }

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    cg.comment(
        varDefinition.getName()
            + " :: "
            + varDefinition.getType()
            + "(offset "
            + varDefinition.getOffset()
            + ")");
    return null;
  }

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    cg.newLine(functionDefinition.getLine());

    FuncType type = (FuncType) functionDefinition.getType();

    cg.label(functionDefinition.getName());
    cg.comment("Parameters");
    type.getParams().forEach(p -> p.accept(this, param));

    cg.comment("Local variables");
    functionDefinition.getVarDefinitions().forEach(v -> v.accept(this, param));

    // El tamaño de la función será el valor absoluto del offset del último elemento de la lista de
    // definiciones
    int localBytes =
        functionDefinition.getVarDefinitions().size() > 0
            ? -functionDefinition
                .getVarDefinitions()
                .get(functionDefinition.getVarDefinitions().size() - 1)
                .getOffset()
            : 0;

    cg.enter(localBytes);

    int argumentsBytes = 0;
    for (VarDefinition varDefinition : type.getParams())
      argumentsBytes += varDefinition.getType().getNumberOfBytes();
    int returnBytes = type.getReturnType().getNumberOfBytes();

    functionDefinition.getStatements().forEach(s -> s.accept(this, param));

    cg.ret(returnBytes, localBytes, argumentsBytes);

    return null;
  }
}
