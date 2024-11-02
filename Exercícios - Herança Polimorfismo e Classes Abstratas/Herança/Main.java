package Herança;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Yamaha", "MT-07");

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();
        carro.acelerar();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
        moto.acelerar();
    }
}
