package app;

import model.Autor;
import model.Biblioteca;
import model.Livro;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------");

        Autor autor1 = new Autor(
                "Machado de Assis",
                "Brasileiro"
        );

        Livro livro1 = new Livro(
                "Dom Casmurro",
                1899,
                autor1
        );

        Livro livro2 = new Livro(
                "Memórias Póstumas",
                1881,
                autor1
        );

        Biblioteca biblioteca = new Biblioteca(
                "Biblioteca Central"
        );

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();
    }
}