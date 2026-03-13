import java.util.Scanner;

public class Exercicio4 {

// ******************************************************************************************************************
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
// Descritivo: Faça um programa que converta uma temperatura em graus Celsius para Fahrenheit, utilizando a fórmula:
// F = (C × 9/5) + 32.
// ******************************************************************************************************************

    static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Vamos converter a temperatura de hoje em Fahrenreit?");
        System.out.println ("Informe a temperatura de hoje em graus Celsius (°C): ");

        double temperaturaCelsius = scanner.nextDouble();
        System.out.println("Temperatura em Celsius (°C) informada: " + temperaturaCelsius);

        double temperaturaFahrenreit = (temperaturaCelsius * 9/5) + 32;

        System.out.println ("Essa é a temperatura de hoje em Fahrenreit (°F) " + temperaturaFahrenreit);
    }
}
