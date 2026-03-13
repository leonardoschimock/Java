import java.util.Scanner;

public class Exercicio6 {

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
// Descritivo: Escreva um programa que leia 5 números do usuário e os armazene em um array, depois exiba todos os
// números.
// *****************************************************************************************************************

    static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Vamos construir um vetor, a seguir informe 5 números.");
        System.out.println ("Informe seu primeiro número: ");

        int primeiro = scanner.nextInt();

        System.out.println ("Primeiro número: " + primeiro);
        System.out.println ("Informe o segundo número: ");

        int segundo = scanner.nextInt();

        System.out.println ("Segundo número: " + segundo);
        System.out.println ("Informe o terceiro número: ");

        int terceiro = scanner.nextInt();

        System.out.println ("Terceiro número: " + terceiro);
        System.out.println ("Informe o quarto número: ");

        int quarto = scanner.nextInt();

        System.out.println ("Quarto número: " + quarto);
        System.out.println ("Informe o quinto número: ");

        int quinto = scanner.nextInt();

        System.out.println ("Quinto número: " + quinto);
    }
}
