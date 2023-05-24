package es.uniovi.dlp.visitor.codegeneration;

public class ReturnBytesParam {

  public int bytesLocals;
  public int bytesParams;
  public int bytesReturn;

  public ReturnBytesParam(int bytesReturn, int bytesLocals, int bytesParams) {
    this.bytesLocals = bytesLocals;
    this.bytesParams = bytesParams;
    this.bytesReturn = bytesReturn;
  }
}
