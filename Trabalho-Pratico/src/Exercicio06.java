import java.util.Scanner;

public class Exercicio06 {

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

    public void main (String[] args) {

        Scanner scanner = new Scanner (System.in);


        int[] vetor = new int[5];


        System.out.println ("Vamos construir um vetor. Informe 5 números: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.println ("Informe o número " + (i + 1) + ": ");
            vetor [i] = scanner.nextInt();
        }



        System.out.println ("Números digitados: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println (vetor [i]);
        }


        scanner.close();
    }
}
