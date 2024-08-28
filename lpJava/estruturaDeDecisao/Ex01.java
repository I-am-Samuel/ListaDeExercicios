package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " é maior que " + num1);
        } else {
            System.out.println("São iguais");
        }

        scanner.close();
        
    }
    
}