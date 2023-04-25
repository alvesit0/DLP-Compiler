package es.uniovi.dlp.visitor.codegeneration;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {

  private boolean showDebug;
  private String filename;
  private OutputStreamWriter out;

  private int lastLabelId = 0;

  public CodeGenerator(String filename, boolean showDebug, OutputStreamWriter out) {
    this.showDebug = showDebug;
    this.filename = filename;
    this.out = out;
    try {
      this.out.write("#source \"" + filename + "\"");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void writePragma(String string) {
    write("#" + string);
  }

  public void comment(String comment) {
    if (showDebug) {
      writeInstruction("' " + comment);
    }
  }

  public void newLine(int number) {
    write("\n#line " + number);
  }

  public void allocateLabels(int howMany) {
    lastLabelId += howMany;
  }

  public int getLastLabelId() {
    return lastLabelId;
  }

  public void label(int id) {
    label("label" + id);
  }

  public void label(String label) {
    writeInstruction(label + ":");
  }

  public void main() {
    if (showDebug) {
      write("' Invocation to the main function");
    }
    write("call main");
    write("halt");
  }

  public void writeInstruction(String text) {
    write("\t" + text);
  }

  public void write(String text) {
    try {
      this.out.write(text);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
