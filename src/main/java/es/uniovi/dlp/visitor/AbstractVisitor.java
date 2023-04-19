package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.ErrorManager;

public abstract class AbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {

  // ########## EXPRESSIONS ##########

  @Override
  public ReturnType visit(ArithmeticOperation arithmeticOperation, ParamType param) {
    arithmeticOperation.getLeftExpression().accept(this, param);
    arithmeticOperation.getRightExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(ArrayAccess arrayAccess, ParamType param) {
    arrayAccess.getIndexes().forEach(p -> p.accept(this, param));
    arrayAccess.getArray().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(BooleanNot booleanNot, ParamType param) {
    booleanNot.getExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(BooleanOperation booleanOperation, ParamType param) {
    booleanOperation.getLeftExpression().accept(this, param);
    booleanOperation.getRightExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(Cast cast, ParamType param) {
    cast.getLeftExpression().accept(this, param);
    cast.getType().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(CharLiteral charLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(ComparisonOperation comparisonOperation, ParamType param) {
    comparisonOperation.getLeftExpression().accept(this, param);
    comparisonOperation.getRightExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(DoubleLiteral doubleLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(IntLiteral intLiteral, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(Invocation invocation, ParamType param) {
    invocation.getArguments().forEach(a -> a.accept(this, param));
    invocation.getVariable().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(Negative negative, ParamType param) {
    negative.getExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(StructAccess structAccess, ParamType param) {
    structAccess.getStruct().accept(this, param);

    return null;
  }

  // ########## PROGRAM ##########

  @Override
  public ReturnType visit(FunctionDefinition functionDefinition, ParamType param) {
    functionDefinition.getType().accept(this, param);
    functionDefinition.getVarDefinitions().forEach(st -> st.accept(this, param));
    functionDefinition.getStatements().forEach(st -> st.accept(this, param));

    return null;
  }

  @Override
  public ReturnType visit(Program program, ParamType param) {
    program.getDefinitions().forEach(definition -> definition.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(VarDefinition varDefinition, ParamType param) {
    varDefinition.getType().accept(this, param);

    return null;
  }

  // ########## STATEMENTS ##########

  @Override
  public ReturnType visit(Assignment assignment, ParamType param) {
    assignment.getRightExpression().accept(this, param);
    assignment.getLeftExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(If ifStatement, ParamType param) {
    ifStatement.getCondition().accept(this, param);
    ifStatement.getIfBody().forEach(st -> st.accept(this, param));
    ifStatement.getElseBody().forEach(st -> st.accept(this, param));

    return null;
  }

  @Override
  public ReturnType visit(Read read, ParamType param) {
    read.getExpression().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(Return returnStatement, ParamType param) {
    returnStatement.getReturnValue().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(While whileStatement, ParamType param) {
    whileStatement.getCondition().accept(this, param);
    whileStatement.getBody().forEach(st -> st.accept(this, param));

    return null;
  }

  @Override
  public ReturnType visit(Write write, ParamType param) {
    write.getExpression().accept(this, param);

    return null;
  }

  // ########## TYPES ##########

  @Override
  public ReturnType visit(Array array, ParamType param) {
    array.getType().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(CharType charType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(DoubleType doubleType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(FuncType funcType, ParamType param) {
    funcType.getParams().forEach(p -> p.accept(this, param));
    funcType.getReturnType().accept(this, param);

    return null;
  }

  @Override
  public ReturnType visit(IntType intType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(Struct struct, ParamType param) {
    struct.getFields().forEach(st -> st.accept(this, param));
    return null;
  }

  @Override
  public ReturnType visit(VoidType voidType, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(Variable variable, ParamType param) {
    return null;
  }

  @Override
  public ReturnType visit(StructField structField, ParamType param) {
    return null;
  }

  public ReturnType visit(ErrorType errorType, ParamType param) {
    return null;
  }
}
