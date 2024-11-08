package Ex2;

public class FuncionarioHorista extends Funcionario{
    protected double horasTrabalhadas;
    protected double valorPorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario(){
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public double calcularBonus() {
        return calcularSalario() * 0.05;
    }
}
