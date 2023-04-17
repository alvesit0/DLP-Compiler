package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.Invocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

  private SymbolTable symbolTable = new SymbolTable();

  @Override
  public Type visit(Variable variable, Type param) {
    Definition definition = symbolTable.find(variable.getName());
    if (definition == null)
      ErrorManager.getInstance()
          .addError(variable.getLine(), variable.getColumn(), ErrorReason.VARIABLE_NOT_DECLARED);
    variable.setDefinition(definition);
    return null;
  }

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    if (!symbolTable.insert(functionDefinition))
      ErrorManager.getInstance()
          .addError(
              functionDefinition.getLine(),
              functionDefinition.getColumn(),
              ErrorReason.FUNCTION_ALREADY_DECLARED);
    functionDefinition.getVarDefinitions().forEach(((varDef) -> {}));

    symbolTable.set();
    super.visit(functionDefinition, param);
    symbolTable.reset();
    return null;
  }

  @Override
  public Type visit(Invocation invocation, Type param) {

    Definition definition = symbolTable.find(invocation.getVariable().getName());
    if (definition == null)
      ErrorManager.getInstance()
          .addError(
              invocation.getLine(), invocation.getColumn(), ErrorReason.FUNCTION_NOT_DECLARED);

    invocation.getVariable().setDefinition(definition);

    return null;
  }

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    if (!symbolTable.insert(varDefinition))
      ErrorManager.getInstance()
          .addError(
              varDefinition.getLine(),
              varDefinition.getColumn(),
              ErrorReason.VARIABLE_ALREADY_DECLARED);
    super.visit(varDefinition, param);

    return null;
  }

  @Override
  public Type visit(Struct struct, Type param) {
    List<String> fieldNames = new ArrayList<>();
    struct
        .getFields()
        .forEach(
            recordField -> {
              if (fieldNames.contains(recordField.getName()))
                ErrorManager.getInstance()
                    .addError(
                        recordField.getLine(),
                        recordField.getColumn(),
                        ErrorReason.FIELD_ALREADY_DECLARED);
              else fieldNames.add(recordField.getName());
            });

    return null;
  }
}
