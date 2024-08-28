package lpJava.estruturaDeDecisao;

import java.util.Scanner;

/**
 * Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7 && media < 10) {
            System.out.print("Aprovado");
        } else if (media < 7) {
            System.out.print("Reprovado");
        } else if (media == 10) {
            System.out.print("Aprovado com Distinção");
        }

        scanner.close();

    }
    
}