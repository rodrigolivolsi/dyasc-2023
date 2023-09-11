package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class ManejadorArgumentos {

    public static Argumentos obtenerArgumentos(String[] args) throws IllegalArgumentException {
        String opciones = Opcion.DEFAULT_OPCIONES.getValor();
        int n = 0;
        char modoFuncionamiento = Opcion.DEFAULT_MODO_FUNCIONAMIENTO.getValorChar(); 
        Map<String, String> opcionesArchivo = new HashMap<>();
        int cantidadArgumentosN = 0; // Contador de argumentos n

        for (String arg : args) {
            if (arg.startsWith(Opcion.FORMATEO.getValor())) {
                opciones = arg.substring(3);
            } else if (arg.startsWith(Opcion.ARCHIVO.getValor())) {
                String nombreArchivo = arg.substring(3);
                opcionesArchivo.put(Opcion.ARCHIVOKEY.getValor(), nombreArchivo);
            } else if (arg.startsWith(Opcion.MODO_FUNCIONAMIENTO.getValor())) {
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

        return new Argumentos(n, orientacion, direccion, modoFuncionamiento, opcionesArchivo);
    }
}
