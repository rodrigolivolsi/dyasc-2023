package ar.edu.untref.dyasc;

public enum CST {
    FORMATEO("-o="),
    ARCHIVO("-f="),
    MODO_FUNCIONAMIENTO("-m="),
    ARCHIVOKEY(ARCHIVO.getString().substring(0, ARCHIVO.getString().length() - 1)), //"-f"
    LISTA("l"),
    SUMATORIA("s"),    
    ORIENTACION_HORIZONTAL("h"),
    ORIENTACION_VERTICAL("v"),
    DIRECCION_DIRECTA("d"),
    DIRECCION_INVERSA("i"),
    OPCION_HORIZONTAL_DIRECTA(ORIENTACION_HORIZONTAL.getString() + DIRECCION_DIRECTA.getString()),
    OPCION_HORIZONTAL_INVERSA(ORIENTACION_HORIZONTAL.getString() + DIRECCION_INVERSA.getString()),
    OPCION_VERTICAL_DIRECTA(ORIENTACION_VERTICAL.getString() + DIRECCION_DIRECTA.getString()),
    OPCION_VERTICAL_INVERSA(ORIENTACION_VERTICAL.getString() + DIRECCION_INVERSA.getString()),
    DEFAULT_MODO_FUNCIONAMIENTO("l"),
    DEFAULT_OPCIONES("hd");

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