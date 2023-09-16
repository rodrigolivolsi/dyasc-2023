package ar.edu.untref.dyasc;


public class Argumentos {
    private final int n;
    private final char orientacion;
    private final char direccion;
    private final char modoFuncionamiento;
    private final String NombreArchivo;

    public Argumentos(int n, char orientacion, char direccion, char modoFuncionamiento, String NombreArchivo) {
        this.n = n;
        this.orientacion = orientacion;
        this.direccion = direccion;
        this.modoFuncionamiento = modoFuncionamiento;
        this.NombreArchivo = NombreArchivo;
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

    public String getNombreArchivo() {
        return NombreArchivo;
    }
    
}