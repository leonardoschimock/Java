import java.util.Scanner;

public class exercicio01 {

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

        System.out.println("Vamos somar!");

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Primeiro número digitado: " + primeiroNumero);

        System.out.println("Digite o segundo número que gostaria de somar: ");
        int segundoNumero = scanner.nextInt();
        System.out.println("Segundo número digitado: " + segundoNumero);

        System.out.println("A operação de soma será: " + primeiroNumero + "+" + segundoNumero);
        int soma = primeiroNumero + segundoNumero;

        System.out.println("A soma dos números informados é: " + soma);

        scanner.close();
    }
}
