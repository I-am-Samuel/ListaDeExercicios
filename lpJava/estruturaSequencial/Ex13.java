package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7

 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura, pesoIdealM, pesoIdealF;

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        pesoIdealM = (72.7*altura) - 58;
        pesoIdealF = (62.1*altura) - 44.7;

        System.out.println("O Seu peso ideal (Homens): " + pesoIdealM);
        System.out.println("O Seu peso ideal é: (Mulheres): " + pesoIdealF);

        scanner.close();
    }
    
}