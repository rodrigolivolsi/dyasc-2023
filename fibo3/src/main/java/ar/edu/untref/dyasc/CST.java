package ar.edu.untref.dyasc;

public enum CST {
    OPCION_FORMATEO("-o="),
    OPCION_ARCHIVO("-f="),
    OPCION_MODO_FUNCIONAMIENTO("-m="),
    ARCHIVOKEY(OPCION_ARCHIVO.getString().substring(0, OPCION_ARCHIVO.getString().length() - 1)), //"-f"
    MODO_LISTA("l"),
    MODO_SUMATORIA("s"),    
    ORIENTACION_HORIZONTAL("h"),
    ORIENTACION_VERTICAL("v"),
    DIRECCION_DIRECTA("d"),
    DIRECCION_INVERSA("i"),
    HORIZONTAL_DIRECTA(ORIENTACION_HORIZONTAL.getString() + DIRECCION_DIRECTA.getString()),
    HORIZONTAL_INVERSA(ORIENTACION_HORIZONTAL.getString() + DIRECCION_INVERSA.getString()),
    VERTICAL_DIRECTA(ORIENTACION_VERTICAL.getString() + DIRECCION_DIRECTA.getString()),
    VERTICAL_INVERSA(ORIENTACION_VERTICAL.getString() + DIRECCION_INVERSA.getString()),
    DEFAULT_OPCION_MODO_FUNCIONAMIENTO("l"),
    DEFAULT_OPCION_FORMATEO("hd");

    private final String valor;

    CST(String valor) {
        this.valor = valor;
    }

    public String getString() {
        return valor;
    }

    public char getChar() {
        return valor.charAt(0);
    }
}