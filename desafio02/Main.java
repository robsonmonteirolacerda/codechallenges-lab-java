package desafio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        int resultado = somar(numero1, numero2);

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é: " + resultado);

        scanner.close();
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}

