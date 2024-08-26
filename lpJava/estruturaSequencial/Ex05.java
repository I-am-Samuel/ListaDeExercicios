package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que converta metros para centímetros.
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        
        double centimetros = metros * 100;
        
        System.out.println("O valor em centímetros é: " + centimetros);
        
        scanner.close();
    }
    
}