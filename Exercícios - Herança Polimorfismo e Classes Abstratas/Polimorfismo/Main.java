package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new ContaPoupanca(100, 0.02));
        contas.add(new ContaCorrente(1000));
        contas.add(new ContaPoupanca(1500, 0.02));
        contas.add(new ContaCorrente(1700));
        contas.add(new ContaPoupanca(1900, 0.02));
        contas.add(new ContaCorrente(500));

        for (Conta conta : contas) {
            conta.calcularJuros();
        }
    }
}
