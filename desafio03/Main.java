package desafio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        compararNumeros(numero1, numero2);

        scanner.close();
    }

    public static void compararNumeros(double a, double b) {
        if (a > b) {
            System.out.println(a + " é maior que " + b);
        } else if (a < b) {
            System.out.println(a + " é menor que " + b);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}

