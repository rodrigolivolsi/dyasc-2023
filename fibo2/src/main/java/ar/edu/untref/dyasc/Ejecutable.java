package ar.edu.untref.dyasc;

public class Ejecutable {

    public static void main(String[] args) {
        try {
            Validacion.validarArgumentos(args);

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

            String output = Formateador.formateadorFibonacci(n, orientacion, direccion);

            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}