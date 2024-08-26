package lpJava.estruturaSequencial;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit, celsius;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit =  (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit: " + fahrenheit);

        scanner.close(); 

    }
    
}