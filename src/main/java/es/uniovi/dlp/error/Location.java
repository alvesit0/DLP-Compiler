package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location> {
  @Override
  public int compareTo(Location location) {
    if (this.line == location.line) return this.column - location.column;
    else return this.line - location.line;
  }

  @Override
  public String toString() {
    return "line: " + line + ", column: " + column;
  }
}
