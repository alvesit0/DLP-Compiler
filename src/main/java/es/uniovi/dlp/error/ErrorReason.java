package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue required"),
  VARIABLE_ALREADY_DECLARED("The variable is already declared"),
  FUNCTION_ALREADY_DECLARED("The function is already declared"),
  VARIABLE_NOT_DECLARED("The variable is not declared"),
  FUNCTION_NOT_DECLARED("The function is not declared");
  ;

  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
