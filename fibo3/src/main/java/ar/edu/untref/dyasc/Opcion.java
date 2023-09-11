package ar.edu.untref.dyasc;

public enum Opcion {
    FORMATEO("-o="),
    ARCHIVO("-f="),
    MODO_FUNCIONAMIENTO("-m="),
    ARCHIVOKEY(ARCHIVO.getValor().substring(0, ARCHIVO.getValor().length() - 1)), //"-f"
    LISTA("l"),
    SUMATORIA("s"),    
    ORIENTACION_HORIZONTAL("h"),
    ORIENTACION_VERTICAL("v"),
    DIRECCION_DIRECTA("d"),
    DIRECCION_INVERSA("i"),
    OPCION_HORIZONTAL_DIRECTA(ORIENTACION_HORIZONTAL.getValor() + DIRECCION_DIRECTA.getValor()),
    OPCION_HORIZONTAL_INVERSA(ORIENTACION_HORIZONTAL.getValor() + DIRECCION_INVERSA.getValor()),
    OPCION_VERTICAL_DIRECTA(ORIENTACION_VERTICAL.getValor() + DIRECCION_DIRECTA.getValor()),
    OPCION_VERTICAL_INVERSA(ORIENTACION_VERTICAL.getValor() + DIRECCION_INVERSA.getValor()),
    DEFAULT_MODO_FUNCIONAMIENTO("l"),
    DEFAULT_OPCIONES("hd");

    private final String valor;

    Opcion(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public char getValorChar() {
        return valor.charAt(0);
    }
}