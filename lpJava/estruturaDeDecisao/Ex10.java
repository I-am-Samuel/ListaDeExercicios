package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M-matutino ou V-Vespertino ou 
 * N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" 
 * ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o turno em que você estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = scanner.next().charAt(0);

        switch (turno) {
            case 'M':
            case 'm':
            System.out.println("Bom dia!");
                break;

            case 'V':
            case 'v':
            System.out.println("Boa Tarde!");
                break;

            case 'N':
            case 'n':
            System.out.println("Boa Noite!");
                break;
        
            default:
                System.out.println("Valor Inválido!");
                break;
        }

        scanner.close();

    }
    
}