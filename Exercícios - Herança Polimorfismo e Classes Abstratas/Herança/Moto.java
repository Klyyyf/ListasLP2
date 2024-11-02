package Herança;

public class Moto extends Veiculo {
    public Moto (String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("A moto acelerou.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Moto");
        super.exibirInformacoes();
    }
}
