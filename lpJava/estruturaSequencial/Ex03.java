package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima a soma.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("A soma dos dois números é: " + soma);
        
        scanner.close();
        
    }
}