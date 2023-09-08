package ar.edu.untref.dyasc;

public class Ejecutable {

    public static void main(String[] args) {
        try {
            Validacion.validarArgumentos(args);

            Argumentos argumentos = ManejadorArgumentos.obtenerArgumentos(args);

            String output = Formateador.formateadorFibonacci(argumentos.n, argumentos.orientacion, argumentos.direccion);

            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}