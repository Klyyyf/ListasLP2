package Ex2;

public class FuncionarioAssalariado extends Funcionario {
    protected double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    public double calcularBonus() {
        return calcularSalario() * 0.1;
    }

    public double calcularSalario() {
        return salarioMensal;
    }
}
