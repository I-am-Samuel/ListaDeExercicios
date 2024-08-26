package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double ladoQuadrado, areaDoQuadrado;

        System.out.print("Digite o tamanho do lado do quadrado: ");
        ladoQuadrado = scanner.nextDouble();

        areaDoQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("O dobro da área do quadrado é: " + areaDoQuadrado * 2);

        scanner.close();
    }
    
}