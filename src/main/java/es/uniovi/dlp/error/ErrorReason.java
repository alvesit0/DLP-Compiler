package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),
  LVALUE_REQUIRED("LValue required"),
  VARIABLE_ALREADY_DECLARED("The variable is already declared"),
  FUNCTION_ALREADY_DECLARED("The function is already declared"),
  VARIABLE_NOT_DECLARED("The variable is not declared"),
  FUNCTION_NOT_DECLARED("The function is not declared"),
  INVALID_INDEX_EXPRESSION("Invalid index expression"),
  INVALID_CAST("Invalid cast"),
  INVALID_INDEXING("Invalid indexing"),
  INVALID_ARITHMETIC("Invalid arithmetic operation"),
  NOT_LOGICAL("Not a logical operation"),
  INVALID_LOGICAL("Invalid logical operation"),
  INVALID_COMPARISON("Invalid comparison operation"),
  NO_SUCH_FIELD("No such field"),
  INVALID_DOT("Invalid dot"),
  INCOMPATIBLE_TYPES("Incompatible types"),
  INVALID_RETURN_TYPE("Invalid return type"),
  INVALID_ARGS("Invalid arguments"),
  INVALID_INVOCATION("Invalid invocation");

  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
