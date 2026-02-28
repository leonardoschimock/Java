public class Carro {
    public String cor;
    public String modelo;
    public int ano;


    public Carro (String cor, String modelo, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println(modelo + cor + " está acelerando!");
    }

    public void frear() {
        System.out.println(modelo + cor + " está freando!");
    }


}