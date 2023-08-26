package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void testVD() {
        String expected = "fibo<5>:\n0\n1\n1\n2\n3";
        String result = Ejecutable.simulacionCapturaOutput("-o=vd 5");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testHI() {
        String expected = "fibo<8>: 13 8 5 3 2 1 1 0";
        String result = Ejecutable.simulacionCapturaOutput("-o=hi 8");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testVI() {
        String expected = "fibo<8>:\n13\n8\n5\n3\n2\n1\n1\n0";
        String result = Ejecutable.simulacionCapturaOutput("-o=vi 8");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testOpcionInvalida() {
        String expected = "Opciones no validas.";
        String result = Ejecutable.simulacionCapturaOutput("-o=xy 8");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testOpcionDefault() {
        String expected = "fibo<8>: 0 1 1 2 3 5 8 13";
        String result = Ejecutable.simulacionCapturaOutput("8");
        assertThat(result).isEqualTo(expected);
    }
}