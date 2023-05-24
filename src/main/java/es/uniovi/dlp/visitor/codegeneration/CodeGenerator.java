package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.types.Type;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {

  private boolean showDebug;
  private String filename;
  private OutputStreamWriter out;

  private int currentLine = 0;
  private int lastLabelId = -1;

  // TODO: Detalles de las variables (array y struct)

  public CodeGenerator(String filename, boolean showDebug, OutputStreamWriter out) {
    this.showDebug = showDebug;
    this.filename = filename;
    this.out = out;
    try {
      String[] formattedName = filename.split("/");
      this.out.write("#source \"" + formattedName[formattedName.length - 1] + "\"");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void comment(String comment) {
    if (showDebug) {
      writeInstruction("' " + comment);
    }
  }

  public void newLine(int number) {
    if (number > currentLine) {
      write("\n#line " + number);
      currentLine = number;
    }
  }

  public void allocateLabels(int howMany) {
    lastLabelId += howMany;
  }

  public int getLastLabelId() {
    return lastLabelId;
  }

  public void assignment() {}

  public void label(String label) {
    write("\n" + label + ":");
  }

  public void main() {
    if (showDebug) {
      write("' Invocation to the main function");
    }
    write("call main");
    write("halt");
  }

  public void writeInstruction(String text) {
    if (!text.isEmpty()) write("\t" + text);
  }

  public void write(String text) {
    try {
      this.out.write("\n" + text);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void store(Type type) {
    writeInstruction("store" + type.getSuffix());
  }

  public void load(Type type) {
    writeInstruction("load" + type.getSuffix());
  }

  public void pushValue(Type type, String value) {
    writeInstruction("push" + type.getSuffix() + "\t" + value);
  }

  public void pusha(int dir) {
    writeInstruction("pusha\t" + dir);
  }

  public void pushBP() {
    writeInstruction("push\tbp");
  }

  public void pop(Type type) {
    writeInstruction("pop" + type.getSuffix());
  }

  public void dup(Type type) {
    writeInstruction("dup" + type.getSuffix());
  }

  public void add(Type type) {
    writeInstruction("add" + type.getSuffix());
  }

  public void sub(Type type) {
    writeInstruction("sub" + type.getSuffix());
  }

  public void mul(Type type) {
    writeInstruction("mul" + type.getSuffix());
  }

  public void div(Type type) {
    writeInstruction("div" + type.getSuffix());
  }

  public void mod(Type type) {
    writeInstruction("mod" + type.getSuffix());
  }

  public void out(Type type) {
    writeInstruction("out" + type.getSuffix());
  }

  public void in(Type type) {
    writeInstruction("in" + type.getSuffix());
  }

  public void cast(Type left, Type type) {
    writeInstruction(left.convert(type));
  }

  public void and() {
    writeInstruction("and");
  }

  public void or() {
    writeInstruction("or");
  }

  public void not() {
    writeInstruction("not");
  }

  public void greater(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("gti");
    else writeInstruction("gt" + type.getSuffix());
  }

  public void lesser(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("lti");
    else writeInstruction("lt" + type.getSuffix());
  }

  public void greaterOrEquals(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("gei");
    else writeInstruction("ge" + type.getSuffix());
  }

  public void lesserOrEquals(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("lei");
    else writeInstruction("le" + type.getSuffix());
  }

  public void equals(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("eqi");
    else writeInstruction("eq" + type.getSuffix());
  }

  public void notEquals(Type type) {
    if (type.getSuffix().equals("b")) writeInstruction("nei");
    else writeInstruction("ne" + type.getSuffix());
  }

  public void enter(int dir) {
    writeInstruction("enter" + "\t" + dir);
  }

  public void ret(int returnBytes, int localBytes, int argumentsBytes) {
    writeInstruction("ret" + "\t" + returnBytes + ", " + localBytes + ", " + argumentsBytes);
  }

  public void call(String id) {
    writeInstruction("call" + "\t" + id);
  }

  public void jmp(String label) {
    writeInstruction("jmp" + "\t" + label);
  }

  public void jz(String label) {
    writeInstruction("jz" + "\t" + label);
  }

  public void jnz(String label) {
    writeInstruction("jnz" + "\t" + label);
  }
}
