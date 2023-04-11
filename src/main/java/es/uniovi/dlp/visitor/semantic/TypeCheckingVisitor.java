package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.Read;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  @Override
  public Type visit(Assignment assignment, Type param) {
    assignment.getLeftExpression().accept(this, param);
    assignment.getRightExpression().accept(this, param);

    if (!assignment.getLeftExpression().getLValue())
      ErrorManager.getInstance()
          .getErrors()
          .add(
              new Error(
                  new Location(
                      assignment.getLeftExpression().getLine(),
                      assignment.getLeftExpression().getColumn() - 2),
                  ErrorReason.LVALUE_REQUIRED));

    return null;
  }

  @Override
  public Type visit(Read read, Type param) {
    read.getExpression().accept(this, param);

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
      ErrorManager.getInstance().addError(arithmeticOperation.getLine(), arithmeticOperation.getColumn(),
              ErrorReason.INVALID_ARITHMETIC);
    }

    arithmeticOperation.setLValue(false);
    return null;
  }

  public Type visit(Negative negative, Type param) {
    super.visit(negative, param);

    if (negative.getType() == null) {
      negative.setType(ErrorType.getInstance());
      ErrorManager.getInstance().addError(negative.getLine(), negative.getColumn(),
              ErrorReason.INVALID_ARITHMETIC);
    }

    negative.setLValue(false);

    return null;
  }

  @Override
  public Type visit(Cast cast, Type param) {
    super.visit(cast, param);

    Type leftType = cast.getLeftExpression().getType();
    Type rightType = cast.getType();

    cast.setType(rightType.cast(leftType));

    if (cast.getType() == null) {
      cast.setType(ErrorType.getInstance());
      ErrorManager.getInstance().addError(cast.getLine(), cast.getColumn(),
              ErrorReason.INVALID_CAST);
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
  public Type visit(StructAccess structAccess, Type param) {
    structAccess.setLValue(true);
    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, Type param) {
    arrayAccess.setLValue(true);
    return null;
  }

  @Override
  public Type visit(DoubleType doubleType, Type param) {
    return null;
  }

  @Override
  public Type visit(StructField structField, Type param) {
    return null;
  }
}
