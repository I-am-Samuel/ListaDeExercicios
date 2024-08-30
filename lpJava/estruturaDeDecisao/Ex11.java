package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salarioAtual, salarioComReajuste, aumento, reajuste;

        System.out.print("Digite o seu salário: ");
        salarioAtual = scanner.nextDouble();

        if (salarioAtual <= 280 && salarioAtual > 1) {
            aumento = 20;
            reajuste = (salarioAtual * aumento) / 100;
            salarioComReajuste = salarioAtual + reajuste;
            System.out.println("Salário antes do reajuste: " + salarioAtual);
            System.out.println("Percentual de aumento aplicado: " + aumento + "%");
            System.out.println("Valor do aumento: " + reajuste + " R$");
            System.out.println("Novo salário, após o aumento: " + salarioComReajuste + " R$");
        } else if (salarioAtual > 280 && salarioAtual <= 700) {
            aumento = 15;
            reajuste = (salarioAtual * aumento) / 100;
            salarioComReajuste = salarioAtual + reajuste;
            System.out.println("Salário antes do reajuste: " + salarioAtual);
            System.out.println("Percentual de aumento aplicado: " + aumento + "%");
            System.out.println("Valor do aumento: " + reajuste + " R$");
            System.out.println("Novo salário, após o aumento: " + salarioComReajuste + " R$");
        } else if (salarioAtual > 700 && salarioAtual <= 1500) {
            aumento = 10;
            reajuste = (salarioAtual * aumento) / 100;
            salarioComReajuste = salarioAtual + reajuste;
            System.out.println("Salário antes do reajuste: " + salarioAtual);
            System.out.println("Percentual de aumento aplicado: " + aumento + "%");
            System.out.println("Valor do aumento: " + reajuste + " R$");
            System.out.println("Novo salário, após o aumento: " + salarioComReajuste + " R$");
        } else if (salarioAtual > 1500) {
            aumento = 5;
            reajuste = (salarioAtual * aumento) / 100;
            salarioComReajuste = salarioAtual + reajuste;
            System.out.println("Salário antes do reajuste: " + salarioAtual);
            System.out.println("Percentual de aumento aplicado: " + aumento + "%");
            System.out.println("Valor do aumento: " + reajuste + " R$");
            System.out.println("Novo salário, após o aumento: " + salarioComReajuste + " R$");
        } else{
            System.out.println("Digite um valor valido!");
        }

        scanner.close();

    }
    
}