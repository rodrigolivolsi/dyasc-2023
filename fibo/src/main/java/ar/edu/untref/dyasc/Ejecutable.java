package ar.edu.untref.dyasc;

public class Ejecutable {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Estoy en ejecución");
            return;
        }

        int n = Integer.parseInt(args[0]);

        System.out.print("fibo<" + n + ">:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + Fibonacci.fibo(i));
        }
        System.out.println();
    }
}
