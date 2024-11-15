package Polimorfismo;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void calcularJuros() {
        System.out.println("Saldo da conta corrente: " + saldo);
    }
}