public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro (" vermelho", "Fusca", 1980);
        meuCarro.acelerar();
        meuCarro.frear();

        Carro outroCarro = new Carro (" prata", "Creta", 2026);
        outroCarro.acelerar();
        outroCarro.frear();
    }
}