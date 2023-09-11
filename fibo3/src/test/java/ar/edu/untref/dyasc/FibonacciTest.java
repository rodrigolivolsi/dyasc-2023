package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FibonacciTest {

    @Test
    public void testVD() {
        String expected = "fibo<5>:\n0\n1\n1\n2\n3";
        String[] args = { "-o=vd", "5" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testHI() {
        String expected = "fibo<8>: 13 8 5 3 2 1 1 0";
        String[] args = { "-o=hi", "8" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testVI() {
        String expected = "fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0";
        String[] args = { "-o=vi", "8" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testOpcionInvalida() {
        String expected = "Opciones no validas.";
        String[] args = { "-o=xy", "8" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testOpcionDefault() {
        String expected = "fibo<8>: 0 1 1 2 3 5 8 13";
        String[] args = { "8" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSalidaArchivo() throws IOException {
        String expectedOutput = "fibo<5> guardado en salida.txt";
        String[] args = { "-o=vd", "-f=salida.txt", "5" };
        String consoleOutput = SimuladorDeEjecucion.capturarOutput(args);
        
        // Verificar que el mensaje de consola sea el esperado
        assertThat(consoleOutput).isEqualTo(expectedOutput);

        // Verificar que el contenido del archivo generado sea el esperado
        String archivoGenerado = new String(Files.readAllBytes(Paths.get("salida.txt")));
        String expectedArchivo = "fibo<5>:\n0\n1\n1\n2\n3\n";
        assertThat(archivoGenerado).isEqualTo(expectedArchivo);
        
        // Eliminar el archivo generado después de la prueba
        Files.deleteIfExists(Paths.get("salida.txt"));
    }

    @Test
    public void testModoS() {
        String expected = "fibo<5>s: 7";
        String[] args = { "-o=hd", "-m=s", "5" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSalidaArchivoConModoS() throws IOException {
        String expectedOutput = "fibo<5> guardado en salida.txt";
        String[] args = { "-o=vd", "-f=salida.txt", "-m=s", "5" };
        String consoleOutput = SimuladorDeEjecucion.capturarOutput(args);
        
        // Verificar que el mensaje de consola sea el esperado
        assertThat(consoleOutput).isEqualTo(expectedOutput);

        // Verificar que el contenido del archivo generado sea el esperado
        String archivoGenerado = new String(Files.readAllBytes(Paths.get("salida.txt")));
        String expectedArchivo = "fibo<5>s:\n7";
        assertThat(archivoGenerado).isEqualTo(expectedArchivo);
        
        // Eliminar el archivo generado después de la prueba
        Files.deleteIfExists(Paths.get("salida.txt"));
    }

    @Test
    public void testModoInvalido() {
        String expected = "Modo de funcionamiento no valido.";
        String[] args = { "-o=hd", "-m=i", "5" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testNumeroEntero() {
        String expected = "El argumento debe ser un número entero.";
        String[] args = { "-o=hd", "-m=l", "5.8" };
        String result = SimuladorDeEjecucion.capturarOutput(args);
        assertThat(result).isEqualTo(expected);
    }

}