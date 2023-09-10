package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class ManejadorArgumentos {

    public static Argumentos obtenerArgumentos(String[] args) throws IllegalArgumentException {
        String opciones = "hd"; // Opción por defecto
        int n = 0;
        Map<String, String> opcionesArchivo = new HashMap<>();

        for (String arg : args) {
            if (arg.startsWith("-o=")) {
                opciones = arg.substring(3);
            } else if (arg.startsWith("-f=")) {
                String nombreArchivo = arg.substring(3);
                opcionesArchivo.put("-f", nombreArchivo);
            } else {
                n = Integer.parseInt(arg);  //validar n entero, hacer metodo en validacion.java. Tambien voy a necesitar otro metodo para verificar -m= que sea distinto de l o s (o tambien podria verificarlo en formateador.java)
            }
        }

        Validacion.validarOpciones(opciones);

        char orientacion = opciones.charAt(0);
        char direccion = opciones.charAt(1);

        return new Argumentos(n, orientacion, direccion, opcionesArchivo);
    }
}
