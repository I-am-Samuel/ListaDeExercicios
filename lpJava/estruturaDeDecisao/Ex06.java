package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre o maior deles.
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, maiorNumero;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        maiorNumero = num1;

        if (num2 > maiorNumero) {
            System.out.println(num2 + " é o maior número");
        } else if (num3 > maiorNumero) {
            System.out.println(num3 + " é o maior número");
        } else {
            System.out.println(maiorNumero + " é o maior número");
        }

        scanner.close();

    }
    
}