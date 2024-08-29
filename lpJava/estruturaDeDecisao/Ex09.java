package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        num3 = scanner.nextInt();
        System.out.println("\n");

        if (num1 >= num2 && num1 >= num3) {
            if (num2 > num3) {
                System.out.println(num1 + " | " + num2 + " | " + num3);
            } else{
                System.out.println(num1 + " | " + num3 + " | " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 > num3) {
                System.out.println(num2 + " | " + num1 + " | " + num3);
            } else{
                System.out.println(num2 + " | " + num3 + " | " + num1);
            }
        } else if (num3 >= num1 && num3 >= num2) {
            if (num1 > num2) {
                System.out.println(num3 + " | " + num1 + " | " + num2);
            } else{
                System.out.println(num3 + " | " + num2 + " | " + num1);
            }
        }

        scanner.close();

    }
    
}