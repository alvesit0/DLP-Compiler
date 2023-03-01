package es.uniovi.dlp.ast.types;

public class StructField {

    private String name;
    private Type type;

    public StructField(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
