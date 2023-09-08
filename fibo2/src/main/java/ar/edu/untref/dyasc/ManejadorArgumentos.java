package ar.edu.untref.dyasc;

public class ManejadorArgumentos {
    public static Argumentos obtenerArgumentos(String[] args) throws IllegalArgumentException {
        String opciones = "";
        int n;

        if (args[0].startsWith("-o=")) {
            opciones = args[0].substring(3);
            n = Integer.parseInt(args[1]);
        } else {
            opciones = "hd"; // Opción por defecto
            n = Integer.parseInt(args[0]);
        }

        Validacion.validarOpciones(opciones);

        char orientacion = opciones.charAt(0);
        char direccion = opciones.charAt(1);

        return new Argumentos(n, orientacion, direccion);
    }    
}
