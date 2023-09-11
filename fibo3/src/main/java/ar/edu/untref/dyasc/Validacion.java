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
        if (!opciones.equals(CST.OPCION_HORIZONTAL_DIRECTA.getString()) && !opciones.equals(CST.OPCION_HORIZONTAL_INVERSA.getString())
        && !opciones.equals(CST.OPCION_VERTICAL_INVERSA.getString()) && !opciones.equals(CST.OPCION_VERTICAL_DIRECTA.getString())) {
            throw new IllegalArgumentException("Opciones no validas.");
        }        
    }    

    public static void validarModoFuncionamiento(char modo) throws IllegalArgumentException {
        if (modo != CST.LISTA.getChar() && modo != CST.SUMATORIA.getChar()) {
            throw new IllegalArgumentException("Modo de funcionamiento no valido.");
        }
    }

    public static void validarEntero(String numero) throws IllegalArgumentException {
        try {
            Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El argumento debe ser un número entero.");
        }
    }

    public static void validarCantidadArgumentosN(int cantidad) throws IllegalArgumentException {
        if (cantidad > 1) {
            throw new IllegalArgumentException("Demasiados argumentos 'n'.");
        } else if (cantidad == 0){
            throw new IllegalArgumentException("Se debe especificar un argumento 'n'.");
        }
    }
}