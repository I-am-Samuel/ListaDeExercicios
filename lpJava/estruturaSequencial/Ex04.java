package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaBi1, notaBi2, notaBi3, notaBi4, mediaBi;

        System.out.print("Digite a nota do 1° bimestre: ");
        notaBi1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2° bimestre: ");
        notaBi2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3° bimestre: ");
        notaBi3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4° bimestre: ");
        notaBi4 = scanner.nextDouble();

        mediaBi = (notaBi1 + notaBi2 + notaBi3 + notaBi4) / 4;

        System.out.print("A média é " + mediaBi);

        scanner.close();
    }

}