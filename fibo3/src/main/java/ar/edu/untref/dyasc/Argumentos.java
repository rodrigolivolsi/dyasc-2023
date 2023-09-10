package ar.edu.untref.dyasc;

import java.util.Map;

public class Argumentos {
    public final int n;
    public final char orientacion;
    public final char direccion;
    public final Map<String, String> opcionesArchivo;

    public Argumentos(int n, char orientacion, char direccion, Map<String, String> opcionesArchivo) {
        this.n = n;
        this.orientacion = orientacion;
        this.direccion = direccion;
        this.opcionesArchivo = opcionesArchivo;
    }   
}