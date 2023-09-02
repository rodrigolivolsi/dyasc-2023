package ar.edu.untref.dyasc;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class SimuladorDeEjecucion {
    
    public static String capturarOutput(String[] args) {
        OutputStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Ejecutable.main(args); // Llama al programa principal

        System.setOut(new PrintStream(originalOut));

        return outputStream.toString().trim();
    }

}