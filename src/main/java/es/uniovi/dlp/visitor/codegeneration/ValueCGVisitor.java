package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.types.Struct;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
  private AddressCGVisitor addressVisitor;
  private CodeGenerator cg;

  public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressVisitor) {
    this.cg = cg;
    this.addressVisitor = addressVisitor;
  }

  @Override
  public Type visit(Variable v, Type param) {
    v.accept(addressVisitor, param);
    cg.load(v.getType());
    return null;
  }

  public Type visit(ArithmeticOperation arithmeticOperation, Type param) {
    Type leftType = arithmeticOperation.getLeftExpression().getType();
    Type rightType = arithmeticOperation.getRightExpression().getType();

    arithmeticOperation.getLeftExpression().accept(this, param);
    cg.writeInstruction(leftType.convert(rightType));
    arithmeticOperation.getRightExpression().accept(this, param);
    cg.writeInstruction(rightType.convert(leftType));

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
  public Type visit(Cast cast, Type param) {
    cast.getLeftExpression().accept(this, param);
    cg.cast(cast.getLeftExpression().getType(), cast.getType());

    return null;
  }

  @Override
  public Type visit(IntLiteral intLiteral, Type param) {
    cg.pushValue(intLiteral.getType(), intLiteral.getValue() + "");

    return null;
  }

  @Override
  public Type visit(DoubleLiteral doubleLiteral, Type param) {
    cg.pushValue(doubleLiteral.getType(), doubleLiteral.getValue() + "");

    return null;
  }

  @Override
  public Type visit(CharLiteral charLiteral, Type param) {
    cg.pushValue(charLiteral.getType(), ((int) charLiteral.getValue()) + "");

    return null;
  }

  @Override
  public Type visit(BooleanOperation booleanOperation, Type param) {
    booleanOperation.getLeftExpression().accept(this, param);
    booleanOperation.getRightExpression().accept(this, param);

    switch (booleanOperation.getOp()) {
      case "&&" -> cg.and();
      case "||" -> cg.or();
    }

    return null;
  }

  @Override
  public Type visit(BooleanNot booleanNot, Type param) {
    booleanNot.getExpression().accept(this, param);
    if (!booleanNot.getExpression().getType().toInt().isEmpty())
      cg.writeInstruction(booleanNot.getExpression().getType().toInt());
    cg.not();

    return null;
  }

  @Override
  public Type visit(ComparisonOperation comparisonOperation, Type param) {
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
  public Type visit(ArrayAccess arrayAccess, Type param) {
    arrayAccess.accept(addressVisitor, param);
    cg.load(arrayAccess.getIndexes().get(0).getType());

    return null;
  }

  @Override
  public Type visit(StructAccess structAccess, Type param) {
    structAccess.accept(addressVisitor, param);
    cg.load(structAccess.getStruct().getType());

    return null;
  }
}
