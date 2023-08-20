package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacci5() {
        assertThat(Fibonacci.fibo(0)).isEqualTo(0);
        assertThat(Fibonacci.fibo(1)).isEqualTo(1);
        assertThat(Fibonacci.fibo(2)).isEqualTo(1);
        assertThat(Fibonacci.fibo(3)).isEqualTo(2);
        assertThat(Fibonacci.fibo(4)).isEqualTo(3);
    }
    
    @Test
    public void testFibonacci8() {
        assertThat(Fibonacci.fibo(0)).isEqualTo(0);
        assertThat(Fibonacci.fibo(1)).isEqualTo(1);
        assertThat(Fibonacci.fibo(2)).isEqualTo(1);
        assertThat(Fibonacci.fibo(3)).isEqualTo(2);
        assertThat(Fibonacci.fibo(4)).isEqualTo(3);
        assertThat(Fibonacci.fibo(5)).isEqualTo(5);
        assertThat(Fibonacci.fibo(6)).isEqualTo(8);
        assertThat(Fibonacci.fibo(7)).isEqualTo(13);
    }
}
