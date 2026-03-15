import java.util.Scanner;

public class exercicio07 {

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

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println ("Primeiro, vamos construir um array. Informe 10 números inteiros: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.println ("Informe o número " + (i + 1) + ": ");
            numeros [i] = scanner.nextInt();
        }

        System.out.print("\n************************\n\n");
        System.out.print ("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print (" " + numeros [i]);
        }

        int maiorNumero = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("\n\nO maior número do seu array é: " + maiorNumero);
        System.out.print("\n\n************************");
    }
}
