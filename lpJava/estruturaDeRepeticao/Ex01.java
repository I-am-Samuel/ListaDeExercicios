package lpJava.estruturaDeRepeticao;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota, entre zero e dez. 
 * Mostre uma mensagem caso o valor seja inválido e 
 * continue pedindo até que o usuário informe um valor válido.
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;

        while (true) {
            System.out.println("Digite um valor de 0 a 10");
            valor = scanner.nextInt();

            if (valor < 0 || valor > 10) {
                System.out.println("Erro: digite um valor de 0 a 10!");
            } else{
                break;
            }
        }
        scanner.close();
    }
    
}