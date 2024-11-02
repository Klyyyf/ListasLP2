package Polimorfismo;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double saldoInicial, double taxaJuros) {
        super(saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void calcularJuros() {
        double juros = saldo * taxaJuros;
        saldo += juros;
        System.out.println("Juros calculados para Conta Poupança: " + juros + ". Novo saldo: " + saldo);
    }
}
