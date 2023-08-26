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

    public static String generadorOpcionhd(int n) {  //Opcion hd
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = 0; i < n; i++) {
            result.append(fibo(i)).append(" ");
        }
        return result.toString().trim();
    }

    public static String generadorOpcionhi(int n) {   //opcion hi
        StringBuilder result = new StringBuilder("fibo<" + n + ">: ");
        for (int i = n - 1; i >= 0; i--) {
            result.append(fibo(i)).append(" ");
        }
        return result.toString().trim();
    }

    

    public static String generadorOutput(char orientacion, char direccion, int n) { // Genera la salida en base a las opciones especificadas
        String output = "";

        switch (orientacion) {
            case 'h':
                if (direccion == 'd') {
                    output = generadorOpcionhd(n);
                } else if (direccion == 'i') {
                    output = generadorOpcionhi(n);
                } else {
                    output = "Opciones no validas.";
                }
                break;           
            default:
                output = "Opciones no validas.";
                break;
        }

        return output;
    }
}