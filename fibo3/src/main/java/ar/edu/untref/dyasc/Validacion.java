package ar.edu.untref.dyasc;

public class Validacion {
    public static void validarArgumentos(String[] args) throws IllegalArgumentException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Debe ingresar al menos un argumento.");
        } else if (args.length > 2) {
            throw new IllegalArgumentException("Demasiados argumentos.");
        }

        if (args[0].startsWith("-o=")) {
            if (args.length < 2) {
                throw new IllegalArgumentException("Debe ingresar al menos un argumento.");
            }
            try {
                Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("El argumento debe ser un número entero.");
            }
        } else {
            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("El argumento debe ser un número entero.");
            }
        }
    }

    public static void validarOpciones(String opciones) throws IllegalArgumentException {
        if (opciones.length() != 2) {
            throw new IllegalArgumentException("Opciones no válidas.");
        }
    }    
}
