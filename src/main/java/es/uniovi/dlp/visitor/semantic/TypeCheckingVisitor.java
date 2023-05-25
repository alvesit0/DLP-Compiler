package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  // ###################### STATEMENTS ######################

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
                      assignment.getLeftExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));

    Type leftType = assignment.getLeftExpression().getType();
    if (leftType == null) {
      assignment.getLeftExpression().setType(ErrorType.getInstance());
      leftType = ErrorType.getInstance();
    }
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

    if (!read.getExpression().getLValue()) {
      ErrorManager.getInstance()
          .getErrors()
          .add(
              new Error(
                  new Location(read.getExpression().getLine(), read.getExpression().getColumn()),
                  ErrorReason.LVALUE_REQUIRED));
    }

    return null;
  }

  @Override
  public Type visit(Return returnStatement, Type param) {
    super.visit(returnStatement, param);

    returnStatement
        .getReturnValue()
        .setType(returnStatement.getReturnValue().getType().subtype(param));

    if (returnStatement.getReturnValue().getType() == null) {
      returnStatement.getReturnValue().setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              returnStatement.getReturnValue().getLine(),
              returnStatement.getReturnValue().getColumn(),
              ErrorReason.INVALID_RETURN_TYPE);
    }

    return null;
  }

  @Override
  public Type visit(If ifStatement, Type param) {
    super.visit(ifStatement, param);

    ifStatement.getCondition().setType(ifStatement.getCondition().getType().isBoolean());

    if (ifStatement.getCondition().getType() == null) {
      ifStatement.getCondition().setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              ifStatement.getCondition().getLine(),
              ifStatement.getCondition().getColumn(),
              ErrorReason.NOT_LOGICAL);
    }

    return null;
  }

  @Override
  public Type visit(While whileStatement, Type param) {
    ErrorManager e = ErrorManager.getInstance();
    super.visit(whileStatement, param);

    whileStatement.getCondition().setType(whileStatement.getCondition().getType().isBoolean());

    if (whileStatement.getCondition().getType() == null) {
      whileStatement.getCondition().setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              whileStatement.getCondition().getLine(),
              whileStatement.getCondition().getColumn(),
              ErrorReason.NOT_LOGICAL);
    }

    return null;
  }

  // ###################### EXPRESSIONS ######################

  public Type visit(Invocation invocation, Type param) {
    super.visit(invocation, param);

    var type = invocation.getVariable().getType();

    if (type instanceof FuncType funcType) {
      invocation.setType(funcType.getReturnType());
      var params = funcType.getParams();
      var args = invocation.getArguments();

      var validArgSize = params.size() == args.size();

      if (!validArgSize) {
        invocation.setType(ErrorType.getInstance());
        ErrorManager.getInstance()
            .addError(invocation.getLine(), invocation.getColumn(), ErrorReason.INVALID_ARGS);
      }

      for (int i = 0; validArgSize && i < params.size(); i++)
        if (params.get(i).getType().asParam(args.get(i).getType()) == null) {
          invocation.setType(ErrorType.getInstance());
          ErrorManager.getInstance()
              .addError(invocation.getLine(), invocation.getColumn(), ErrorReason.INVALID_ARGS);
        }

    } else if (type == null) {
      invocation.setType(ErrorType.getInstance());
    } else {
      invocation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(invocation.getLine(), invocation.getColumn(), ErrorReason.INVALID_INVOCATION);
    }

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
              arithmeticOperation.getColumn() + 2,
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
    super.visit(variable, param);
    variable.setLValue(true);
    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, Type param) {
    super.visit(structAccess, param);
    structAccess.setLValue(true);

    if (!structAccess.getStruct().getType().isStruct()) {
      structAccess.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(structAccess.getLine(), structAccess.getColumn(), ErrorReason.INVALID_DOT);
    } else structAccess.setType(structAccess.getStruct().getType().dot(structAccess.getName()));

    if (structAccess.getType() == null) {
      structAccess.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(structAccess.getLine(), structAccess.getColumn(), ErrorReason.NO_SUCH_FIELD);
    }

    return null;
  }

  @Override
  public Type visit(Indexing indexing, Type param) {
    super.visit(indexing, param);
    indexing.setLValue(true);

    if (!indexing.getArray().getType().isIndexable()) {
      indexing.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(indexing.getLine(), indexing.getColumn(), ErrorReason.INVALID_INDEXING);
    } else indexing.setType(indexing.getArray().getType().indexing(indexing.getIndex().getType()));

    if (indexing.getType() == null) {
      indexing.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              indexing.getIndex().getLine(),
              indexing.getIndex().getColumn(),
              ErrorReason.INVALID_INDEX_EXPRESSION);
    }

    return null;
  }

  @Override
  public Type visit(ComparisonOperation comparisonOperation, Type param) {
    super.visit(comparisonOperation, param);
    comparisonOperation.setLValue(false);
    Type leftType = comparisonOperation.getLeftExpression().getType();
    Type rightType = comparisonOperation.getRightExpression().getType();

    comparisonOperation.setType(leftType.comparison(rightType));

    if (comparisonOperation.getType() == null) {
      comparisonOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              comparisonOperation.getLine(),
              comparisonOperation.getColumn(),
              ErrorReason.INVALID_COMPARISON);
    }

    return null;
  }

  @Override
  public Type visit(BooleanOperation booleanOperation, Type param) {
    super.visit(booleanOperation, param);
    booleanOperation.setLValue(false);

    Type leftType = booleanOperation.getLeftExpression().getType();
    Type rightType = booleanOperation.getRightExpression().getType();

    booleanOperation.setType(leftType.logical(rightType));

    if (booleanOperation.getType() == null) {
      booleanOperation.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              booleanOperation.getLine(),
              booleanOperation.getColumn(),
              ErrorReason.INVALID_LOGICAL);
    }

    return null;
  }

  @Override
  public Type visit(BooleanNot booleanNot, Type param) {
    super.visit(booleanNot, param);
    booleanNot.setLValue(false);

    booleanNot.setType(booleanNot.getExpression().getType().booleanNot());

    if (booleanNot.getType() == null) {
      booleanNot.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(booleanNot.getLine(), booleanNot.getColumn(), ErrorReason.NOT_LOGICAL);
    }

    return null;
  }

  // ###################### DEFINITIONS ######################

  @Override
  public Type visit(VarDefinition varDefinition, Type param) {
    super.visit(varDefinition, param);
    return null;
  }

  @Override
  public Type visit(FunctionDefinition functionDefinition, Type param) {
    super.visit(functionDefinition, ((FuncType) functionDefinition.getType()).getReturnType());
    return null;
  }
}
