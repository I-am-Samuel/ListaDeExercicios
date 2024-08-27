package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. terceiro elevado ao cubo.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;
        double numero3;

        System.out.print("Digite o 1° número: ");
        numero1 = scanner.nextInt();

        System.out.print("DIgite o 2° número: ");
        numero2 = scanner.nextInt();

        System.out.print("DIgite o 3° número: ");
        numero3 = scanner.nextDouble();

        int a = (numero1 * 2) + (numero2/2);
        double b = (numero1 * 3) + numero3;
        double c = numero3 * numero3 * numero3;

        System.out.print("\na. O produto do dobro do primeiro com metade do segundo: " + a +"\n");
        System.out.println("\nb. A soma do triplo do primeiro com o terceiro: " + b +"\n");
        System.out.println("c. terceiro elevado ao cubo." + c + "\n");

        scanner.close();
    }
    
}