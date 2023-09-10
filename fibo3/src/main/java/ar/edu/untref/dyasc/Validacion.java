package ar.edu.untref.dyasc;

public class Validacion {
    public static void validarArgumentos(String[] args) throws IllegalArgumentException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Debe ingresar al menos un argumento.");
        } else if (args.length > 4) {
            throw new IllegalArgumentException("Demasiados argumentos.");
        }

    }

    public static void validarOpciones(String opciones) throws IllegalArgumentException {
        if (opciones.length() != 2) {
            throw new IllegalArgumentException("Opciones no válidas.");
        }
    }    
}
