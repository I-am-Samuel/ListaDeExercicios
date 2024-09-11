package lpJava.estruturaDeRepeticao;

import java.util.Scanner;

/**
 * Faça um programa que leia um nome de usuário e a sua senha 
 * e não aceite a senha igual ao nome do usuário, mostrando 
 * uma mensagem de erro e voltando a pedir as informações.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, senha;

        while (true) {
            System.out.print("Digite um nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            if (senha.equals(nome)) {
                System.out.println("Erro: Senha não pode ser igual a nome!");
            } else{
                break;
            }
        }
        scanner.close();
    }
    
}