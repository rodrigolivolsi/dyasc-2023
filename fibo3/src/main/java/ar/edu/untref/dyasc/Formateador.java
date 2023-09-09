package ar.edu.untref.dyasc;


public class Formateador {
    public static String formateadorFibonacci(int n, char orientacion, char direccion) {
        switch (orientacion) {
            case 'h':
                if (direccion == 'd') {
                    return generadorOpcionhd(n);
                } else if (direccion == 'i') {
                    return generadorOpcionhi(n);
                }
                break;
            case 'v':
                if (direccion == 'd') {
                    return generadorOpcionvd(n);
                } else if (direccion == 'i') {
                    return generadorOpcionvi(n);
                }
                break;
        }
        return "Opciones no validas.";
    }

    private static String generadorOpcionhd(int n) {
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = 0; i < n; i++) {
            result.append(Fibonacci.fibo(i)).append(" ");
        }
        return result.toString().trim();
    }

    private static String generadorOpcionhi(int n) {
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = n - 1; i >= 0; i--) {
            result.append(Fibonacci.fibo(i)).append(" ");
        }
        return result.toString().trim();
    }

    private static String generadorOpcionvd(int n) {
        StringBuilder result = new StringBuilder("fibo<" + n + ">:\n");
        for (int i = 0; i < n; i++) {
            result.append(Fibonacci.fibo(i)).append("\n");
        }
        return result.toString();
    }

    private static String generadorOpcionvi(int n) {
        StringBuilder result = new StringBuilder("fibo<" + n + ">:\n");
        for (int i = n - 1; i >= 0; i--) {
            result.append(Fibonacci.fibo(i)).append("\n");
        }
        return result.toString();
    }
}

