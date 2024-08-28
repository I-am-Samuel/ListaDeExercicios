package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        if (num >= 0) {
            System.out.println(num + " é uma valor positivo");
        } else {
            System.out.println(num + " é uma valor negativo");
        }

        scanner.close();

    }
    
}