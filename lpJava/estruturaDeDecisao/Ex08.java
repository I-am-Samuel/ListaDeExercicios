package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um programa que pergunte o preço 
 * de três produtos e informe qual produto 
 * você deve comprar, sabendo que a decisão 
 * é sempre pelo mais barato.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double camisaAzul, camisaVermelha, camisaAmarela;

        System.out.println("Qual é o valor da Camisa Azul: ");
        camisaAzul = scanner.nextDouble();

        System.out.println("Qual é o valor da Camisa Vermelha: ");
        camisaVermelha = scanner.nextDouble();

        System.out.println("Qual é o valor da Camisa Amarela: ");
        camisaAmarela = scanner.nextDouble();

        if (camisaVermelha < camisaAzul && camisaVermelha < camisaAmarela) {
            System.out.println("Compre a camisa Vermelha! Ela é a mais barata");
        } else if (camisaAmarela < camisaAzul && camisaAmarela < camisaVermelha) {
            System.out.println("Compre a camisa Amarela! Ela é a mais barata");
        } else if (camisaAzul < camisaAmarela && camisaAzul < camisaVermelha) {
            System.out.println("Compre a camisa Azul! Ela é a mais barata");
        } else{
            System.out.println("Todas estão no mesmo valor");
        }

        scanner.close();

    }
    
}