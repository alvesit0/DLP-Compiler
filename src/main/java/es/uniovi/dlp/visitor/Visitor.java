package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public interface Visitor<ReturnType, ParamType> {

  // ########### EXPRESSIONS ###########
  ReturnType visit(ArithmeticOperation arithmeticOperation, ParamType param);

  ReturnType visit(ArrayAccess arrayAccess, ParamType param);

  ReturnType visit(BooleanNot booleanNot, ParamType param);

  ReturnType visit(BooleanOperation booleanOperation, ParamType param);

  ReturnType visit(Cast cast, ParamType param);

  ReturnType visit(CharLiteral charLiteral, ParamType param);

  ReturnType visit(ComparisonOperation comparisonOperation, ParamType param);

  ReturnType visit(DoubleLiteral doubleLiteral, ParamType param);

  ReturnType visit(IntLiteral intLiteral, ParamType param);

  ReturnType visit(Invocation invocation, ParamType param);

  ReturnType visit(Negative negative, ParamType param);

  ReturnType visit(StructAccess structAccess, ParamType param);

  ReturnType visit(Variable variable, ParamType param);

  // ########### PROGRAM ###########
  ReturnType visit(Program program, ParamType param);

  ReturnType visit(FunctionDefinition functionDefinition, ParamType param);

  ReturnType visit(VarDefinition varDefinition, ParamType param);

  // ########### STATEMENTS ###########
  ReturnType visit(Assignment assignment, ParamType param);

  ReturnType visit(If ifStatement, ParamType param);

  ReturnType visit(Read read, ParamType param);

  ReturnType visit(Return returnStatement, ParamType param);

  ReturnType visit(While whileStatement, ParamType param);

  ReturnType visit(Write write, ParamType param);

  // ########### TYPES ###########
  ReturnType visit(Array array, ParamType param);

  ReturnType visit(CharType charType, ParamType param);

  ReturnType visit(DoubleType doubleType, ParamType param);

  ReturnType visit(FuncType funcType, ParamType param);

  ReturnType visit(IntType intType, ParamType param);

  ReturnType visit(Struct struct, ParamType param);

  ReturnType visit(StructField structField, ParamType param);

  ReturnType visit(VoidType voidType, ParamType param);
}
