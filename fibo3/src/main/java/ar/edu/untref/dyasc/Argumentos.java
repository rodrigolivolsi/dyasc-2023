package ar.edu.untref.dyasc;

import java.util.Map;

public class Argumentos {
    private final int n;
    private final char orientacion;
    private final char direccion;
    private final char modoFuncionamiento;
    private final Map<String, String> opcionesArchivo;

    public Argumentos(int n, char orientacion, char direccion, char modoFuncionamiento, Map<String, String> opcionesArchivo) {
        this.n = n;
        this.orientacion = orientacion;
        this.direccion = direccion;
        this.modoFuncionamiento = modoFuncionamiento;
        this.opcionesArchivo = opcionesArchivo;
    }

    public int getN() {
        return n;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public char getDireccion() {
        return direccion;
    }

    public char getModoFuncionamiento() {
        return modoFuncionamiento;
    }

    public Map<String, String> getOpcionesArchivo() {
        return opcionesArchivo;
    }
    
    // Método para obtener el archivo (si es que se proporciona)
    public String getNombreArchivo() {
        return this.opcionesArchivo.get("-f");
    }
    
}