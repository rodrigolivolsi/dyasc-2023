package ar.edu.untref.dyasc;

public class Ejecutable {

    public static void main(String[] args) {
        try {
            Validacion.validarArgumentos(args);
            Argumentos argumentos = ManejadorArgumentos.obtenerArgumentos(args);

            String output = Formateador.formateadorFibonacci(argumentos);

            String nombreArchivo = argumentos.getNombreArchivo();
            if (nombreArchivo != null) {
                GuardarArchivo.guardarEnArchivo(nombreArchivo, output, argumentos.getN());
            } else {
                System.out.println(output);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}