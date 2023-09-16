package ar.edu.untref.dyasc;

public class ManejadorArgumentos {

    public static Argumentos obtenerArgumentos(String[] args) throws IllegalArgumentException {
        String opciones = CST.DEFAULT_OPCION_FORMATEO.getString();
        int n = 0;
        char modoFuncionamiento = CST.DEFAULT_OPCION_MODO_FUNCIONAMIENTO.getChar(); 
        String nombreArchivo = null;
        int cantidadArgumentosN = 0; // Contador de argumentos n

        for (String arg : args) {
            if (arg.startsWith(CST.OPCION_FORMATEO.getString())) {
                opciones = arg.substring(3);
            } else if (arg.startsWith(CST.OPCION_ARCHIVO.getString())) {
                nombreArchivo = arg.substring(3);               
            } else if (arg.startsWith(CST.OPCION_MODO_FUNCIONAMIENTO.getString())) {
                modoFuncionamiento = arg.charAt(3);
            } else {
                cantidadArgumentosN++;
                Validacion.validarEntero(arg);
                n = Integer.parseInt(arg);                 
            }
        }

        Validacion.validarCantidadArgumentosN(cantidadArgumentosN);
        Validacion.validarOpciones(opciones);
        Validacion.validarModoFuncionamiento(modoFuncionamiento);

        char orientacion = opciones.charAt(0);
        char direccion = opciones.charAt(1);

        return new Argumentos(n, orientacion, direccion, modoFuncionamiento, nombreArchivo);
    }
}
