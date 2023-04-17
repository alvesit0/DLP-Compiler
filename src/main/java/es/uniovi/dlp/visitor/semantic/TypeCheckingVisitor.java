package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  @Override
  public Type visit(Assignment assignment, Type param) {
    super.visit(assignment, param);

    if (!assignment.getLeftExpression().getLValue())
      ErrorManager.getInstance()
          .getErrors()
          .add(
              new Error(
                  new Location(
                      assignment.getLeftExpression().getLine(),
                      assignment.getLeftExpression().getColumn() - 2),
                  ErrorReason.LVALUE_REQUIRED));

    Type leftType = assignment.getLeftExpression().getType();
    Type rightType = assignment.getRightExpression().getType();

    assignment.getLeftExpression().setType(leftType.assign(rightType));

    if (assignment.getLeftExpression().getType() == null) {
      assignment.getLeftExpression().setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              assignment.getLeftExpression().getLine(),
              assignment.getLeftExpression().getColumn(),
              ErrorReason.INCOMPATIBLE_TYPES);
    }

    return null;
  }

  @Override
  public Type visit(Read read, Type param) {
    super.visit(read, param);

    if (!read.getExpression().getLValue())
      ErrorManager.getInstance()
          .getErrors()
          .add(
              new Error(
                  new Location(
                      read.getExpression().getLine(), read.getExpression().getColumn() - 2),
                  ErrorReason.LVALUE_REQUIRED));

    return null;
  }

  @Override
  public Type visit(ArithmeticOperation arithmeticOperation, Type param) {
    super.visit(arithmeticOperation, param);

    Type leftType = arithmeticOperation.getLeftExpression().getType();
    Type rightType = arithmeticOperation.getRightExpression().getType();

    arithmeticOperation.setType(leftType.arithmetic(rightType));

    if (arithmeticOperation.getType() == null) {
      arithmeticOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              arithmeticOperation.getLine(),
              arithmeticOperation.getColumn(),
              ErrorReason.INVALID_ARITHMETIC);
    }

    arithmeticOperation.setLValue(false);
    return null;
  }

  public Type visit(Negative negative, Type param) {
    super.visit(negative, param);
    negative.setLValue(false);

    negative.setType(negative.getExpression().getType().negative());

    if (negative.getType() == null) {
      negative.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(negative.getLine(), negative.getColumn(), ErrorReason.INVALID_ARITHMETIC);
    }

    return null;
  }

  @Override
  public Type visit(Cast cast, Type param) {
    super.visit(cast, param);

    Type leftType = cast.getLeftExpression().getType();
    Type rightType = cast.getType();

    cast.setType(leftType.cast(rightType));

    if (cast.getType() == null) {
      cast.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(cast.getLine(), cast.getColumn(), ErrorReason.INVALID_CAST);
    }

    cast.setLValue(false);
    return null;
  }

  @Override
  public Type visit(Variable variable, Type param) {
    variable.setLValue(true);
    return null;
  }

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    super.visit(varDefinition, param);
    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, Type param) {
    super.visit(structAccess, param);
    structAccess.setLValue(true);

    structAccess.setType(structAccess.getStruct().getType().dot(structAccess.getName()));

    if (structAccess.getType() == null) {
      structAccess.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(structAccess.getLine(), structAccess.getColumn(), ErrorReason.INVALID_DOT);
    }

    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, Type param) {
    super.visit(arrayAccess, param);
    arrayAccess.setLValue(true);

    if (!arrayAccess.getArray().getType().isIndexable()) {
      arrayAccess.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(arrayAccess.getLine(), arrayAccess.getColumn(), ErrorReason.INVALID_INDEXING);
    } else
      arrayAccess.setType(
          arrayAccess.getArray().getType().indexing(arrayAccess.getIndexes().get(0).getType()));

    if (arrayAccess.getType() == null) {
      arrayAccess.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              arrayAccess.getIndexes().get(0).getLine(),
              arrayAccess.getIndexes().get(0).getColumn(),
              ErrorReason.INVALID_INDEX_EXPRESSION);
    }

    return null;
  }
}
