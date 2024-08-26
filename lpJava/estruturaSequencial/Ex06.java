package lpJava.estruturaSequencial;
import java.util.Scanner;

/**
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        
        double pi = 3.141592653589793;
        double area = pi * raio * raio;
        
        System.out.println("A área do círculo é: " + area);
        
        scanner.close();
    }
}