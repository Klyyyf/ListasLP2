package Herança;

public class Carro extends Veiculo {
    public Carro (String marca, String modelo) {
        super(marca, modelo);
    }

    public void acelerar() {
        System.out.println("O carro acelerou.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Carro");
        super.exibirInformacoes();
    }
}
