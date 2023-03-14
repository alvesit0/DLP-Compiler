package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import java.util.List;

public class Struct extends AbstractType {

  private List<StructField> fields;

  public Struct(int line, int column, List<StructField> fields) {
    super(line, column);
    for (StructField s1 : fields)
      for (StructField s2 : fields)
        if (s2.getName().equals(s1.getName())) {
          ErrorManager.getInstance()
              .getErrors()
              .add(
                  new Error(
                      new Location(s2.getLine(), s2.getColumn()),
                      ErrorReason.FIELD_ALREADY_DECLARED));
          return;
        }
    this.fields = fields;
  }

  public List<StructField> getFields() {
    return fields;
  }

  @Override
  public int getLine() {
    return 0;
  }

  @Override
  public int getColumn() {
    return 0;
  }

  @Override
  public String toString() {
    return "struct";
  }
}
