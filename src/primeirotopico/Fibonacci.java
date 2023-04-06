package primeirotopico;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número inteiro positivo: ");
        numero = input.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0, b = 1, c;

        while (b < numero) {
            c = a + b;
            a = b;
            b = c;
        }

        return (b == numero);
    }
}
