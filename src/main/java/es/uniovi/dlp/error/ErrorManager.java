package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ErrorManager {
  private static final ErrorManager instance = new ErrorManager();

  private final List<Error> errors = new ArrayList<>();

  private ErrorManager() {}

  public static ErrorManager getInstance() {
    return instance;
  }

  public void clearErrors() {
    errors.clear();
  }

  public List<Error> getErrors() {
    Collections.sort(errors);
    return errors;
  }

  public boolean hasErrors() {
    return errors.size() > 0;
  }
}