package Exercicio-01;

public class Main {
    static void main (String[] args){
        Pessoa pessoa = new Pessoa();


        pessoa.setNome("Maria");
        pessoa.setIdade(25);


        pessoa.setNome("");
        pessoa.setIdade(150);


        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}