package ar.edu.untref.dyasc;

public class Formateador {
    public static String formateadorFibonacci(Argumentos argumentos) {
        if (argumentos.getModoFuncionamiento() == Opcion.LISTA.getValorChar()) {
            return formateadorLista(argumentos);            
        } else if (argumentos.getModoFuncionamiento() == Opcion.SUMATORIA.getValorChar()) {
            return formateadorSumatoria(argumentos);            
        } else {
            return "Modo de funcionamiento no valido.";       
        }
    }

    private static String formateadorLista(Argumentos argumentos) {
        if (argumentos.getOrientacion() == Opcion.ORIENTACION_HORIZONTAL.getValorChar()) {
            if (argumentos.getDireccion() == Opcion.DIRECCION_DIRECTA.getValorChar()) {
                return generadorOpcionhd(argumentos); //Horizontal Directa
            } else if (argumentos.getDireccion() == Opcion.DIRECCION_INVERSA.getValorChar()) {
                return generadorOpcionhi(argumentos); //Horizontal Inversa
            }
        } else if (argumentos.getOrientacion() == Opcion.ORIENTACION_VERTICAL.getValorChar()) {
            if (argumentos.getDireccion() == Opcion.DIRECCION_DIRECTA.getValorChar()) {
                return generadorOpcionvd(argumentos); //Vertical Directa
            } else if (argumentos.getDireccion() == Opcion.DIRECCION_INVERSA.getValorChar()) {
                return generadorOpcionvi(argumentos); //Vertical Inversa
            }
        }       
        return "Opciones no validas.";
    }

    private static String formateadorSumatoria(Argumentos argumentos) {
        int sumatoria = Fibonacci.fiboSumatoria(argumentos.getN());
        if (argumentos.getOrientacion() == Opcion.ORIENTACION_HORIZONTAL.getValorChar()) {
            return "fibo<" + argumentos.getN() + ">s: " + sumatoria;
        } else if (argumentos.getOrientacion() == Opcion.ORIENTACION_VERTICAL.getValorChar()) {
            return "fibo<" + argumentos.getN() + ">s:\n" + sumatoria;
        } else {
            return "Opciones no validas.";
        }
    }

    private static String generadorOpcionhd(Argumentos argumentos) {
        int n = argumentos.getN();
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = 0; i < n; i++) {
            result.append(Fibonacci.fibo(i)).append(" ");
        }
        return result.toString().trim();
    }
    
    private static String generadorOpcionhi(Argumentos argumentos) {
        int n = argumentos.getN();
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = n - 1; i >= 0; i--) {
            result.append(Fibonacci.fibo(i)).append(" ");
        }
        return result.toString().trim();
    }
    
    private static String generadorOpcionvd(Argumentos argumentos) {
        int n = argumentos.getN();
        StringBuilder result = new StringBuilder("fibo<" + n + ">:\n");
        for (int i = 0; i < n; i++) {
            result.append(Fibonacci.fibo(i)).append("\n");
        }
        return result.toString();
    }
    
    private static String generadorOpcionvi(Argumentos argumentos) {
        int n = argumentos.getN();
        StringBuilder result = new StringBuilder("fibo<" + n + ">:\n");
        for (int i = n - 1; i >= 0; i--) {
            result.append(Fibonacci.fibo(i)).append("\n");
        }
        return result.toString();
    }
}

