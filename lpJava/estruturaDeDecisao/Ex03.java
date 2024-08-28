package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 */
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.print("Digite F ou M: ");
        letra = scanner.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.println("F - Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }

        scanner.close();
    }
    
}