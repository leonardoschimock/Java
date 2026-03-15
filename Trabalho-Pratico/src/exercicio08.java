import java.util.Scanner;

public class exercicio08 {

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

        System.out.println("Digite uma palavra ou frase qualquer: ");
        String palavraFrase = scanner.nextLine();
        palavraFrase = palavraFrase.toLowerCase();

        int contador = 0;
        for (int i = 0; i < palavraFrase.length(); i++) {
            char vogal = palavraFrase.charAt(i);
            if (vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u' ) {
                contador++;
            }
        }

        System.out.println("Vamos contar quantas vogais (A, E, I, O, U) têm na sua palavra ou frase.");
        System.out.println("Sua palavra ou frase tem: " + contador + " vogais.");
    }
}
