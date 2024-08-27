package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();

        pesoIdeal = (72.7*altura) - 58;

        System.out.println("O Seu peso ideal é: " + pesoIdeal);

        scanner.close();
    }
    
}