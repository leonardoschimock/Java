package Exercicio-01;

public class Pessoa {
    public String nome;
    public int idade;


    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome (String nome){
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println ("Erro: Nome não pode ser vazio!");
        }
        else {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            System.out.println("Erro: Idade deve ser entre 0 e 120 anos!");
        } else {
            this.idade = idade;
        }
    }

}
