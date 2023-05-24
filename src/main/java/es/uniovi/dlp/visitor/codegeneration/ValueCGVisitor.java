package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, ReturnBytesParam> {
  private AddressCGVisitor addressVisitor;
  private CodeGenerator cg;

  public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressVisitor) {
    this.cg = cg;
    this.addressVisitor = addressVisitor;
  }

  @Override
  public Type visit(Variable v, ReturnBytesParam param) {
    v.accept(addressVisitor, param);
    cg.load(v.getType());
    return null;
  }

  public Type visit(ArithmeticOperation arithmeticOperation, ReturnBytesParam param) {
    Type leftType = arithmeticOperation.getLeftExpression().getType();
    Type rightType = arithmeticOperation.getRightExpression().getType();

    arithmeticOperation.getLeftExpression().accept(this, param);
    cg.writeInstruction(leftType.toInt());
    arithmeticOperation.getRightExpression().accept(this, param);
    cg.writeInstruction(rightType.toInt());

    switch (arithmeticOperation.getOp()) {
      case "+" -> cg.add(arithmeticOperation.getType());
      case "-" -> cg.sub(arithmeticOperation.getType());
      case "*" -> cg.mul(arithmeticOperation.getType());
      case "/" -> cg.div(arithmeticOperation.getType());
      case "%" -> cg.mod(arithmeticOperation.getType());
    }

    return null;
  }

  @Override
  public Type visit(Cast cast, ReturnBytesParam param) {
    cast.getLeftExpression().accept(this, param);
    cg.cast(cast.getLeftExpression().getType(), cast.getType());

    return null;
  }

  @Override
  public Type visit(IntLiteral intLiteral, ReturnBytesParam param) {
    cg.pushValue(intLiteral.getType(), intLiteral.getValue() + "");

    return null;
  }

  @Override
  public Type visit(DoubleLiteral doubleLiteral, ReturnBytesParam param) {
    cg.pushValue(doubleLiteral.getType(), doubleLiteral.getValue() + "");

    return null;
  }

  @Override
  public Type visit(CharLiteral charLiteral, ReturnBytesParam param) {
    cg.pushValue(charLiteral.getType(), ((int) charLiteral.getValue()) + "");

    return null;
  }

  @Override
  public Type visit(BooleanOperation booleanOperation, ReturnBytesParam param) {
    booleanOperation.getLeftExpression().accept(this, param);
    booleanOperation.getRightExpression().accept(this, param);

    switch (booleanOperation.getOp()) {
      case "&&" -> cg.and();
      case "||" -> cg.or();
    }

    return null;
  }

  @Override
  public Type visit(BooleanNot booleanNot, ReturnBytesParam param) {
    booleanNot.getExpression().accept(this, param);
    if (!booleanNot.getExpression().getType().toInt().isEmpty())
      cg.writeInstruction(booleanNot.getExpression().getType().toInt());
    cg.not();

    return null;
  }

  @Override
  public Type visit(ComparisonOperation comparisonOperation, ReturnBytesParam param) {
    Type leftType = comparisonOperation.getLeftExpression().getType();
    Type rightType = comparisonOperation.getRightExpression().getType();

    comparisonOperation.getLeftExpression().accept(this, param);
    // Si es char, lo convertimos a int para poder hacer la comparación
    if (!leftType.toInt().isEmpty()) cg.writeInstruction(leftType.toInt());

    comparisonOperation.getRightExpression().accept(this, param);
    if (!rightType.toInt().isEmpty()) cg.writeInstruction(rightType.toInt());

    switch (comparisonOperation.getOp()) {
      case ">" -> cg.greater(rightType);
      case ">=" -> cg.greaterOrEquals(rightType);
      case "<" -> cg.lesser(rightType);
      case "<=" -> cg.lesserOrEquals(rightType);
      case "==" -> cg.equals(rightType);
      case "!=" -> cg.notEquals(rightType);
    }

    return null;
  }

  @Override
  public Type visit(ArrayAccess arrayAccess, ReturnBytesParam param) {
    arrayAccess.accept(addressVisitor, param);
    cg.load(arrayAccess.getType());

    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, ReturnBytesParam param) {
    structAccess.accept(addressVisitor, param);
    cg.load(structAccess.getType());

    return null;
  }

  @Override
  public Type visit(Invocation invocation, ReturnBytesParam param) {
    invocation.getArguments().forEach(a -> a.accept(this, param));
    cg.call(invocation.getVariable().getName());

    return null;
  }
}
