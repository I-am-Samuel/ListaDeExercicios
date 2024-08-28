package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.print("Digite uma letra: ");
        letra = scanner.next().charAt(0);

        if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u') {
            System.out.println(letra + " é uma vogal");
        } else {
            System.out.println(letra + " é uma consoante");
        }

        scanner.close();
    }
    
}