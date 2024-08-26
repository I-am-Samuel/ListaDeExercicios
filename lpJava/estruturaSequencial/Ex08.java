package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioHora, horasTrabalhadas, salarioTotal;

        System.out.println("Quanto você ganha por hora?");
        salarioHora = scanner.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: ");
        horasTrabalhadas = scanner.nextDouble();

        salarioTotal = horasTrabalhadas * salarioHora;

        System.out.println("O salário do mês: " + salarioTotal);

        scanner.close();
    }
    
}