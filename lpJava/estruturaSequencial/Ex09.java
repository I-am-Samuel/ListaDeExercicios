package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = scanner.nextDouble();

        celsius =  5 * ((fahrenheit-32) / 9);

        System.out.println("A temperatura em celsius: " + celsius);

        scanner.close(); 

    }
    
}