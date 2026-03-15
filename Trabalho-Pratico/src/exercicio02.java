import java.util.Scanner;

public class exercicio02 {

// *****************************************************************************************************************
// Curso: Engenharia de Software
// Disciplina: Análise e Projeto Orientado a Objetos
// Professor: José Carlos Flores
// Turma: ESOFT3B
// Componentes:
// 25212854-2 - Arthur de Andrade Malvaso
// 25034198-2 - Carlos Eduardo dos Santos da Silva
// 25216341-2 - Isadora Tereza Taques Fernandes
// 25357718-2 - Jean Carlos Siqueira dos Santos
// 25363487-2 - Leonardo Schimock Silveira
// 25363611-2 - Thiago de Barros Inácio
// Data: 16 de Março de 2026
// Descritivo: Escreva um programa que calcule a média de três notas fornecidas pelo usuário.
// *****************************************************************************************************************



    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        if (numeroInteiro % 2 == 0) {
            System.out.println("Seu número é par!");
        } else {
            System.out.println("Seu número é ímpar!");
        }
    }
}
