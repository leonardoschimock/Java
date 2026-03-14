import java.util.Scanner;

public class exercicio03 {

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
        Scanner scanner = new Scanner (System.in);

        System.out.println("Vamos calcular sua média?");

        System.out.println("Informe sua PRIMEIRA nota: ");
        double primeiraNota = scanner.nextDouble();

        System.out.println ("Informe sua SEGUNDA nota ");
        double segundaNota = scanner.nextDouble();

        System.out.println("Informe sua TERCEIRA nota: ");
        double terceiraNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("A média de suas notas é: " + media);

        scanner.close();
    }
}

// ******** COMENTÁRIO *********************************************************************************************
// O código se inicia com a criação da classe Scanner (linha 22), presente na biblioteca java.util do próprio Java,
// que vai receber informações digitadas pelo usuário e armazená-las no sistema para futuras operações. A seguir
// temos a impressão de um guiador do que será feito no código ("[...] calcular [...] média") e, para cada nota
// informada pelo usuário, o código chama o método Scanner de acordo com o tipo da variável para armazená-la no
// sistema. Ao final é declarada uma variável chamada media que calcula a média simples das notas informadas pelo
// usuário e o comando scanner.close(); é utilizado para fechar a leitura de informações do terminal.
// *****************************************************************************************************************
