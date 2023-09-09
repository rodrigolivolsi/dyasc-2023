package ar.edu.untref.dyasc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class SimuladorDeEjecucion {  //para simular la ejecucion del programa y capturar la salida, lo implemente para los tests y verificar la salida generada por el programa
    
    public static String capturarOutput(String[] args) {
        OutputStream originalOut = System.out;  //Creo una instancia de OutputStream llamada originalOut y la inicializo con la salida estándar actual, que es la que se usa para mostrar mensajes en la consola.
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); //Creo una instancia de ByteArrayOutputStream llamada outputStream. Esta clase es un flujo de salida que se utiliza para almacenar datos en memoria.
        System.setOut(new PrintStream(outputStream)); //Aquí se cambia la salida estándar actual (que originalmente apuntaba a la consola) para que apunte a outputStream. 
                                                      //Esto significa que todo lo que normalmente se imprimiría en la consola ahora se redirigirá y se almacenará en outputStream.
        Ejecutable.main(args); // Llama al programa principal pasandole el array de cadenas 'args' como argumento

        System.setOut(new PrintStream(originalOut)); //Luego de ejecutar el programa principal, esta línea restaura la salida estándar original, que apunta nuevamente a la consola.

        return outputStream.toString().trim(); // El contenido capturado en outputStream se convierte en una cadena llamada output y se elimina cualquier espacio en blanco adicional. Esta cadena es lo que devuelve la función capturarOutput.
    }

}