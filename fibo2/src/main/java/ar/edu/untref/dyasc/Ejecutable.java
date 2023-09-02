package ar.edu.untref.dyasc;

public class Ejecutable {
    public static void main(String[] args) {
        // Verifico la cantidad de argumentos
        if (args.length < 1) {
            System.out.println("Debe ingresar al menos un argumento");
            return;
        } else if (args.length > 2) {
            System.out.println("Demasiados argumentos");
            return;
        }

        int n = 0;
        String opciones = "";

        // Si esta presente -o, procesa opciones y argumentos
        if (args[0].startsWith("-o=")) {
            if (args.length < 2) {
                System.out.println("Debe ingresar al menos un argumento");
                return;
            }
            opciones = args[0].substring(3);
            if (opciones.length() != 2) {
                System.out.println("Opciones no validas.");
                return;
            }
            n = Integer.parseInt(args[1]);
        } else {
            opciones = "hd"; // Opción por defecto
            n = Integer.parseInt(args[0]);
        }

        char orientacion = opciones.charAt(0);
        char direccion = opciones.charAt(1);

        String output = Formateador.formateadorFibonacci(n, orientacion, direccion);

        System.out.println(output);
    }
}