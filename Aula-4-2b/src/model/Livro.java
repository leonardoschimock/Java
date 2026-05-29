package model;

public class Livro {

    private String titulo;
    private int ano;
    private Autor autor;

    public Livro(String titulo, int ano, Autor autor){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public void exibirLivro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano: " + ano);
        autor.exibirDados();
    }
}