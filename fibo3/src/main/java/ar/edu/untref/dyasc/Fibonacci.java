package ar.edu.untref.dyasc;

public class Fibonacci {

    public static int fibo(int n) {   //Calculo el término n de la serie de Fibonacci
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static int fiboSumatoria(int n) {
        int sumatoria = 0;

        for (int i = 0; i < n; i++) {
            sumatoria += fibo(i);
        }

        return sumatoria;
    }
    
}