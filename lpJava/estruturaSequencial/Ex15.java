package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioHora, horasTrabalhadas, salarioTotalMes;

        System.out.println("Quanto você ganha por hora?");
        salarioHora = scanner.nextDouble();

        System.out.print("Número de horas trabalhadas no mês: \n");
        horasTrabalhadas = scanner.nextDouble();

        salarioTotalMes = horasTrabalhadas * salarioHora;

        double ir = salarioTotalMes * 0.11;
        double inss = salarioTotalMes * 0.08;
        double sindicato = salarioTotalMes * 0.05;

        double salarioLiquido = salarioTotalMes - ir - inss - sindicato;

        System.out.println("\nSalário bruto: " + salarioTotalMes + " R$");
        System.out.println("- IR 11%: " + ir + " R$");
        System.out.println("- INSS (8%) :" + inss + " R$");
        System.out.println("- Sindicato ( 5%) : " + sindicato + " R$");
        System.out.println("= Salário Liquido : " + salarioLiquido +" R$");

        scanner.close();
    }
    
}